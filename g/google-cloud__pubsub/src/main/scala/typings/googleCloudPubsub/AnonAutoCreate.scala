package typings.googleCloudPubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoCreate extends js.Object {
  var autoCreate: js.UndefOr[Boolean] = js.undefined
}

object AnonAutoCreate {
  @scala.inline
  def apply(autoCreate: js.UndefOr[Boolean] = js.undefined): AnonAutoCreate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCreate)) __obj.updateDynamic("autoCreate")(autoCreate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoCreate]
  }
}

