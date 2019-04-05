package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs.ReportsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompatibleFieldsCollection extends js.Object {
  // Returns the fields that are compatible to be selected in the respective sections of a report criteria, given the fields already selected in the input report and user permissions.
  def query(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Report,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CompatibleFields
}

object CompatibleFieldsCollection {
  @scala.inline
  def apply(
    query: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Report, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CompatibleFields
  ): CompatibleFieldsCollection = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction2(query))
  
    __obj.asInstanceOf[CompatibleFieldsCollection]
  }
}

