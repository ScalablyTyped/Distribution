package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPlusdomains.anon.Oauthtoken
import typings.gapiClientPlusdomains.anon.OrderBy
import typings.gapiClientPlusdomains.anon.PageToken
import typings.gapiClientPlusdomains.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeopleResource extends js.Object {
  /** Get a person's profile. */
  def get(request: Oauthtoken): Request[Person]
  /** List all of the people in the specified collection. */
  def list(request: OrderBy): Request[PeopleFeed]
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: PageToken): Request[PeopleFeed]
  /** List all of the people who are members of a circle. */
  def listByCircle(request: QuotaUser): Request[PeopleFeed]
}

object PeopleResource {
  @scala.inline
  def apply(
    get: Oauthtoken => Request[Person],
    list: OrderBy => Request[PeopleFeed],
    listByActivity: PageToken => Request[PeopleFeed],
    listByCircle: QuotaUser => Request[PeopleFeed]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listByActivity = js.Any.fromFunction1(listByActivity), listByCircle = js.Any.fromFunction1(listByCircle))
    __obj.asInstanceOf[PeopleResource]
  }
}

