package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagramChangeConnectorPointsArgs extends js.Object {
  
  /**
    * [descr:dxDiagramChangeConnectorPointsArgs.connector]
    */
  var connector: js.UndefOr[dxDiagramConnector] = js.native
  
  /**
    * [descr:dxDiagramChangeConnectorPointsArgs.newPoints]
    */
  var newPoints: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * [descr:dxDiagramChangeConnectorPointsArgs.oldPoints]
    */
  var oldPoints: js.UndefOr[js.Array[_]] = js.native
}
object dxDiagramChangeConnectorPointsArgs {
  
  @scala.inline
  def apply(): dxDiagramChangeConnectorPointsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramChangeConnectorPointsArgs]
  }
  
  @scala.inline
  implicit class dxDiagramChangeConnectorPointsArgsOps[Self <: dxDiagramChangeConnectorPointsArgs] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setNewPointsVarargs(value: js.Any*): Self = this.set("newPoints", js.Array(value :_*))
    
    @scala.inline
    def setNewPoints(value: js.Array[_]): Self = this.set("newPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewPoints: Self = this.set("newPoints", js.undefined)
    
    @scala.inline
    def setOldPointsVarargs(value: js.Any*): Self = this.set("oldPoints", js.Array(value :_*))
    
    @scala.inline
    def setOldPoints(value: js.Array[_]): Self = this.set("oldPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldPoints: Self = this.set("oldPoints", js.undefined)
  }
}
