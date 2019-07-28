package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrint
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetSslProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetSslProxiesResource extends js.Object {
  /** Deletes the specified TargetSslProxy resource. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy): Request[Operation]
  /** Returns the specified TargetSslProxy resource. Get a list of available target SSL proxies by making a list() request. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetSslProxy): Request[TargetSslProxy]
  /** Creates a TargetSslProxy resource in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Retrieves the list of TargetSslProxy resources available to the specified project. */
  def list(request: Anon_Alt): Request[TargetSslProxyList]
  /** Changes the BackendService for TargetSslProxy. */
  def setBackendService(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy): Request[Operation]
  /** Changes the ProxyHeaderType for TargetSslProxy. */
  def setProxyHeader(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy): Request[Operation]
  /** Changes SslCertificates for TargetSslProxy. */
  def setSslCertificates(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy): Request[Operation]
}

object TargetSslProxiesResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy => Request[Operation],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetSslProxy => Request[TargetSslProxy],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    list: Anon_Alt => Request[TargetSslProxyList],
    setBackendService: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy => Request[Operation],
    setProxyHeader: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy => Request[Operation],
    setSslCertificates: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetSslProxy => Request[Operation]
  ): TargetSslProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setBackendService = js.Any.fromFunction1(setBackendService), setProxyHeader = js.Any.fromFunction1(setProxyHeader), setSslCertificates = js.Any.fromFunction1(setSslCertificates))
  
    __obj.asInstanceOf[TargetSslProxiesResource]
  }
}

