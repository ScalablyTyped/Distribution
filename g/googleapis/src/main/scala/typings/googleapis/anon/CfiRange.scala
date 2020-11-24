package typings.googleapis.anon

import typings.googleapis.booksV1Mod.booksV1.SchemaBooksAnnotationsRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CfiRange extends js.Object {
  
  var cfiRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.native
  
  var contentVersion: js.UndefOr[String] = js.native
  
  var gbImageRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.native
  
  var gbTextRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.native
  
  var imageCfiRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.native
}
object CfiRange {
  
  @scala.inline
  def apply(): CfiRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CfiRange]
  }
  
  @scala.inline
  implicit class CfiRangeOps[Self <: CfiRange] (val x: Self) extends AnyVal {
    
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
    def setCfiRange(value: SchemaBooksAnnotationsRange): Self = this.set("cfiRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCfiRange: Self = this.set("cfiRange", js.undefined)
    
    @scala.inline
    def setContentVersion(value: String): Self = this.set("contentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentVersion: Self = this.set("contentVersion", js.undefined)
    
    @scala.inline
    def setGbImageRange(value: SchemaBooksAnnotationsRange): Self = this.set("gbImageRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGbImageRange: Self = this.set("gbImageRange", js.undefined)
    
    @scala.inline
    def setGbTextRange(value: SchemaBooksAnnotationsRange): Self = this.set("gbTextRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGbTextRange: Self = this.set("gbTextRange", js.undefined)
    
    @scala.inline
    def setImageCfiRange(value: SchemaBooksAnnotationsRange): Self = this.set("imageCfiRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageCfiRange: Self = this.set("imageCfiRange", js.undefined)
  }
}
