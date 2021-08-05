package typings.firstMate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait MaxLineLength extends StObject {
    
    var maxLineLength: js.UndefOr[Double] = js.undefined
    
    var maxTokensPerLine: js.UndefOr[Double] = js.undefined
  }
  object MaxLineLength {
    
    inline def apply(): MaxLineLength = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxLineLength]
    }
    
    extension [Self <: MaxLineLength](x: Self) {
      
      inline def setMaxLineLength(value: Double): Self = StObject.set(x, "maxLineLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLineLengthUndefined: Self = StObject.set(x, "maxLineLength", js.undefined)
      
      inline def setMaxTokensPerLine(value: Double): Self = StObject.set(x, "maxTokensPerLine", value.asInstanceOf[js.Any])
      
      inline def setMaxTokensPerLineUndefined: Self = StObject.set(x, "maxTokensPerLine", js.undefined)
    }
  }
}
