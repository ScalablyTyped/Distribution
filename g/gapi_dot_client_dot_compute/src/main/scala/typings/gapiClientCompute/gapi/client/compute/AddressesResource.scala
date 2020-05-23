package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Filter
import typings.gapiClientCompute.anon.Oauthtoken
import typings.gapiClientCompute.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressesResource extends js.Object {
  /** Retrieves an aggregated list of addresses. */
  def aggregatedList(request: Alt): Request[AddressAggregatedList]
  /** Deletes the specified address resource. */
  def delete(request: typings.gapiClientCompute.anon.Address): Request[Operation]
  /** Returns the specified address resource. */
  def get(request: Oauthtoken): Request[Address]
  /** Creates an address resource in the specified project using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation]
  /** Retrieves a list of addresses contained within the specified region. */
  def list(request: Filter): Request[AddressList]
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
}

