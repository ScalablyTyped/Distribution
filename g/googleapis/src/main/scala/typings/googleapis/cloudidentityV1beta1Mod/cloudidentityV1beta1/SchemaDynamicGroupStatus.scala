package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDynamicGroupStatus extends StObject {
  
  /**
    * Status of the dynamic group.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The latest time at which the dynamic group is guaranteed to be in the given status. If status is `UP_TO_DATE`, the latest time at which the dynamic group was confirmed to be up-to-date. If status is `UPDATING_MEMBERSHIPS`, the time at which dynamic group was created.
    */
  var statusTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaDynamicGroupStatus {
  
  inline def apply(): SchemaDynamicGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicGroupStatus]
  }
  
  extension [Self <: SchemaDynamicGroupStatus](x: Self) {
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusTime(value: String): Self = StObject.set(x, "statusTime", value.asInstanceOf[js.Any])
    
    inline def setStatusTimeNull: Self = StObject.set(x, "statusTime", null)
    
    inline def setStatusTimeUndefined: Self = StObject.set(x, "statusTime", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
