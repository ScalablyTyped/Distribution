package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagramBeforeChangeShapeTextArgs extends js.Object {
  
  /**
    * [descr:dxDiagramBeforeChangeShapeTextArgs.shape]
    */
  var shape: js.UndefOr[dxDiagramShape] = js.native
}
object dxDiagramBeforeChangeShapeTextArgs {
  
  @scala.inline
  def apply(): dxDiagramBeforeChangeShapeTextArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramBeforeChangeShapeTextArgs]
  }
  
  @scala.inline
  implicit class dxDiagramBeforeChangeShapeTextArgsOps[Self <: dxDiagramBeforeChangeShapeTextArgs] (val x: Self) extends AnyVal {
    
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
