package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPlusdomains.AnonAltCircleId
import typings.gapiClientPlusdomains.AnonAltCircleIdFields
import typings.gapiClientPlusdomains.AnonAltFields
import typings.gapiClientPlusdomains.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CirclesResource extends js.Object {
  /** Add a person to a circle. Google+ limits certain circle operations, including the number of circle adds. Learn More. */
  def addPeople(request: AnonAltCircleId): Request_[Circle]
  /** Get a circle. */
  def get(request: AnonAltCircleIdFields): Request_[Circle]
  /** Create a new circle for the authenticated user. */
  def insert(request: AnonAltFieldsKey): Request_[Circle]
  /** List all of the circles for a user. */
  def list(request: AnonAltFields): Request_[CircleFeed]
  /** Update a circle's description. This method supports patch semantics. */
  def patch(request: AnonAltCircleIdFields): Request_[Circle]
  /** Delete a circle. */
  def remove(request: AnonAltCircleIdFields): Request_[Unit]
  /** Remove a person from a circle. */
  def removePeople(request: AnonAltCircleId): Request_[Unit]
  /** Update a circle's description. */
  def update(request: AnonAltCircleIdFields): Request_[Circle]
}

object CirclesResource {
  @scala.inline
  def apply(
    addPeople: AnonAltCircleId => Request_[Circle],
    get: AnonAltCircleIdFields => Request_[Circle],
    insert: AnonAltFieldsKey => Request_[Circle],
    list: AnonAltFields => Request_[CircleFeed],
    patch: AnonAltCircleIdFields => Request_[Circle],
    remove: AnonAltCircleIdFields => Request_[Unit],
    removePeople: AnonAltCircleId => Request_[Unit],
    update: AnonAltCircleIdFields => Request_[Circle]
  ): CirclesResource = {
    val __obj = js.Dynamic.literal(addPeople = js.Any.fromFunction1(addPeople), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), remove = js.Any.fromFunction1(remove), removePeople = js.Any.fromFunction1(removePeople), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CirclesResource]
  }
}

