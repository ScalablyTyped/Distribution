package typings.googleAppsScript.GoogleAppsScript.Analytics.Collection

import typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Metadata.ColumnsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataCollection extends js.Object {
  var Columns: js.UndefOr[ColumnsCollection] = js.native
}

object MetadataCollection {
  @scala.inline
  def apply(): MetadataCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataCollection]
  }
  @scala.inline
  implicit class MetadataCollectionOps[Self <: MetadataCollection] (val x: Self) extends AnyVal {
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
    def setColumns(value: ColumnsCollection): Self = this.set("Columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("Columns", js.undefined)
  }
  
}

