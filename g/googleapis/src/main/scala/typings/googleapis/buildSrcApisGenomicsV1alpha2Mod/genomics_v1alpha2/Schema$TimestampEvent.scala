package typings.googleapis.buildSrcApisGenomicsV1alpha2Mod.genomics_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores the list of events and times they occured for major events in job
  * execution.
  */
@js.native
trait Schema$TimestampEvent extends js.Object {
  /**
    * String indicating the type of event
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The time this event occured.
    */
  var timestamp: js.UndefOr[String] = js.native
}

object Schema$TimestampEvent {
  @scala.inline
  def apply(description: String = null, timestamp: String = null): Schema$TimestampEvent = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TimestampEvent]
  }
}

