package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlInferenceConfigUpdateContainer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inferenceconfig extends StObject {
  
  var docs: js.Array[Record[String, Any]]
  
  var inference_config: js.UndefOr[MlInferenceConfigUpdateContainer] = js.undefined
}
object Inferenceconfig {
  
  inline def apply(docs: js.Array[Record[String, Any]]): Inferenceconfig = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inferenceconfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inferenceconfig] (val x: Self) extends AnyVal {
    
    inline def setDocs(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "docs", js.Array(value*))
    
    inline def setInference_config(value: MlInferenceConfigUpdateContainer): Self = StObject.set(x, "inference_config", value.asInstanceOf[js.Any])
    
    inline def setInference_configUndefined: Self = StObject.set(x, "inference_config", js.undefined)
  }
}
