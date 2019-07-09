package typings
package expressDashValidatorLib.srcOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsFloatOptions extends MinMaxExtendedOptions {
  var locale: js.UndefOr[AlphanumericLocale] = js.undefined
}

object IsFloatOptions {
  @scala.inline
  def apply(
    gt: scala.Int | scala.Double = null,
    locale: AlphanumericLocale = null,
    lt: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): IsFloatOptions = {
    val __obj = js.Dynamic.literal()
    if (gt != null) __obj.updateDynamic("gt")(gt.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFloatOptions]
  }
}

