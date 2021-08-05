package typings.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logInfoPluginMod {
  
  @JSImport("enhanced-resolve/lib/LogInfoPlugin", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with LogInfoPlugin {
    def this(source: String) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    /* CompleteClass */
    var source: String = js.native
  }
  
  trait LogInfoPlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit
    
    var source: String
  }
  object LogInfoPlugin {
    
    inline def apply(apply: typings.enhancedResolve.resolverMod.^ => Unit, source: String): LogInfoPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogInfoPlugin]
    }
    
    extension [Self <: LogInfoPlugin](x: Self) {
      
      inline def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
