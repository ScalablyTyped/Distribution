package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance-attached disk resource.
  */
@js.native
trait SchemaAttachedDisk extends StObject {
  
  /**
    * Specifies whether the disk will be auto-deleted when the instance is
    * deleted (but not when the disk is detached from the instance).
    */
  var autoDelete: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates that this is a boot disk. The virtual machine will use the
    * first partition of the disk for its root filesystem.
    */
  var boot: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies a unique device name of your choice that is reflected into the
    * /dev/disk/by-id/google-* tree of a Linux operating system running within
    * the instance. This name can be used to reference the device for mounting,
    * resizing, and so on, from within the instance.  If not specified, the
    * server chooses a default device name to apply to this disk, in the form
    * persistent-disk-x, where x is a number assigned by Google Compute Engine.
    * This field is only applicable for persistent disks.
    */
  var deviceName: js.UndefOr[String] = js.native
  
  /**
    * Encrypts or decrypts a disk using a customer-supplied encryption key.  If
    * you are creating a new disk, this field encrypts the new disk using an
    * encryption key that you provide. If you are attaching an existing disk
    * that is already encrypted, this field decrypts the disk using the
    * customer-supplied encryption key.  If you encrypt a disk using a
    * customer-supplied key, you must provide the same key again when you
    * attempt to use this resource at a later time. For example, you must
    * provide the key when you create a snapshot or an image from the disk or
    * when you attach the disk to a virtual machine instance.  If you do not
    * provide an encryption key, then the disk will be encrypted using an
    * automatically generated key and you do not need to provide a key to use
    * the disk later.  Instance templates do not store customer-supplied
    * encryption keys, so you cannot use your own keys to encrypt disks in a
    * managed instance group.
    */
  var diskEncryptionKey: js.UndefOr[SchemaCustomerEncryptionKey] = js.native
  
  /**
    * The size of the disk in base-2 GB. This supersedes disk_size_gb in
    * InitializeParams.
    */
  var diskSizeGb: js.UndefOr[String] = js.native
  
  /**
    * A list of features to enable on the guest operating system. Applicable
    * only for bootable images. Read  Enabling guest operating system features
    * to see a list of available options.
    */
  var guestOsFeatures: js.UndefOr[js.Array[SchemaGuestOsFeature]] = js.native
  
  /**
    * [Output Only] A zero-based index to this disk, where 0 is reserved for
    * the boot disk. If you have many disks attached to an instance, each disk
    * would have a unique index number.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * [Input Only] Specifies the parameters for a new disk that will be created
    * alongside the new instance. Use initialization parameters to create boot
    * disks or local SSDs attached to the new instance.  This property is
    * mutually exclusive with the source property; you can only define one or
    * the other, but not both.
    */
  var initializeParams: js.UndefOr[SchemaAttachedDiskInitializeParams] = js.native
  
  /**
    * Specifies the disk interface to use for attaching this disk, which is
    * either SCSI or NVME. The default is SCSI. Persistent disks must always
    * use SCSI and the request will fail if you attempt to attach a persistent
    * disk in any other format than SCSI. Local SSDs can use either NVME or
    * SCSI. For performance characteristics of SCSI over NVMe, see Local SSD
    * performance.
    */
  var interface: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Type of the resource. Always compute#attachedDisk for
    * attached disks.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Any valid publicly visible licenses.
    */
  var licenses: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If
    * not specified, the default is to attach the disk in READ_WRITE mode.
    */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * For LocalSSD disks on VM Instances in STOPPED or SUSPENDED state, this
    * field is set to PRESERVED if the LocalSSD data has been saved to a
    * persistent location by customer request. (see the discard_local_ssd
    * option on Stop/Suspend). Read-only in the api.
    */
  var savedState: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] shielded vm initial state stored on disk
    */
  var shieldedInstanceInitialState: js.UndefOr[SchemaInitialStateConfig] = js.native
  
  /**
    * Specifies a valid partial or full URL to an existing Persistent Disk
    * resource. When creating a new instance, one of
    * initializeParams.sourceImage or disks.source is required except for local
    * SSD.  If desired, you can also attach existing non-root persistent disks
    * using this property. This field is only applicable for persistent disks.
    * Note that for InstanceTemplate, specify the disk name, not the URL for
    * the disk.
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * Specifies the type of the disk, either SCRATCH or PERSISTENT. If not
    * specified, the default is PERSISTENT.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaAttachedDisk {
  
  @scala.inline
  def apply(): SchemaAttachedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachedDisk]
  }
  
  @scala.inline
  implicit class SchemaAttachedDiskMutableBuilder[Self <: SchemaAttachedDisk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoDelete(value: Boolean): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
    
    @scala.inline
    def setBoot(value: Boolean): Self = StObject.set(x, "boot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootUndefined: Self = StObject.set(x, "boot", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    @scala.inline
    def setDiskEncryptionKey(value: SchemaCustomerEncryptionKey): Self = StObject.set(x, "diskEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskEncryptionKeyUndefined: Self = StObject.set(x, "diskEncryptionKey", js.undefined)
    
    @scala.inline
    def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    @scala.inline
    def setGuestOsFeatures(value: js.Array[SchemaGuestOsFeature]): Self = StObject.set(x, "guestOsFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuestOsFeaturesUndefined: Self = StObject.set(x, "guestOsFeatures", js.undefined)
    
    @scala.inline
    def setGuestOsFeaturesVarargs(value: SchemaGuestOsFeature*): Self = StObject.set(x, "guestOsFeatures", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setInitializeParams(value: SchemaAttachedDiskInitializeParams): Self = StObject.set(x, "initializeParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializeParamsUndefined: Self = StObject.set(x, "initializeParams", js.undefined)
    
    @scala.inline
    def setInterface(value: String): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceUndefined: Self = StObject.set(x, "interface", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLicenses(value: js.Array[String]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
    
    @scala.inline
    def setLicensesVarargs(value: String*): Self = StObject.set(x, "licenses", js.Array(value :_*))
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setSavedState(value: String): Self = StObject.set(x, "savedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedStateUndefined: Self = StObject.set(x, "savedState", js.undefined)
    
    @scala.inline
    def setShieldedInstanceInitialState(value: SchemaInitialStateConfig): Self = StObject.set(x, "shieldedInstanceInitialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShieldedInstanceInitialStateUndefined: Self = StObject.set(x, "shieldedInstanceInitialState", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
