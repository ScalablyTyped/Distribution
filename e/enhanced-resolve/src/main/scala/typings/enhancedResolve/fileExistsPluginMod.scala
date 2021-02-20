package typings.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileExistsPluginMod {
  
  @JSImport("enhanced-resolve/lib/FileExistsPlugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends FileExistsPlugin {
    def this(source: String, target: String) = this()
  }
  
  @js.native
  trait FileExistsPlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    var source: String = js.native
    
    var target: String = js.native
  }
  object FileExistsPlugin {
    
    @scala.inline
    def apply(apply: typings.enhancedResolve.resolverMod.^ => Unit, source: String, target: String): FileExistsPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileExistsPlugin]
    }
    
    @scala.inline
    implicit class FileExistsPluginMutableBuilder[Self <: FileExistsPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
