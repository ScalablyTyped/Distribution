package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetSslProxiesResource extends js.Object {
  /** Deletes the specified TargetSslProxy resource. */
  def delete(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified TargetSslProxy resource. Get a list of available target SSL proxies by making a list() request. */
  def get(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetSslProxy
  ): gapiDotClientLib.gapiNs.clientNs.Request[TargetSslProxy]
  /** Creates a TargetSslProxy resource in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of TargetSslProxy resources available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[TargetSslProxyList]
  /** Changes the BackendService for TargetSslProxy. */
  def setBackendService(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Changes the ProxyHeaderType for TargetSslProxy. */
  def setProxyHeader(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Changes SslCertificates for TargetSslProxy. */
  def setSslCertificates(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object TargetSslProxiesResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetSslProxy, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetSslProxy]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetSslProxyList]
    ],
    setBackendService: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setProxyHeader: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setSslCertificates: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): TargetSslProxiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("setBackendService")(setBackendService)
    __obj.updateDynamic("setProxyHeader")(setProxyHeader)
    __obj.updateDynamic("setSslCertificates")(setSslCertificates)
    __obj.asInstanceOf[TargetSslProxiesResource]
  }
}

