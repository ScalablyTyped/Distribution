package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPlusdomains.anon.CircleId
import typings.gapiClientPlusdomains.anon.Fields
import typings.gapiClientPlusdomains.anon.Key
import typings.gapiClientPlusdomains.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CirclesResource extends js.Object {
  /** Add a person to a circle. Google+ limits certain circle operations, including the number of circle adds. Learn More. */
  def addPeople(request: CircleId): Request[Circle] = js.native
  /** Get a circle. */
  def get(request: Key): Request[Circle] = js.native
  /** Create a new circle for the authenticated user. */
  def insert(request: Oauthtoken): Request[Circle] = js.native
  /** List all of the circles for a user. */
  def list(request: Fields): Request[CircleFeed] = js.native
  /** Update a circle's description. This method supports patch semantics. */
  def patch(request: Key): Request[Circle] = js.native
  /** Delete a circle. */
  def remove(request: Key): Request[Unit] = js.native
  /** Remove a person from a circle. */
  def removePeople(request: CircleId): Request[Unit] = js.native
  /** Update a circle's description. */
  def update(request: Key): Request[Circle] = js.native
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
  @scala.inline
  implicit class CirclesResourceOps[Self <: CirclesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddPeople(value: CircleId => Request[Circle]): Self = this.set("addPeople", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => Request[Circle]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Oauthtoken => Request[Circle]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[CircleFeed]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Key => Request[Circle]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: Key => Request[Unit]): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setRemovePeople(value: CircleId => Request[Unit]): Self = this.set("removePeople", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[Circle]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

