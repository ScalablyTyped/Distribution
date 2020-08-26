package typings.gapiClientSiteverification.gapi.client.siteverification

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSiteverification.anon.Alt
import typings.gapiClientSiteverification.anon.Fields
import typings.gapiClientSiteverification.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebResourceResource extends js.Object {
  /** Relinquish ownership of a website or domain. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Get the most current data for a website or domain. */
  def get(request: Alt): Request[SiteVerificationWebResourceResource] = js.native
  /** Get a verification token for placing on a website or domain. */
  def getToken(request: Fields): Request[SiteVerificationWebResourceGettokenResponse] = js.native
  /** Attempt verification of a website or domain. */
  def insert(request: Key): Request[SiteVerificationWebResourceResource] = js.native
  /** Get the list of your verified websites and domains. */
  def list(request: Fields): Request[SiteVerificationWebResourceListResponse] = js.native
  /** Modify the list of owners for your website or domain. This method supports patch semantics. */
  def patch(request: Alt): Request[SiteVerificationWebResourceResource] = js.native
  /** Modify the list of owners for your website or domain. */
  def update(request: Alt): Request[SiteVerificationWebResourceResource] = js.native
}

object WebResourceResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    get: Alt => Request[SiteVerificationWebResourceResource],
    getToken: Fields => Request[SiteVerificationWebResourceGettokenResponse],
    insert: Key => Request[SiteVerificationWebResourceResource],
    list: Fields => Request[SiteVerificationWebResourceListResponse],
    patch: Alt => Request[SiteVerificationWebResourceResource],
    update: Alt => Request[SiteVerificationWebResourceResource]
  ): WebResourceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getToken = js.Any.fromFunction1(getToken), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[WebResourceResource]
  }
  @scala.inline
  implicit class WebResourceResourceOps[Self <: WebResourceResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: Alt => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Alt => Request[SiteVerificationWebResourceResource]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetToken(value: Fields => Request[SiteVerificationWebResourceGettokenResponse]): Self = this.set("getToken", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[SiteVerificationWebResourceResource]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[SiteVerificationWebResourceListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Alt => Request[SiteVerificationWebResourceResource]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Alt => Request[SiteVerificationWebResourceResource]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

