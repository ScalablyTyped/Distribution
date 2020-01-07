package typings.googleapis.buildSrcApisAppsactivityV1Mod.appsactivity_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Activity resource is a combined view of multiple events. An activity has
  * a list of individual events and a combined view of the common fields among
  * all events.
  */
@js.native
trait Schema$Activity extends js.Object {
  /**
    * The fields common to all of the singleEvents that make up the Activity.
    */
  var combinedEvent: js.UndefOr[Schema$Event] = js.native
  /**
    * A list of all the Events that make up the Activity.
    */
  var singleEvents: js.UndefOr[js.Array[Schema$Event]] = js.native
}

object Schema$Activity {
  @scala.inline
  def apply(combinedEvent: Schema$Event = null, singleEvents: js.Array[Schema$Event] = null): Schema$Activity = {
    val __obj = js.Dynamic.literal()
    if (combinedEvent != null) __obj.updateDynamic("combinedEvent")(combinedEvent.asInstanceOf[js.Any])
    if (singleEvents != null) __obj.updateDynamic("singleEvents")(singleEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Activity]
  }
}

