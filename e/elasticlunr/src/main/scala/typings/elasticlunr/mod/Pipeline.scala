package typings.elasticlunr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("elasticlunr", "Pipeline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def getRegisteredFunction(label: String): PipelineFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredFunction")(label.asInstanceOf[js.Any]).asInstanceOf[PipelineFunction]
  
  /* static member */
  @scala.inline
  def load(serialised: SerialisedPipeline): Pipeline = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(serialised.asInstanceOf[js.Any]).asInstanceOf[Pipeline]
  
  /* static member */
  @scala.inline
  def registerFunction(fn: PipelineFunction, label: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFunction")(fn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object registeredFunctions {
    
    object stemmer {
      
      @scala.inline
      def apply(w: String): String = ^.asInstanceOf[js.Dynamic].apply(w.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @JSImport("elasticlunr", "Pipeline.registeredFunctions.stemmer")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("elasticlunr", "Pipeline.registeredFunctions.stemmer.label")
      @js.native
      val label: String = js.native
    }
    
    object stopWordFilter {
      
      @scala.inline
      def apply(token: String): String = ^.asInstanceOf[js.Dynamic].apply(token.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @JSImport("elasticlunr", "Pipeline.registeredFunctions.stopWordFilter")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("elasticlunr", "Pipeline.registeredFunctions.stopWordFilter.label")
      @js.native
      val label: String = js.native
    }
    
    object trimmer {
      
      @scala.inline
      def apply(token: String): String = ^.asInstanceOf[js.Dynamic].apply(token.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @JSImport("elasticlunr", "Pipeline.registeredFunctions.trimmer")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("elasticlunr", "Pipeline.registeredFunctions.trimmer.label")
      @js.native
      val label: String = js.native
    }
  }
  
  /* static member */
  @scala.inline
  def warnIfFunctionNotRegistered(fn: PipelineFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnIfFunctionNotRegistered")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
