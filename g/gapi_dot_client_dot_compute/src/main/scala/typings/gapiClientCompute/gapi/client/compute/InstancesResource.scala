package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAccessConfig
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAutoDelete
import typings.gapiClientCompute.AnonDeviceName
import typings.gapiClientCompute.AnonFields
import typings.gapiClientCompute.AnonFieldsInstance
import typings.gapiClientCompute.AnonInstance
import typings.gapiClientCompute.AnonInstanceKey
import typings.gapiClientCompute.AnonPort
import typings.gapiClientCompute.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesResource extends js.Object {
  /** Adds an access config to an instance's network interface. */
  def addAccessConfig(request: AnonInstance): Request_[Operation]
  /** Retrieves aggregated list of instances. */
  def aggregatedList(request: AnonAlt): Request_[InstanceAggregatedList]
  /**
    * Attaches an existing Disk resource to an instance. You must first create the disk before you can attach it. It is not possible to create and attach a
    * disk at the same time. For more information, read Adding a persistent disk to your instance.
    */
  def attachDisk(request: AnonFieldsInstance): Request_[Operation]
  /** Deletes the specified Instance resource. For more information, see Stopping or Deleting an Instance. */
  def delete(request: AnonFieldsInstance): Request_[Operation]
  /** Deletes an access config from an instance's network interface. */
  def deleteAccessConfig(request: AnonAccessConfig): Request_[Operation]
  /** Detaches a disk from an instance. */
  def detachDisk(request: AnonDeviceName): Request_[Operation]
  /** Returns the specified Instance resource. Get a list of available instances by making a list() request. */
  def get(request: AnonInstanceKey): Request_[Instance]
  /** Returns the specified instance's serial port output. */
  def getSerialPortOutput(request: AnonPort): Request_[SerialPortOutput]
  /** Creates an instance resource in the specified project using the data included in the request. */
  def insert(request: AnonQuotaUser): Request_[Operation]
  /** Retrieves the list of instances contained within the specified zone. */
  def list(request: AnonFields): Request_[InstanceList]
  /** Performs a reset on the instance. For more information, see Resetting an instance. */
  def reset(request: AnonFieldsInstance): Request_[Operation]
  /** Sets the auto-delete flag for a disk attached to an instance. */
  def setDiskAutoDelete(request: AnonAutoDelete): Request_[Operation]
  /** Sets labels on an instance. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: AnonFieldsInstance): Request_[Operation]
  /** Changes the number and/or type of accelerator for a stopped instance to the values specified in the request. */
  def setMachineResources(request: AnonFieldsInstance): Request_[Operation]
  /** Changes the machine type for a stopped instance to the machine type specified in the request. */
  def setMachineType(request: AnonFieldsInstance): Request_[Operation]
  /** Sets metadata for the specified instance to the data included in the request. */
  def setMetadata(request: AnonFieldsInstance): Request_[Operation]
  /**
    * Changes the minimum CPU platform that this instance should use. This method can only be called on a stopped instance. For more information, read
    * Specifying a Minimum CPU Platform.
    */
  def setMinCpuPlatform(request: AnonFieldsInstance): Request_[Operation]
  /** Sets an instance's scheduling options. */
  def setScheduling(request: AnonFieldsInstance): Request_[Operation]
  /** Sets the service account on the instance. For more information, read Changing the service account and access scopes for an instance. */
  def setServiceAccount(request: AnonFieldsInstance): Request_[Operation]
  /** Sets tags for the specified instance to the data included in the request. */
  def setTags(request: AnonFieldsInstance): Request_[Operation]
  /** Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance. */
  def start(request: AnonFieldsInstance): Request_[Operation]
  /** Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance. */
  def startWithEncryptionKey(request: AnonFieldsInstance): Request_[Operation]
  /**
    * Stops a running instance, shutting it down cleanly, and allows you to restart the instance at a later time. Stopped instances do not incur per-minute,
    * virtual machine usage charges while they are stopped, but any resources that the virtual machine is using, such as persistent disks and static IP
    * addresses, will continue to be charged until they are deleted. For more information, see Stopping an instance.
    */
  def stop(request: AnonFieldsInstance): Request_[Operation]
}

object InstancesResource {
  @scala.inline
  def apply(
    addAccessConfig: AnonInstance => Request_[Operation],
    aggregatedList: AnonAlt => Request_[InstanceAggregatedList],
    attachDisk: AnonFieldsInstance => Request_[Operation],
    delete: AnonFieldsInstance => Request_[Operation],
    deleteAccessConfig: AnonAccessConfig => Request_[Operation],
    detachDisk: AnonDeviceName => Request_[Operation],
    get: AnonInstanceKey => Request_[Instance],
    getSerialPortOutput: AnonPort => Request_[SerialPortOutput],
    insert: AnonQuotaUser => Request_[Operation],
    list: AnonFields => Request_[InstanceList],
    reset: AnonFieldsInstance => Request_[Operation],
    setDiskAutoDelete: AnonAutoDelete => Request_[Operation],
    setLabels: AnonFieldsInstance => Request_[Operation],
    setMachineResources: AnonFieldsInstance => Request_[Operation],
    setMachineType: AnonFieldsInstance => Request_[Operation],
    setMetadata: AnonFieldsInstance => Request_[Operation],
    setMinCpuPlatform: AnonFieldsInstance => Request_[Operation],
    setScheduling: AnonFieldsInstance => Request_[Operation],
    setServiceAccount: AnonFieldsInstance => Request_[Operation],
    setTags: AnonFieldsInstance => Request_[Operation],
    start: AnonFieldsInstance => Request_[Operation],
    startWithEncryptionKey: AnonFieldsInstance => Request_[Operation],
    stop: AnonFieldsInstance => Request_[Operation]
  ): InstancesResource = {
    val __obj = js.Dynamic.literal(addAccessConfig = js.Any.fromFunction1(addAccessConfig), aggregatedList = js.Any.fromFunction1(aggregatedList), attachDisk = js.Any.fromFunction1(attachDisk), delete = js.Any.fromFunction1(delete), deleteAccessConfig = js.Any.fromFunction1(deleteAccessConfig), detachDisk = js.Any.fromFunction1(detachDisk), get = js.Any.fromFunction1(get), getSerialPortOutput = js.Any.fromFunction1(getSerialPortOutput), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), reset = js.Any.fromFunction1(reset), setDiskAutoDelete = js.Any.fromFunction1(setDiskAutoDelete), setLabels = js.Any.fromFunction1(setLabels), setMachineResources = js.Any.fromFunction1(setMachineResources), setMachineType = js.Any.fromFunction1(setMachineType), setMetadata = js.Any.fromFunction1(setMetadata), setMinCpuPlatform = js.Any.fromFunction1(setMinCpuPlatform), setScheduling = js.Any.fromFunction1(setScheduling), setServiceAccount = js.Any.fromFunction1(setServiceAccount), setTags = js.Any.fromFunction1(setTags), start = js.Any.fromFunction1(start), startWithEncryptionKey = js.Any.fromFunction1(startWithEncryptionKey), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[InstancesResource]
  }
}

