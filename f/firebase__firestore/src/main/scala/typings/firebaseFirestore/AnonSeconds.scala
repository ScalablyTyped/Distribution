package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSeconds extends js.Object {
  var nanos: js.UndefOr[Double] = js.undefined
  var seconds: js.UndefOr[String | Double] = js.undefined
}

object AnonSeconds {
  @scala.inline
  def apply(nanos: Int | Double = null, seconds: String | Double = null): AnonSeconds = {
    val __obj = js.Dynamic.literal()
    if (nanos != null) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSeconds]
  }
}

