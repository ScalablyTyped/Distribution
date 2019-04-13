package typings
package globalizeLib.distGlobalizePluralMod.distGlobalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shared extends js.Object {
  /**
  		 * Returns the value's corresponding plural group: zero, one, two, few, many, or other.
  		 * @param {number} value A Number for which to return the plural group.
  		 * @param {PluralGeneratorOptions} options A JSON object including none or any of the following options.
  		 * type Optional String cardinal (default), or ordinal.
  		 * @returns {string} Returns the value's corresponding plural group: zero, one, two, few, many, or other.
  		 */
  def plural(value: scala.Double): java.lang.String = js.native
  def plural(value: scala.Double, options: PluralGeneratorOptions): java.lang.String = js.native
  /**
  		 * Return a function that returns the value's corresponding plural group: zero, one, two, few, many, or other.
  		 * The returned function is invoked with one argument: the Number value for which to return the plural group.
  		 * @param {PluralGeneratorOptions} options A JSON object including none or any of the following options.
  		 * type Optional String cardinal (default), or ordinal.
  		 * @returns {Function} Return a function that returns the value's corresponding plural group: zero, one, two, few, many, or other.
  		 */
  def pluralGenerator(): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
  def pluralGenerator(options: PluralGeneratorOptions): js.Function1[/* value */ scala.Double, java.lang.String] = js.native
}

