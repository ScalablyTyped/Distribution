package typings.enhancedResolve

import typings.enhancedResolve.anon.ForceRelative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainFieldPluginMod {
  
  @JSImport("enhanced-resolve/lib/MainFieldPlugin", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with MainFieldPlugin {
    def this(source: String, options: ForceRelative, target: String) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    /* CompleteClass */
    var options: ForceRelative = js.native
    
    /* CompleteClass */
    var source: String = js.native
    
    /* CompleteClass */
    var target: String = js.native
  }
  
  trait MainFieldPlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit
    
    var options: ForceRelative
    
    var source: String
    
    var target: String
  }
  object MainFieldPlugin {
    
    @scala.inline
    def apply(
      apply: typings.enhancedResolve.resolverMod.^ => Unit,
      options: ForceRelative,
      source: String,
      target: String
    ): MainFieldPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[MainFieldPlugin]
    }
    
    @scala.inline
    implicit class MainFieldPluginMutableBuilder[Self <: MainFieldPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptions(value: ForceRelative): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
