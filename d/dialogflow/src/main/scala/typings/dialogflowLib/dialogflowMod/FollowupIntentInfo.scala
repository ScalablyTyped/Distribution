package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FollowupIntentInfo extends js.Object {
  var followupIntentName: java.lang.String
  var parentFollowupIntentName: java.lang.String
}

object FollowupIntentInfo {
  @scala.inline
  def apply(followupIntentName: java.lang.String, parentFollowupIntentName: java.lang.String): FollowupIntentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("followupIntentName")(followupIntentName)
    __obj.updateDynamic("parentFollowupIntentName")(parentFollowupIntentName)
    __obj.asInstanceOf[FollowupIntentInfo]
  }
}

