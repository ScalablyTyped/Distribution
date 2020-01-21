package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection.Reports

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.CompatibleFields
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Report
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompatibleFieldsCollection extends js.Object {
  // Returns the fields that are compatible to be selected in the respective sections of a report criteria, given the fields already selected in the input report and user permissions.
  def query(resource: Report, profileId: String): CompatibleFields
}

object CompatibleFieldsCollection {
  @scala.inline
  def apply(query: (Report, String) => CompatibleFields): CompatibleFieldsCollection = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction2(query))
  
    __obj.asInstanceOf[CompatibleFieldsCollection]
  }
}

