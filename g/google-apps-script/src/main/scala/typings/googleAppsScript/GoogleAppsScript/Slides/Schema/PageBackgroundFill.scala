package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageBackgroundFill extends js.Object {
  
  var propertyState: js.UndefOr[String] = js.native
  
  var solidFill: js.UndefOr[SolidFill] = js.native
  
  var stretchedPictureFill: js.UndefOr[StretchedPictureFill] = js.native
}
object PageBackgroundFill {
  
  @scala.inline
  def apply(): PageBackgroundFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageBackgroundFill]
  }
  
  @scala.inline
  implicit class PageBackgroundFillOps[Self <: PageBackgroundFill] (val x: Self) extends AnyVal {
    
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
    def setPropertyState(value: String): Self = this.set("propertyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyState: Self = this.set("propertyState", js.undefined)
    
    @scala.inline
    def setSolidFill(value: SolidFill): Self = this.set("solidFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolidFill: Self = this.set("solidFill", js.undefined)
    
    @scala.inline
    def setStretchedPictureFill(value: StretchedPictureFill): Self = this.set("stretchedPictureFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStretchedPictureFill: Self = this.set("stretchedPictureFill", js.undefined)
  }
}
