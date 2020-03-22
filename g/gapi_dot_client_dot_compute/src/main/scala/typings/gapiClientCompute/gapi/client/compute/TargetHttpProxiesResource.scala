package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFields
import typings.gapiClientCompute.AnonQuotaUserTargetHttpProxy
import typings.gapiClientCompute.AnonTargetHttpProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHttpProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpProxy resource. */
  def delete(request: AnonTargetHttpProxy): Request_[Operation]
  /** Returns the specified TargetHttpProxy resource. Get a list of available target HTTP proxies by making a list() request. */
  def get(request: AnonQuotaUserTargetHttpProxy): Request_[TargetHttpProxy]
  /** Creates a TargetHttpProxy resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of TargetHttpProxy resources available to the specified project. */
  def list(request: AnonAlt): Request_[TargetHttpProxyList]
  /** Changes the URL map for TargetHttpProxy. */
  def setUrlMap(request: AnonTargetHttpProxy): Request_[Operation]
}

object TargetHttpProxiesResource {
  @scala.inline
  def apply(
    delete: AnonTargetHttpProxy => Request_[Operation],
    get: AnonQuotaUserTargetHttpProxy => Request_[TargetHttpProxy],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[TargetHttpProxyList],
    setUrlMap: AnonTargetHttpProxy => Request_[Operation]
  ): TargetHttpProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setUrlMap = js.Any.fromFunction1(setUrlMap))
  
    __obj.asInstanceOf[TargetHttpProxiesResource]
  }
}

