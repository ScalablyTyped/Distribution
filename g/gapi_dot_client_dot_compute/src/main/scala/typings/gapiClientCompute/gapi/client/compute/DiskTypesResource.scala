package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskTypesResource extends js.Object {
  /** Retrieves an aggregated list of disk types. */
  def aggregatedList(request: Alt): Request[DiskTypeAggregatedList] = js.native
  /** Returns the specified disk type. Get a list of available disk types by making a list() request. */
  def get(request: typings.gapiClientCompute.anon.DiskType): Request[DiskType] = js.native
  /** Retrieves a list of disk types available to the specified project. */
  def list(request: Fields): Request[DiskTypeList] = js.native
}

object DiskTypesResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[DiskTypeAggregatedList],
    get: typings.gapiClientCompute.anon.DiskType => Request[DiskType],
    list: Fields => Request[DiskTypeList]
  ): DiskTypesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DiskTypesResource]
  }
  @scala.inline
  implicit class DiskTypesResourceOps[Self <: DiskTypesResource] (val x: Self) extends AnyVal {
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
    def setAggregatedList(value: Alt => Request[DiskTypeAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: typings.gapiClientCompute.anon.DiskType => Request[DiskType]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[DiskTypeList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

