package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AutoDelete
import typings.gapiClientCompute.anon.DeviceName
import typings.gapiClientCompute.anon.Fields
import typings.gapiClientCompute.anon.FieldsInstance
import typings.gapiClientCompute.anon.InstanceKey
import typings.gapiClientCompute.anon.Port
import typings.gapiClientCompute.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesResource extends js.Object {
  /** Adds an access config to an instance's network interface. */
  def addAccessConfig(request: typings.gapiClientCompute.anon.Instance): Request[Operation] = js.native
  /** Retrieves aggregated list of instances. */
  def aggregatedList(request: Alt): Request[InstanceAggregatedList] = js.native
  /**
    * Attaches an existing Disk resource to an instance. You must first create the disk before you can attach it. It is not possible to create and attach a
    * disk at the same time. For more information, read Adding a persistent disk to your instance.
    */
  def attachDisk(request: FieldsInstance): Request[Operation] = js.native
  /** Deletes the specified Instance resource. For more information, see Stopping or Deleting an Instance. */
  def delete(request: FieldsInstance): Request[Operation] = js.native
  /** Deletes an access config from an instance's network interface. */
  def deleteAccessConfig(request: typings.gapiClientCompute.anon.AccessConfig): Request[Operation] = js.native
  /** Detaches a disk from an instance. */
  def detachDisk(request: DeviceName): Request[Operation] = js.native
  /** Returns the specified Instance resource. Get a list of available instances by making a list() request. */
  def get(request: InstanceKey): Request[Instance] = js.native
  /** Returns the specified instance's serial port output. */
  def getSerialPortOutput(request: Port): Request[SerialPortOutput] = js.native
  /** Creates an instance resource in the specified project using the data included in the request. */
  def insert(request: QuotaUser): Request[Operation] = js.native
  /** Retrieves the list of instances contained within the specified zone. */
  def list(request: Fields): Request[InstanceList] = js.native
  /** Performs a reset on the instance. For more information, see Resetting an instance. */
  def reset(request: FieldsInstance): Request[Operation] = js.native
  /** Sets the auto-delete flag for a disk attached to an instance. */
  def setDiskAutoDelete(request: AutoDelete): Request[Operation] = js.native
  /** Sets labels on an instance. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: FieldsInstance): Request[Operation] = js.native
  /** Changes the number and/or type of accelerator for a stopped instance to the values specified in the request. */
  def setMachineResources(request: FieldsInstance): Request[Operation] = js.native
  /** Changes the machine type for a stopped instance to the machine type specified in the request. */
  def setMachineType(request: FieldsInstance): Request[Operation] = js.native
  /** Sets metadata for the specified instance to the data included in the request. */
  def setMetadata(request: FieldsInstance): Request[Operation] = js.native
  /**
    * Changes the minimum CPU platform that this instance should use. This method can only be called on a stopped instance. For more information, read
    * Specifying a Minimum CPU Platform.
    */
  def setMinCpuPlatform(request: FieldsInstance): Request[Operation] = js.native
  /** Sets an instance's scheduling options. */
  def setScheduling(request: FieldsInstance): Request[Operation] = js.native
  /** Sets the service account on the instance. For more information, read Changing the service account and access scopes for an instance. */
  def setServiceAccount(request: FieldsInstance): Request[Operation] = js.native
  /** Sets tags for the specified instance to the data included in the request. */
  def setTags(request: FieldsInstance): Request[Operation] = js.native
  /** Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance. */
  def start(request: FieldsInstance): Request[Operation] = js.native
  /** Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance. */
  def startWithEncryptionKey(request: FieldsInstance): Request[Operation] = js.native
  /**
    * Stops a running instance, shutting it down cleanly, and allows you to restart the instance at a later time. Stopped instances do not incur per-minute,
    * virtual machine usage charges while they are stopped, but any resources that the virtual machine is using, such as persistent disks and static IP
    * addresses, will continue to be charged until they are deleted. For more information, see Stopping an instance.
    */
  def stop(request: FieldsInstance): Request[Operation] = js.native
}

