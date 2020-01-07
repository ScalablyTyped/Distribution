package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Overrides of stateful properties for a given instance
  */
@js.native
trait Schema$ManagedInstanceOverride extends js.Object {
  /**
    * Disk overrides defined for this instance. According to documentation the
    * maximum number of disks attached to an instance is 128:
    * https://cloud.google.com/compute/docs/disks/ However, compute API defines
    * the limit at 140, so this is what we check.
    */
  var disks: js.UndefOr[js.Array[Schema$ManagedInstanceOverrideDiskOverride]] = js.native
  /**
    * Metadata overrides defined for this instance. TODO(b/69785416) validate
    * the total length is &lt;9 KB
    */
  var metadata: js.UndefOr[js.Array[Anon_Key]] = js.native
  /**
    * [Output Only] Indicates where does the override come from.
    */
  var origin: js.UndefOr[String] = js.native
}

object Schema$ManagedInstanceOverride {
  @scala.inline
  def apply(
    disks: js.Array[Schema$ManagedInstanceOverrideDiskOverride] = null,
    metadata: js.Array[Anon_Key] = null,
    origin: String = null
  ): Schema$ManagedInstanceOverride = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedInstanceOverride]
  }
}

