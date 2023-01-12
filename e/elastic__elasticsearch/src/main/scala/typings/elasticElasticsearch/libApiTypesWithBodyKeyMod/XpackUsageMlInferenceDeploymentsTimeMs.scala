package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageMlInferenceDeploymentsTimeMs extends StObject {
  
  var avg: double
}
object XpackUsageMlInferenceDeploymentsTimeMs {
  
  inline def apply(avg: double): XpackUsageMlInferenceDeploymentsTimeMs = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageMlInferenceDeploymentsTimeMs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageMlInferenceDeploymentsTimeMs] (val x: Self) extends AnyVal {
    
    inline def setAvg(value: double): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
  }
}
