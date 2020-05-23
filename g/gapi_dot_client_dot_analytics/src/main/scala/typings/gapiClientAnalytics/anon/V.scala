package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V extends js.Object {
  var v: js.UndefOr[String] = js.undefined
}

object V {
  @scala.inline
  def apply(v: String = null): V = {
    val __obj = js.Dynamic.literal()
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[V]
  }
}

