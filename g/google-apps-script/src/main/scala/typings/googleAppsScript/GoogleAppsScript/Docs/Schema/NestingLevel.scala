package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NestingLevel extends js.Object {
  
  var bulletAlignment: js.UndefOr[String] = js.native
  
  var glyphFormat: js.UndefOr[String] = js.native
  
  var glyphSymbol: js.UndefOr[String] = js.native
  
  var glyphType: js.UndefOr[String] = js.native
  
  var indentFirstLine: js.UndefOr[Dimension] = js.native
  
  var indentStart: js.UndefOr[Dimension] = js.native
  
  var startNumber: js.UndefOr[Double] = js.native
  
  var textStyle: js.UndefOr[TextStyle] = js.native
}
object NestingLevel {
  
  @scala.inline
  def apply(): NestingLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestingLevel]
  }
  
  @scala.inline
  implicit class NestingLevelOps[Self <: NestingLevel] (val x: Self) extends AnyVal {
    
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
    def setBulletAlignment(value: String): Self = this.set("bulletAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulletAlignment: Self = this.set("bulletAlignment", js.undefined)
    
    @scala.inline
    def setGlyphFormat(value: String): Self = this.set("glyphFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphFormat: Self = this.set("glyphFormat", js.undefined)
    
    @scala.inline
    def setGlyphSymbol(value: String): Self = this.set("glyphSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphSymbol: Self = this.set("glyphSymbol", js.undefined)
    
    @scala.inline
    def setGlyphType(value: String): Self = this.set("glyphType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphType: Self = this.set("glyphType", js.undefined)
    
    @scala.inline
    def setIndentFirstLine(value: Dimension): Self = this.set("indentFirstLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentFirstLine: Self = this.set("indentFirstLine", js.undefined)
    
    @scala.inline
    def setIndentStart(value: Dimension): Self = this.set("indentStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentStart: Self = this.set("indentStart", js.undefined)
    
    @scala.inline
    def setStartNumber(value: Double): Self = this.set("startNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartNumber: Self = this.set("startNumber", js.undefined)
    
    @scala.inline
    def setTextStyle(value: TextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
}
