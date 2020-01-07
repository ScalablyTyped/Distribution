package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DisplayNameString extends js.Object {
  var displayName: js.UndefOr[String] = js.native
}

object Anon_DisplayNameString {
  @scala.inline
  def apply(displayName: String = null): Anon_DisplayNameString = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DisplayNameString]
  }
}

