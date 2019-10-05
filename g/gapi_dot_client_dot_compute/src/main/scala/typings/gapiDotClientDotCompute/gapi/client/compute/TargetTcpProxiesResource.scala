package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrint
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetTcpProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetTcpProxiesResource extends js.Object {
  /** Deletes the specified TargetTcpProxy resource. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy): Request[Operation]
  /** Returns the specified TargetTcpProxy resource. Get a list of available target TCP proxies by making a list() request. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetTcpProxy): Request[TargetTcpProxy]
  /** Creates a TargetTcpProxy resource in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Retrieves the list of TargetTcpProxy resources available to the specified project. */
  def list(request: Anon_Alt): Request[TargetTcpProxyList]
  /** Changes the BackendService for TargetTcpProxy. */
  def setBackendService(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy): Request[Operation]
  /** Changes the ProxyHeaderType for TargetTcpProxy. */
  def setProxyHeader(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy): Request[Operation]
}

object TargetTcpProxiesResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy => Request[Operation],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetTcpProxy => Request[TargetTcpProxy],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    list: Anon_Alt => Request[TargetTcpProxyList],
    setBackendService: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy => Request[Operation],
    setProxyHeader: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy => Request[Operation]
  ): TargetTcpProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setBackendService = js.Any.fromFunction1(setBackendService), setProxyHeader = js.Any.fromFunction1(setProxyHeader))
  
    __obj.asInstanceOf[TargetTcpProxiesResource]
  }
}

