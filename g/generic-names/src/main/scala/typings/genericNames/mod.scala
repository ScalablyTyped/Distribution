package typings.genericNames

import typings.genericNames.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(pattern: String): Generator = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[Generator]
  @scala.inline
  def apply(pattern: String, options: PartialOptions): Generator = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator]
  
  @JSImport("generic-names", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Generator = js.Function2[/* localName */ String, /* filepath */ String, String]
  
  trait Options extends StObject {
    
    var context: String
    
    var hashPrefix: String
  }
  object Options {
    
    @scala.inline
    def apply(context: String, hashPrefix: String): Options = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], hashPrefix = hashPrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashPrefix(value: String): Self = StObject.set(x, "hashPrefix", value.asInstanceOf[js.Any])
    }
  }
}
