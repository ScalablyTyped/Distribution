package typings.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object descriptionFilePluginMod {
  
  @JSImport("enhanced-resolve/lib/DescriptionFilePlugin", JSImport.Namespace)
  @js.native
  class ^ protected () extends DescriptionFilePlugin {
    def this(source: String, filenames: String, target: String) = this()
    def this(source: String, filenames: js.Array[String], target: String) = this()
  }
  
  @js.native
  trait DescriptionFilePlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    var filenames: js.Array[String] = js.native
    
    var source: String = js.native
    
    var target: String = js.native
  }
  object DescriptionFilePlugin {
    
    @scala.inline
    def apply(
      apply: typings.enhancedResolve.resolverMod.^ => Unit,
      filenames: js.Array[String],
      source: String,
      target: String
    ): DescriptionFilePlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), filenames = filenames.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescriptionFilePlugin]
    }
    
    @scala.inline
    implicit class DescriptionFilePluginMutableBuilder[Self <: DescriptionFilePlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilenames(value: js.Array[String]): Self = StObject.set(x, "filenames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenamesVarargs(value: String*): Self = StObject.set(x, "filenames", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
