package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OcrRequest extends StObject {
  
  var ocrLanguage: js.UndefOr[String] = js.native
  
  var pageSelection: js.UndefOr[String] = js.native
  
  var setPageOrientation: js.UndefOr[String] = js.native
  
  var showFrames: js.UndefOr[String] = js.native
  
  var showText: js.UndefOr[String] = js.native
  
  var skipPagesHavingExistingExtractableText: js.UndefOr[String] = js.native
}
object OcrRequest {
  
  @scala.inline
  def apply(): OcrRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OcrRequest]
  }
  
  @scala.inline
  implicit class OcrRequestMutableBuilder[Self <: OcrRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOcrLanguage(value: String): Self = StObject.set(x, "ocrLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcrLanguageUndefined: Self = StObject.set(x, "ocrLanguage", js.undefined)
    
    @scala.inline
    def setPageSelection(value: String): Self = StObject.set(x, "pageSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSelectionUndefined: Self = StObject.set(x, "pageSelection", js.undefined)
    
    @scala.inline
    def setSetPageOrientation(value: String): Self = StObject.set(x, "setPageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPageOrientationUndefined: Self = StObject.set(x, "setPageOrientation", js.undefined)
    
    @scala.inline
    def setShowFrames(value: String): Self = StObject.set(x, "showFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFramesUndefined: Self = StObject.set(x, "showFrames", js.undefined)
    
    @scala.inline
    def setShowText(value: String): Self = StObject.set(x, "showText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTextUndefined: Self = StObject.set(x, "showText", js.undefined)
    
    @scala.inline
    def setSkipPagesHavingExistingExtractableText(value: String): Self = StObject.set(x, "skipPagesHavingExistingExtractableText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipPagesHavingExistingExtractableTextUndefined: Self = StObject.set(x, "skipPagesHavingExistingExtractableText", js.undefined)
  }
}
