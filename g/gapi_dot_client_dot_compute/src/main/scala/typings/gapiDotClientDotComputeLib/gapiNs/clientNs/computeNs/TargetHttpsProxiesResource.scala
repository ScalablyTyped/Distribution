package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHttpsProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpsProxy resource. */
  def delete(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserTargetHttpsProxy): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified TargetHttpsProxy resource. Get a list of available target HTTPS proxies by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserTargetHttpsProxyKey): gapiDotClientLib.gapiNs.clientNs.Request[TargetHttpsProxy]
  /** Creates a TargetHttpsProxy resource in the specified project using the data included in the request. */
  def insert(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenAltFieldsRequestId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of TargetHttpsProxy resources available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[TargetHttpsProxyList]
  /** Replaces SslCertificates for TargetHttpsProxy. */
  def setSslCertificates(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserTargetHttpsProxy): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Changes the URL map for TargetHttpsProxy. */
  def setUrlMap(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserTargetHttpsProxy): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

