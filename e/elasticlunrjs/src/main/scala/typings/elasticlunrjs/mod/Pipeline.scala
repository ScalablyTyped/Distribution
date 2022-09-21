package typings.elasticlunrjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticlunrjs", "Pipeline")
@js.native
open class Pipeline () extends StObject {
  
  def add(functions: PipelineFunction*): Unit = js.native
  
  def after(existingFn: PipelineFunction, newFn: PipelineFunction): Unit = js.native
  
  def before(existingFn: PipelineFunction, newFn: PipelineFunction): Unit = js.native
  
  def get(): js.Array[PipelineFunction] = js.native
  
  def remove(fn: PipelineFunction): Unit = js.native
  
  def reset(): Unit = js.native
  
  def run(tokens: js.Array[String]): js.Array[String] = js.native
  
  def toJSON(): SerialisedPipeline = js.native
}
object Pipeline {
  
  @JSImport("elasticlunrjs", "Pipeline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getRegisteredFunction(label: String): PipelineFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredFunction")(label.asInstanceOf[js.Any]).asInstanceOf[PipelineFunction]
  
  /* static member */
  inline def load(serialised: SerialisedPipeline): Pipeline = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(serialised.asInstanceOf[js.Any]).asInstanceOf[Pipeline]
  
  /* static member */
  inline def registerFunction(fn: PipelineFunction, label: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFunction")(fn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object registeredFunctions {
    
    object stemmer {
      
      inline def apply(token: String): String = ^.asInstanceOf[js.Dynamic].apply(token.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @JSImport("elasticlunrjs", "Pipeline.registeredFunctions.stemmer")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("elasticlunrjs", "Pipeline.registeredFunctions.stemmer.label")
      @js.native
      val label: String = js.native
    }
    
    object stopWordFilter {
      
      inline def apply(token: String): String = ^.asInstanceOf[js.Dynamic].apply(token.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @JSImport("elasticlunrjs", "Pipeline.registeredFunctions.stopWordFilter")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("elasticlunrjs", "Pipeline.registeredFunctions.stopWordFilter.label")
      @js.native
      val label: String = js.native
    }
    
    object trimmer {
      
      inline def apply(token: String): String = ^.asInstanceOf[js.Dynamic].apply(token.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @JSImport("elasticlunrjs", "Pipeline.registeredFunctions.trimmer")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("elasticlunrjs", "Pipeline.registeredFunctions.trimmer.label")
      @js.native
      val label: String = js.native
    }
  }
  
  /* static member */
  inline def warnIfFunctionNotRegistered(fn: PipelineFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnIfFunctionNotRegistered")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
