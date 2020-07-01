package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specification of the desired way to instantiate a disk in the instance
  * template when its created from a source instance.
  */
@js.native
trait SchemaDiskInstantiationConfig extends js.Object {
  /**
    * Specifies whether the disk will be auto-deleted when the instance is
    * deleted (but not when the disk is detached from the instance).
    */
  var autoDelete: js.UndefOr[Boolean] = js.native
  /**
    * The custom source image to be used to restore this disk when
    * instantiating this instance template.
    */
  var customImage: js.UndefOr[String] = js.native
  /**
    * Specifies the device name of the disk to which the configurations apply
    * to.
    */
  var deviceName: js.UndefOr[String] = js.native
  /**
    * Specifies whether to include the disk and what image to use. Possible
    * values are:   - source-image: to use the same image that was used to
    * create the source instance&#39;s corresponding disk. Applicable to the
    * boot disk and additional read-write disks.  - source-image-family: to use
    * the same image family that was used to create the source instance&#39;s
    * corresponding disk. Applicable to the boot disk and additional read-write
    * disks.  - custom-image: to use a user-provided image url for disk
    * creation. Applicable to the boot disk and additional read-write disks.  -
    * attach-read-only: to attach a read-only disk. Applicable to read-only
    * disks.  - do-not-include: to exclude a disk from the template. Applicable
    * to additional read-write disks, local SSDs, and read-only disks.
    */
  var instantiateFrom: js.UndefOr[String] = js.native
}

object SchemaDiskInstantiationConfig {
  @scala.inline
  def apply(
    autoDelete: js.UndefOr[Boolean] = js.undefined,
    customImage: String = null,
    deviceName: String = null,
    instantiateFrom: String = null
  ): SchemaDiskInstantiationConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDelete)) __obj.updateDynamic("autoDelete")(autoDelete.get.asInstanceOf[js.Any])
    if (customImage != null) __obj.updateDynamic("customImage")(customImage.asInstanceOf[js.Any])
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (instantiateFrom != null) __obj.updateDynamic("instantiateFrom")(instantiateFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDiskInstantiationConfig]
  }
}

