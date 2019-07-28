package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_AccessConfig
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltAutoDelete
import typings.gapiDotClientDotCompute.Anon_AltDeviceName
import typings.gapiDotClientDotCompute.Anon_AltFields
import typings.gapiDotClientDotCompute.Anon_AltFieldsInstance
import typings.gapiDotClientDotCompute.Anon_AltFieldsInstanceKey
import typings.gapiDotClientDotCompute.Anon_AltFieldsInstanceKeyOauthtoken
import typings.gapiDotClientDotCompute.Anon_AltFieldsInstanceKeyOauthtokenPort
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesResource extends js.Object {
  /** Adds an access config to an instance's network interface. */
  def addAccessConfig(request: Anon_AltFieldsInstance): Request[Operation]
  /** Retrieves aggregated list of instances. */
  def aggregatedList(request: Anon_Alt): Request[InstanceAggregatedList]
  /**
    * Attaches an existing Disk resource to an instance. You must first create the disk before you can attach it. It is not possible to create and attach a
    * disk at the same time. For more information, read Adding a persistent disk to your instance.
    */
  def attachDisk(request: Anon_AltFieldsInstanceKey): Request[Operation]
  /** Deletes the specified Instance resource. For more information, see Stopping or Deleting an Instance. */
  def delete(request: Anon_AltFieldsInstanceKey): Request[Operation]
  /** Deletes an access config from an instance's network interface. */
  def deleteAccessConfig(request: Anon_AccessConfig): Request[Operation]
  /** Detaches a disk from an instance. */
  def detachDisk(request: Anon_AltDeviceName): Request[Operation]
  /** Returns the specified Instance resource. Get a list of available instances by making a list() request. */
  def get(request: Anon_AltFieldsInstanceKeyOauthtoken): Request[Instance]
  /** Returns the specified instance's serial port output. */
  def getSerialPortOutput(request: Anon_AltFieldsInstanceKeyOauthtokenPort): Request[SerialPortOutput]
  /** Creates an instance resource in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtoken): Request[Operation]
  /** Retrieves the list of instances contained within the specified zone. */
  def list(request: Anon_AltFields): Request[InstanceList]
  /** Performs a reset on the instance. For more information, see Resetting an instance. */
  def reset(request: Anon_AltFieldsInstanceKey): Request[Operation]
  /** Sets the auto-delete flag for a disk attached to an instance. */
  def setDiskAutoDelete(request: Anon_AltAutoDelete): Request[Operation]
  /** Sets labels on an instance. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: Anon_AltFieldsInstanceKey): Request[Operation]
  /** Changes the number and/or type of accelerator for a stopped instance to the values specified in the request. */
  def setMachineResources(request: Anon_AltFieldsInstanceKey): Request[Operation]
  /** Changes the machine type for a stopped instance to the machine type specified in the request. */
  def setMachineType(request: Anon_AltFieldsInstanceKey): Request[Operation]
  /** Sets metadata for the specified instance to the data included in the request. */
  def setMetadata(request: Anon_AltFieldsInstanceKey): Request[Operation]
  /**
    * Changes the minimum CPU platform that this instance should use. This method can only be called on a stopped instance. For more information, read
    * Specifying a Minimum CPU Platform.
    */
  def setMinCpuPlatform(request: Anon_AltFieldsInstanceKey): Request[Operation]
  /** Sets an instance's scheduling options. */
  def setScheduling(request: Anon_AltFieldsInstanceKey): Request[Operation]
  /** Sets the service account on the instance. For more information, read Changing the service account and access scopes for an instance. */
  def setServiceAccount(request: Anon_AltFieldsInstanceKey): Request[Operation]
  /** Sets tags for the specified instance to the data included in the request. */
  def setTags(request: Anon_AltFieldsInstanceKey): Request[Operation]
  /** Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance. */
  def start(request: Anon_AltFieldsInstanceKey): Request[Operation]
  /** Starts an instance that was stopped using the using the instances().stop method. For more information, see Restart an instance. */
  def startWithEncryptionKey(request: Anon_AltFieldsInstanceKey): Request[Operation]
  /**
    * Stops a running instance, shutting it down cleanly, and allows you to restart the instance at a later time. Stopped instances do not incur per-minute,
    * virtual machine usage charges while they are stopped, but any resources that the virtual machine is using, such as persistent disks and static IP
    * addresses, will continue to be charged until they are deleted. For more information, see Stopping an instance.
    */
  def stop(request: Anon_AltFieldsInstanceKey): Request[Operation]
}

