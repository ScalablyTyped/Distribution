package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PeopleResource extends js.Object {
  /** Get a person's profile. */
  def get(request: gapiDotClientDotPlusdomainsLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[Person]
  /** List all of the people in the specified collection. */
  def list(request: gapiDotClientDotPlusdomainsLib.Anon_CollectionMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[PeopleFeed]
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: gapiDotClientDotPlusdomainsLib.Anon_Collection): gapiDotClientLib.gapiNs.clientNs.Request[PeopleFeed]
  /** List all of the people who are members of a circle. */
  def listByCircle(request: gapiDotClientDotPlusdomainsLib.Anon_MaxResultsPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[PeopleFeed]
}

