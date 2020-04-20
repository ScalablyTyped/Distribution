package typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsCollection extends js.Object {
  // Gets one resource by id.
  def get(groupUniqueId: String): Groups
  // Updates an existing resource. This method supports patch semantics.
  def patch(resource: Groups, groupUniqueId: String): Groups
  // Updates an existing resource.
  def update(resource: Groups, groupUniqueId: String): Groups
}

object GroupsCollection {
  @scala.inline
  def apply(get: String => Groups, patch: (Groups, String) => Groups, update: (Groups, String) => Groups): GroupsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction2(patch), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[GroupsCollection]
  }
}

