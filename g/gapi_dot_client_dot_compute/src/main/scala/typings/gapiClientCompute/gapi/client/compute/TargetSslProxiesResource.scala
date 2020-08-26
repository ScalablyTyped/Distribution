package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.QuotaUserTargetSslProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetSslProxiesResource extends js.Object {
  /** Deletes the specified TargetSslProxy resource. */
  def delete(request: typings.gapiClientCompute.anon.TargetSslProxy): Request[Operation] = js.native
  /** Returns the specified TargetSslProxy resource. Get a list of available target SSL proxies by making a list() request. */
  def get(request: QuotaUserTargetSslProxy): Request[TargetSslProxy] = js.native
  /** Creates a TargetSslProxy resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  /** Retrieves the list of TargetSslProxy resources available to the specified project. */
  def list(request: Alt): Request[TargetSslProxyList] = js.native
  /** Changes the BackendService for TargetSslProxy. */
  def setBackendService(request: typings.gapiClientCompute.anon.TargetSslProxy): Request[Operation] = js.native
  /** Changes the ProxyHeaderType for TargetSslProxy. */
  def setProxyHeader(request: typings.gapiClientCompute.anon.TargetSslProxy): Request[Operation] = js.native
  /** Changes SslCertificates for TargetSslProxy. */
  def setSslCertificates(request: typings.gapiClientCompute.anon.TargetSslProxy): Request[Operation] = js.native
}

object TargetSslProxiesResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientCompute.anon.TargetSslProxy => Request[Operation],
    get: QuotaUserTargetSslProxy => Request[TargetSslProxy],
    insert: AltFields => Request[Operation],
    list: Alt => Request[TargetSslProxyList],
    setBackendService: typings.gapiClientCompute.anon.TargetSslProxy => Request[Operation],
    setProxyHeader: typings.gapiClientCompute.anon.TargetSslProxy => Request[Operation],
    setSslCertificates: typings.gapiClientCompute.anon.TargetSslProxy => Request[Operation]
  ): TargetSslProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setBackendService = js.Any.fromFunction1(setBackendService), setProxyHeader = js.Any.fromFunction1(setProxyHeader), setSslCertificates = js.Any.fromFunction1(setSslCertificates))
    __obj.asInstanceOf[TargetSslProxiesResource]
  }
  @scala.inline
  implicit class TargetSslProxiesResourceOps[Self <: TargetSslProxiesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: typings.gapiClientCompute.anon.TargetSslProxy => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: QuotaUserTargetSslProxy => Request[TargetSslProxy]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: AltFields => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[TargetSslProxyList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBackendService(value: typings.gapiClientCompute.anon.TargetSslProxy => Request[Operation]): Self = this.set("setBackendService", js.Any.fromFunction1(value))
    @scala.inline
    def setSetProxyHeader(value: typings.gapiClientCompute.anon.TargetSslProxy => Request[Operation]): Self = this.set("setProxyHeader", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSslCertificates(value: typings.gapiClientCompute.anon.TargetSslProxy => Request[Operation]): Self = this.set("setSslCertificates", js.Any.fromFunction1(value))
  }
  
}

