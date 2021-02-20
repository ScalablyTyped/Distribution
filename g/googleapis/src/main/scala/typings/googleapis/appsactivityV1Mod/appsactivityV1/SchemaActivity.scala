package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Activity resource is a combined view of multiple events. An activity has
  * a list of individual events and a combined view of the common fields among
  * all events.
  */
@js.native
trait SchemaActivity extends StObject {
  
  /**
    * The fields common to all of the singleEvents that make up the Activity.
    */
  var combinedEvent: js.UndefOr[SchemaEvent] = js.native
  
  /**
    * A list of all the Events that make up the Activity.
    */
  var singleEvents: js.UndefOr[js.Array[SchemaEvent]] = js.native
}
object SchemaActivity {
  
  @scala.inline
  def apply(): SchemaActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivity]
  }
  
  @scala.inline
  implicit class SchemaActivityMutableBuilder[Self <: SchemaActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCombinedEvent(value: SchemaEvent): Self = StObject.set(x, "combinedEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCombinedEventUndefined: Self = StObject.set(x, "combinedEvent", js.undefined)
    
    @scala.inline
    def setSingleEvents(value: js.Array[SchemaEvent]): Self = StObject.set(x, "singleEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleEventsUndefined: Self = StObject.set(x, "singleEvents", js.undefined)
    
    @scala.inline
    def setSingleEventsVarargs(value: SchemaEvent*): Self = StObject.set(x, "singleEvents", js.Array(value :_*))
  }
}
