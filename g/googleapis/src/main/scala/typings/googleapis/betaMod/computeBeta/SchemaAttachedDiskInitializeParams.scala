package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Input Only] Specifies the parameters for a new disk that will be created
  * alongside the new instance. Use initialization parameters to create boot
  * disks or local SSDs attached to the new instance.  This property is
  * mutually exclusive with the source property; you can only define one or the
  * other, but not both.
  */
@js.native
trait SchemaAttachedDiskInitializeParams extends js.Object {
  /**
    * An optional description. Provide this property when creating the disk.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Specifies the disk name. If not specified, the default is to use the name
    * of the instance. If the disk with the instance name exists already in the
    * given zone/region, a new name will be automatically generated.
    */
  var diskName: js.UndefOr[String] = js.native
  /**
    * Specifies the size of the disk in base-2 GB.
    */
  var diskSizeGb: js.UndefOr[String] = js.native
  /**
    * Specifies the disk type to use to create the instance. If not specified,
    * the default is pd-standard, specified using the full URL. For example:
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/pd-standard
    * Other values include pd-ssd and local-ssd. If you define this field, you
    * can provide either the full or partial URL. For example, the following
    * are valid values:   -
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/diskType
    * - projects/project/zones/zone/diskTypes/diskType  -
    * zones/zone/diskTypes/diskType  Note that for InstanceTemplate, this is
    * the name of the disk type, not URL.
    */
  var diskType: js.UndefOr[String] = js.native
  /**
    * A list of features to enable on the guest operating system. Applicable
    * only for bootable images. Read  Enabling guest operating system features
    * to see a list of available options.  Guest OS features are applied by
    * merging initializeParams.guestOsFeatures and disks.guestOsFeatures
    */
  var guestOsFeatures: js.UndefOr[js.Array[SchemaGuestOsFeature]] = js.native
  /**
    * Labels to apply to this disk. These can be later modified by the
    * disks.setLabels method. This field is only applicable for persistent
    * disks.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The source image to create this disk. When creating a new instance, one
    * of initializeParams.sourceImage or disks.source is required except for
    * local SSD.  To create a disk with one of the public operating system
    * images, specify the image by its family name. For example, specify
    * family/debian-9 to use the latest Debian 9 image:
    * projects/debian-cloud/global/images/family/debian-9   Alternatively, use
    * a specific version of a public operating system image:
    * projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD   To
    * create a disk with a custom image that you created, specify the image
    * name in the following format: global/images/my-custom-image   You can
    * also specify a custom image by its image family, which returns the latest
    * version of the image in that family. Replace the image name with
    * family/family-name: global/images/family/my-image-family   If the source
    * image is deleted later, this field will not be set.
    */
  var sourceImage: js.UndefOr[String] = js.native
  /**
    * The customer-supplied encryption key of the source image. Required if the
    * source image is protected by a customer-supplied encryption key. Instance
    * templates do not store customer-supplied encryption keys, so you cannot
    * create disks for instances in a managed instance group if the source
    * images are encrypted with your own keys.
    */
  var sourceImageEncryptionKey: js.UndefOr[SchemaCustomerEncryptionKey] = js.native
}

object SchemaAttachedDiskInitializeParams {
  @scala.inline
  def apply(
    description: String = null,
    diskName: String = null,
    diskSizeGb: String = null,
    diskType: String = null,
    guestOsFeatures: js.Array[SchemaGuestOsFeature] = null,
    labels: StringDictionary[String] = null,
    sourceImage: String = null,
    sourceImageEncryptionKey: SchemaCustomerEncryptionKey = null
  ): SchemaAttachedDiskInitializeParams = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (diskName != null) __obj.updateDynamic("diskName")(diskName.asInstanceOf[js.Any])
    if (diskSizeGb != null) __obj.updateDynamic("diskSizeGb")(diskSizeGb.asInstanceOf[js.Any])
    if (diskType != null) __obj.updateDynamic("diskType")(diskType.asInstanceOf[js.Any])
    if (guestOsFeatures != null) __obj.updateDynamic("guestOsFeatures")(guestOsFeatures.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (sourceImage != null) __obj.updateDynamic("sourceImage")(sourceImage.asInstanceOf[js.Any])
    if (sourceImageEncryptionKey != null) __obj.updateDynamic("sourceImageEncryptionKey")(sourceImageEncryptionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAttachedDiskInitializeParams]
  }
}

