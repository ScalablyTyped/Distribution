package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetTcpProxiesResource extends js.Object {
  /** Deletes the specified TargetTcpProxy resource. */
  def delete(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified TargetTcpProxy resource. Get a list of available target TCP proxies by making a list() request. */
  def get(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetTcpProxy
  ): gapiDotClientLib.gapiNs.clientNs.Request[TargetTcpProxy]
  /** Creates a TargetTcpProxy resource in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of TargetTcpProxy resources available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[TargetTcpProxyList]
  /** Changes the BackendService for TargetTcpProxy. */
  def setBackendService(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Changes the ProxyHeaderType for TargetTcpProxy. */
  def setProxyHeader(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object TargetTcpProxiesResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetTcpProxy, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetTcpProxy]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[TargetTcpProxyList]
    ],
    setBackendService: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    setProxyHeader: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): TargetTcpProxiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("setBackendService")(setBackendService)
    __obj.updateDynamic("setProxyHeader")(setProxyHeader)
    __obj.asInstanceOf[TargetTcpProxiesResource]
  }
}

