package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.QuotaUserTargetHttpsProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHttpsProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpsProxy resource. */
  def delete(request: typings.gapiClientCompute.anon.TargetHttpsProxy): Request[Operation]
  /** Returns the specified TargetHttpsProxy resource. Get a list of available target HTTPS proxies by making a list() request. */
  def get(request: QuotaUserTargetHttpsProxy): Request[TargetHttpsProxy]
  /** Creates a TargetHttpsProxy resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation]
  /** Retrieves the list of TargetHttpsProxy resources available to the specified project. */
  def list(request: Alt): Request[TargetHttpsProxyList]
  /** Replaces SslCertificates for TargetHttpsProxy. */
  def setSslCertificates(request: typings.gapiClientCompute.anon.TargetHttpsProxy): Request[Operation]
  /** Changes the URL map for TargetHttpsProxy. */
  def setUrlMap(request: typings.gapiClientCompute.anon.TargetHttpsProxy): Request[Operation]
}

object TargetHttpsProxiesResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientCompute.anon.TargetHttpsProxy => Request[Operation],
    get: QuotaUserTargetHttpsProxy => Request[TargetHttpsProxy],
    insert: AltFields => Request[Operation],
    list: Alt => Request[TargetHttpsProxyList],
    setSslCertificates: typings.gapiClientCompute.anon.TargetHttpsProxy => Request[Operation],
    setUrlMap: typings.gapiClientCompute.anon.TargetHttpsProxy => Request[Operation]
  ): TargetHttpsProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setSslCertificates = js.Any.fromFunction1(setSslCertificates), setUrlMap = js.Any.fromFunction1(setUrlMap))
    __obj.asInstanceOf[TargetHttpsProxiesResource]
  }
}

