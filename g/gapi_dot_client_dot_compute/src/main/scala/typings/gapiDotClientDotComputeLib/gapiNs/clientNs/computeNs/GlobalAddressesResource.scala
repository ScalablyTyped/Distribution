package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GlobalAddressesResource extends js.Object {
  /** Deletes the specified address resource. */
  def delete(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenAltFieldsAddressRequestId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified address resource. Get a list of available addresses by making a list() request. */
  def get(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenAltFieldsAddress
  ): gapiDotClientLib.gapiNs.clientNs.Request[Address]
  /** Creates an address resource in the specified project using the data included in the request. */
  def insert(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenAltFieldsRequestId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of global addresses. */
  def list(request: gapiDotClientDotComputeLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[AddressList]
}

