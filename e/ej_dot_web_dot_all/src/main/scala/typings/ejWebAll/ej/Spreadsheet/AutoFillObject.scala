package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoFillObject extends js.Object {
  
  /** Pass the data range to autofill
    */
  var dataRange: js.UndefOr[String] = js.native
  
  /** Pass the direction to autofill
    */
  var direction: js.UndefOr[String] = js.native
  
  /** Pass the fill range to autofill
    */
  var fillRange: js.UndefOr[String] = js.native
  
  /** Pass the fill type to perform autofill in spreadsheet
    */
  var fillType: js.UndefOr[String] = js.native
}
object AutoFillObject {
  
  @scala.inline
  def apply(): AutoFillObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFillObject]
  }
  
  @scala.inline
  implicit class AutoFillObjectOps[Self <: AutoFillObject] (val x: Self) extends AnyVal {
    
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
    def setDataRange(value: String): Self = this.set("dataRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataRange: Self = this.set("dataRange", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setFillRange(value: String): Self = this.set("fillRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillRange: Self = this.set("fillRange", js.undefined)
    
    @scala.inline
    def setFillType(value: String): Self = this.set("fillType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillType: Self = this.set("fillType", js.undefined)
  }
}
