package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressesResource extends js.Object {
  /** Retrieves an aggregated list of addresses. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[AddressAggregatedList]
  /** Deletes the specified address resource. */
  def delete(request: gapiDotClientDotComputeLib.Anon_Address): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified address resource. */
  def get(request: gapiDotClientDotComputeLib.Anon_AddressAlt): gapiDotClientLib.gapiNs.clientNs.Request[Address]
  /** Creates an address resource in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of addresses contained within the specified region. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[AddressList]
}

object AddressesResource {
  @scala.inline
  def apply(
    aggregatedList: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[AddressAggregatedList]
    ],
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_Address, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AddressAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Address]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[AddressList]
    ]
  ): AddressesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = aggregatedList, delete = delete, get = get, insert = insert, list = list)
  
    __obj.asInstanceOf[AddressesResource]
  }
}

