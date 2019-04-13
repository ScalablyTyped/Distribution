package typings
package globalizeLib.distGlobalizeUnitMod.distGlobalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shared extends js.Object {
  /**
  		 * Alias for .unitFormatter( unit, options )( value ).
  		 * @param {number} value The number to be formatted.
  		 * @param {string} unit String value indicating the unit to be formatted. eg. "day", "week", "month", etc. Could also be a compound unit, eg. "mile-per-hour" or "mile/hour"
  		 * @param {UnitFormatterOptions} options form: [String] eg. "long", "short" or "narrow".
  		 * @returns {string} Returns the unit formatted.
  		 */
  def formatUnit(value: scala.Double, unit: java.lang.String): java.lang.String = js.native
  def formatUnit(value: scala.Double, unit: java.lang.String, options: UnitFormatterOptions): java.lang.String = js.native
  /**
  		 * Returns a function that formats a unit according to the given unit, options, and the default/instance locale.
  		 * The returned function is invoked with one argument: the number value to be formatted.
  		 * @param unit String value indicating the unit to be formatted. eg. "day", "week", "month", etc. Could also be a compound unit, eg. "mile-per-hour" or "mile/hour"
  		 * @param options form: [String] eg. "long", "short" or "narrow".
  		 * @returns {Function} Returns a function that formats a unit according to the given unit, options, and the default/instance locale.
  		 */
  def unitFormatter(unit: java.lang.String): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
  def unitFormatter(unit: java.lang.String, options: UnitFormatterOptions): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
}

