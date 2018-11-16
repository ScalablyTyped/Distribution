package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AttachedDiskInitializeParams extends js.Object {
  /** Specifies the disk name. If not specified, the default is to use the name of the instance. */
  var diskName: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the size of the disk in base-2 GB. */
  var diskSizeGb: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Specifies the disk type to use to create the instance. If not specified, the default is pd-standard, specified using the full URL. For example:
               *
               * https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/pd-standard
               *
               * Other values include pd-ssd and local-ssd. If you define this field, you can provide either the full or partial URL. For example, the following are
               * valid values:
               * - https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/diskType
               * - projects/project/zones/zone/diskTypes/diskType
               * - zones/zone/diskTypes/diskType  Note that for InstanceTemplate, this is the name of the disk type, not URL.
               */
  var diskType: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The source image to create this disk. When creating a new instance, one of initializeParams.sourceImage or disks.source is required.
               *
               * To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-8 to use the
               * latest Debian 8 image:
               *
               * projects/debian-cloud/global/images/family/debian-8
               *
               * Alternatively, use a specific version of a public operating system image:
               *
               * projects/debian-cloud/global/images/debian-8-jessie-vYYYYMMDD
               *
               * To create a disk with a private image that you created, specify the image name in the following format:
               *
               * global/images/my-private-image
               *
               * You can also specify a private image by its image family, which returns the latest version of the image in that family. Replace the image name with
               * family/family-name:
               *
               * global/images/family/my-private-family
               *
               * If the source image is deleted later, this field will not be set.
               */
  var sourceImage: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
               *
               * Instance templates do not store customer-supplied encryption keys, so you cannot create disks for instances in a managed instance group if the source
               * images are encrypted with your own keys.
               */
  var sourceImageEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.undefined
}

