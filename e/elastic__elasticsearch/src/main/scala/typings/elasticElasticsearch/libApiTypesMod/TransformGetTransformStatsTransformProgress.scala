package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformGetTransformStatsTransformProgress extends StObject {
  
  var docs_indexed: long
  
  var docs_processed: long
  
  var docs_remaining: long
  
  var percent_complete: double
  
  var total_docs: long
}
object TransformGetTransformStatsTransformProgress {
  
  inline def apply(
    docs_indexed: long,
    docs_processed: long,
    docs_remaining: long,
    percent_complete: double,
    total_docs: long
  ): TransformGetTransformStatsTransformProgress = {
    val __obj = js.Dynamic.literal(docs_indexed = docs_indexed.asInstanceOf[js.Any], docs_processed = docs_processed.asInstanceOf[js.Any], docs_remaining = docs_remaining.asInstanceOf[js.Any], percent_complete = percent_complete.asInstanceOf[js.Any], total_docs = total_docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformGetTransformStatsTransformProgress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformGetTransformStatsTransformProgress] (val x: Self) extends AnyVal {
    
    inline def setDocs_indexed(value: long): Self = StObject.set(x, "docs_indexed", value.asInstanceOf[js.Any])
    
    inline def setDocs_processed(value: long): Self = StObject.set(x, "docs_processed", value.asInstanceOf[js.Any])
    
    inline def setDocs_remaining(value: long): Self = StObject.set(x, "docs_remaining", value.asInstanceOf[js.Any])
    
    inline def setPercent_complete(value: double): Self = StObject.set(x, "percent_complete", value.asInstanceOf[js.Any])
    
    inline def setTotal_docs(value: long): Self = StObject.set(x, "total_docs", value.asInstanceOf[js.Any])
  }
}
