package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuperStickerMetadata extends js.Object {
  
  var altText: js.UndefOr[String] = js.native
  
  var altTextLanguage: js.UndefOr[String] = js.native
  
  var stickerId: js.UndefOr[String] = js.native
}
object SuperStickerMetadata {
  
  @scala.inline
  def apply(): SuperStickerMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuperStickerMetadata]
  }
  
  @scala.inline
  implicit class SuperStickerMetadataOps[Self <: SuperStickerMetadata] (val x: Self) extends AnyVal {
    
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
    def setAltText(value: String): Self = this.set("altText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltText: Self = this.set("altText", js.undefined)
    
    @scala.inline
    def setAltTextLanguage(value: String): Self = this.set("altTextLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltTextLanguage: Self = this.set("altTextLanguage", js.undefined)
    
    @scala.inline
    def setStickerId(value: String): Self = this.set("stickerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickerId: Self = this.set("stickerId", js.undefined)
  }
}
