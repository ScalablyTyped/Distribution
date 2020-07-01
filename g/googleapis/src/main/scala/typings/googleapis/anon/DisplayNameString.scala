package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayNameString extends js.Object {
  var displayName: js.UndefOr[String] = js.native
}

object DisplayNameString {
  @scala.inline
  def apply(displayName: String = null): DisplayNameString = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayNameString]
  }
}

