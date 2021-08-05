package typings.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleAppendPluginMod {
  
  @JSImport("enhanced-resolve/lib/ModuleAppendPlugin", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with ModuleAppendPlugin {
    def this(source: String, appending: String, target: String) = this()
    
    /* CompleteClass */
    var appending: String = js.native
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    /* CompleteClass */
    var source: String = js.native
    
    /* CompleteClass */
    var target: String = js.native
  }
  
  trait ModuleAppendPlugin extends StObject {
    
    var appending: String
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit
    
    var source: String
    
    var target: String
  }
  object ModuleAppendPlugin {
    
    inline def apply(
      appending: String,
      apply: typings.enhancedResolve.resolverMod.^ => Unit,
      source: String,
      target: String
    ): ModuleAppendPlugin = {
      val __obj = js.Dynamic.literal(appending = appending.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleAppendPlugin]
    }
    
    extension [Self <: ModuleAppendPlugin](x: Self) {
      
      inline def setAppending(value: String): Self = StObject.set(x, "appending", value.asInstanceOf[js.Any])
      
      inline def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
