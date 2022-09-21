package typings.gitignoreParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accepts extends StObject {
    
    def accepts(input: String): Boolean
    
    def denies(input: String): Boolean
    
    def maybe(input: String): Boolean
  }
  object Accepts {
    
    inline def apply(accepts: String => Boolean, denies: String => Boolean, maybe: String => Boolean): Accepts = {
      val __obj = js.Dynamic.literal(accepts = js.Any.fromFunction1(accepts), denies = js.Any.fromFunction1(denies), maybe = js.Any.fromFunction1(maybe))
      __obj.asInstanceOf[Accepts]
    }
    
    extension [Self <: Accepts](x: Self) {
      
      inline def setAccepts(value: String => Boolean): Self = StObject.set(x, "accepts", js.Any.fromFunction1(value))
      
      inline def setDenies(value: String => Boolean): Self = StObject.set(x, "denies", js.Any.fromFunction1(value))
      
      inline def setMaybe(value: String => Boolean): Self = StObject.set(x, "maybe", js.Any.fromFunction1(value))
    }
  }
}
