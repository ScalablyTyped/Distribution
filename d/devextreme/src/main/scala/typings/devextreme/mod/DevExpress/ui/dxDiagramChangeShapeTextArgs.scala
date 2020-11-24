package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagramChangeShapeTextArgs extends js.Object {
  
  /**
    * [descr:dxDiagramChangeShapeTextArgs.shape]
    */
  var shape: js.UndefOr[dxDiagramShape] = js.native
  
  /**
    * [descr:dxDiagramChangeShapeTextArgs.text]
    */
  var text: js.UndefOr[String] = js.native
}
object dxDiagramChangeShapeTextArgs {
  
  @scala.inline
  def apply(): dxDiagramChangeShapeTextArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramChangeShapeTextArgs]
  }
  
  @scala.inline
  implicit class dxDiagramChangeShapeTextArgsOps[Self <: dxDiagramChangeShapeTextArgs] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
