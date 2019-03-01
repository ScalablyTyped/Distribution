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
    get: js.Function1[
      gapiDotClientDotPlusdomainsLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Person]
    ],
    list: js.Function1[
      gapiDotClientDotPlusdomainsLib.Anon_AltCollectionFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[PeopleFeed]
    ],
    listByActivity: js.Function1[
      gapiDotClientDotPlusdomainsLib.Anon_ActivityIdAltCollection, 
      gapiDotClientLib.gapiNs.clientNs.Request[PeopleFeed]
    ],
    listByCircle: js.Function1[
      gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[PeopleFeed]
    ]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("listByActivity")(listByActivity)
    __obj.updateDynamic("listByCircle")(listByCircle)
    __obj.asInstanceOf[PeopleResource]
  }
}

