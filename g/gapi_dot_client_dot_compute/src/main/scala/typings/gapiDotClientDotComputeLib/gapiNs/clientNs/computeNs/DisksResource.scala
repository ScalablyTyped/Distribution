package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisksResource extends js.Object {
  /** Retrieves an aggregated list of persistent disks. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[DiskAggregatedList]
  /** Creates a snapshot of a specified persistent disk. */
  def createSnapshot(request: gapiDotClientDotComputeLib.Anon_AltDisk): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Deletes the specified persistent disk. Deleting a disk removes its data permanently and is irreversible. However, deleting a disk does not delete any
    * snapshots previously made from the disk. You must separately delete snapshots.
    */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltDiskFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns a specified persistent disk. Get a list of available persistent disks by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltDiskFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Disk]
  /**
    * Creates a persistent disk in the specified project using the data in the request. You can create a disk with a sourceImage, a sourceSnapshot, or create
    * an empty 500 GB data disk by omitting all properties. You can also create a disk that is larger than the default size by specifying the sizeGb
    * property.
    */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProject): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of persistent disks contained within the specified zone. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[DiskList]
  /** Resizes the specified persistent disk. */
  def resize(request: gapiDotClientDotComputeLib.Anon_AltDiskFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Sets the labels on a disk. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object DisksResource {
  @scala.inline
  def apply(
    aggregatedList: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[DiskAggregatedList]
    ],
    createSnapshot: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltDisk, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltDiskFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltDiskFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Disk]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProject, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[DiskList]
    ],
    resize: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltDiskFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setLabels: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUser, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): DisksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(aggregatedList)
    __obj.updateDynamic("createSnapshot")(createSnapshot)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("resize")(resize)
    __obj.updateDynamic("setLabels")(setLabels)
    __obj.asInstanceOf[DisksResource]
  }
}

