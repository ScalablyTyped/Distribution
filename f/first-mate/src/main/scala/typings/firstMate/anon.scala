package typings.firstMate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait MaxLineLength extends StObject {
    
    var maxLineLength: js.UndefOr[Double] = js.native
    
    var maxTokensPerLine: js.UndefOr[Double] = js.native
  }
  object MaxLineLength {
    
    @scala.inline
    def apply(): MaxLineLength = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxLineLength]
    }
    
    @scala.inline
    implicit class MaxLineLengthMutableBuilder[Self <: MaxLineLength] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxLineLength(value: Double): Self = StObject.set(x, "maxLineLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLineLengthUndefined: Self = StObject.set(x, "maxLineLength", js.undefined)
      
      @scala.inline
      def setMaxTokensPerLine(value: Double): Self = StObject.set(x, "maxTokensPerLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTokensPerLineUndefined: Self = StObject.set(x, "maxTokensPerLine", js.undefined)
    }
  }
}
