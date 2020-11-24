package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.end
import typings.devextreme.devextremeStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagramChangeConnectionArgs extends js.Object {
  
  /**
    * [descr:dxDiagramChangeConnectionArgs.connectionPointIndex]
    */
  var connectionPointIndex: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxDiagramChangeConnectionArgs.connector]
    */
  var connector: js.UndefOr[dxDiagramConnector] = js.native
  
  /**
    * [descr:dxDiagramChangeConnectionArgs.connectorPosition]
    */
  var connectorPosition: js.UndefOr[start | end] = js.native
  
  /**
    * [descr:dxDiagramChangeConnectionArgs.newShape]
    */
  var newShape: js.UndefOr[dxDiagramShape] = js.native
  
  /**
    * [descr:dxDiagramChangeConnectionArgs.oldShape]
    */
  var oldShape: js.UndefOr[dxDiagramShape] = js.native
}
object dxDiagramChangeConnectionArgs {
  
  @scala.inline
  def apply(): dxDiagramChangeConnectionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramChangeConnectionArgs]
  }
  
  @scala.inline
  implicit class dxDiagramChangeConnectionArgsOps[Self <: dxDiagramChangeConnectionArgs] (val x: Self) extends AnyVal {
    
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
    def setConnectionPointIndex(value: Double): Self = this.set("connectionPointIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionPointIndex: Self = this.set("connectionPointIndex", js.undefined)
    
    @scala.inline
    def setConnector(value: dxDiagramConnector): Self = this.set("connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnector: Self = this.set("connector", js.undefined)
    
    @scala.inline
    def setConnectorPosition(value: start | end): Self = this.set("connectorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorPosition: Self = this.set("connectorPosition", js.undefined)
    
    @scala.inline
    def setNewShape(value: dxDiagramShape): Self = this.set("newShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewShape: Self = this.set("newShape", js.undefined)
    
    @scala.inline
    def setOldShape(value: dxDiagramShape): Self = this.set("oldShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldShape: Self = this.set("oldShape", js.undefined)
  }
}
