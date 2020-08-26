package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.QuotaUserTargetHttpsProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetHttpsProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpsProxy resource. */
  def delete(request: typings.gapiClientCompute.anon.TargetHttpsProxy): Request[Operation] = js.native
  /** Returns the specified TargetHttpsProxy resource. Get a list of available target HTTPS proxies by making a list() request. */
  def get(request: QuotaUserTargetHttpsProxy): Request[TargetHttpsProxy] = js.native
  /** Creates a TargetHttpsProxy resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  /** Retrieves the list of TargetHttpsProxy resources available to the specified project. */
  def list(request: Alt): Request[TargetHttpsProxyList] = js.native
  /** Replaces SslCertificates for TargetHttpsProxy. */
  def setSslCertificates(request: typings.gapiClientCompute.anon.TargetHttpsProxy): Request[Operation] = js.native
  /** Changes the URL map for TargetHttpsProxy. */
  def setUrlMap(request: typings.gapiClientCompute.anon.TargetHttpsProxy): Request[Operation] = js.native
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
  @scala.inline
  implicit class TargetHttpsProxiesResourceOps[Self <: TargetHttpsProxiesResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: typings.gapiClientCompute.anon.TargetHttpsProxy => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: QuotaUserTargetHttpsProxy => Request[TargetHttpsProxy]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: AltFields => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[TargetHttpsProxyList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSslCertificates(value: typings.gapiClientCompute.anon.TargetHttpsProxy => Request[Operation]): Self = this.set("setSslCertificates", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUrlMap(value: typings.gapiClientCompute.anon.TargetHttpsProxy => Request[Operation]): Self = this.set("setUrlMap", js.Any.fromFunction1(value))
  }
  
}

