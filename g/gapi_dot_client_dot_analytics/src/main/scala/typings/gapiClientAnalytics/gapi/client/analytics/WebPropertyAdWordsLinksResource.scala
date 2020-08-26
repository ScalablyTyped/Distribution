package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.PrettyPrint
import typings.gapiClientAnalytics.anon.QuotaUser
import typings.gapiClientAnalytics.anon.WebPropertyAdWordsLinkId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPropertyAdWordsLinksResource extends js.Object {
  /** Deletes a web property-AdWords link. */
  def delete(request: WebPropertyAdWordsLinkId): Request[Unit] = js.native
  /** Returns a web property-AdWords link to which the user has access. */
  def get(request: WebPropertyAdWordsLinkId): Request[EntityAdWordsLink] = js.native
  /** Creates a webProperty-AdWords link. */
  def insert(request: QuotaUser): Request[EntityAdWordsLink] = js.native
  /** Lists webProperty-AdWords links for a given web property. */
  def list(request: PrettyPrint): Request[EntityAdWordsLinks] = js.native
  /** Updates an existing webProperty-AdWords link. This method supports patch semantics. */
  def patch(request: WebPropertyAdWordsLinkId): Request[EntityAdWordsLink] = js.native
  /** Updates an existing webProperty-AdWords link. */
  def update(request: WebPropertyAdWordsLinkId): Request[EntityAdWordsLink] = js.native
}

object WebPropertyAdWordsLinksResource {
  @scala.inline
  def apply(
    delete: WebPropertyAdWordsLinkId => Request[Unit],
    get: WebPropertyAdWordsLinkId => Request[EntityAdWordsLink],
    insert: QuotaUser => Request[EntityAdWordsLink],
    list: PrettyPrint => Request[EntityAdWordsLinks],
    patch: WebPropertyAdWordsLinkId => Request[EntityAdWordsLink],
    update: WebPropertyAdWordsLinkId => Request[EntityAdWordsLink]
  ): WebPropertyAdWordsLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[WebPropertyAdWordsLinksResource]
  }
  @scala.inline
  implicit class WebPropertyAdWordsLinksResourceOps[Self <: WebPropertyAdWordsLinksResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: WebPropertyAdWordsLinkId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: WebPropertyAdWordsLinkId => Request[EntityAdWordsLink]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: QuotaUser => Request[EntityAdWordsLink]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: PrettyPrint => Request[EntityAdWordsLinks]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: WebPropertyAdWordsLinkId => Request[EntityAdWordsLink]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: WebPropertyAdWordsLinkId => Request[EntityAdWordsLink]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

