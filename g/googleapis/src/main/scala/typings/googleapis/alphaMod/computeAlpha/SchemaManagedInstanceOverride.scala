package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Overrides of stateful properties for a given instance
  */
@js.native
trait SchemaManagedInstanceOverride extends js.Object {
  /**
    * Disk overrides defined for this instance. According to documentation the
    * maximum number of disks attached to an instance is 128:
    * https://cloud.google.com/compute/docs/disks/ However, compute API defines
    * the limit at 140, so this is what we check.
    */
  var disks: js.UndefOr[js.Array[SchemaManagedInstanceOverrideDiskOverride]] = js.native
  /**
    * Metadata overrides defined for this instance. TODO(b/69785416) validate
    * the total length is &lt;9 KB
    */
  var metadata: js.UndefOr[js.Array[AnonKey]] = js.native
  /**
    * [Output Only] Indicates where does the override come from.
    */
  var origin: js.UndefOr[String] = js.native
}

object SchemaManagedInstanceOverride {
  @scala.inline
  def apply(
    disks: js.Array[SchemaManagedInstanceOverrideDiskOverride] = null,
    metadata: js.Array[AnonKey] = null,
    origin: String = null
  ): SchemaManagedInstanceOverride = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedInstanceOverride]
  }
}

