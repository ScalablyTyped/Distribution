package typings.estree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cooked extends StObject {
    
    /** It is null when the template literal is tagged and the text has an invalid escape (e.g. - tag`\\unicode and \\u{55}`) */
    var cooked: js.UndefOr[String | Null] = js.undefined
    
    var raw: String
  }
  object Cooked {
    
    inline def apply(raw: String): Cooked = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cooked]
    }
    
    extension [Self <: Cooked](x: Self) {
      
      inline def setCooked(value: String): Self = StObject.set(x, "cooked", value.asInstanceOf[js.Any])
      
      inline def setCookedNull: Self = StObject.set(x, "cooked", null)
      
      inline def setCookedUndefined: Self = StObject.set(x, "cooked", js.undefined)
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  trait Flags extends StObject {
    
    var flags: String
    
    var pattern: String
  }
  object Flags {
    
    inline def apply(flags: String, pattern: String): Flags = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flags]
    }
    
    extension [Self <: Flags](x: Self) {
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
}
