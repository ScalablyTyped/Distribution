package typings.gapiClientPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrimary extends js.Object {
  /** If "true", this place of residence is this person's primary residence. */
  var primary: js.UndefOr[Boolean] = js.undefined
  /** A place where this person has lived. For example: "Seattle, WA", "Near Toronto". */
  var value: js.UndefOr[String] = js.undefined
}

object AnonPrimary {
  @scala.inline
  def apply(primary: js.UndefOr[Boolean] = js.undefined, value: String = null): AnonPrimary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrimary]
  }
}

