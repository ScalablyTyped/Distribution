package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateLinePropertiesRequest extends js.Object {
  
  var fields: js.UndefOr[String] = js.native
  
  var lineProperties: js.UndefOr[LineProperties] = js.native
  
  var objectId: js.UndefOr[String] = js.native
}
object UpdateLinePropertiesRequest {
  
  @scala.inline
  def apply(): UpdateLinePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLinePropertiesRequest]
  }
  
  @scala.inline
  implicit class UpdateLinePropertiesRequestOps[Self <: UpdateLinePropertiesRequest] (val x: Self) extends AnyVal {
    
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
    def setLineProperties(value: LineProperties): Self = this.set("lineProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineProperties: Self = this.set("lineProperties", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
  }
}
