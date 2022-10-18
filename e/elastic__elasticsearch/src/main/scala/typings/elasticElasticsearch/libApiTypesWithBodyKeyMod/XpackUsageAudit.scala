package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageAudit
  extends StObject
     with XpackUsageFeatureToggle {
  
  var outputs: js.UndefOr[js.Array[String]] = js.undefined
}
object XpackUsageAudit {
  
  inline def apply(enabled: Boolean): XpackUsageAudit = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageAudit]
  }
  
  extension [Self <: XpackUsageAudit](x: Self) {
    
    inline def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value*))
  }
}
