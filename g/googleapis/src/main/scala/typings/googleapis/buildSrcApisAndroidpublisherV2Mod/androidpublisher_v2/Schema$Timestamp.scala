package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Timestamp extends js.Object {
  var nanos: js.UndefOr[Double] = js.native
  var seconds: js.UndefOr[String] = js.native
}

object Schema$Timestamp {
  @scala.inline
  def apply(nanos: Int | Double = null, seconds: String = null): Schema$Timestamp = {
    val __obj = js.Dynamic.literal()
    if (nanos != null) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Timestamp]
  }
}

