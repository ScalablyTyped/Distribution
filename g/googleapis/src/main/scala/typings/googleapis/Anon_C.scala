package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_C extends js.Object {
  var c: js.UndefOr[js.Array[Anon_V]] = js.native
}

object Anon_C {
  @scala.inline
  def apply(c: js.Array[Anon_V] = null): Anon_C = {
    val __obj = js.Dynamic.literal()
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_C]
  }
}

