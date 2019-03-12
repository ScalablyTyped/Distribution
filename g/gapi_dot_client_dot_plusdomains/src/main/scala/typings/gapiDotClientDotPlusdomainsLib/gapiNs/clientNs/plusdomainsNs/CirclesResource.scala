package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CirclesResource extends js.Object {
  /** Add a person to a circle. Google+ limits certain circle operations, including the number of circle adds. Learn More. */
  def addPeople(request: gapiDotClientDotPlusdomainsLib.Anon_AltCircleId): gapiDotClientLib.gapiNs.clientNs.Request[Circle]
  /** Get a circle. */
  def get(request: gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Circle]
  /** Create a new circle for the authenticated user. */
  def insert(request: gapiDotClientDotPlusdomainsLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Circle]
  /** List all of the circles for a user. */
  def list(request: gapiDotClientDotPlusdomainsLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[CircleFeed]
  /** Update a circle's description. This method supports patch semantics. */
  def patch(request: gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Circle]
  /** Delete a circle. */
  def remove(request: gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Remove a person from a circle. */
  def removePeople(request: gapiDotClientDotPlusdomainsLib.Anon_AltCircleId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Update a circle's description. */
  def update(request: gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Circle]
}

object CirclesResource {
  @scala.inline
  def apply(
    addPeople: gapiDotClientDotPlusdomainsLib.Anon_AltCircleId => gapiDotClientLib.gapiNs.clientNs.Request[Circle],
    get: gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Circle],
    insert: gapiDotClientDotPlusdomainsLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Circle],
    list: gapiDotClientDotPlusdomainsLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[CircleFeed],
    patch: gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Circle],
    remove: gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    removePeople: gapiDotClientDotPlusdomainsLib.Anon_AltCircleId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    update: gapiDotClientDotPlusdomainsLib.Anon_AltCircleIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Circle]
  ): CirclesResource = {
    val __obj = js.Dynamic.literal(addPeople = js.Any.fromFunction1(addPeople), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), remove = js.Any.fromFunction1(remove), removePeople = js.Any.fromFunction1(removePeople), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CirclesResource]
  }
}

