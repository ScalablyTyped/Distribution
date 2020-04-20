package typings.formatjsIntlRelativetimeformat.coreMod

import typings.formatjsIntlRelativetimeformat.typesMod.FormattableUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeTimeFormat extends js.Object {
  def format(value: Double, unit: FormattableUnit): String
  def formatToParts(value: Double, unit: FormattableUnit): js.Array[Part]
  def resolvedOptions(): ResolvedIntlRelativeTimeFormatOptions
}

object RelativeTimeFormat {
  @scala.inline
  def apply(
    format: (Double, FormattableUnit) => String,
    formatToParts: (Double, FormattableUnit) => js.Array[Part],
    resolvedOptions: () => ResolvedIntlRelativeTimeFormatOptions
  ): RelativeTimeFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), formatToParts = js.Any.fromFunction2(formatToParts), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
    __obj.asInstanceOf[RelativeTimeFormat]
  }
}

