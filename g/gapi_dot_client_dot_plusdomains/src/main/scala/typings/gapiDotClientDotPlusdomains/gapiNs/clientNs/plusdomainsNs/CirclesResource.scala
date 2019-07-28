package typings.gapiDotClientDotPlusdomains.gapiNs.clientNs.plusdomainsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPlusdomains.Anon_AltCircleId
import typings.gapiDotClientDotPlusdomains.Anon_AltCircleIdFields
import typings.gapiDotClientDotPlusdomains.Anon_AltFields
import typings.gapiDotClientDotPlusdomains.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CirclesResource extends js.Object {
  /** Add a person to a circle. Google+ limits certain circle operations, including the number of circle adds. Learn More. */
  def addPeople(request: Anon_AltCircleId): Request[Circle]
  /** Get a circle. */
  def get(request: Anon_AltCircleIdFields): Request[Circle]
  /** Create a new circle for the authenticated user. */
  def insert(request: Anon_AltFieldsKey): Request[Circle]
  /** List all of the circles for a user. */
  def list(request: Anon_AltFields): Request[CircleFeed]
  /** Update a circle's description. This method supports patch semantics. */
  def patch(request: Anon_AltCircleIdFields): Request[Circle]
  /** Delete a circle. */
  def remove(request: Anon_AltCircleIdFields): Request[Unit]
  /** Remove a person from a circle. */
  def removePeople(request: Anon_AltCircleId): Request[Unit]
  /** Update a circle's description. */
  def update(request: Anon_AltCircleIdFields): Request[Circle]
}

object CirclesResource {
  @scala.inline
  def apply(
    addPeople: Anon_AltCircleId => Request[Circle],
    get: Anon_AltCircleIdFields => Request[Circle],
    insert: Anon_AltFieldsKey => Request[Circle],
    list: Anon_AltFields => Request[CircleFeed],
    patch: Anon_AltCircleIdFields => Request[Circle],
    remove: Anon_AltCircleIdFields => Request[Unit],
    removePeople: Anon_AltCircleId => Request[Unit],
    update: Anon_AltCircleIdFields => Request[Circle]
  ): CirclesResource = {
    val __obj = js.Dynamic.literal(addPeople = js.Any.fromFunction1(addPeople), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), remove = js.Any.fromFunction1(remove), removePeople = js.Any.fromFunction1(removePeople), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CirclesResource]
  }
}