object InstancesResource {
  @scala.inline
  def apply(
    addAccessConfig: Anon_AltFieldsInstance => Request[Operation],
    aggregatedList: Anon_Alt => Request[InstanceAggregatedList],
    attachDisk: Anon_AltFieldsInstanceKey => Request[Operation],
    delete: Anon_AltFieldsInstanceKey => Request[Operation],
    deleteAccessConfig: Anon_AccessConfig => Request[Operation],
    detachDisk: Anon_AltDeviceName => Request[Operation],
    get: Anon_AltFieldsInstanceKeyOauthtoken => Request[Instance],
    getSerialPortOutput: Anon_AltFieldsInstanceKeyOauthtokenPort => Request[SerialPortOutput],
    insert: Anon_AltFieldsKeyOauthtoken => Request[Operation],
    list: Anon_AltFields => Request[InstanceList],
    reset: Anon_AltFieldsInstanceKey => Request[Operation],
    setDiskAutoDelete: Anon_AltAutoDelete => Request[Operation],
    setLabels: Anon_AltFieldsInstanceKey => Request[Operation],
    setMachineResources: Anon_AltFieldsInstanceKey => Request[Operation],
    setMachineType: Anon_AltFieldsInstanceKey => Request[Operation],
    setMetadata: Anon_AltFieldsInstanceKey => Request[Operation],
    setMinCpuPlatform: Anon_AltFieldsInstanceKey => Request[Operation],
    setScheduling: Anon_AltFieldsInstanceKey => Request[Operation],
    setServiceAccount: Anon_AltFieldsInstanceKey => Request[Operation],
    setTags: Anon_AltFieldsInstanceKey => Request[Operation],
    start: Anon_AltFieldsInstanceKey => Request[Operation],
    startWithEncryptionKey: Anon_AltFieldsInstanceKey => Request[Operation],
    stop: Anon_AltFieldsInstanceKey => Request[Operation]
  ): InstancesResource = {
    val __obj = js.Dynamic.literal(addAccessConfig = js.Any.fromFunction1(addAccessConfig), aggregatedList = js.Any.fromFunction1(aggregatedList), attachDisk = js.Any.fromFunction1(attachDisk), delete = js.Any.fromFunction1(delete), deleteAccessConfig = js.Any.fromFunction1(deleteAccessConfig), detachDisk = js.Any.fromFunction1(detachDisk), get = js.Any.fromFunction1(get), getSerialPortOutput = js.Any.fromFunction1(getSerialPortOutput), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), reset = js.Any.fromFunction1(reset), setDiskAutoDelete = js.Any.fromFunction1(setDiskAutoDelete), setLabels = js.Any.fromFunction1(setLabels), setMachineResources = js.Any.fromFunction1(setMachineResources), setMachineType = js.Any.fromFunction1(setMachineType), setMetadata = js.Any.fromFunction1(setMetadata), setMinCpuPlatform = js.Any.fromFunction1(setMinCpuPlatform), setScheduling = js.Any.fromFunction1(setScheduling), setServiceAccount = js.Any.fromFunction1(setServiceAccount), setTags = js.Any.fromFunction1(setTags), start = js.Any.fromFunction1(start), startWithEncryptionKey = js.Any.fromFunction1(startWithEncryptionKey), stop = js.Any.fromFunction1(stop))
  
    __obj.asInstanceOf[InstancesResource]
  }
}

