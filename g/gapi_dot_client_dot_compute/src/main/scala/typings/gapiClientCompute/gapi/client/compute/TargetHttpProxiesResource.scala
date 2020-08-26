package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.QuotaUserTargetHttpProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetHttpProxiesResource extends js.Object {
  /** Deletes the specified TargetHttpProxy resource. */
  def delete(request: typings.gapiClientCompute.anon.TargetHttpProxy): Request[Operation] = js.native
  /** Returns the specified TargetHttpProxy resource. Get a list of available target HTTP proxies by making a list() request. */
  def get(request: QuotaUserTargetHttpProxy): Request[TargetHttpProxy] = js.native
  /** Creates a TargetHttpProxy resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  /** Retrieves the list of TargetHttpProxy resources available to the specified project. */
  def list(request: Alt): Request[TargetHttpProxyList] = js.native
  /** Changes the URL map for TargetHttpProxy. */
  def setUrlMap(request: typings.gapiClientCompute.anon.TargetHttpProxy): Request[Operation] = js.native
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
  @scala.inline
  implicit class TargetHttpProxiesResourceOps[Self <: TargetHttpProxiesResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: typings.gapiClientCompute.anon.TargetHttpProxy => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: QuotaUserTargetHttpProxy => Request[TargetHttpProxy]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: AltFields => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[TargetHttpProxyList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUrlMap(value: typings.gapiClientCompute.anon.TargetHttpProxy => Request[Operation]): Self = this.set("setUrlMap", js.Any.fromFunction1(value))
  }
  
}

