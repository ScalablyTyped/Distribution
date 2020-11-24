package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagramDeleteShapeArgs extends js.Object {
  
  /**
    * [descr:dxDiagramDeleteShapeArgs.shape]
    */
  var shape: js.UndefOr[dxDiagramShape] = js.native
}
object dxDiagramDeleteShapeArgs {
  
  @scala.inline
  def apply(): dxDiagramDeleteShapeArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramDeleteShapeArgs]
  }
  
  @scala.inline
  implicit class dxDiagramDeleteShapeArgsOps[Self <: dxDiagramDeleteShapeArgs] (val x: Self) extends AnyVal {
    
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
    def setShape(value: dxDiagramShape): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
  }
}
