package typings.ejWebAll.ej.PivotChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Zooming extends js.Object {
  
  /** Enables or disables the horizontal scrollbar.
    * @Default {false}
    */
  var enableScrollbar: js.UndefOr[Boolean] = js.native
}
object Zooming {
  
  @scala.inline
  def apply(): Zooming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Zooming]
  }
  
  @scala.inline
  implicit class ZoomingOps[Self <: Zooming] (val x: Self) extends AnyVal {
    
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
    def setEnableScrollbar(value: Boolean): Self = this.set("enableScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableScrollbar: Self = this.set("enableScrollbar", js.undefined)
  }
}