object InstancesResource {
  @scala.inline
  def apply(
    addAccessConfig: typings.gapiClientCompute.anon.Instance => Request[Operation],
    aggregatedList: Alt => Request[InstanceAggregatedList],
    attachDisk: FieldsInstance => Request[Operation],
    delete: FieldsInstance => Request[Operation],
    deleteAccessConfig: typings.gapiClientCompute.anon.AccessConfig => Request[Operation],
    detachDisk: DeviceName => Request[Operation],
    get: InstanceKey => Request[Instance],
    getSerialPortOutput: Port => Request[SerialPortOutput],
    insert: QuotaUser => Request[Operation],
    list: Fields => Request[InstanceList],
    reset: FieldsInstance => Request[Operation],
    setDiskAutoDelete: AutoDelete => Request[Operation],
    setLabels: FieldsInstance => Request[Operation],
    setMachineResources: FieldsInstance => Request[Operation],
    setMachineType: FieldsInstance => Request[Operation],
    setMetadata: FieldsInstance => Request[Operation],
    setMinCpuPlatform: FieldsInstance => Request[Operation],
    setScheduling: FieldsInstance => Request[Operation],
    setServiceAccount: FieldsInstance => Request[Operation],
    setTags: FieldsInstance => Request[Operation],
    start: FieldsInstance => Request[Operation],
    startWithEncryptionKey: FieldsInstance => Request[Operation],
    stop: FieldsInstance => Request[Operation]
  ): InstancesResource = {
    val __obj = js.Dynamic.literal(addAccessConfig = js.Any.fromFunction1(addAccessConfig), aggregatedList = js.Any.fromFunction1(aggregatedList), attachDisk = js.Any.fromFunction1(attachDisk), delete = js.Any.fromFunction1(delete), deleteAccessConfig = js.Any.fromFunction1(deleteAccessConfig), detachDisk = js.Any.fromFunction1(detachDisk), get = js.Any.fromFunction1(get), getSerialPortOutput = js.Any.fromFunction1(getSerialPortOutput), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), reset = js.Any.fromFunction1(reset), setDiskAutoDelete = js.Any.fromFunction1(setDiskAutoDelete), setLabels = js.Any.fromFunction1(setLabels), setMachineResources = js.Any.fromFunction1(setMachineResources), setMachineType = js.Any.fromFunction1(setMachineType), setMetadata = js.Any.fromFunction1(setMetadata), setMinCpuPlatform = js.Any.fromFunction1(setMinCpuPlatform), setScheduling = js.Any.fromFunction1(setScheduling), setServiceAccount = js.Any.fromFunction1(setServiceAccount), setTags = js.Any.fromFunction1(setTags), start = js.Any.fromFunction1(start), startWithEncryptionKey = js.Any.fromFunction1(startWithEncryptionKey), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[InstancesResource]
  }
  @scala.inline
  implicit class InstancesResourceOps[Self <: InstancesResource] (val x: Self) extends AnyVal {
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
    def setAddAccessConfig(value: typings.gapiClientCompute.anon.Instance => Request[Operation]): Self = this.set("addAccessConfig", js.Any.fromFunction1(value))
    @scala.inline
    def setAggregatedList(value: Alt => Request[InstanceAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    @scala.inline
    def setAttachDisk(value: FieldsInstance => Request[Operation]): Self = this.set("attachDisk", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: FieldsInstance => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteAccessConfig(value: typings.gapiClientCompute.anon.AccessConfig => Request[Operation]): Self = this.set("deleteAccessConfig", js.Any.fromFunction1(value))
    @scala.inline
    def setDetachDisk(value: DeviceName => Request[Operation]): Self = this.set("detachDisk", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: InstanceKey => Request[Instance]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetSerialPortOutput(value: Port => Request[SerialPortOutput]): Self = this.set("getSerialPortOutput", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: QuotaUser => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[InstanceList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setReset(value: FieldsInstance => Request[Operation]): Self = this.set("reset", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDiskAutoDelete(value: AutoDelete => Request[Operation]): Self = this.set("setDiskAutoDelete", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLabels(value: FieldsInstance => Request[Operation]): Self = this.set("setLabels", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMachineResources(value: FieldsInstance => Request[Operation]): Self = this.set("setMachineResources", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMachineType(value: FieldsInstance => Request[Operation]): Self = this.set("setMachineType", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMetadata(value: FieldsInstance => Request[Operation]): Self = this.set("setMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMinCpuPlatform(value: FieldsInstance => Request[Operation]): Self = this.set("setMinCpuPlatform", js.Any.fromFunction1(value))
    @scala.inline
    def setSetScheduling(value: FieldsInstance => Request[Operation]): Self = this.set("setScheduling", js.Any.fromFunction1(value))
    @scala.inline
    def setSetServiceAccount(value: FieldsInstance => Request[Operation]): Self = this.set("setServiceAccount", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTags(value: FieldsInstance => Request[Operation]): Self = this.set("setTags", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: FieldsInstance => Request[Operation]): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def setStartWithEncryptionKey(value: FieldsInstance => Request[Operation]): Self = this.set("startWithEncryptionKey", js.Any.fromFunction1(value))
    @scala.inline
    def setStop(value: FieldsInstance => Request[Operation]): Self = this.set("stop", js.Any.fromFunction1(value))
  }
  
}

