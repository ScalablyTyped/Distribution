package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultSettings extends js.Object {
  
  /** Initializes the default connector properties
    * @Default {null}
    */
  var connector: js.UndefOr[js.Any] = js.native
  
  /** Initializes the default properties of groups
    * @Default {null}
    */
  var group: js.UndefOr[js.Any] = js.native
  
  /** Initializes the default properties for nodes
    * @Default {null}
    */
  var node: js.UndefOr[js.Any] = js.native
}
object DefaultSettings {
  
  @scala.inline
  def apply(): DefaultSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultSettings]
  }
  
  @scala.inline
  implicit class DefaultSettingsOps[Self <: DefaultSettings] (val x: Self) extends AnyVal {
    
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
    def setConnector(value: js.Any): Self = this.set("connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnector: Self = this.set("connector", js.undefined)
    
    @scala.inline
    def setGroup(value: js.Any): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setNode(value: js.Any): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
  }
}
