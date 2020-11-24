package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagramAddShapeArgs extends js.Object {
  
  /**
    * [descr:dxDiagramAddShapeArgs.position]
    */
  var position: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxDiagramAddShapeArgs.shape]
    */
  var shape: js.UndefOr[dxDiagramShape] = js.native
}
object dxDiagramAddShapeArgs {
  
  @scala.inline
  def apply(): dxDiagramAddShapeArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramAddShapeArgs]
  }
  
  @scala.inline
  implicit class dxDiagramAddShapeArgsOps[Self <: dxDiagramAddShapeArgs] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShape(value: dxDiagramShape): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
  }
}
