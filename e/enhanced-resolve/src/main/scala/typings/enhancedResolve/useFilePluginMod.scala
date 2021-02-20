package typings.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFilePluginMod {
  
  @JSImport("enhanced-resolve/lib/UseFilePlugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends UseFilePlugin {
    def this(source: String, filename: String, target: String) = this()
  }
  
  @js.native
  trait UseFilePlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    var filename: String = js.native
    
    var source: String = js.native
    
    var target: String = js.native
  }
  object UseFilePlugin {
    
    @scala.inline
    def apply(
      apply: typings.enhancedResolve.resolverMod.^ => Unit,
      filename: String,
      source: String,
      target: String
    ): UseFilePlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), filename = filename.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseFilePlugin]
    }
    
    @scala.inline
    implicit class UseFilePluginMutableBuilder[Self <: UseFilePlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
