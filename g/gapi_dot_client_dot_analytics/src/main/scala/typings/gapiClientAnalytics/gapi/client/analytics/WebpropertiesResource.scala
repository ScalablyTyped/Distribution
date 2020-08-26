package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.Maxresults
import typings.gapiClientAnalytics.anon.Oauthtoken
import typings.gapiClientAnalytics.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpropertiesResource extends js.Object {
  /** Gets a web property to which the user has access. */
  def get(request: QuotaUser): Request[Webproperty] = js.native
  /**
    * Create a new property if the account has fewer than 20 properties. Web properties are visible in the Google Analytics interface only if they have at
    * least one profile.
    */
  def insert(request: Oauthtoken): Request[Webproperty] = js.native
  /** Lists web properties to which the user has access. */
  def list(request: Maxresults): Request[Webproperties] = js.native
  /** Updates an existing web property. This method supports patch semantics. */
  def patch(request: QuotaUser): Request[Webproperty] = js.native
  /** Updates an existing web property. */
  def update(request: QuotaUser): Request[Webproperty] = js.native
}

object WebpropertiesResource {
  @scala.inline
  def apply(
    get: QuotaUser => Request[Webproperty],
    insert: Oauthtoken => Request[Webproperty],
    list: Maxresults => Request[Webproperties],
    patch: QuotaUser => Request[Webproperty],
    update: QuotaUser => Request[Webproperty]
  ): WebpropertiesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[WebpropertiesResource]
  }
  @scala.inline
  implicit class WebpropertiesResourceOps[Self <: WebpropertiesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: QuotaUser => Request[Webproperty]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Oauthtoken => Request[Webproperty]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Maxresults => Request[Webproperties]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: QuotaUser => Request[Webproperty]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: QuotaUser => Request[Webproperty]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

