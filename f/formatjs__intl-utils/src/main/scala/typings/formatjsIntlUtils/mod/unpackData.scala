package typings.formatjsIntlUtils.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils", "unpackData")
@js.native
object unpackData extends js.Object {
  def apply[T /* <: Record[String, _] */](locale: String, localeData: typings.formatjsIntlUtils.srcTypesMod.LocaleData[T]): T = js.native
  def apply[T /* <: Record[String, _] */](
    locale: String,
    localeData: typings.formatjsIntlUtils.srcTypesMod.LocaleData[T],
    /** By default shallow merge the dictionaries. */
  reducer: js.Function2[/* all */ T, /* d */ T, T]
  ): T = js.native
}

