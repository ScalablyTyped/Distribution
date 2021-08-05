package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OcrRequest extends StObject {
  
  var ocrLanguage: js.UndefOr[String] = js.undefined
  
  var pageSelection: js.UndefOr[String] = js.undefined
  
  var setPageOrientation: js.UndefOr[String] = js.undefined
  
  var showFrames: js.UndefOr[String] = js.undefined
  
  var showText: js.UndefOr[String] = js.undefined
  
  var skipPagesHavingExistingExtractableText: js.UndefOr[String] = js.undefined
}
object OcrRequest {
  
  inline def apply(): OcrRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OcrRequest]
  }
  
  extension [Self <: OcrRequest](x: Self) {
    
    inline def setOcrLanguage(value: String): Self = StObject.set(x, "ocrLanguage", value.asInstanceOf[js.Any])
    
    inline def setOcrLanguageUndefined: Self = StObject.set(x, "ocrLanguage", js.undefined)
    
    inline def setPageSelection(value: String): Self = StObject.set(x, "pageSelection", value.asInstanceOf[js.Any])
    
    inline def setPageSelectionUndefined: Self = StObject.set(x, "pageSelection", js.undefined)
    
    inline def setSetPageOrientation(value: String): Self = StObject.set(x, "setPageOrientation", value.asInstanceOf[js.Any])
    
    inline def setSetPageOrientationUndefined: Self = StObject.set(x, "setPageOrientation", js.undefined)
    
    inline def setShowFrames(value: String): Self = StObject.set(x, "showFrames", value.asInstanceOf[js.Any])
    
    inline def setShowFramesUndefined: Self = StObject.set(x, "showFrames", js.undefined)
    
    inline def setShowText(value: String): Self = StObject.set(x, "showText", value.asInstanceOf[js.Any])
    
    inline def setShowTextUndefined: Self = StObject.set(x, "showText", js.undefined)
    
    inline def setSkipPagesHavingExistingExtractableText(value: String): Self = StObject.set(x, "skipPagesHavingExistingExtractableText", value.asInstanceOf[js.Any])
    
    inline def setSkipPagesHavingExistingExtractableTextUndefined: Self = StObject.set(x, "skipPagesHavingExistingExtractableText", js.undefined)
  }
}
