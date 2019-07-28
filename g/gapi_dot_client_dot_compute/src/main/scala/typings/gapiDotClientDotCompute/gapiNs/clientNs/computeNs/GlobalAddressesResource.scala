package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_AddressAltFields
import typings.gapiDotClientDotCompute.Anon_AddressAltFieldsKey
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalAddressesResource extends js.Object {
  /** Deletes the specified address resource. */
  def delete(request: Anon_AddressAltFields): Request[Operation]
  /** Returns the specified address resource. Get a list of available addresses by making a list() request. */
  def get(request: Anon_AddressAltFieldsKey): Request[Address]
  /** Creates an address resource in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Retrieves a list of global addresses. */
  def list(request: Anon_Alt): Request[AddressList]
}

object GlobalAddressesResource {
  @scala.inline
  def apply(
    delete: Anon_AddressAltFields => Request[Operation],
    get: Anon_AddressAltFieldsKey => Request[Address],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    list: Anon_Alt => Request[AddressList]
  ): GlobalAddressesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GlobalAddressesResource]
  }
}

