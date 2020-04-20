package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPlusdomains.AnonOauthtoken
import typings.gapiClientPlusdomains.AnonOrderBy
import typings.gapiClientPlusdomains.AnonPageToken
import typings.gapiClientPlusdomains.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeopleResource extends js.Object {
  /** Get a person's profile. */
  def get(request: AnonOauthtoken): Request_[Person]
  /** List all of the people in the specified collection. */
  def list(request: AnonOrderBy): Request_[PeopleFeed]
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: AnonPageToken): Request_[PeopleFeed]
  /** List all of the people who are members of a circle. */
  def listByCircle(request: AnonQuotaUser): Request_[PeopleFeed]
}

object PeopleResource {
  @scala.inline
  def apply(
    get: AnonOauthtoken => Request_[Person],
    list: AnonOrderBy => Request_[PeopleFeed],
    listByActivity: AnonPageToken => Request_[PeopleFeed],
    listByCircle: AnonQuotaUser => Request_[PeopleFeed]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listByActivity = js.Any.fromFunction1(listByActivity), listByCircle = js.Any.fromFunction1(listByCircle))
    __obj.asInstanceOf[PeopleResource]
  }
}

