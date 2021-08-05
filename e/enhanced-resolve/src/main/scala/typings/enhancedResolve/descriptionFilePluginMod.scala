package typings.enhancedResolve

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object descriptionFilePluginMod {
  
  @JSImport("enhanced-resolve/lib/DescriptionFilePlugin", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with DescriptionFilePlugin {
    def this(source: String, filenames: String, target: String) = this()
    def this(source: String, filenames: js.Array[String], target: String) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
    
    /* CompleteClass */
    var filenames: js.Array[String] = js.native
    
    /* CompleteClass */
    var source: String = js.native
    
    /* CompleteClass */
    var target: String = js.native
  }
  
  trait DescriptionFilePlugin extends StObject {
    
    @JSName("apply")
    def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit
    
    var filenames: js.Array[String]
    
    var source: String
    
    var target: String
  }
  object DescriptionFilePlugin {
    
    inline def apply(
      apply: typings.enhancedResolve.resolverMod.^ => Unit,
      filenames: js.Array[String],
      source: String,
      target: String
    ): DescriptionFilePlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), filenames = filenames.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescriptionFilePlugin]
    }
    
    extension [Self <: DescriptionFilePlugin](x: Self) {
      
      inline def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setFilenames(value: js.Array[String]): Self = StObject.set(x, "filenames", value.asInstanceOf[js.Any])
      
      inline def setFilenamesVarargs(value: String*): Self = StObject.set(x, "filenames", js.Array(value :_*))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
