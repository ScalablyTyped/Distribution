package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CFormatOptions extends js.Object {
  
  /** Pass the condition to set the conditional formatting
    */
  var action: js.UndefOr[String] = js.native
  
  /** Pass the bgColor to set the conditional formatting
    */
  var bgColor: js.UndefOr[String] = js.native
  
  /** Pass the color to set the conditional formatting
    */
  var color: js.UndefOr[String] = js.native
  
  /** Pass the inputs to set the conditional formatting
    */
  var inputs: js.UndefOr[js.Array[_] | String] = js.native
  
  /** Pass the range to set the conditional formatting
    */
  var range: js.UndefOr[String] = js.native
}
object CFormatOptions {
  
  @scala.inline
  def apply(): CFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CFormatOptions]
  }
  
  @scala.inline
  implicit class CFormatOptionsOps[Self <: CFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setBgColor(value: String): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: js.Any*): Self = this.set("inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: js.Array[_] | String): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    
    @scala.inline
    def setRange(value: String): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
