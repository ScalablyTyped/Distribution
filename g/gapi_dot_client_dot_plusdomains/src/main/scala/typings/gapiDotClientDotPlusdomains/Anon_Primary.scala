package typings.gapiDotClientDotPlusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Primary extends js.Object {
  /** If "true", this place of residence is this person's primary residence. */
  var primary: js.UndefOr[Boolean] = js.undefined
  /** A place where this person has lived. For example: "Seattle, WA", "Near Toronto". */
  var value: js.UndefOr[String] = js.undefined
}

object Anon_Primary {
  @scala.inline
  def apply(primary: js.UndefOr[Boolean] = js.undefined, value: String = null): Anon_Primary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Primary]
  }
}

