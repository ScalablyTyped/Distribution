package typings
package gapiDotClientDotPlusdomainsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Primary extends js.Object {
  /** If "true", this place of residence is this person's primary residence. */
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  /** A place where this person has lived. For example: "Seattle, WA", "Near Toronto". */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Primary {
  @scala.inline
  def apply(primary: js.UndefOr[scala.Boolean] = js.undefined, value: java.lang.String = null): Anon_Primary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Primary]
  }
}

