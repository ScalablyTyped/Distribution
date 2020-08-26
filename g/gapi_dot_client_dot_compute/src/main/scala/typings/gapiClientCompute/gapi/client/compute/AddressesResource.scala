package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Filter
import typings.gapiClientCompute.anon.Oauthtoken
import typings.gapiClientCompute.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressesResource extends js.Object {
  /** Retrieves an aggregated list of addresses. */
  def aggregatedList(request: Alt): Request[AddressAggregatedList] = js.native
  /** Deletes the specified address resource. */
  def delete(request: typings.gapiClientCompute.anon.Address): Request[Operation] = js.native
  /** Returns the specified address resource. */
  def get(request: Oauthtoken): Request[Address] = js.native
  /** Creates an address resource in the specified project using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  /** Retrieves a list of addresses contained within the specified region. */
  def list(request: Filter): Request[AddressList] = js.native
}

object AddressesResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[AddressAggregatedList],
    delete: typings.gapiClientCompute.anon.Address => Request[Operation],
    get: Oauthtoken => Request[Address],
    insert: PrettyPrint => Request[Operation],
    list: Filter => Request[AddressList]
  ): AddressesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AddressesResource]
  }
  @scala.inline
  implicit class AddressesResourceOps[Self <: AddressesResource] (val x: Self) extends AnyVal {
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
    def setAggregatedList(value: Alt => Request[AddressAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: typings.gapiClientCompute.anon.Address => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Oauthtoken => Request[Address]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: PrettyPrint => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[AddressList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

