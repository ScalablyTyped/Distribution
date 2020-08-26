package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection.Reports

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.CompatibleFields
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Report
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompatibleFieldsCollection extends js.Object {
  // Returns the fields that are compatible to be selected in the respective sections of a report criteria, given the fields already selected in the input report and user permissions.
  def query(resource: Report, profileId: String): CompatibleFields = js.native
}

object CompatibleFieldsCollection {
  @scala.inline
  def apply(query: (Report, String) => CompatibleFields): CompatibleFieldsCollection = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction2(query))
    __obj.asInstanceOf[CompatibleFieldsCollection]
  }
  @scala.inline
  implicit class CompatibleFieldsCollectionOps[Self <: CompatibleFieldsCollection] (val x: Self) extends AnyVal {
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
    def setQuery(value: (Report, String) => CompatibleFields): Self = this.set("query", js.Any.fromFunction2(value))
  }
  
}

