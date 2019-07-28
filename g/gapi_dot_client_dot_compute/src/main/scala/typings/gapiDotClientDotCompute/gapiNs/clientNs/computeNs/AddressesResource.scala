package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Address
import typings.gapiDotClientDotCompute.Anon_AddressAlt
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsFilter
import typings.gapiDotClientDotCompute.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressesResource extends js.Object {
  /** Retrieves an aggregated list of addresses. */
  def aggregatedList(request: Anon_Alt): Request[AddressAggregatedList]
  /** Deletes the specified address resource. */
  def delete(request: Anon_Address): Request[Operation]
  /** Returns the specified address resource. */
  def get(request: Anon_AddressAlt): Request[Address]
  /** Creates an address resource in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKey): Request[Operation]
  /** Retrieves a list of addresses contained within the specified region. */
  def list(request: Anon_AltFieldsFilter): Request[AddressList]
}

object AddressesResource {
  @scala.inline
  def apply(
    aggregatedList: Anon_Alt => Request[AddressAggregatedList],
    delete: Anon_Address => Request[Operation],
    get: Anon_AddressAlt => Request[Address],
    insert: Anon_AltFieldsKey => Request[Operation],
    list: Anon_AltFieldsFilter => Request[AddressList]
  ): AddressesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AddressesResource]
  }
}

