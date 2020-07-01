package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance-attached disk resource.
  */
@js.native
trait SchemaSavedAttachedDisk extends js.Object {
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
    * persistent-disks-x, where x is a number assigned by Google Compute
    * Engine. This field is only applicable for persistent disks.
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
    * the disk later.  Machine Images do not store customer-supplied encryption
    * keys, so you cannot use your own keys to encrypt disks in a managed
    * instance group.
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
    * Specifies a valid partial or full URL to an existing Persistent Disk
    * resource. When creating a new instance, one of
    * initializeParams.sourceImage or disks.source is required except for local
    * SSD.  If desired, you can also attach existing non-root persistent disks
    * using this property. This field is only applicable for persistent disks.
    * Note that for sourceMachineImage, specify the disk name, not the URL for
    * the disk.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * [Output Only] A size of the storage used by the disk&#39;s snapshot.
    */
  var storageBytes: js.UndefOr[String] = js.native
  /**
    * [Output Only] An indicator whether storageBytes is in a stable state or
    * it is being adjusted as a result of shared storage reallocation. This
    * status can either be UPDATING, meaning the size of the snapshot is being
    * updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
    */
  var storageBytesStatus: js.UndefOr[String] = js.native
  /**
    * Specifies the type of the disk, either SCRATCH or PERSISTENT. If not
    * specified, the default is PERSISTENT.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaSavedAttachedDisk {
  @scala.inline
  def apply(
    autoDelete: js.UndefOr[Boolean] = js.undefined,
    boot: js.UndefOr[Boolean] = js.undefined,
    deviceName: String = null,
    diskEncryptionKey: SchemaCustomerEncryptionKey = null,
    diskSizeGb: String = null,
    guestOsFeatures: js.Array[SchemaGuestOsFeature] = null,
    index: js.UndefOr[Double] = js.undefined,
    initializeParams: SchemaAttachedDiskInitializeParams = null,
    interface: String = null,
    kind: String = null,
    licenses: js.Array[String] = null,
    mode: String = null,
    savedState: String = null,
    source: String = null,
    storageBytes: String = null,
    storageBytesStatus: String = null,
    `type`: String = null
  ): SchemaSavedAttachedDisk = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDelete)) __obj.updateDynamic("autoDelete")(autoDelete.get.asInstanceOf[js.Any])
    if (!js.isUndefined(boot)) __obj.updateDynamic("boot")(boot.get.asInstanceOf[js.Any])
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (diskEncryptionKey != null) __obj.updateDynamic("diskEncryptionKey")(diskEncryptionKey.asInstanceOf[js.Any])
    if (diskSizeGb != null) __obj.updateDynamic("diskSizeGb")(diskSizeGb.asInstanceOf[js.Any])
    if (guestOsFeatures != null) __obj.updateDynamic("guestOsFeatures")(guestOsFeatures.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (initializeParams != null) __obj.updateDynamic("initializeParams")(initializeParams.asInstanceOf[js.Any])
    if (interface != null) __obj.updateDynamic("interface")(interface.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (licenses != null) __obj.updateDynamic("licenses")(licenses.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (savedState != null) __obj.updateDynamic("savedState")(savedState.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (storageBytes != null) __obj.updateDynamic("storageBytes")(storageBytes.asInstanceOf[js.Any])
    if (storageBytesStatus != null) __obj.updateDynamic("storageBytesStatus")(storageBytesStatus.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSavedAttachedDisk]
  }
}

