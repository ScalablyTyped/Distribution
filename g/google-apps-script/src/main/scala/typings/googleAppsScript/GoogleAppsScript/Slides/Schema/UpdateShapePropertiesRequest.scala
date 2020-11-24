package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateShapePropertiesRequest extends js.Object {
  
  var fields: js.UndefOr[String] = js.native
  
  var objectId: js.UndefOr[String] = js.native
  
  var shapeProperties: js.UndefOr[ShapeProperties] = js.native
}
object UpdateShapePropertiesRequest {
  
  @scala.inline
  def apply(): UpdateShapePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateShapePropertiesRequest]
  }
  
  @scala.inline
  implicit class UpdateShapePropertiesRequestOps[Self <: UpdateShapePropertiesRequest] (val x: Self) extends AnyVal {
    
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
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setShapeProperties(value: ShapeProperties): Self = this.set("shapeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeProperties: Self = this.set("shapeProperties", js.undefined)
  }
}
