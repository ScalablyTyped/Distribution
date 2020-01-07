package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Modification timestamp.
  */
@js.native
trait Schema$LastModifiedInfo extends js.Object {
  /**
    * Timestamp of the last change in milliseconds since epoch.
    */
  var time: js.UndefOr[String] = js.native
}

object Schema$LastModifiedInfo {
  @scala.inline
  def apply(time: String = null): Schema$LastModifiedInfo = {
    val __obj = js.Dynamic.literal()
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LastModifiedInfo]
  }
}

