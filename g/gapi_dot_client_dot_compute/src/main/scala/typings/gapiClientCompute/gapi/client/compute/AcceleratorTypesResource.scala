package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorTypesResource extends js.Object {
  /** Retrieves an aggregated list of accelerator types. */
  def aggregatedList(request: Alt): Request[AcceleratorTypeAggregatedList] = js.native
  /** Returns the specified accelerator type. Get a list of available accelerator types by making a list() request. */
  def get(request: typings.gapiClientCompute.anon.AcceleratorType): Request[AcceleratorType] = js.native
  /** Retrieves a list of accelerator types available to the specified project. */
  def list(request: Fields): Request[AcceleratorTypeList] = js.native
}

object AcceleratorTypesResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[AcceleratorTypeAggregatedList],
    get: typings.gapiClientCompute.anon.AcceleratorType => Request[AcceleratorType],
    list: Fields => Request[AcceleratorTypeList]
  ): AcceleratorTypesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AcceleratorTypesResource]
  }
  @scala.inline
  implicit class AcceleratorTypesResourceOps[Self <: AcceleratorTypesResource] (val x: Self) extends AnyVal {
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
    def setAggregatedList(value: Alt => Request[AcceleratorTypeAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: typings.gapiClientCompute.anon.AcceleratorType => Request[AcceleratorType]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[AcceleratorTypeList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

