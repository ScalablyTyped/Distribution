package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowAddShape extends js.Object {
  
  var allowAddShape: js.UndefOr[Boolean] = js.native
  
  var allowChangeConnection: js.UndefOr[Boolean] = js.native
  
  var allowChangeConnectorPoints: js.UndefOr[Boolean] = js.native
  
  var allowChangeConnectorText: js.UndefOr[Boolean] = js.native
  
  var allowChangeShapeText: js.UndefOr[Boolean] = js.native
  
  var allowDeleteConnector: js.UndefOr[Boolean] = js.native
  
  var allowDeleteShape: js.UndefOr[Boolean] = js.native
  
  var allowMoveShape: js.UndefOr[Boolean] = js.native
  
  var allowResizeShape: js.UndefOr[Boolean] = js.native
}
object AllowAddShape {
  
  @scala.inline
  def apply(): AllowAddShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowAddShape]
  }
  
  @scala.inline
  implicit class AllowAddShapeOps[Self <: AllowAddShape] (val x: Self) extends AnyVal {
    
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
    def setAllowAddShape(value: Boolean): Self = this.set("allowAddShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAddShape: Self = this.set("allowAddShape", js.undefined)
    
    @scala.inline
    def setAllowChangeConnection(value: Boolean): Self = this.set("allowChangeConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowChangeConnection: Self = this.set("allowChangeConnection", js.undefined)
    
    @scala.inline
    def setAllowChangeConnectorPoints(value: Boolean): Self = this.set("allowChangeConnectorPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowChangeConnectorPoints: Self = this.set("allowChangeConnectorPoints", js.undefined)
    
    @scala.inline
    def setAllowChangeConnectorText(value: Boolean): Self = this.set("allowChangeConnectorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowChangeConnectorText: Self = this.set("allowChangeConnectorText", js.undefined)
    
    @scala.inline
    def setAllowChangeShapeText(value: Boolean): Self = this.set("allowChangeShapeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowChangeShapeText: Self = this.set("allowChangeShapeText", js.undefined)
    
    @scala.inline
    def setAllowDeleteConnector(value: Boolean): Self = this.set("allowDeleteConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDeleteConnector: Self = this.set("allowDeleteConnector", js.undefined)
    
    @scala.inline
    def setAllowDeleteShape(value: Boolean): Self = this.set("allowDeleteShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDeleteShape: Self = this.set("allowDeleteShape", js.undefined)
    
    @scala.inline
    def setAllowMoveShape(value: Boolean): Self = this.set("allowMoveShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMoveShape: Self = this.set("allowMoveShape", js.undefined)
    
    @scala.inline
    def setAllowResizeShape(value: Boolean): Self = this.set("allowResizeShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowResizeShape: Self = this.set("allowResizeShape", js.undefined)
  }
}
