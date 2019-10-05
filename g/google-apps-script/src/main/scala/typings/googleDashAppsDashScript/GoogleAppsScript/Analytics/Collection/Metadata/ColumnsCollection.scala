package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Metadata

import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnsCollection extends js.Object {
  // Lists all columns for a report type
  def list(reportType: String): Columns
}

object ColumnsCollection {
  @scala.inline
  def apply(list: String => Columns): ColumnsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ColumnsCollection]
  }
}

