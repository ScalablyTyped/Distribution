package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Required extends js.Object {
  var required: js.UndefOr[js.Array[String]] = js.native
}

object Anon_Required {
  @scala.inline
  def apply(required: js.Array[String] = null): Anon_Required = {
    val __obj = js.Dynamic.literal()
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Required]
  }
}

