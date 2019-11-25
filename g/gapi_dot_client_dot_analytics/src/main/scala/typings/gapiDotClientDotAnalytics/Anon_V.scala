package typings.gapiDotClientDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_V extends js.Object {
  var v: js.UndefOr[String] = js.undefined
}

object Anon_V {
  @scala.inline
  def apply(v: String = null): Anon_V = {
    val __obj = js.Dynamic.literal()
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_V]
  }
}

