package typings.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appendPluginMod {
  
  @JSImport("enhanced-resolve/lib/AppendPlugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends AppendPlugin {
    def this(source: String, appending: String, target: String) = this()
  }
  
  @js.native
  trait AppendPlugin extends StObject {
    
    var appending: String = js.native
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    var source: String = js.native
    
    var target: String = js.native
  }
  object AppendPlugin {
    
    @scala.inline
    def apply(
      appending: String,
      apply: typings.enhancedResolve.resolverMod.^ => Unit,
      source: String,
      target: String
    ): AppendPlugin = {
      val __obj = js.Dynamic.literal(appending = appending.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppendPlugin]
    }
    
    @scala.inline
    implicit class AppendPluginMutableBuilder[Self <: AppendPlugin] (val x: Self) extends AnyVal {
      
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
