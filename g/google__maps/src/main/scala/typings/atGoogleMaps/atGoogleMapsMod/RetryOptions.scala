package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryOptions extends js.Object {
  /** If a transient server error occurs, how long to wait before retrying the request, in milliseconds. (Default: 500 ms). */
  var interval: js.UndefOr[Double] = js.undefined
}

object RetryOptions {
  @scala.inline
  def apply(interval: Int | Double = null): RetryOptions = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOptions]
  }
}

