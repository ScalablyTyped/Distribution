package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagramChangeConnectorTextArgs extends js.Object {
  
  /**
    * [descr:dxDiagramChangeConnectorTextArgs.connector]
    */
  var connector: js.UndefOr[dxDiagramConnector] = js.native
  
  /**
    * [descr:dxDiagramChangeConnectorTextArgs.index]
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxDiagramChangeConnectorTextArgs.text]
    */
  var text: js.UndefOr[String] = js.native
}
object dxDiagramChangeConnectorTextArgs {
  
  @scala.inline
  def apply(): dxDiagramChangeConnectorTextArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramChangeConnectorTextArgs]
  }
  
  @scala.inline
  implicit class dxDiagramChangeConnectorTextArgsOps[Self <: dxDiagramChangeConnectorTextArgs] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
