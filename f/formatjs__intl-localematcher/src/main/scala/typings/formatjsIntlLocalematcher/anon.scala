package typings.formatjsIntlLocalematcher

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictk
    extends StObject
       with /* k */ StringDictionary[String] {
    
    var localeMatcher: String
  }
  object Dictk {
    
    inline def apply(localeMatcher: String): Dictk = {
      val __obj = js.Dynamic.literal(localeMatcher = localeMatcher.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictk]
    }
    
    extension [Self <: Dictk](x: Self) {
      
      inline def setLocaleMatcher(value: String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    }
  }
}
