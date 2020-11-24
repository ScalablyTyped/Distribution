package typings.devextreme.anon

import typings.devextreme.devextremeStrings.arrow
import typings.devextreme.devextremeStrings.filledTriangle
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.orthogonal
import typings.devextreme.devextremeStrings.outlinedTriangle
import typings.devextreme.devextremeStrings.straight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorLineEnd extends js.Object {
  
  var connectorLineEnd: js.UndefOr[none | arrow | outlinedTriangle | filledTriangle] = js.native
  
  var connectorLineStart: js.UndefOr[none | arrow | outlinedTriangle | filledTriangle] = js.native
  
  var connectorLineType: js.UndefOr[straight | orthogonal] = js.native
  
  var shapeMaxHeight: js.UndefOr[Double] = js.native
  
  var shapeMaxWidth: js.UndefOr[Double] = js.native
  
  var shapeMinHeight: js.UndefOr[Double] = js.native
  
  var shapeMinWidth: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[js.Any] = js.native
  
  var textStyle: js.UndefOr[js.Any] = js.native
}
object ConnectorLineEnd {
  
  @scala.inline
  def apply(): ConnectorLineEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorLineEnd]
  }
  
  @scala.inline
  implicit class ConnectorLineEndOps[Self <: ConnectorLineEnd] (val x: Self) extends AnyVal {
    
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
    def setConnectorLineEnd(value: none | arrow | outlinedTriangle | filledTriangle): Self = this.set("connectorLineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorLineEnd: Self = this.set("connectorLineEnd", js.undefined)
    
    @scala.inline
    def setConnectorLineStart(value: none | arrow | outlinedTriangle | filledTriangle): Self = this.set("connectorLineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorLineStart: Self = this.set("connectorLineStart", js.undefined)
    
    @scala.inline
    def setConnectorLineType(value: straight | orthogonal): Self = this.set("connectorLineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorLineType: Self = this.set("connectorLineType", js.undefined)
    
    @scala.inline
    def setShapeMaxHeight(value: Double): Self = this.set("shapeMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeMaxHeight: Self = this.set("shapeMaxHeight", js.undefined)
    
    @scala.inline
    def setShapeMaxWidth(value: Double): Self = this.set("shapeMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeMaxWidth: Self = this.set("shapeMaxWidth", js.undefined)
    
    @scala.inline
    def setShapeMinHeight(value: Double): Self = this.set("shapeMinHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeMinHeight: Self = this.set("shapeMinHeight", js.undefined)
    
    @scala.inline
    def setShapeMinWidth(value: Double): Self = this.set("shapeMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeMinWidth: Self = this.set("shapeMinWidth", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTextStyle(value: js.Any): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
}
