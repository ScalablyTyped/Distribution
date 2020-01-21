package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltDisk
import typings.gapiClientCompute.AnonAltDiskFields
import typings.gapiClientCompute.AnonAltDiskFieldsKey
import typings.gapiClientCompute.AnonAltFields
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProject
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisksResource extends js.Object {
  /** Retrieves an aggregated list of persistent disks. */
  def aggregatedList(request: AnonAlt): Request_[DiskAggregatedList]
  /** Creates a snapshot of a specified persistent disk. */
  def createSnapshot(request: AnonAltDisk): Request_[Operation]
  /**
    * Deletes the specified persistent disk. Deleting a disk removes its data permanently and is irreversible. However, deleting a disk does not delete any
    * snapshots previously made from the disk. You must separately delete snapshots.
    */
  def delete(request: AnonAltDiskFields): Request_[Operation]
  /** Returns a specified persistent disk. Get a list of available persistent disks by making a list() request. */
  def get(request: AnonAltDiskFieldsKey): Request_[Disk]
  /**
    * Creates a persistent disk in the specified project using the data in the request. You can create a disk with a sourceImage, a sourceSnapshot, or create
    * an empty 500 GB data disk by omitting all properties. You can also create a disk that is larger than the default size by specifying the sizeGb
    * property.
    */
  def insert(request: AnonAltFieldsKeyOauthtokenPrettyPrintProject): Request_[Operation]
  /** Retrieves a list of persistent disks contained within the specified zone. */
  def list(request: AnonAltFields): Request_[DiskList]
  /** Resizes the specified persistent disk. */
  def resize(request: AnonAltDiskFields): Request_[Operation]
  /** Sets the labels on a disk. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUser): Request_[Operation]
}

object DisksResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[DiskAggregatedList],
    createSnapshot: AnonAltDisk => Request_[Operation],
    delete: AnonAltDiskFields => Request_[Operation],
    get: AnonAltDiskFieldsKey => Request_[Disk],
    insert: AnonAltFieldsKeyOauthtokenPrettyPrintProject => Request_[Operation],
    list: AnonAltFields => Request_[DiskList],
    resize: AnonAltDiskFields => Request_[Operation],
    setLabels: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUser => Request_[Operation]
  ): DisksResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), createSnapshot = js.Any.fromFunction1(createSnapshot), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), resize = js.Any.fromFunction1(resize), setLabels = js.Any.fromFunction1(setLabels))
  
    __obj.asInstanceOf[DisksResource]
  }
}

