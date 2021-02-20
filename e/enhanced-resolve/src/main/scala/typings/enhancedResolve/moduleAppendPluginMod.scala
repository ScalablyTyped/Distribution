package typings.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleAppendPluginMod {
  
  @JSImport("enhanced-resolve/lib/ModuleAppendPlugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends ModuleAppendPlugin {
    def this(source: String, appending: String, target: String) = this()
  }
  
  @js.native
  trait ModuleAppendPlugin extends StObject {
    
    var appending: String = js.native
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    var source: String = js.native
    
    var target: String = js.native
  }
  object ModuleAppendPlugin {
    
    @scala.inline
    def apply(
      appending: String,
      apply: typings.enhancedResolve.resolverMod.^ => Unit,
      source: String,
      target: String
    ): ModuleAppendPlugin = {
      val __obj = js.Dynamic.literal(appending = appending.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleAppendPlugin]
    }
    
    @scala.inline
    implicit class ModuleAppendPluginMutableBuilder[Self <: ModuleAppendPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppending(value: String): Self = StObject.set(x, "appending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
