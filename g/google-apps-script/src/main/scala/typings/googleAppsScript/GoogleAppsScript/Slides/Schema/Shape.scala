package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shape extends js.Object {
  
  var placeholder: js.UndefOr[Placeholder] = js.native
  
  var shapeProperties: js.UndefOr[ShapeProperties] = js.native
  
  var shapeType: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[TextContent] = js.native
}
object Shape {
  
  @scala.inline
  def apply(): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shape]
  }
  
  @scala.inline
  implicit class ShapeOps[Self <: Shape] (val x: Self) extends AnyVal {
    
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
    def setPlaceholder(value: Placeholder): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setShapeProperties(value: ShapeProperties): Self = this.set("shapeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeProperties: Self = this.set("shapeProperties", js.undefined)
    
    @scala.inline
    def setShapeType(value: String): Self = this.set("shapeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeType: Self = this.set("shapeType", js.undefined)
    
    @scala.inline
    def setText(value: TextContent): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
