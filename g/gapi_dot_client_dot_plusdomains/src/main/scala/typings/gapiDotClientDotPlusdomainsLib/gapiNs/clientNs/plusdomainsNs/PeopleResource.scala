package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeopleResource extends js.Object {
  /** Get a person's profile. */
  def get(request: gapiDotClientDotPlusdomainsLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Person]
  /** List all of the people in the specified collection. */
  def list(request: gapiDotClientDotPlusdomainsLib.Anon_AltCollectionFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[PeopleFeed]
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: gapiDotClientDotPlusdomainsLib.Anon_ActivityIdAltCollection): gapiDotClientLib.gapiNs.clientNs.Request[PeopleFeed]
  /** List all of the people who are members of a circle. */
  def listByCircle(request: gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[PeopleFeed]
}

object PeopleResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotPlusdomainsLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Person],
    list: gapiDotClientDotPlusdomainsLib.Anon_AltCollectionFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[PeopleFeed],
    listByActivity: gapiDotClientDotPlusdomainsLib.Anon_ActivityIdAltCollection => gapiDotClientLib.gapiNs.clientNs.Request[PeopleFeed],
    listByCircle: gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[PeopleFeed]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listByActivity = js.Any.fromFunction1(listByActivity), listByCircle = js.Any.fromFunction1(listByCircle))
  
    __obj.asInstanceOf[PeopleResource]
  }
}

