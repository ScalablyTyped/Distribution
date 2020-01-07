package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_V extends js.Object {
  var v: js.UndefOr[String] = js.native
}

object Anon_V {
  @scala.inline
  def apply(v: String = null): Anon_V = {
    val __obj = js.Dynamic.literal()
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_V]
  }
}

