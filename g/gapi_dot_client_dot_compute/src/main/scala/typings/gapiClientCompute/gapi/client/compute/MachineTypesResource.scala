package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MachineTypesResource extends js.Object {
  /** Retrieves an aggregated list of machine types. */
  def aggregatedList(request: Alt): Request[MachineTypeAggregatedList] = js.native
  /** Returns the specified machine type. Get a list of available machine types by making a list() request. */
  def get(request: typings.gapiClientCompute.anon.MachineType): Request[MachineType] = js.native
  /** Retrieves a list of machine types available to the specified project. */
  def list(request: Fields): Request[MachineTypeList] = js.native
}

object MachineTypesResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[MachineTypeAggregatedList],
    get: typings.gapiClientCompute.anon.MachineType => Request[MachineType],
    list: Fields => Request[MachineTypeList]
  ): MachineTypesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MachineTypesResource]
  }
  @scala.inline
  implicit class MachineTypesResourceOps[Self <: MachineTypesResource] (val x: Self) extends AnyVal {
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
    def setAggregatedList(value: Alt => Request[MachineTypeAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: typings.gapiClientCompute.anon.MachineType => Request[MachineType]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[MachineTypeList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

