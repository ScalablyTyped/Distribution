package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonPrettyPrint
import typings.gapiClientAnalytics.AnonQuotaUser
import typings.gapiClientAnalytics.AnonWebPropertyAdWordsLinkId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPropertyAdWordsLinksResource extends js.Object {
  /** Deletes a web property-AdWords link. */
  def delete(request: AnonWebPropertyAdWordsLinkId): Request_[Unit]
  /** Returns a web property-AdWords link to which the user has access. */
  def get(request: AnonWebPropertyAdWordsLinkId): Request_[EntityAdWordsLink]
  /** Creates a webProperty-AdWords link. */
  def insert(request: AnonQuotaUser): Request_[EntityAdWordsLink]
  /** Lists webProperty-AdWords links for a given web property. */
  def list(request: AnonPrettyPrint): Request_[EntityAdWordsLinks]
  /** Updates an existing webProperty-AdWords link. This method supports patch semantics. */
  def patch(request: AnonWebPropertyAdWordsLinkId): Request_[EntityAdWordsLink]
  /** Updates an existing webProperty-AdWords link. */
  def update(request: AnonWebPropertyAdWordsLinkId): Request_[EntityAdWordsLink]
}

object WebPropertyAdWordsLinksResource {
  @scala.inline
  def apply(
    delete: AnonWebPropertyAdWordsLinkId => Request_[Unit],
    get: AnonWebPropertyAdWordsLinkId => Request_[EntityAdWordsLink],
    insert: AnonQuotaUser => Request_[EntityAdWordsLink],
    list: AnonPrettyPrint => Request_[EntityAdWordsLinks],
    patch: AnonWebPropertyAdWordsLinkId => Request_[EntityAdWordsLink],
    update: AnonWebPropertyAdWordsLinkId => Request_[EntityAdWordsLink]
  ): WebPropertyAdWordsLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[WebPropertyAdWordsLinksResource]
  }
}

