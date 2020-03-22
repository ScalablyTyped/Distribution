package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAddressAlt
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFields
import typings.gapiClientCompute.AnonFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalAddressesResource extends js.Object {
  /** Deletes the specified address resource. */
  def delete(request: AnonAddressAlt): Request_[Operation]
  /** Returns the specified address resource. Get a list of available addresses by making a list() request. */
  def get(request: AnonFieldsKey): Request_[Address]
  /** Creates an address resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves a list of global addresses. */
  def list(request: AnonAlt): Request_[AddressList]
}

object GlobalAddressesResource {
  @scala.inline
  def apply(
    delete: AnonAddressAlt => Request_[Operation],
    get: AnonFieldsKey => Request_[Address],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[AddressList]
  ): GlobalAddressesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GlobalAddressesResource]
  }
}

