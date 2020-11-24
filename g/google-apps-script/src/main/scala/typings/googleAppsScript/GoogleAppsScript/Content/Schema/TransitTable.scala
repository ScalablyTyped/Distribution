package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitTable extends js.Object {
  
  var postalCodeGroupNames: js.UndefOr[js.Array[String]] = js.native
  
  var rows: js.UndefOr[js.Array[TransitTableTransitTimeRow]] = js.native
  
  var transitTimeLabels: js.UndefOr[js.Array[String]] = js.native
}
object TransitTable {
  
  @scala.inline
  def apply(): TransitTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitTable]
  }
  
  @scala.inline
  implicit class TransitTableOps[Self <: TransitTable] (val x: Self) extends AnyVal {
    
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
    def setPostalCodeGroupNamesVarargs(value: String*): Self = this.set("postalCodeGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setPostalCodeGroupNames(value: js.Array[String]): Self = this.set("postalCodeGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCodeGroupNames: Self = this.set("postalCodeGroupNames", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: TransitTableTransitTimeRow*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[TransitTableTransitTimeRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setTransitTimeLabelsVarargs(value: String*): Self = this.set("transitTimeLabels", js.Array(value :_*))
    
    @scala.inline
    def setTransitTimeLabels(value: js.Array[String]): Self = this.set("transitTimeLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitTimeLabels: Self = this.set("transitTimeLabels", js.undefined)
  }
}
