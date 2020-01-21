package typings.flatpickr.datesMod

import typings.flatpickr.globalsMod._Global_.Date
import typings.flatpickr.localeMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flatpickr/dist/utils/dates", "createDateFormatter")
@js.native
object createDateFormatter extends js.Object {
  def apply(hasConfigL10n: FormatterArgs): js.Function3[/* dateObj */ Date, /* frmt */ String, /* overrideLocale */ js.UndefOr[Locale], String] = js.native
}

