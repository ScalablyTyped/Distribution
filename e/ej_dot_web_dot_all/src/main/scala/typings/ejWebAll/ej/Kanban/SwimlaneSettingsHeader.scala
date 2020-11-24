package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwimlaneSettingsHeader extends js.Object {
  
  /** Gets or sets a value that indicates to render the Kanban with specified swimlane header key.
    * @Default {null}
    */
  var key: js.UndefOr[String] = js.native
  
  /** Gets or sets a value that indicates to render the Kanban with specified swimlane header text.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
}
object SwimlaneSettingsHeader {
  
  @scala.inline
  def apply(): SwimlaneSettingsHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwimlaneSettingsHeader]
  }
  
  @scala.inline
  implicit class SwimlaneSettingsHeaderOps[Self <: SwimlaneSettingsHeader] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
