package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait McfDataRows extends js.Object {
  
  var conversionPathValue: js.UndefOr[js.Array[McfDataRowsConversionPathValue]] = js.native
  
  var primitiveValue: js.UndefOr[String] = js.native
}
object McfDataRows {
  
  @scala.inline
  def apply(): McfDataRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[McfDataRows]
  }
  
  @scala.inline
  implicit class McfDataRowsOps[Self <: McfDataRows] (val x: Self) extends AnyVal {
    
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
    def setConversionPathValueVarargs(value: McfDataRowsConversionPathValue*): Self = this.set("conversionPathValue", js.Array(value :_*))
    
    @scala.inline
    def setConversionPathValue(value: js.Array[McfDataRowsConversionPathValue]): Self = this.set("conversionPathValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversionPathValue: Self = this.set("conversionPathValue", js.undefined)
    
    @scala.inline
    def setPrimitiveValue(value: String): Self = this.set("primitiveValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimitiveValue: Self = this.set("primitiveValue", js.undefined)
  }
}
