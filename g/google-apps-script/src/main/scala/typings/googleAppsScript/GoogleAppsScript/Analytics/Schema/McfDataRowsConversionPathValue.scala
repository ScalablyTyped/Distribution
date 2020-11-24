package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait McfDataRowsConversionPathValue extends js.Object {
  
  var interactionType: js.UndefOr[String] = js.native
  
  var nodeValue: js.UndefOr[String] = js.native
}
object McfDataRowsConversionPathValue {
  
  @scala.inline
  def apply(): McfDataRowsConversionPathValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[McfDataRowsConversionPathValue]
  }
  
  @scala.inline
  implicit class McfDataRowsConversionPathValueOps[Self <: McfDataRowsConversionPathValue] (val x: Self) extends AnyVal {
    
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
    def setInteractionType(value: String): Self = this.set("interactionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractionType: Self = this.set("interactionType", js.undefined)
    
    @scala.inline
    def setNodeValue(value: String): Self = this.set("nodeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeValue: Self = this.set("nodeValue", js.undefined)
  }
}
