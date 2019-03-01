package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedCharacterCount extends js.Object {
  /** Maximum allowed characters on this layer, especially for the "copy" layer. */
  var allowedCharacterCount: js.UndefOr[scala.Double] = js.undefined
  /** Type of limitation on this layer. "limited" or "unlimited" for the "copy" layer. */
  var limitType: js.UndefOr[java.lang.String] = js.undefined
  /** Remaining allowed characters on this layer, especially for the "copy" layer. */
  var remainingCharacterCount: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AllowedCharacterCount {
  @scala.inline
  def apply(
    allowedCharacterCount: scala.Int | scala.Double = null,
    limitType: java.lang.String = null,
    remainingCharacterCount: scala.Int | scala.Double = null
  ): Anon_AllowedCharacterCount = {
    val __obj = js.Dynamic.literal()
    if (allowedCharacterCount != null) __obj.updateDynamic("allowedCharacterCount")(allowedCharacterCount.asInstanceOf[js.Any])
    if (limitType != null) __obj.updateDynamic("limitType")(limitType)
    if (remainingCharacterCount != null) __obj.updateDynamic("remainingCharacterCount")(remainingCharacterCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowedCharacterCount]
  }
}

