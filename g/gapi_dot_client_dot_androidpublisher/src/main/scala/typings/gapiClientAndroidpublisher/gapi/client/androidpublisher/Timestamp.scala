package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timestamp extends js.Object {
  var nanos: js.UndefOr[Double] = js.undefined
  var seconds: js.UndefOr[String] = js.undefined
}

object Timestamp {
  @scala.inline
  def apply(nanos: js.UndefOr[Double] = js.undefined, seconds: String = null): Timestamp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nanos)) __obj.updateDynamic("nanos")(nanos.get.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timestamp]
  }
}

