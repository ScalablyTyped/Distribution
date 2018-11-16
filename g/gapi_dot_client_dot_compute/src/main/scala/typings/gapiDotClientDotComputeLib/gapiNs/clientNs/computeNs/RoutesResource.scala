package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RoutesResource extends js.Object {
  /** Deletes the specified Route resource. */
  def delete(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenAltFieldsRequestIdRoute
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified Route resource. Get a list of available routes by making a list() request. */
  def get(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenAltFieldsRoute
  ): gapiDotClientLib.gapiNs.clientNs.Request[Route]
  /** Creates a Route resource in the specified project using the data included in the request. */
  def insert(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenAltFieldsRequestId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of Route resources available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[RouteList]
}

