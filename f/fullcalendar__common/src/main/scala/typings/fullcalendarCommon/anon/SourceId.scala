package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.fullcalendarCommonStrings.REMOVE_EVENT_SOURCE
import typings.fullcalendarCommon.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceId
  extends StObject
     with Action {
  
  var sourceId: String
  
  var `type`: REMOVE_EVENT_SOURCE
}
object SourceId {
  
  inline def apply(sourceId: String): SourceId = {
    val __obj = js.Dynamic.literal(sourceId = sourceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("REMOVE_EVENT_SOURCE")
    __obj.asInstanceOf[SourceId]
  }
  
  extension [Self <: SourceId](x: Self) {
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setType(value: REMOVE_EVENT_SOURCE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
