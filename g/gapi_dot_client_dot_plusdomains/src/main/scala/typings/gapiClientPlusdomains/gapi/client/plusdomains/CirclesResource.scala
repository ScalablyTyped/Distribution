package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPlusdomains.AnonCircleId
import typings.gapiClientPlusdomains.AnonFields
import typings.gapiClientPlusdomains.AnonKey
import typings.gapiClientPlusdomains.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CirclesResource extends js.Object {
  /** Add a person to a circle. Google+ limits certain circle operations, including the number of circle adds. Learn More. */
  def addPeople(request: AnonCircleId): Request_[Circle]
  /** Get a circle. */
  def get(request: AnonKey): Request_[Circle]
  /** Create a new circle for the authenticated user. */
  def insert(request: AnonOauthtoken): Request_[Circle]
  /** List all of the circles for a user. */
  def list(request: AnonFields): Request_[CircleFeed]
  /** Update a circle's description. This method supports patch semantics. */
  def patch(request: AnonKey): Request_[Circle]
  /** Delete a circle. */
  def remove(request: AnonKey): Request_[Unit]
  /** Remove a person from a circle. */
  def removePeople(request: AnonCircleId): Request_[Unit]
  /** Update a circle's description. */
  def update(request: AnonKey): Request_[Circle]
}

object CirclesResource {
  @scala.inline
  def apply(
    addPeople: AnonCircleId => Request_[Circle],
    get: AnonKey => Request_[Circle],
    insert: AnonOauthtoken => Request_[Circle],
    list: AnonFields => Request_[CircleFeed],
    patch: AnonKey => Request_[Circle],
    remove: AnonKey => Request_[Unit],
    removePeople: AnonCircleId => Request_[Unit],
    update: AnonKey => Request_[Circle]
  ): CirclesResource = {
    val __obj = js.Dynamic.literal(addPeople = js.Any.fromFunction1(addPeople), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), remove = js.Any.fromFunction1(remove), removePeople = js.Any.fromFunction1(removePeople), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CirclesResource]
  }
}

