package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltDisk
import typings.gapiDotClientDotCompute.Anon_AltDiskFields
import typings.gapiDotClientDotCompute.Anon_AltDiskFieldsKey
import typings.gapiDotClientDotCompute.Anon_AltFields
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProject
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisksResource extends js.Object {
  /** Retrieves an aggregated list of persistent disks. */
  def aggregatedList(request: Anon_Alt): Request[DiskAggregatedList]
  /** Creates a snapshot of a specified persistent disk. */
  def createSnapshot(request: Anon_AltDisk): Request[Operation]
  /**
    * Deletes the specified persistent disk. Deleting a disk removes its data permanently and is irreversible. However, deleting a disk does not delete any
    * snapshots previously made from the disk. You must separately delete snapshots.
    */
  def delete(request: Anon_AltDiskFields): Request[Operation]
  /** Returns a specified persistent disk. Get a list of available persistent disks by making a list() request. */
  def get(request: Anon_AltDiskFieldsKey): Request[Disk]
  /**
    * Creates a persistent disk in the specified project using the data in the request. You can create a disk with a sourceImage, a sourceSnapshot, or create
    * an empty 500 GB data disk by omitting all properties. You can also create a disk that is larger than the default size by specifying the sizeGb
    * property.
    */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProject): Request[Operation]
  /** Retrieves a list of persistent disks contained within the specified zone. */
  def list(request: Anon_AltFields): Request[DiskList]
  /** Resizes the specified persistent disk. */
  def resize(request: Anon_AltDiskFields): Request[Operation]
  /** Sets the labels on a disk. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUser): Request[Operation]
}

object DisksResource {
  @scala.inline
  def apply(
    aggregatedList: Anon_Alt => Request[DiskAggregatedList],
    createSnapshot: Anon_AltDisk => Request[Operation],
    delete: Anon_AltDiskFields => Request[Operation],
    get: Anon_AltDiskFieldsKey => Request[Disk],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrintProject => Request[Operation],
    list: Anon_AltFields => Request[DiskList],
    resize: Anon_AltDiskFields => Request[Operation],
    setLabels: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUser => Request[Operation]
  ): DisksResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), createSnapshot = js.Any.fromFunction1(createSnapshot), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), resize = js.Any.fromFunction1(resize), setLabels = js.Any.fromFunction1(setLabels))
  
    __obj.asInstanceOf[DisksResource]
  }
}

