package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformFontUsage extends js.Object {
  
  /**
    * Font's family name reported by platform.
    */
  var familyName: String = js.native
  
  /**
    * Amount of glyphs that were rendered with this font.
    */
  var glyphCount: Double = js.native
  
  /**
    * Indicates if the font was downloaded or resolved locally.
    */
  var isCustomFont: Boolean = js.native
}
object PlatformFontUsage {
  
  @scala.inline
  def apply(familyName: String, glyphCount: Double, isCustomFont: Boolean): PlatformFontUsage = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], glyphCount = glyphCount.asInstanceOf[js.Any], isCustomFont = isCustomFont.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformFontUsage]
  }
  
  @scala.inline
  implicit class PlatformFontUsageOps[Self <: PlatformFontUsage] (val x: Self) extends AnyVal {
    
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
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphCount(value: Double): Self = this.set("glyphCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCustomFont(value: Boolean): Self = this.set("isCustomFont", value.asInstanceOf[js.Any])
  }
}
