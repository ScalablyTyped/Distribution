package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAddress
import typings.gapiClientCompute.AnonAddressAlt
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFieldsFilter
import typings.gapiClientCompute.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressesResource extends js.Object {
  /** Retrieves an aggregated list of addresses. */
  def aggregatedList(request: AnonAlt): Request_[AddressAggregatedList]
  /** Deletes the specified address resource. */
  def delete(request: AnonAddress): Request_[Operation]
  /** Returns the specified address resource. */
  def get(request: AnonAddressAlt): Request_[Address]
  /** Creates an address resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFieldsKey): Request_[Operation]
  /** Retrieves a list of addresses contained within the specified region. */
  def list(request: AnonAltFieldsFilter): Request_[AddressList]
}

object AddressesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[AddressAggregatedList],
    delete: AnonAddress => Request_[Operation],
    get: AnonAddressAlt => Request_[Address],
    insert: AnonAltFieldsKey => Request_[Operation],
    list: AnonAltFieldsFilter => Request_[AddressList]
  ): AddressesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AddressesResource]
  }
}

