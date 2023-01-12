package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.PartialRecordEnrichPolicyGeomatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichSummary extends StObject {
  
  var config: PartialRecordEnrichPolicyGeomatch
}
object EnrichSummary {
  
  inline def apply(config: PartialRecordEnrichPolicyGeomatch): EnrichSummary = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnrichSummary] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: PartialRecordEnrichPolicyGeomatch): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
