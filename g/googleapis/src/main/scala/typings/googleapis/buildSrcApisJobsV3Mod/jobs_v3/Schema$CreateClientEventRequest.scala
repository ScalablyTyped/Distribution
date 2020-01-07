package typings.googleapis.buildSrcApisJobsV3Mod.jobs_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The report event request.
  */
@js.native
trait Schema$CreateClientEventRequest extends js.Object {
  /**
    * Required.  Events issued when end user interacts with customer&#39;s
    * application that uses Cloud Talent Solution.
    */
  var clientEvent: js.UndefOr[Schema$ClientEvent] = js.native
}

object Schema$CreateClientEventRequest {
  @scala.inline
  def apply(clientEvent: Schema$ClientEvent = null): Schema$CreateClientEventRequest = {
    val __obj = js.Dynamic.literal()
    if (clientEvent != null) __obj.updateDynamic("clientEvent")(clientEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateClientEventRequest]
  }
}

