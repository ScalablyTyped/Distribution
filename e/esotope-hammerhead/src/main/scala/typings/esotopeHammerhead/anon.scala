package typings.esotopeHammerhead

import typings.esotopeHammerhead.esotopeHammerheadStrings.auto
import typings.esotopeHammerhead.esotopeHammerheadStrings.double
import typings.esotopeHammerhead.esotopeHammerheadStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Base extends StObject {
    
    var base: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[String] = js.undefined
  }
  object Base {
    
    inline def apply(): Base = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Base]
    }
    
    extension [Self <: Base](x: Self) {
      
      inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait Compact extends StObject {
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var escapeless: js.UndefOr[Boolean] = js.undefined
    
    var hexadecimal: js.UndefOr[Boolean] = js.undefined
    
    var indent: js.UndefOr[Base] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var newline: js.UndefOr[String] = js.undefined
    
    var parentheses: js.UndefOr[Boolean] = js.undefined
    
    var quotes: js.UndefOr[single | double | auto] = js.undefined
    
    var renumber: js.UndefOr[Boolean] = js.undefined
    
    var safeConcatenation: js.UndefOr[Boolean] = js.undefined
    
    var semicolons: js.UndefOr[Boolean] = js.undefined
    
    var space: js.UndefOr[String] = js.undefined
  }
  object Compact {
    
    inline def apply(): Compact = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Compact]
    }
    
    extension [Self <: Compact](x: Self) {
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setEscapeless(value: Boolean): Self = StObject.set(x, "escapeless", value.asInstanceOf[js.Any])
      
      inline def setEscapelessUndefined: Self = StObject.set(x, "escapeless", js.undefined)
      
      inline def setHexadecimal(value: Boolean): Self = StObject.set(x, "hexadecimal", value.asInstanceOf[js.Any])
      
      inline def setHexadecimalUndefined: Self = StObject.set(x, "hexadecimal", js.undefined)
      
      inline def setIndent(value: Base): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      inline def setParentheses(value: Boolean): Self = StObject.set(x, "parentheses", value.asInstanceOf[js.Any])
      
      inline def setParenthesesUndefined: Self = StObject.set(x, "parentheses", js.undefined)
      
      inline def setQuotes(value: single | double | auto): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      inline def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      inline def setRenumber(value: Boolean): Self = StObject.set(x, "renumber", value.asInstanceOf[js.Any])
      
      inline def setRenumberUndefined: Self = StObject.set(x, "renumber", js.undefined)
      
      inline def setSafeConcatenation(value: Boolean): Self = StObject.set(x, "safeConcatenation", value.asInstanceOf[js.Any])
      
      inline def setSafeConcatenationUndefined: Self = StObject.set(x, "safeConcatenation", js.undefined)
      
      inline def setSemicolons(value: Boolean): Self = StObject.set(x, "semicolons", value.asInstanceOf[js.Any])
      
      inline def setSemicolonsUndefined: Self = StObject.set(x, "semicolons", js.undefined)
      
      inline def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
}
