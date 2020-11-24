package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagramDeleteConnectorArgs extends js.Object {
  
  /**
    * [descr:dxDiagramDeleteConnectorArgs.connector]
    */
  var connector: js.UndefOr[dxDiagramConnector] = js.native
}
object dxDiagramDeleteConnectorArgs {
  
  @scala.inline
  def apply(): dxDiagramDeleteConnectorArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramDeleteConnectorArgs]
  }
  
  @scala.inline
  implicit class dxDiagramDeleteConnectorArgsOps[Self <: dxDiagramDeleteConnectorArgs] (val x: Self) extends AnyVal {
    
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
    def setConnector(value: dxDiagramConnector): Self = this.set("connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnector: Self = this.set("connector", js.undefined)
  }
}
