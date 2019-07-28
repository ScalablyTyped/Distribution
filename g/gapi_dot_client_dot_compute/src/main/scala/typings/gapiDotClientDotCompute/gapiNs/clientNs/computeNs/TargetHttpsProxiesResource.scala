package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrint
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetHttpsProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHttpsProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpsProxy resource. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy): Request[Operation]
  /** Returns the specified TargetHttpsProxy resource. Get a list of available target HTTPS proxies by making a list() request. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetHttpsProxy): Request[TargetHttpsProxy]
  /** Creates a TargetHttpsProxy resource in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Retrieves the list of TargetHttpsProxy resources available to the specified project. */
  def list(request: Anon_Alt): Request[TargetHttpsProxyList]
  /** Replaces SslCertificates for TargetHttpsProxy. */
  def setSslCertificates(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy): Request[Operation]
  /** Changes the URL map for TargetHttpsProxy. */
  def setUrlMap(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy): Request[Operation]
}

object TargetHttpsProxiesResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy => Request[Operation],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetHttpsProxy => Request[TargetHttpsProxy],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    list: Anon_Alt => Request[TargetHttpsProxyList],
    setSslCertificates: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy => Request[Operation],
    setUrlMap: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpsProxy => Request[Operation]
  ): TargetHttpsProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setSslCertificates = js.Any.fromFunction1(setSslCertificates), setUrlMap = js.Any.fromFunction1(setUrlMap))
  
    __obj.asInstanceOf[TargetHttpsProxiesResource]
  }
}

