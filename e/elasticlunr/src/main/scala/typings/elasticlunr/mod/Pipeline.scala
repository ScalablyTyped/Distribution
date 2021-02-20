package typings.elasticlunr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticlunr", "Pipeline")
@js.native
class Pipeline () extends StObject {
  
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
  
  /* static member */
  @JSImport("elasticlunr", "Pipeline.getRegisteredFunction")
  @js.native
  def getRegisteredFunction(label: String): PipelineFunction = js.native
  
  /* static member */
  @JSImport("elasticlunr", "Pipeline.load")
  @js.native
  def load(serialised: SerialisedPipeline): Pipeline = js.native
  
  /* static member */
  @JSImport("elasticlunr", "Pipeline.registerFunction")
  @js.native
  def registerFunction(fn: PipelineFunction, label: String): Unit = js.native
  
  object registeredFunctions {
    
    object stemmer {
      
      @JSImport("elasticlunr", "Pipeline.registeredFunctions.stemmer")
      @js.native
      def apply(w: String): String = js.native
      
      @JSImport("elasticlunr", "Pipeline.registeredFunctions.stemmer.label")
      @js.native
      val label: String = js.native
    }
    
    object stopWordFilter {
      
      @JSImport("elasticlunr", "Pipeline.registeredFunctions.stopWordFilter")
      @js.native
      def apply(token: String): String = js.native
      
      @JSImport("elasticlunr", "Pipeline.registeredFunctions.stopWordFilter.label")
      @js.native
      val label: String = js.native
    }
    
    object trimmer {
      
      @JSImport("elasticlunr", "Pipeline.registeredFunctions.trimmer")
      @js.native
      def apply(token: String): String = js.native
      
      @JSImport("elasticlunr", "Pipeline.registeredFunctions.trimmer.label")
      @js.native
      val label: String = js.native
    }
  }
  
  /* static member */
  @JSImport("elasticlunr", "Pipeline.warnIfFunctionNotRegistered")
  @js.native
  def warnIfFunctionNotRegistered(fn: PipelineFunction): Unit = js.native
}
