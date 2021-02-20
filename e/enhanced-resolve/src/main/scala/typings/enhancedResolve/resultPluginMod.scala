package typings.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultPluginMod {
  
  @JSImport("enhanced-resolve/lib/ResultPlugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends ResultPlugin {
    def this(source: String) = this()
  }
  
  @js.native
  trait ResultPlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    var source: String = js.native
  }
  object ResultPlugin {
    
    @scala.inline
    def apply(apply: typings.enhancedResolve.resolverMod.^ => Unit, source: String): ResultPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultPlugin]
    }
    
    @scala.inline
    implicit class ResultPluginMutableBuilder[Self <: ResultPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
