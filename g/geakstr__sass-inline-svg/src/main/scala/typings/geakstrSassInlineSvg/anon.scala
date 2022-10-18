package typings.geakstrSassInlineSvg

import typings.geakstrSassInlineSvg.geakstrSassInlineSvgStrings.base64
import typings.geakstrSassInlineSvg.geakstrSassInlineSvgStrings.uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait EncodingFormat extends StObject {
    
    var encodingFormat: js.UndefOr[base64 | uri] = js.undefined
    
    var optimize: js.UndefOr[Boolean] = js.undefined
  }
  object EncodingFormat {
    
    inline def apply(): EncodingFormat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingFormat]
    }
    
    extension [Self <: EncodingFormat](x: Self) {
      
      inline def setEncodingFormat(value: base64 | uri): Self = StObject.set(x, "encodingFormat", value.asInstanceOf[js.Any])
      
      inline def setEncodingFormatUndefined: Self = StObject.set(x, "encodingFormat", js.undefined)
      
      inline def setOptimize(value: Boolean): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
      
      inline def setOptimizeUndefined: Self = StObject.set(x, "optimize", js.undefined)
    }
  }
}
