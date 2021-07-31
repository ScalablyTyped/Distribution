package typings.estree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cooked extends StObject {
    
    var cooked: String
    
    var raw: String
  }
  object Cooked {
    
    @scala.inline
    def apply(cooked: String, raw: String): Cooked = {
      val __obj = js.Dynamic.literal(cooked = cooked.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cooked]
    }
    
    @scala.inline
    implicit class CookedMutableBuilder[Self <: Cooked] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCooked(value: String): Self = StObject.set(x, "cooked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  trait Flags extends StObject {
    
    var flags: String
    
    var pattern: String
  }
  object Flags {
    
    @scala.inline
    def apply(flags: String, pattern: String): Flags = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flags]
    }
    
    @scala.inline
    implicit class FlagsMutableBuilder[Self <: Flags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
}
