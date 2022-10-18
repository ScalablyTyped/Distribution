package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichSummary extends StObject {
  
  var config: EnrichConfiguration
}
object EnrichSummary {
  
  inline def apply(config: EnrichConfiguration): EnrichSummary = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichSummary]
  }
  
  extension [Self <: EnrichSummary](x: Self) {
    
    inline def setConfig(value: EnrichConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
