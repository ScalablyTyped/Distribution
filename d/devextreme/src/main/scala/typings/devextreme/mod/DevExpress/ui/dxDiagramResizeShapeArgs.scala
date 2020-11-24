package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagramResizeShapeArgs extends js.Object {
  
  /**
    * [descr:dxDiagramResizeShapeArgs.newSize]
    */
  var newSize: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * [descr:dxDiagramResizeShapeArgs.oldSize]
    */
  var oldSize: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * [descr:dxDiagramResizeShapeArgs.shape]
    */
  var shape: js.UndefOr[dxDiagramShape] = js.native
}
object dxDiagramResizeShapeArgs {
  
  @scala.inline
  def apply(): dxDiagramResizeShapeArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramResizeShapeArgs]
  }
  
  @scala.inline
  implicit class dxDiagramResizeShapeArgsOps[Self <: dxDiagramResizeShapeArgs] (val x: Self) extends AnyVal {
    
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
    def setNewSizeVarargs(value: js.Any*): Self = this.set("newSize", js.Array(value :_*))
    
    @scala.inline
    def setNewSize(value: js.Array[_]): Self = this.set("newSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewSize: Self = this.set("newSize", js.undefined)
    
    @scala.inline
    def setOldSizeVarargs(value: js.Any*): Self = this.set("oldSize", js.Array(value :_*))
    
    @scala.inline
    def setOldSize(value: js.Array[_]): Self = this.set("oldSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldSize: Self = this.set("oldSize", js.undefined)
    
    @scala.inline
    def setShape(value: dxDiagramShape): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
  }
}
