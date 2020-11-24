package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterSearchAndReplaceDetails extends js.Object {
  
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var fieldIndex: js.UndefOr[Double] = js.native
  
  var replaceString: js.UndefOr[String] = js.native
  
  var searchString: js.UndefOr[String] = js.native
}
object FilterSearchAndReplaceDetails {
  
  @scala.inline
  def apply(): FilterSearchAndReplaceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterSearchAndReplaceDetails]
  }
  
  @scala.inline
  implicit class FilterSearchAndReplaceDetailsOps[Self <: FilterSearchAndReplaceDetails] (val x: Self) extends AnyVal {
    
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFieldIndex(value: Double): Self = this.set("fieldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldIndex: Self = this.set("fieldIndex", js.undefined)
    
    @scala.inline
    def setReplaceString(value: String): Self = this.set("replaceString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceString: Self = this.set("replaceString", js.undefined)
    
    @scala.inline
    def setSearchString(value: String): Self = this.set("searchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchString: Self = this.set("searchString", js.undefined)
  }
}
