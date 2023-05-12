package typings.eslintCommunityRegexpp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DotAll extends StObject {
    
    var dotAll: Boolean
    
    var global: Boolean
    
    var hasIndices: Boolean
    
    var ignoreCase: Boolean
    
    var multiline: Boolean
    
    var sticky: Boolean
    
    var unicode: Boolean
  }
  object DotAll {
    
    inline def apply(
      dotAll: Boolean,
      global: Boolean,
      hasIndices: Boolean,
      ignoreCase: Boolean,
      multiline: Boolean,
      sticky: Boolean,
      unicode: Boolean
    ): DotAll = {
      val __obj = js.Dynamic.literal(dotAll = dotAll.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], hasIndices = hasIndices.asInstanceOf[js.Any], ignoreCase = ignoreCase.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
      __obj.asInstanceOf[DotAll]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DotAll] (val x: Self) extends AnyVal {
      
      inline def setDotAll(value: Boolean): Self = StObject.set(x, "dotAll", value.asInstanceOf[js.Any])
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setHasIndices(value: Boolean): Self = StObject.set(x, "hasIndices", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      inline def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    }
  }
}
