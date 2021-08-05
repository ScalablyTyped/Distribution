package typings.genericNames

import typings.genericNames.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(pattern: String): Generator = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[Generator]
  inline def apply(pattern: String, options: PartialOptions): Generator = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator]
  
  @JSImport("generic-names", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Generator = js.Function2[/* localName */ String, /* filepath */ String, String]
  
  trait Options extends StObject {
    
    var context: String
    
    var hashPrefix: String
  }
  object Options {
    
    inline def apply(context: String, hashPrefix: String): Options = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], hashPrefix = hashPrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setHashPrefix(value: String): Self = StObject.set(x, "hashPrefix", value.asInstanceOf[js.Any])
    }
  }
}
