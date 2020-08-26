package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.AddressAlt
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.FieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalAddressesResource extends js.Object {
  /** Deletes the specified address resource. */
  def delete(request: AddressAlt): Request[Operation] = js.native
  /** Returns the specified address resource. Get a list of available addresses by making a list() request. */
  def get(request: FieldsKey): Request[Address] = js.native
  /** Creates an address resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  /** Retrieves a list of global addresses. */
  def list(request: Alt): Request[AddressList] = js.native
}

object GlobalAddressesResource {
  @scala.inline
  def apply(
    delete: AddressAlt => Request[Operation],
    get: FieldsKey => Request[Address],
    insert: AltFields => Request[Operation],
    list: Alt => Request[AddressList]
  ): GlobalAddressesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[GlobalAddressesResource]
  }
  @scala.inline
  implicit class GlobalAddressesResourceOps[Self <: GlobalAddressesResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: AddressAlt => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: FieldsKey => Request[Address]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: AltFields => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[AddressList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

