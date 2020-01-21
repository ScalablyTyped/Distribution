package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrint
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetSslProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetSslProxiesResource extends js.Object {
  /** Deletes the specified TargetSslProxy resource. */
  def delete(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy): Request_[Operation]
  /** Returns the specified TargetSslProxy resource. Get a list of available target SSL proxies by making a list() request. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetSslProxy): Request_[TargetSslProxy]
  /** Creates a TargetSslProxy resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** Retrieves the list of TargetSslProxy resources available to the specified project. */
  def list(request: AnonAlt): Request_[TargetSslProxyList]
  /** Changes the BackendService for TargetSslProxy. */
  def setBackendService(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy): Request_[Operation]
  /** Changes the ProxyHeaderType for TargetSslProxy. */
  def setProxyHeader(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy): Request_[Operation]
  /** Changes SslCertificates for TargetSslProxy. */
  def setSslCertificates(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy): Request_[Operation]
}

object TargetSslProxiesResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy => Request_[Operation],
    get: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetSslProxy => Request_[TargetSslProxy],
    insert: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    list: AnonAlt => Request_[TargetSslProxyList],
    setBackendService: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy => Request_[Operation],
    setProxyHeader: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy => Request_[Operation],
    setSslCertificates: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy => Request_[Operation]
  ): TargetSslProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setBackendService = js.Any.fromFunction1(setBackendService), setProxyHeader = js.Any.fromFunction1(setProxyHeader), setSslCertificates = js.Any.fromFunction1(setSslCertificates))
  
    __obj.asInstanceOf[TargetSslProxiesResource]
  }
}

