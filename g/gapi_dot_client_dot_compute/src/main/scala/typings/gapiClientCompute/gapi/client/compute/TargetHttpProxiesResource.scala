package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.QuotaUserTargetHttpProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHttpProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpProxy resource. */
  def delete(request: typings.gapiClientCompute.anon.TargetHttpProxy): Request[Operation]
  /** Returns the specified TargetHttpProxy resource. Get a list of available target HTTP proxies by making a list() request. */
  def get(request: QuotaUserTargetHttpProxy): Request[TargetHttpProxy]
  /** Creates a TargetHttpProxy resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation]
  /** Retrieves the list of TargetHttpProxy resources available to the specified project. */
  def list(request: Alt): Request[TargetHttpProxyList]
  /** Changes the URL map for TargetHttpProxy. */
  def setUrlMap(request: typings.gapiClientCompute.anon.TargetHttpProxy): Request[Operation]
}

object TargetHttpProxiesResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientCompute.anon.TargetHttpProxy => Request[Operation],
    get: QuotaUserTargetHttpProxy => Request[TargetHttpProxy],
    insert: AltFields => Request[Operation],
    list: Alt => Request[TargetHttpProxyList],
    setUrlMap: typings.gapiClientCompute.anon.TargetHttpProxy => Request[Operation]
  ): TargetHttpProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setUrlMap = js.Any.fromFunction1(setUrlMap))
    __obj.asInstanceOf[TargetHttpProxiesResource]
  }
}

