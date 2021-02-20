package typings.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesInRootPluginMod {
  
  @JSImport("enhanced-resolve/lib/ModulesInRootPlugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends ModulesInRootPlugin {
    def this(source: String, path: String, target: String) = this()
  }
  
  @js.native
  trait ModulesInRootPlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    var path: String = js.native
    
    var source: String = js.native
    
    var target: String = js.native
  }
  object ModulesInRootPlugin {
    
    @scala.inline
    def apply(apply: typings.enhancedResolve.resolverMod.^ => Unit, path: String, source: String, target: String): ModulesInRootPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), path = path.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModulesInRootPlugin]
    }
    
    @scala.inline
    implicit class ModulesInRootPluginMutableBuilder[Self <: ModulesInRootPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
