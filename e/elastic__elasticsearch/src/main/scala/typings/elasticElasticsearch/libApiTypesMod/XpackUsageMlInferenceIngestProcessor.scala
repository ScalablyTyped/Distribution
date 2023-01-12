package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageMlInferenceIngestProcessor extends StObject {
  
  var num_docs_processed: XpackUsageMlInferenceIngestProcessorCount
  
  var num_failures: XpackUsageMlInferenceIngestProcessorCount
  
  var pipelines: XpackUsageMlCounter
  
  var time_ms: XpackUsageMlInferenceIngestProcessorCount
}
object XpackUsageMlInferenceIngestProcessor {
  
  inline def apply(
    num_docs_processed: XpackUsageMlInferenceIngestProcessorCount,
    num_failures: XpackUsageMlInferenceIngestProcessorCount,
    pipelines: XpackUsageMlCounter,
    time_ms: XpackUsageMlInferenceIngestProcessorCount
  ): XpackUsageMlInferenceIngestProcessor = {
    val __obj = js.Dynamic.literal(num_docs_processed = num_docs_processed.asInstanceOf[js.Any], num_failures = num_failures.asInstanceOf[js.Any], pipelines = pipelines.asInstanceOf[js.Any], time_ms = time_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageMlInferenceIngestProcessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageMlInferenceIngestProcessor] (val x: Self) extends AnyVal {
    
    inline def setNum_docs_processed(value: XpackUsageMlInferenceIngestProcessorCount): Self = StObject.set(x, "num_docs_processed", value.asInstanceOf[js.Any])
    
    inline def setNum_failures(value: XpackUsageMlInferenceIngestProcessorCount): Self = StObject.set(x, "num_failures", value.asInstanceOf[js.Any])
    
    inline def setPipelines(value: XpackUsageMlCounter): Self = StObject.set(x, "pipelines", value.asInstanceOf[js.Any])
    
    inline def setTime_ms(value: XpackUsageMlInferenceIngestProcessorCount): Self = StObject.set(x, "time_ms", value.asInstanceOf[js.Any])
  }
}
