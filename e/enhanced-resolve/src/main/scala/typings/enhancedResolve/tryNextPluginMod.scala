package typings.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tryNextPluginMod {
  
  @JSImport("enhanced-resolve/lib/TryNextPlugin", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with TryNextPlugin {
    def this(source: String, message: String, target: String) = this()
    def this(source: String, message: Null, target: String) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    /* CompleteClass */
    var message: String | Null = js.native
    
    /* CompleteClass */
    var source: String = js.native
    
    /* CompleteClass */
    var target: String = js.native
  }
  
  trait TryNextPlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit
    
    var message: String | Null
    
    var source: String
    
    var target: String
  }
  object TryNextPlugin {
    
    @scala.inline
    def apply(apply: typings.enhancedResolve.resolverMod.^ => Unit, source: String, target: String): TryNextPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], message = null)
      __obj.asInstanceOf[TryNextPlugin]
    }
    
    @scala.inline
    implicit class TryNextPluginMutableBuilder[Self <: TryNextPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageNull: Self = StObject.set(x, "message", null)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
