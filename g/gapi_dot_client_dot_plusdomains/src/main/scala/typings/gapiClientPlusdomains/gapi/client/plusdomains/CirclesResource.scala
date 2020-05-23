package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPlusdomains.anon.CircleId
import typings.gapiClientPlusdomains.anon.Fields
import typings.gapiClientPlusdomains.anon.Key
import typings.gapiClientPlusdomains.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CirclesResource extends js.Object {
  /** Add a person to a circle. Google+ limits certain circle operations, including the number of circle adds. Learn More. */
  def addPeople(request: CircleId): Request[Circle]
  /** Get a circle. */
  def get(request: Key): Request[Circle]
  /** Create a new circle for the authenticated user. */
  def insert(request: Oauthtoken): Request[Circle]
  /** List all of the circles for a user. */
  def list(request: Fields): Request[CircleFeed]
  /** Update a circle's description. This method supports patch semantics. */
  def patch(request: Key): Request[Circle]
  /** Delete a circle. */
  def remove(request: Key): Request[Unit]
  /** Remove a person from a circle. */
  def removePeople(request: CircleId): Request[Unit]
  /** Update a circle's description. */
  def update(request: Key): Request[Circle]
}

object CirclesResource {
  @scala.inline
  def apply(
    addPeople: CircleId => Request[Circle],
    get: Key => Request[Circle],
    insert: Oauthtoken => Request[Circle],
    list: Fields => Request[CircleFeed],
    patch: Key => Request[Circle],
    remove: Key => Request[Unit],
    removePeople: CircleId => Request[Unit],
    update: Key => Request[Circle]
  ): CirclesResource = {
    val __obj = js.Dynamic.literal(addPeople = js.Any.fromFunction1(addPeople), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), remove = js.Any.fromFunction1(remove), removePeople = js.Any.fromFunction1(removePeople), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CirclesResource]
  }
}

