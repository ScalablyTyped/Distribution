package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Input Only] Specifies the parameters for a new disk that will be created
  * alongside the new instance. Use initialization parameters to create boot
  * disks or local SSDs attached to the new instance.  This property is
  * mutually exclusive with the source property; you can only define one or the
  * other, but not both.
  */
trait SchemaAttachedDiskInitializeParams extends StObject {
  
  /**
    * An optional description. Provide this property when creating the disk.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the disk name. If not specified, the default is to use the name
    * of the instance. If the disk with the instance name exists already in the
    * given zone/region, a new name will be automatically generated.
    */
  var diskName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the size of the disk in base-2 GB.
    */
  var diskSizeGb: js.UndefOr[String] = js.undefined
  
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
  var diskType: js.UndefOr[String] = js.undefined
  
  /**
    * A list of features to enable on the guest operating system. Applicable
    * only for bootable images. Read  Enabling guest operating system features
    * to see a list of available options.  Guest OS features are applied by
    * merging initializeParams.guestOsFeatures and disks.guestOsFeatures
    */
  var guestOsFeatures: js.UndefOr[js.Array[SchemaGuestOsFeature]] = js.undefined
  
  /**
    * Labels to apply to this disk. These can be later modified by the
    * disks.setLabels method. This field is only applicable for persistent
    * disks.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * URLs of the zones where the disk should be replicated to. Only applicable
    * for regional resources.
    */
  var replicaZones: js.UndefOr[js.Array[String]] = js.undefined
  
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
  var sourceImage: js.UndefOr[String] = js.undefined
  
  /**
    * The customer-supplied encryption key of the source image. Required if the
    * source image is protected by a customer-supplied encryption key. Instance
    * templates do not store customer-supplied encryption keys, so you cannot
    * create disks for instances in a managed instance group if the source
    * images are encrypted with your own keys.
    */
  var sourceImageEncryptionKey: js.UndefOr[SchemaCustomerEncryptionKey] = js.undefined
  
  /**
    * The source snapshot to create this disk. When creating a new instance,
    * one of initializeParams.sourceSnapshot or disks.source is required except
    * for local SSD.  To create a disk with a snapshot that you created,
    * specify the snapshot name in the following format:
    * global/snapshots/my-backup   If the source snapshot is deleted later,
    * this field will not be set.
    */
  var sourceSnapshot: js.UndefOr[String] = js.undefined
  
  /**
    * The customer-supplied encryption key of the source snapshot.
    */
  var sourceSnapshotEncryptionKey: js.UndefOr[SchemaCustomerEncryptionKey] = js.undefined
}
object SchemaAttachedDiskInitializeParams {
  
  inline def apply(): SchemaAttachedDiskInitializeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachedDiskInitializeParams]
  }
  
  extension [Self <: SchemaAttachedDiskInitializeParams](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiskName(value: String): Self = StObject.set(x, "diskName", value.asInstanceOf[js.Any])
    
    inline def setDiskNameUndefined: Self = StObject.set(x, "diskName", js.undefined)
    
    inline def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    inline def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
    
    inline def setGuestOsFeatures(value: js.Array[SchemaGuestOsFeature]): Self = StObject.set(x, "guestOsFeatures", value.asInstanceOf[js.Any])
    
    inline def setGuestOsFeaturesUndefined: Self = StObject.set(x, "guestOsFeatures", js.undefined)
    
    inline def setGuestOsFeaturesVarargs(value: SchemaGuestOsFeature*): Self = StObject.set(x, "guestOsFeatures", js.Array(value :_*))
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setReplicaZones(value: js.Array[String]): Self = StObject.set(x, "replicaZones", value.asInstanceOf[js.Any])
    
    inline def setReplicaZonesUndefined: Self = StObject.set(x, "replicaZones", js.undefined)
    
    inline def setReplicaZonesVarargs(value: String*): Self = StObject.set(x, "replicaZones", js.Array(value :_*))
    
    inline def setSourceImage(value: String): Self = StObject.set(x, "sourceImage", value.asInstanceOf[js.Any])
    
    inline def setSourceImageEncryptionKey(value: SchemaCustomerEncryptionKey): Self = StObject.set(x, "sourceImageEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setSourceImageEncryptionKeyUndefined: Self = StObject.set(x, "sourceImageEncryptionKey", js.undefined)
    
    inline def setSourceImageUndefined: Self = StObject.set(x, "sourceImage", js.undefined)
    
    inline def setSourceSnapshot(value: String): Self = StObject.set(x, "sourceSnapshot", value.asInstanceOf[js.Any])
    
    inline def setSourceSnapshotEncryptionKey(value: SchemaCustomerEncryptionKey): Self = StObject.set(x, "sourceSnapshotEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setSourceSnapshotEncryptionKeyUndefined: Self = StObject.set(x, "sourceSnapshotEncryptionKey", js.undefined)
    
    inline def setSourceSnapshotUndefined: Self = StObject.set(x, "sourceSnapshot", js.undefined)
  }
}
