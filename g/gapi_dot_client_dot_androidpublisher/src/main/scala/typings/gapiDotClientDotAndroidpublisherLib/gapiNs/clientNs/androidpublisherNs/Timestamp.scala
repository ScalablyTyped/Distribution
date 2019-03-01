package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timestamp extends js.Object {
  var nanos: js.UndefOr[scala.Double] = js.undefined
  var seconds: js.UndefOr[java.lang.String] = js.undefined
}

object Timestamp {
  @scala.inline
  def apply(nanos: scala.Int | scala.Double = null, seconds: java.lang.String = null): Timestamp = {
    val __obj = js.Dynamic.literal()
    if (nanos != null) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds)
    __obj.asInstanceOf[Timestamp]
  }
}

