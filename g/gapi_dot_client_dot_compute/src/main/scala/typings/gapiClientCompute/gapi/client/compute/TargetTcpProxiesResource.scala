package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrint
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetTcpProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetTcpProxiesResource extends js.Object {
  /** Deletes the specified TargetTcpProxy resource. */
  def delete(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy): Request_[Operation]
  /** Returns the specified TargetTcpProxy resource. Get a list of available target TCP proxies by making a list() request. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetTcpProxy): Request_[TargetTcpProxy]
  /** Creates a TargetTcpProxy resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** Retrieves the list of TargetTcpProxy resources available to the specified project. */
  def list(request: AnonAlt): Request_[TargetTcpProxyList]
  /** Changes the BackendService for TargetTcpProxy. */
  def setBackendService(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy): Request_[Operation]
  /** Changes the ProxyHeaderType for TargetTcpProxy. */
  def setProxyHeader(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy): Request_[Operation]
}

object TargetTcpProxiesResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy => Request_[Operation],
    get: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetTcpProxy => Request_[TargetTcpProxy],
    insert: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    list: AnonAlt => Request_[TargetTcpProxyList],
    setBackendService: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy => Request_[Operation],
    setProxyHeader: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetTcpProxy => Request_[Operation]
  ): TargetTcpProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setBackendService = js.Any.fromFunction1(setBackendService), setProxyHeader = js.Any.fromFunction1(setProxyHeader))
  
    __obj.asInstanceOf[TargetTcpProxiesResource]
  }
}

