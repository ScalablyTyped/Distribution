package typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupsCollection extends js.Object {
  // Gets one resource by id.
  def get(groupUniqueId: String): Groups = js.native
  // Updates an existing resource. This method supports patch semantics.
  def patch(resource: Groups, groupUniqueId: String): Groups = js.native
  // Updates an existing resource.
  def update(resource: Groups, groupUniqueId: String): Groups = js.native
}

object GroupsCollection {
  @scala.inline
  def apply(get: String => Groups, patch: (Groups, String) => Groups, update: (Groups, String) => Groups): GroupsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction2(patch), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[GroupsCollection]
  }
  @scala.inline
  implicit class GroupsCollectionOps[Self <: GroupsCollection] (val x: Self) extends AnyVal {
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
    def setGet(value: String => Groups): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: (Groups, String) => Groups): Self = this.set("patch", js.Any.fromFunction2(value))
    @scala.inline
    def setUpdate(value: (Groups, String) => Groups): Self = this.set("update", js.Any.fromFunction2(value))
  }
  
}

