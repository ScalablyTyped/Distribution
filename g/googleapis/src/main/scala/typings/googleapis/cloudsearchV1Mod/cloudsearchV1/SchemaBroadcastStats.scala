package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBroadcastStats extends StObject {
  
  /**
    * Estimated concurrent viewer count.
    */
  var estimatedViewerCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaBroadcastStats {
  
  inline def apply(): SchemaBroadcastStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBroadcastStats]
  }
  
  extension [Self <: SchemaBroadcastStats](x: Self) {
    
    inline def setEstimatedViewerCount(value: String): Self = StObject.set(x, "estimatedViewerCount", value.asInstanceOf[js.Any])
    
    inline def setEstimatedViewerCountNull: Self = StObject.set(x, "estimatedViewerCount", null)
    
    inline def setEstimatedViewerCountUndefined: Self = StObject.set(x, "estimatedViewerCount", js.undefined)
  }
}
