package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltDisk
import typings.gapiClientCompute.anon.Fields
import typings.gapiClientCompute.anon.Resource
import typings.gapiClientCompute.anon.SourceImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisksResource extends js.Object {
  /** Retrieves an aggregated list of persistent disks. */
  def aggregatedList(request: Alt): Request[DiskAggregatedList] = js.native
  /** Creates a snapshot of a specified persistent disk. */
  def createSnapshot(request: typings.gapiClientCompute.anon.Disk): Request[Operation] = js.native
  /**
    * Deletes the specified persistent disk. Deleting a disk removes its data permanently and is irreversible. However, deleting a disk does not delete any
    * snapshots previously made from the disk. You must separately delete snapshots.
    */
  def delete(request: typings.gapiClientCompute.anon.Zone): Request[Operation] = js.native
  /** Returns a specified persistent disk. Get a list of available persistent disks by making a list() request. */
  def get(request: AltDisk): Request[Disk] = js.native
  /**
    * Creates a persistent disk in the specified project using the data in the request. You can create a disk with a sourceImage, a sourceSnapshot, or create
    * an empty 500 GB data disk by omitting all properties. You can also create a disk that is larger than the default size by specifying the sizeGb
    * property.
    */
  def insert(request: SourceImage): Request[Operation] = js.native
  /** Retrieves a list of persistent disks contained within the specified zone. */
  def list(request: Fields): Request[DiskList] = js.native
  /** Resizes the specified persistent disk. */
  def resize(request: typings.gapiClientCompute.anon.Zone): Request[Operation] = js.native
  /** Sets the labels on a disk. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: Resource): Request[Operation] = js.native
}

object DisksResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[DiskAggregatedList],
    createSnapshot: typings.gapiClientCompute.anon.Disk => Request[Operation],
    delete: typings.gapiClientCompute.anon.Zone => Request[Operation],
    get: AltDisk => Request[Disk],
    insert: SourceImage => Request[Operation],
    list: Fields => Request[DiskList],
    resize: typings.gapiClientCompute.anon.Zone => Request[Operation],
    setLabels: Resource => Request[Operation]
  ): DisksResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), createSnapshot = js.Any.fromFunction1(createSnapshot), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), resize = js.Any.fromFunction1(resize), setLabels = js.Any.fromFunction1(setLabels))
    __obj.asInstanceOf[DisksResource]
  }
  @scala.inline
  implicit class DisksResourceOps[Self <: DisksResource] (val x: Self) extends AnyVal {
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
    def setAggregatedList(value: Alt => Request[DiskAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateSnapshot(value: typings.gapiClientCompute.anon.Disk => Request[Operation]): Self = this.set("createSnapshot", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: typings.gapiClientCompute.anon.Zone => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: AltDisk => Request[Disk]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: SourceImage => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[DiskList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setResize(value: typings.gapiClientCompute.anon.Zone => Request[Operation]): Self = this.set("resize", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLabels(value: Resource => Request[Operation]): Self = this.set("setLabels", js.Any.fromFunction1(value))
  }
  
}

