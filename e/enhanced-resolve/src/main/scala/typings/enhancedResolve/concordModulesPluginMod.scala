package typings.enhancedResolve

import typings.enhancedResolve.concordMod.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concordModulesPluginMod {
  
  @JSImport("enhanced-resolve/lib/ConcordModulesPlugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends ConcordModulesPlugin {
    def this(source: String, options: Dictionary[_], target: String) = this()
  }
  
  @js.native
  trait ConcordModulesPlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    var options: Dictionary[_] = js.native
    
    var source: String = js.native
    
    var target: String = js.native
  }
  object ConcordModulesPlugin {
    
    @scala.inline
    def apply(
      apply: typings.enhancedResolve.resolverMod.^ => Unit,
      options: Dictionary[_],
      source: String,
      target: String
    ): ConcordModulesPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcordModulesPlugin]
    }
    
    @scala.inline
    implicit class ConcordModulesPluginMutableBuilder[Self <: ConcordModulesPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptions(value: Dictionary[_]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
