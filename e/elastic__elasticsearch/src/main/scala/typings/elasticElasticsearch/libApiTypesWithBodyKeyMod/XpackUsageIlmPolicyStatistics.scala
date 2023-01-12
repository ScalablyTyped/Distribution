package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageIlmPolicyStatistics extends StObject {
  
  var indices_managed: integer
  
  var phases: IlmPhases
}
object XpackUsageIlmPolicyStatistics {
  
  inline def apply(indices_managed: integer, phases: IlmPhases): XpackUsageIlmPolicyStatistics = {
    val __obj = js.Dynamic.literal(indices_managed = indices_managed.asInstanceOf[js.Any], phases = phases.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageIlmPolicyStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageIlmPolicyStatistics] (val x: Self) extends AnyVal {
    
    inline def setIndices_managed(value: integer): Self = StObject.set(x, "indices_managed", value.asInstanceOf[js.Any])
    
    inline def setPhases(value: IlmPhases): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
  }
}
