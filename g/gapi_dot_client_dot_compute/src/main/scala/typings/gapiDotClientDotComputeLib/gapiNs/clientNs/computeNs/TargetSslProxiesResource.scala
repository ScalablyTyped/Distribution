package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetSslProxiesResource extends js.Object {
  /** Deletes the specified TargetSslProxy resource. */
  def delete(request: gapiDotClientDotComputeLib.Anon_TargetSslProxy): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified TargetSslProxy resource. Get a list of available target SSL proxies by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_TargetSslProxyProject): gapiDotClientLib.gapiNs.clientNs.Request[TargetSslProxy]
  /** Creates a TargetSslProxy resource in the specified project using the data included in the request. */
  def insert(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenAltFieldsRequestId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of TargetSslProxy resources available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[TargetSslProxyList]
  /** Changes the BackendService for TargetSslProxy. */
  def setBackendService(request: gapiDotClientDotComputeLib.Anon_TargetSslProxy): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Changes the ProxyHeaderType for TargetSslProxy. */
  def setProxyHeader(request: gapiDotClientDotComputeLib.Anon_TargetSslProxy): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Changes SslCertificates for TargetSslProxy. */
  def setSslCertificates(request: gapiDotClientDotComputeLib.Anon_TargetSslProxy): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

