package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrint
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpProxy
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetHttpProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHttpProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpProxy resource. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpProxy): Request[Operation]
  /** Returns the specified TargetHttpProxy resource. Get a list of available target HTTP proxies by making a list() request. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetHttpProxy): Request[TargetHttpProxy]
  /** Creates a TargetHttpProxy resource in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Retrieves the list of TargetHttpProxy resources available to the specified project. */
  def list(request: Anon_Alt): Request[TargetHttpProxyList]
  /** Changes the URL map for TargetHttpProxy. */
  def setUrlMap(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpProxy): Request[Operation]
}

object TargetHttpProxiesResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpProxy => Request[Operation],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserTargetHttpProxy => Request[TargetHttpProxy],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    list: Anon_Alt => Request[TargetHttpProxyList],
    setUrlMap: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdTargetHttpProxy => Request[Operation]
  ): TargetHttpProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setUrlMap = js.Any.fromFunction1(setUrlMap))
  
    __obj.asInstanceOf[TargetHttpProxiesResource]
  }
}

