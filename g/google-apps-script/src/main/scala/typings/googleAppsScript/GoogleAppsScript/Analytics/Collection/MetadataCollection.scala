package typings.googleAppsScript.GoogleAppsScript.Analytics.Collection

import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Metadata.ColumnsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataCollection extends js.Object {
  var Columns: js.UndefOr[ColumnsCollection] = js.undefined
}

object MetadataCollection {
  @scala.inline
  def apply(Columns: ColumnsCollection = null): MetadataCollection = {
    val __obj = js.Dynamic.literal()
    if (Columns != null) __obj.updateDynamic("Columns")(Columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataCollection]
  }
}

