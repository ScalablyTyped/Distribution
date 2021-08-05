package typings.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultPluginMod {
  
  @JSImport("enhanced-resolve/lib/ResultPlugin", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with ResultPlugin {
    def this(source: String) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    /* CompleteClass */
    var source: String = js.native
  }
  
  trait ResultPlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit
    
    var source: String
  }
  object ResultPlugin {
    
    inline def apply(apply: typings.enhancedResolve.resolverMod.^ => Unit, source: String): ResultPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultPlugin]
    }
    
    extension [Self <: ResultPlugin](x: Self) {
      
      inline def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
