package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayName extends js.Object {
  /** Name of this person. */
  var displayName: js.UndefOr[String] = js.undefined
}

object DisplayName {
  @scala.inline
  def apply(displayName: String = null): DisplayName = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName]
  }
}

