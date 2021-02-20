package typings.googleapis.anon

import typings.googleapis.booksV1Mod.booksV1.SchemaBooksAnnotationsRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentVersion extends StObject {
  
  var cfiRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.native
  
  var contentVersion: js.UndefOr[String] = js.native
  
  var gbImageRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.native
  
  var gbTextRange: js.UndefOr[SchemaBooksAnnotationsRange] = js.native
}
object ContentVersion {
  
  @scala.inline
  def apply(): ContentVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentVersion]
  }
  
  @scala.inline
  implicit class ContentVersionMutableBuilder[Self <: ContentVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCfiRange(value: SchemaBooksAnnotationsRange): Self = StObject.set(x, "cfiRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCfiRangeUndefined: Self = StObject.set(x, "cfiRange", js.undefined)
    
    @scala.inline
    def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    @scala.inline
    def setGbImageRange(value: SchemaBooksAnnotationsRange): Self = StObject.set(x, "gbImageRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGbImageRangeUndefined: Self = StObject.set(x, "gbImageRange", js.undefined)
    
    @scala.inline
    def setGbTextRange(value: SchemaBooksAnnotationsRange): Self = StObject.set(x, "gbTextRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGbTextRangeUndefined: Self = StObject.set(x, "gbTextRange", js.undefined)
  }
}
