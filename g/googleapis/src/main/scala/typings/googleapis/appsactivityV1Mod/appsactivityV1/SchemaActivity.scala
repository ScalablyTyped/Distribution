package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaActivity extends StObject {
  
  /**
    * The fields common to all of the singleEvents that make up the Activity.
    */
  var combinedEvent: js.UndefOr[SchemaEvent] = js.undefined
  
  /**
    * A list of all the Events that make up the Activity.
    */
  var singleEvents: js.UndefOr[js.Array[SchemaEvent]] = js.undefined
}
object SchemaActivity {
  
  inline def apply(): SchemaActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivity]
  }
  
  extension [Self <: SchemaActivity](x: Self) {
    
    inline def setCombinedEvent(value: SchemaEvent): Self = StObject.set(x, "combinedEvent", value.asInstanceOf[js.Any])
    
    inline def setCombinedEventUndefined: Self = StObject.set(x, "combinedEvent", js.undefined)
    
    inline def setSingleEvents(value: js.Array[SchemaEvent]): Self = StObject.set(x, "singleEvents", value.asInstanceOf[js.Any])
    
    inline def setSingleEventsUndefined: Self = StObject.set(x, "singleEvents", js.undefined)
    
    inline def setSingleEventsVarargs(value: SchemaEvent*): Self = StObject.set(x, "singleEvents", js.Array(value*))
  }
}
