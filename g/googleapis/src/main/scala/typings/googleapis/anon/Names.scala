package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Names extends js.Object {
  var names: js.UndefOr[js.Array[String]] = js.native
}

object Names {
  @scala.inline
  def apply(names: js.Array[String] = null): Names = {
    val __obj = js.Dynamic.literal()
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    __obj.asInstanceOf[Names]
  }
}

