package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayName extends js.Object {
  /** Name of this person. */
  var displayName: js.UndefOr[String] = js.undefined
}

object Anon_DisplayName {
  @scala.inline
  def apply(displayName: String = null): Anon_DisplayName = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DisplayName]
  }
}

