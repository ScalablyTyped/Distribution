package typings.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinRequestPluginMod {
  
  @JSImport("enhanced-resolve/lib/JoinRequestPlugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends JoinRequestPlugin {
    def this(source: String, target: String) = this()
  }
  
  @js.native
  trait JoinRequestPlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    var source: String = js.native
    
    var target: String = js.native
  }
  object JoinRequestPlugin {
    
    @scala.inline
    def apply(apply: typings.enhancedResolve.resolverMod.^ => Unit, source: String, target: String): JoinRequestPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[JoinRequestPlugin]
    }
    
    @scala.inline
    implicit class JoinRequestPluginMutableBuilder[Self <: JoinRequestPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
