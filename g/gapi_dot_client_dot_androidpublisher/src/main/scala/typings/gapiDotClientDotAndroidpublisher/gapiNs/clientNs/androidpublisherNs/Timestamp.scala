package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timestamp extends js.Object {
  var nanos: js.UndefOr[Double] = js.undefined
  var seconds: js.UndefOr[String] = js.undefined
}

object Timestamp {
  @scala.inline
  def apply(nanos: Int | Double = null, seconds: String = null): Timestamp = {
    val __obj = js.Dynamic.literal()
    if (nanos != null) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds)
    __obj.asInstanceOf[Timestamp]
  }
}

