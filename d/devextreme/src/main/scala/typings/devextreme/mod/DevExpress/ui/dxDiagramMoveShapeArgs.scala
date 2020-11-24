package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagramMoveShapeArgs extends js.Object {
  
  /**
    * [descr:dxDiagramMoveShapeArgs.newPosition]
    */
  var newPosition: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * [descr:dxDiagramMoveShapeArgs.oldPosition]
    */
  var oldPosition: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * [descr:dxDiagramMoveShapeArgs.shape]
    */
  var shape: js.UndefOr[dxDiagramShape] = js.native
}
object dxDiagramMoveShapeArgs {
  
  @scala.inline
  def apply(): dxDiagramMoveShapeArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramMoveShapeArgs]
  }
  
  @scala.inline
  implicit class dxDiagramMoveShapeArgsOps[Self <: dxDiagramMoveShapeArgs] (val x: Self) extends AnyVal {
    
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
    def setNewPositionVarargs(value: js.Any*): Self = this.set("newPosition", js.Array(value :_*))
    
    @scala.inline
    def setNewPosition(value: js.Array[_]): Self = this.set("newPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewPosition: Self = this.set("newPosition", js.undefined)
    
    @scala.inline
    def setOldPositionVarargs(value: js.Any*): Self = this.set("oldPosition", js.Array(value :_*))
    
    @scala.inline
    def setOldPosition(value: js.Array[_]): Self = this.set("oldPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldPosition: Self = this.set("oldPosition", js.undefined)
    
    @scala.inline
    def setShape(value: dxDiagramShape): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
  }
}
