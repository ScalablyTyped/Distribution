package typings.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesInRootPluginMod {
  
  @JSImport("enhanced-resolve/lib/ModulesInRootPlugin", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with ModulesInRootPlugin {
    def this(source: String, path: String, target: String) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    /* CompleteClass */
    var path: String = js.native
    
    /* CompleteClass */
    var source: String = js.native
    
    /* CompleteClass */
    var target: String = js.native
  }
  
  trait ModulesInRootPlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit
    
    var path: String
    
    var source: String
    
    var target: String
  }
  object ModulesInRootPlugin {
    
    inline def apply(apply: typings.enhancedResolve.resolverMod.^ => Unit, path: String, source: String, target: String): ModulesInRootPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), path = path.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModulesInRootPlugin]
    }
    
    extension [Self <: ModulesInRootPlugin](x: Self) {
      
      inline def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
