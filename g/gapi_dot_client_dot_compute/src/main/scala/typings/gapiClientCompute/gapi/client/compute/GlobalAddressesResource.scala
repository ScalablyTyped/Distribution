package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.AddressAlt
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.FieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalAddressesResource extends js.Object {
  /** Deletes the specified address resource. */
  def delete(request: AddressAlt): Request[Operation]
  /** Returns the specified address resource. Get a list of available addresses by making a list() request. */
  def get(request: FieldsKey): Request[Address]
  /** Creates an address resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation]
  /** Retrieves a list of global addresses. */
  def list(request: Alt): Request[AddressList]
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
}

