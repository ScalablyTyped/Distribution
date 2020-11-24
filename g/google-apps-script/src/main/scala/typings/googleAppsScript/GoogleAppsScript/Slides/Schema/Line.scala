package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Line extends js.Object {
  
  var lineCategory: js.UndefOr[String] = js.native
  
  var lineProperties: js.UndefOr[LineProperties] = js.native
  
  var lineType: js.UndefOr[String] = js.native
}
object Line {
  
  @scala.inline
  def apply(): Line = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Line]
  }
  
  @scala.inline
  implicit class LineOps[Self <: Line] (val x: Self) extends AnyVal {
    
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
    def setLineCategory(value: String): Self = this.set("lineCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineCategory: Self = this.set("lineCategory", js.undefined)
    
    @scala.inline
    def setLineProperties(value: LineProperties): Self = this.set("lineProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineProperties: Self = this.set("lineProperties", js.undefined)
    
    @scala.inline
    def setLineType(value: String): Self = this.set("lineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineType: Self = this.set("lineType", js.undefined)
  }
}
