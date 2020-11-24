package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollSettings extends js.Object {
  
  /** To allow the Kanban to freeze particular swimlane at the time of scrolling , until scroll reaches next swimlane and it continues.
    * @Default {false}
    */
  var allowFreezeSwimlane: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets an object that indicates to render the Kanban with specified scroll height.
    * @Default {0}
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /** Gets or sets an object that indicates to render the Kanban with specified scroll width.
    * @Default {auto}
    */
  var width: js.UndefOr[String | Double] = js.native
}
object ScrollSettings {
  
  @scala.inline
  def apply(): ScrollSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollSettings]
  }
  
  @scala.inline
  implicit class ScrollSettingsOps[Self <: ScrollSettings] (val x: Self) extends AnyVal {
    
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
    def setAllowFreezeSwimlane(value: Boolean): Self = this.set("allowFreezeSwimlane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFreezeSwimlane: Self = this.set("allowFreezeSwimlane", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
