package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Key
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
  var metadata: js.UndefOr[js.Array[Key]] = js.native
  /**
    * [Output Only] Indicates where does the override come from.
    */
  var origin: js.UndefOr[String] = js.native
}

object SchemaManagedInstanceOverride {
  @scala.inline
  def apply(): SchemaManagedInstanceOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstanceOverride]
  }
  @scala.inline
  implicit class SchemaManagedInstanceOverrideOps[Self <: SchemaManagedInstanceOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisksVarargs(value: SchemaManagedInstanceOverrideDiskOverride*): Self = this.set("disks", js.Array(value :_*))
    @scala.inline
    def setDisks(value: js.Array[SchemaManagedInstanceOverrideDiskOverride]): Self = this.set("disks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisks: Self = this.set("disks", js.undefined)
    @scala.inline
    def setMetadataVarargs(value: Key*): Self = this.set("metadata", js.Array(value :_*))
    @scala.inline
    def setMetadata(value: js.Array[Key]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
  
}

