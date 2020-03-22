package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFields
import typings.gapiClientCompute.AnonQuotaUserTargetSslProxy
import typings.gapiClientCompute.AnonTargetSslProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetSslProxiesResource extends js.Object {
  /** Deletes the specified TargetSslProxy resource. */
  def delete(request: AnonTargetSslProxy): Request_[Operation]
  /** Returns the specified TargetSslProxy resource. Get a list of available target SSL proxies by making a list() request. */
  def get(request: AnonQuotaUserTargetSslProxy): Request_[TargetSslProxy]
  /** Creates a TargetSslProxy resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of TargetSslProxy resources available to the specified project. */
  def list(request: AnonAlt): Request_[TargetSslProxyList]
  /** Changes the BackendService for TargetSslProxy. */
  def setBackendService(request: AnonTargetSslProxy): Request_[Operation]
  /** Changes the ProxyHeaderType for TargetSslProxy. */
  def setProxyHeader(request: AnonTargetSslProxy): Request_[Operation]
  /** Changes SslCertificates for TargetSslProxy. */
  def setSslCertificates(request: AnonTargetSslProxy): Request_[Operation]
}

object TargetSslProxiesResource {
  @scala.inline
  def apply(
    delete: AnonTargetSslProxy => Request_[Operation],
    get: AnonQuotaUserTargetSslProxy => Request_[TargetSslProxy],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[TargetSslProxyList],
    setBackendService: AnonTargetSslProxy => Request_[Operation],
    setProxyHeader: AnonTargetSslProxy => Request_[Operation],
    setSslCertificates: AnonTargetSslProxy => Request_[Operation]
  ): TargetSslProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setBackendService = js.Any.fromFunction1(setBackendService), setProxyHeader = js.Any.fromFunction1(setProxyHeader), setSslCertificates = js.Any.fromFunction1(setSslCertificates))
  
    __obj.asInstanceOf[TargetSslProxiesResource]
  }
}

