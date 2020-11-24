package typings.ejWebAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionTarget extends js.Object {
  
  /** Sets the Tooltip position against target based on horizontal(x) value.
    * @Default {center}
    */
  var horizontal: js.UndefOr[String | Double] = js.native
  
  /** Sets the Tooltip position against target based on vertical(y) value.
    * @Default {top}
    */
  var vertical: js.UndefOr[String | Double] = js.native
}
object PositionTarget {
  
  @scala.inline
  def apply(): PositionTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionTarget]
  }
  
  @scala.inline
  implicit class PositionTargetOps[Self <: PositionTarget] (val x: Self) extends AnyVal {
    
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
    def setHorizontal(value: String | Double): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setVertical(value: String | Double): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
