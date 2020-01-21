package typings.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(combinedEvent: SchemaEvent = null, singleEvents: js.Array[SchemaEvent] = null): SchemaActivity = {
    val __obj = js.Dynamic.literal()
    if (combinedEvent != null) __obj.updateDynamic("combinedEvent")(combinedEvent.asInstanceOf[js.Any])
    if (singleEvents != null) __obj.updateDynamic("singleEvents")(singleEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaActivity]
  }
}

