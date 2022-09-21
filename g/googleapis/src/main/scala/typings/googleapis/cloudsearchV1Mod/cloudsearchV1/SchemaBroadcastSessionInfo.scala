package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBroadcastSessionInfo extends StObject {
  
  /**
    * A unique server-generated ID for the broadcast session.
    */
  var broadcastSessionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Current broadcast session's statistics.
    */
  var broadcastStats: js.UndefOr[SchemaBroadcastStats] = js.undefined
  
  /**
    * Input only. Deprecated field, should not be used.
    */
  var ingestionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Broadcast session's state information.
    */
  var sessionStateInfo: js.UndefOr[SchemaSessionStateInfo] = js.undefined
}
object SchemaBroadcastSessionInfo {
  
  inline def apply(): SchemaBroadcastSessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBroadcastSessionInfo]
  }
  
  extension [Self <: SchemaBroadcastSessionInfo](x: Self) {
    
    inline def setBroadcastSessionId(value: String): Self = StObject.set(x, "broadcastSessionId", value.asInstanceOf[js.Any])
    
    inline def setBroadcastSessionIdNull: Self = StObject.set(x, "broadcastSessionId", null)
    
    inline def setBroadcastSessionIdUndefined: Self = StObject.set(x, "broadcastSessionId", js.undefined)
    
    inline def setBroadcastStats(value: SchemaBroadcastStats): Self = StObject.set(x, "broadcastStats", value.asInstanceOf[js.Any])
    
    inline def setBroadcastStatsUndefined: Self = StObject.set(x, "broadcastStats", js.undefined)
    
    inline def setIngestionId(value: String): Self = StObject.set(x, "ingestionId", value.asInstanceOf[js.Any])
    
    inline def setIngestionIdNull: Self = StObject.set(x, "ingestionId", null)
    
    inline def setIngestionIdUndefined: Self = StObject.set(x, "ingestionId", js.undefined)
    
    inline def setSessionStateInfo(value: SchemaSessionStateInfo): Self = StObject.set(x, "sessionStateInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionStateInfoUndefined: Self = StObject.set(x, "sessionStateInfo", js.undefined)
  }
}
