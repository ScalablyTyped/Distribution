package typings.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Activity resource is a combined view of multiple events. An activity has
  * a list of individual events and a combined view of the common fields among
  * all events.
  */
@js.native
trait SchemaActivity extends js.Object {
  
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
  implicit class SchemaActivityOps[Self <: SchemaActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCombinedEvent(value: SchemaEvent): Self = this.set("combinedEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCombinedEvent: Self = this.set("combinedEvent", js.undefined)
    
    @scala.inline
    def setSingleEventsVarargs(value: SchemaEvent*): Self = this.set("singleEvents", js.Array(value :_*))
    
    @scala.inline
    def setSingleEvents(value: js.Array[SchemaEvent]): Self = this.set("singleEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleEvents: Self = this.set("singleEvents", js.undefined)
  }
}
