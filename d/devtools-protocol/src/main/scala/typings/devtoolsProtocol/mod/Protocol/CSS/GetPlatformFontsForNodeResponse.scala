package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPlatformFontsForNodeResponse extends js.Object {
  
  /**
    * Usage statistics for every employed platform font.
    */
  var fonts: js.Array[PlatformFontUsage] = js.native
}
object GetPlatformFontsForNodeResponse {
  
  @scala.inline
  def apply(fonts: js.Array[PlatformFontUsage]): GetPlatformFontsForNodeResponse = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlatformFontsForNodeResponse]
  }
  
  @scala.inline
  implicit class GetPlatformFontsForNodeResponseOps[Self <: GetPlatformFontsForNodeResponse] (val x: Self) extends AnyVal {
    
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
    def setFontsVarargs(value: PlatformFontUsage*): Self = this.set("fonts", js.Array(value :_*))
    
    @scala.inline
    def setFonts(value: js.Array[PlatformFontUsage]): Self = this.set("fonts", value.asInstanceOf[js.Any])
  }
}
