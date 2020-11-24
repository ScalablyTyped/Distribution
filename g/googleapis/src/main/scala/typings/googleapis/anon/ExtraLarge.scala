package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraLarge extends js.Object {
  
  var extraLarge: js.UndefOr[String] = js.native
  
  var large: js.UndefOr[String] = js.native
  
  var medium: js.UndefOr[String] = js.native
  
  var small: js.UndefOr[String] = js.native
  
  var smallThumbnail: js.UndefOr[String] = js.native
  
  var thumbnail: js.UndefOr[String] = js.native
}
object ExtraLarge {
  
  @scala.inline
  def apply(): ExtraLarge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraLarge]
  }
  
  @scala.inline
  implicit class ExtraLargeOps[Self <: ExtraLarge] (val x: Self) extends AnyVal {
    
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
    def setExtraLarge(value: String): Self = this.set("extraLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraLarge: Self = this.set("extraLarge", js.undefined)
    
    @scala.inline
    def setLarge(value: String): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    
    @scala.inline
    def setMedium(value: String): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    
    @scala.inline
    def setSmall(value: String): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    
    @scala.inline
    def setSmallThumbnail(value: String): Self = this.set("smallThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallThumbnail: Self = this.set("smallThumbnail", js.undefined)
    
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
  }
}
