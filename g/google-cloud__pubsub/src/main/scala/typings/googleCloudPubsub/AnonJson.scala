package typings.googleCloudPubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJson extends js.Object {
  var json: js.UndefOr[js.Any] = js.undefined
}

object AnonJson {
  @scala.inline
  def apply(json: js.Any = null): AnonJson = {
    val __obj = js.Dynamic.literal()
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJson]
  }
}

