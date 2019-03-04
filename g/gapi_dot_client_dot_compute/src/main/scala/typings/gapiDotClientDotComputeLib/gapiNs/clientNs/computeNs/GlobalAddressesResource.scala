package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalAddressesResource extends js.Object {
  /** Deletes the specified address resource. */
  def delete(request: gapiDotClientDotComputeLib.Anon_AddressAltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified address resource. Get a list of available addresses by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_AddressAltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Address]
  /** Creates an address resource in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of global addresses. */
  def list(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[AddressList]
}

object GlobalAddressesResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AddressAltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AddressAltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Address]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[AddressList]
    ]
  ): GlobalAddressesResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list)
  
    __obj.asInstanceOf[GlobalAddressesResource]
  }
}

