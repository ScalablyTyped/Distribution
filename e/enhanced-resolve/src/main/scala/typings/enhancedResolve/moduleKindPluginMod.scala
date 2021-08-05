package typings.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleKindPluginMod {
  
  @JSImport("enhanced-resolve/lib/ModuleKindPlugin", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with ModuleKindPlugin {
    def this(source: String, target: String) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    /* CompleteClass */
    var source: String = js.native
    
    /* CompleteClass */
    var target: String = js.native
  }
  
  trait ModuleKindPlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit
    
    var source: String
    
    var target: String
  }
  object ModuleKindPlugin {
    
    inline def apply(apply: typings.enhancedResolve.resolverMod.^ => Unit, source: String, target: String): ModuleKindPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleKindPlugin]
    }
    
    extension [Self <: ModuleKindPlugin](x: Self) {
      
      inline def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
