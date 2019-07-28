package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.SettingsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs.Filter
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs.ListFiltersResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiltersCollection extends js.Object {
  // Creates a filter.
  def create(resource: Filter, userId: String): Filter
  // Gets a filter.
  def get(userId: String, id: String): Filter
  // Lists the message filters of a Gmail user.
  def list(userId: String): ListFiltersResponse
  // Deletes a filter.
  def remove(userId: String, id: String): Unit
}

object FiltersCollection {
  @scala.inline
  def apply(
    create: (Filter, String) => Filter,
    get: (String, String) => Filter,
    list: String => ListFiltersResponse,
    remove: (String, String) => Unit
  ): FiltersCollection = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
  
    __obj.asInstanceOf[FiltersCollection]
  }
}

