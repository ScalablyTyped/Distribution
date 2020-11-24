package typings.elasticlunr.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticlunr", "Pipeline")
@js.native
class Pipeline () extends js.Object {
  
  def add(functions: PipelineFunction*): Unit = js.native
  
  def after(existingFn: PipelineFunction, newFn: PipelineFunction): Unit = js.native
  
  def before(existingFn: PipelineFunction, newFn: PipelineFunction): Unit = js.native
  
  def get(): js.Array[PipelineFunction] = js.native
  
  def remove(fn: PipelineFunction): Unit = js.native
  
  def reset(): Unit = js.native
  
  def run(tokens: js.Array[String]): js.Array[String] = js.native
  
  def toJSON(): SerialisedPipeline = js.native
}
/* static members */
@JSImport("elasticlunr", "Pipeline")
@js.native
object Pipeline extends js.Object {
  
  def getRegisteredFunction(label: String): PipelineFunction = js.native
  
  def load(serialised: SerialisedPipeline): Pipeline = js.native
  
  def registerFunction(fn: PipelineFunction, label: String): Unit = js.native
  
  def warnIfFunctionNotRegistered(fn: PipelineFunction): Unit = js.native
  
  @js.native
  object registeredFunctions extends js.Object {
    
    @js.native
    object stemmer extends js.Object {
      
      def apply(w: String): String = js.native
      
      val label: String = js.native
    }
    
    @js.native
    object stopWordFilter extends js.Object {
      
      def apply(token: String): String = js.native
      
      val label: String = js.native
      
      @js.native
      object stopWords extends /* key */ StringDictionary[Boolean]
    }
    
    @js.native
    object trimmer extends js.Object {
      
      def apply(token: String): String = js.native
      
      val label: String = js.native
    }
  }
}
