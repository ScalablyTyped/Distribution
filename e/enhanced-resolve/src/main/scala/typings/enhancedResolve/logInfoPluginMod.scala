package typings.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logInfoPluginMod {
  
  @JSImport("enhanced-resolve/lib/LogInfoPlugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends LogInfoPlugin {
    def this(source: String) = this()
  }
  
  @js.native
  trait LogInfoPlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    var source: String = js.native
  }
  object LogInfoPlugin {
    
    @scala.inline
    def apply(apply: typings.enhancedResolve.resolverMod.^ => Unit, source: String): LogInfoPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogInfoPlugin]
    }
    
    @scala.inline
    implicit class LogInfoPluginMutableBuilder[Self <: LogInfoPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
