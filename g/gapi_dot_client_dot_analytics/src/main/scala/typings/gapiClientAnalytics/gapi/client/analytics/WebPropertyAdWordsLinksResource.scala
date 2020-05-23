package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.PrettyPrint
import typings.gapiClientAnalytics.anon.QuotaUser
import typings.gapiClientAnalytics.anon.WebPropertyAdWordsLinkId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPropertyAdWordsLinksResource extends js.Object {
  /** Deletes a web property-AdWords link. */
  def delete(request: WebPropertyAdWordsLinkId): Request[Unit]
  /** Returns a web property-AdWords link to which the user has access. */
  def get(request: WebPropertyAdWordsLinkId): Request[EntityAdWordsLink]
  /** Creates a webProperty-AdWords link. */
  def insert(request: QuotaUser): Request[EntityAdWordsLink]
  /** Lists webProperty-AdWords links for a given web property. */
  def list(request: PrettyPrint): Request[EntityAdWordsLinks]
  /** Updates an existing webProperty-AdWords link. This method supports patch semantics. */
  def patch(request: WebPropertyAdWordsLinkId): Request[EntityAdWordsLink]
  /** Updates an existing webProperty-AdWords link. */
  def update(request: WebPropertyAdWordsLinkId): Request[EntityAdWordsLink]
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
}

