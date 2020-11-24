package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertInlineImageRequest extends js.Object {
  
  var endOfSegmentLocation: js.UndefOr[EndOfSegmentLocation] = js.native
  
  var location: js.UndefOr[Location] = js.native
  
  var objectSize: js.UndefOr[Size] = js.native
  
  var uri: js.UndefOr[String] = js.native
}
object InsertInlineImageRequest {
  
  @scala.inline
  def apply(): InsertInlineImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertInlineImageRequest]
  }
  
  @scala.inline
  implicit class InsertInlineImageRequestOps[Self <: InsertInlineImageRequest] (val x: Self) extends AnyVal {
    
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
    def setEndOfSegmentLocation(value: EndOfSegmentLocation): Self = this.set("endOfSegmentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOfSegmentLocation: Self = this.set("endOfSegmentLocation", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setObjectSize(value: Size): Self = this.set("objectSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectSize: Self = this.set("objectSize", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
