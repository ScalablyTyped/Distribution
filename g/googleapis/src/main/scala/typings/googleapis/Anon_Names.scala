package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Names extends js.Object {
  var names: js.UndefOr[js.Array[String]] = js.native
}

object Anon_Names {
  @scala.inline
  def apply(names: js.Array[String] = null): Anon_Names = {
    val __obj = js.Dynamic.literal()
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Names]
  }
}

