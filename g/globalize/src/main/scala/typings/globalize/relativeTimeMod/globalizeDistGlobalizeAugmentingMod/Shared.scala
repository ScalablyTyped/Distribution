package typings.globalize.relativeTimeMod.globalizeDistGlobalizeAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shared extends js.Object {
  /**
    * Return a relative time according to the given unit
    * @param {number} value The number to be formatted.
    * @param {string} unit String value indicating the unit to be formatted. eg. "day", "week", "month", etc.
    * @param options form: [String] eg. "short" or "narrow". Or falsy for default long form.
    * @returns {string} Return a relative time according to the given unit.
    */
  def formatRelativeTime(value: Double, unit: String): String = js.native
  def formatRelativeTime(value: Double, unit: String, options: RelativeTimeFormatterOptions): String = js.native
  /**
    * Returns a function that formats a relative time according to the given unit, options, and the default/instance locale.
    * The returned function is invoked with one argument: the number value to be formatted.
    * @param unit String value indicating the unit to be formatted. eg. "day", "week", "month", etc.
    * @param options form: [String] eg. "short" or "narrow". Or falsy for default long form.
    * @returns {Function} Returns a function that formats a relative time according to the given unit.
    */
  def relativeTimeFormatter(unit: String): js.Function1[/* value */ Double, String] = js.native
  def relativeTimeFormatter(unit: String, options: RelativeTimeFormatterOptions): js.Function1[/* value */ Double, String] = js.native
}

