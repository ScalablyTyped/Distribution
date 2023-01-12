package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.anon.PartialRecordEnrichPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichSummary extends StObject {
  
  var config: PartialRecordEnrichPolicy
}
object EnrichSummary {
  
  inline def apply(config: PartialRecordEnrichPolicy): EnrichSummary = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnrichSummary] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: PartialRecordEnrichPolicy): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
