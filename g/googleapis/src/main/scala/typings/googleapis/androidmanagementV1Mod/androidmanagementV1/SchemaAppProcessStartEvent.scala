package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppProcessStartEvent extends StObject {
  
  /**
    * Information about a process.
    */
  var processInfo: js.UndefOr[SchemaAppProcessInfo] = js.undefined
}
object SchemaAppProcessStartEvent {
  
  inline def apply(): SchemaAppProcessStartEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppProcessStartEvent]
  }
  
  extension [Self <: SchemaAppProcessStartEvent](x: Self) {
    
    inline def setProcessInfo(value: SchemaAppProcessInfo): Self = StObject.set(x, "processInfo", value.asInstanceOf[js.Any])
    
    inline def setProcessInfoUndefined: Self = StObject.set(x, "processInfo", js.undefined)
  }
}
