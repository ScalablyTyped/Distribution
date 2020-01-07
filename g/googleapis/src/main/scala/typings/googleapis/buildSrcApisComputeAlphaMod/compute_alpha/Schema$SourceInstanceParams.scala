package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specification of the parameters to use when creating the instance
  * template from a source instance.
  */
@js.native
trait Schema$SourceInstanceParams extends js.Object {
  /**
    * Attached disks configuration. If not provided, defaults are applied: For
    * boot disk and any other R/W disks, new custom images will be created from
    * each disk. For read-only disks, they will be attached in read-only mode.
    * Local SSD disks will be created as blank volumes.
    */
  var diskConfigs: js.UndefOr[js.Array[Schema$DiskInstantiationConfig]] = js.native
}

object Schema$SourceInstanceParams {
  @scala.inline
  def apply(diskConfigs: js.Array[Schema$DiskInstantiationConfig] = null): Schema$SourceInstanceParams = {
    val __obj = js.Dynamic.literal()
    if (diskConfigs != null) __obj.updateDynamic("diskConfigs")(diskConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SourceInstanceParams]
  }
}

