package typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Metadata

import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnsCollection extends js.Object {
  
  // Lists all columns for a report type
  def list(reportType: String): Columns = js.native
}
object ColumnsCollection {
  
  @scala.inline
  def apply(list: String => Columns): ColumnsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ColumnsCollection]
  }
  
  @scala.inline
  implicit class ColumnsCollectionOps[Self <: ColumnsCollection] (val x: Self) extends AnyVal {
    
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
    def setList(value: String => Columns): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
