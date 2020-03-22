package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFields
import typings.gapiClientCompute.AnonQuotaUserTargetHttpsProxy
import typings.gapiClientCompute.AnonTargetHttpsProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHttpsProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpsProxy resource. */
  def delete(request: AnonTargetHttpsProxy): Request_[Operation]
  /** Returns the specified TargetHttpsProxy resource. Get a list of available target HTTPS proxies by making a list() request. */
  def get(request: AnonQuotaUserTargetHttpsProxy): Request_[TargetHttpsProxy]
  /** Creates a TargetHttpsProxy resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of TargetHttpsProxy resources available to the specified project. */
  def list(request: AnonAlt): Request_[TargetHttpsProxyList]
  /** Replaces SslCertificates for TargetHttpsProxy. */
  def setSslCertificates(request: AnonTargetHttpsProxy): Request_[Operation]
  /** Changes the URL map for TargetHttpsProxy. */
  def setUrlMap(request: AnonTargetHttpsProxy): Request_[Operation]
}

object TargetHttpsProxiesResource {
  @scala.inline
  def apply(
    delete: AnonTargetHttpsProxy => Request_[Operation],
    get: AnonQuotaUserTargetHttpsProxy => Request_[TargetHttpsProxy],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[TargetHttpsProxyList],
    setSslCertificates: AnonTargetHttpsProxy => Request_[Operation],
    setUrlMap: AnonTargetHttpsProxy => Request_[Operation]
  ): TargetHttpsProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setSslCertificates = js.Any.fromFunction1(setSslCertificates), setUrlMap = js.Any.fromFunction1(setUrlMap))
  
    __obj.asInstanceOf[TargetHttpsProxiesResource]
  }
}

