package typings.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Collection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsCollection extends js.Object {
  // Gets one resource by id.
  def get(groupUniqueId: String): typings.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
  // Updates an existing resource. This method supports patch semantics.
  def patch(
    resource: typings.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups,
    groupUniqueId: String
  ): typings.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
  // Updates an existing resource.
  def update(
    resource: typings.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups,
    groupUniqueId: String
  ): typings.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
}

object GroupsCollection {
  @scala.inline
  def apply(
    get: String => typings.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups,
    patch: (typings.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups, String) => typings.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups,
    update: (typings.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups, String) => typings.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsSettings.Schema.Groups
  ): GroupsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction2(patch), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[GroupsCollection]
  }
}

