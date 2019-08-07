package typings.atFormatjsIntlDashRelativetimeformat.distCoreMod

import typings.atFormatjsIntlDashRelativetimeformat.distTypesMod.FormattableUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelativeTimeFormat extends js.Object {
  val _fields: js.Any = js.native
  val _locale: js.Any = js.native
  val _localeMatcher: js.Any = js.native
  val _nf: js.Any = js.native
  val _numberingSystem: js.Any = js.native
  val _numeric: js.Any = js.native
  val _pl: js.Any = js.native
  val _style: js.Any = js.native
  def format(value: String, unit: FormattableUnit): String = js.native
  def format(value: Double, unit: FormattableUnit): String = js.native
  def formatToParts(value: String, unit: FormattableUnit): js.Array[Part] = js.native
  def formatToParts(value: Double, unit: FormattableUnit): js.Array[Part] = js.native
  def resolvedOptions(): ResolvedIntlRelativeTimeFormatOptions = js.native
}

