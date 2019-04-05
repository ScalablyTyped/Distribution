package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.CollectionNs.UsersNs.SettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiltersCollection extends js.Object {
  // Creates a filter.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Filter,
    userId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Filter
  // Gets a filter.
  def get(userId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Filter
  // Lists the message filters of a Gmail user.
  def list(userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ListFiltersResponse
  // Deletes a filter.
  def remove(userId: java.lang.String, id: java.lang.String): scala.Unit
}

object FiltersCollection {
  @scala.inline
  def apply(
    create: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Filter, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Filter,
    get: (java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.Filter,
    list: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs.ListFiltersResponse,
    remove: (java.lang.String, java.lang.String) => scala.Unit
  ): FiltersCollection = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
  
    __obj.asInstanceOf[FiltersCollection]
  }
}

