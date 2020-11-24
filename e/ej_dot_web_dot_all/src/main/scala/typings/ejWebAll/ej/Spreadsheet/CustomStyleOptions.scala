package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomStyleOptions extends js.Object {
  
  /** Pass the number format object
    */
  var NumFormat: js.UndefOr[js.Any] = js.native
  
  /** Pass the style object
    */
  var style: js.UndefOr[js.Any] = js.native
}
object CustomStyleOptions {
  
  @scala.inline
  def apply(): CustomStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomStyleOptions]
  }
  
  @scala.inline
  implicit class CustomStyleOptionsOps[Self <: CustomStyleOptions] (val x: Self) extends AnyVal {
    
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
    def setNumFormat(value: js.Any): Self = this.set("NumFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumFormat: Self = this.set("NumFormat", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
