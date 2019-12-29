package typings.atGoogleDashCloudPubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Json extends js.Object {
  var json: js.UndefOr[js.Any] = js.undefined
}

object Anon_Json {
  @scala.inline
  def apply(json: js.Any = null): Anon_Json = {
    val __obj = js.Dynamic.literal()
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Json]
  }
}

