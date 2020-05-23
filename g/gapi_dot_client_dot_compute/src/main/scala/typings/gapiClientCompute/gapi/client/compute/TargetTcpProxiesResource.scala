package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.QuotaUserTargetTcpProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetTcpProxiesResource extends js.Object {
  /** Deletes the specified TargetTcpProxy resource. */
  def delete(request: typings.gapiClientCompute.anon.TargetTcpProxy): Request[Operation]
  /** Returns the specified TargetTcpProxy resource. Get a list of available target TCP proxies by making a list() request. */
  def get(request: QuotaUserTargetTcpProxy): Request[TargetTcpProxy]
  /** Creates a TargetTcpProxy resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation]
  /** Retrieves the list of TargetTcpProxy resources available to the specified project. */
  def list(request: Alt): Request[TargetTcpProxyList]
  /** Changes the BackendService for TargetTcpProxy. */
  def setBackendService(request: typings.gapiClientCompute.anon.TargetTcpProxy): Request[Operation]
  /** Changes the ProxyHeaderType for TargetTcpProxy. */
  def setProxyHeader(request: typings.gapiClientCompute.anon.TargetTcpProxy): Request[Operation]
}

object TargetTcpProxiesResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientCompute.anon.TargetTcpProxy => Request[Operation],
    get: QuotaUserTargetTcpProxy => Request[TargetTcpProxy],
    insert: AltFields => Request[Operation],
    list: Alt => Request[TargetTcpProxyList],
    setBackendService: typings.gapiClientCompute.anon.TargetTcpProxy => Request[Operation],
    setProxyHeader: typings.gapiClientCompute.anon.TargetTcpProxy => Request[Operation]
  ): TargetTcpProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setBackendService = js.Any.fromFunction1(setBackendService), setProxyHeader = js.Any.fromFunction1(setProxyHeader))
    __obj.asInstanceOf[TargetTcpProxiesResource]
  }
}

