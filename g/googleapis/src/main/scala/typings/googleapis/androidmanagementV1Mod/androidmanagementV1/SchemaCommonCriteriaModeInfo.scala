package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommonCriteriaModeInfo extends StObject {
  
  /**
    * Whether Common Criteria Mode is enabled.
    */
  var commonCriteriaModeStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaCommonCriteriaModeInfo {
  
  inline def apply(): SchemaCommonCriteriaModeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommonCriteriaModeInfo]
  }
  
  extension [Self <: SchemaCommonCriteriaModeInfo](x: Self) {
    
    inline def setCommonCriteriaModeStatus(value: String): Self = StObject.set(x, "commonCriteriaModeStatus", value.asInstanceOf[js.Any])
    
    inline def setCommonCriteriaModeStatusNull: Self = StObject.set(x, "commonCriteriaModeStatus", null)
    
    inline def setCommonCriteriaModeStatusUndefined: Self = StObject.set(x, "commonCriteriaModeStatus", js.undefined)
  }
}
