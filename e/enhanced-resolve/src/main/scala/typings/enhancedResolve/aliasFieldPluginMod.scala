package typings.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aliasFieldPluginMod {
  
  @JSImport("enhanced-resolve/lib/AliasFieldPlugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends AliasFieldPlugin {
    def this(source: String, field: String, target: String) = this()
  }
  
  @js.native
  trait AliasFieldPlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    var field: String = js.native
    
    var source: String = js.native
    
    var target: String = js.native
  }
  object AliasFieldPlugin {
    
    @scala.inline
    def apply(
      apply: typings.enhancedResolve.resolverMod.^ => Unit,
      field: String,
      source: String,
      target: String
    ): AliasFieldPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), field = field.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[AliasFieldPlugin]
    }
    
    @scala.inline
    implicit class AliasFieldPluginMutableBuilder[Self <: AliasFieldPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
