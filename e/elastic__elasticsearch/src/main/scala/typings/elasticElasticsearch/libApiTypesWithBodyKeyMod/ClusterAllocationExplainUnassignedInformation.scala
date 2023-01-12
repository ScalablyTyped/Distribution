package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterAllocationExplainUnassignedInformation extends StObject {
  
  var allocation_status: js.UndefOr[String] = js.undefined
  
  var at: DateTime
  
  var delayed: js.UndefOr[Boolean] = js.undefined
  
  var details: js.UndefOr[String] = js.undefined
  
  var failed_allocation_attempts: js.UndefOr[integer] = js.undefined
  
  var last_allocation_status: js.UndefOr[String] = js.undefined
  
  var reason: ClusterAllocationExplainUnassignedInformationReason
}
object ClusterAllocationExplainUnassignedInformation {
  
  inline def apply(at: DateTime, reason: ClusterAllocationExplainUnassignedInformationReason): ClusterAllocationExplainUnassignedInformation = {
    val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterAllocationExplainUnassignedInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterAllocationExplainUnassignedInformation] (val x: Self) extends AnyVal {
    
    inline def setAllocation_status(value: String): Self = StObject.set(x, "allocation_status", value.asInstanceOf[js.Any])
    
    inline def setAllocation_statusUndefined: Self = StObject.set(x, "allocation_status", js.undefined)
    
    inline def setAt(value: DateTime): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setDelayed(value: Boolean): Self = StObject.set(x, "delayed", value.asInstanceOf[js.Any])
    
    inline def setDelayedUndefined: Self = StObject.set(x, "delayed", js.undefined)
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setFailed_allocation_attempts(value: integer): Self = StObject.set(x, "failed_allocation_attempts", value.asInstanceOf[js.Any])
    
    inline def setFailed_allocation_attemptsUndefined: Self = StObject.set(x, "failed_allocation_attempts", js.undefined)
    
    inline def setLast_allocation_status(value: String): Self = StObject.set(x, "last_allocation_status", value.asInstanceOf[js.Any])
    
    inline def setLast_allocation_statusUndefined: Self = StObject.set(x, "last_allocation_status", js.undefined)
    
    inline def setReason(value: ClusterAllocationExplainUnassignedInformationReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
