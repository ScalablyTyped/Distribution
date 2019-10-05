package typings.globalize.globalizeMod

import typings.cldrjs.cldrjsMod.CldrStatic
import typings.globalize.distGlobalizeMod.Globalize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("globalize", JSImport.Namespace)
@js.native
class Class protected () extends Globalize {
  /**
  		 * Create a Globalize instance.
  		 * @param cldr Cldr instance of the instance.
  		 * @returns {Globalize} A Globalize instance
  		 */
  def this(cldr: CldrStatic) = this()
  /**
  		 * Create a Globalize instance.
  		 * @param {string} Locale string of the instance.
  		 * @returns {Globalize} A Globalize instance
  		 */
  def this(locale: String) = this()
}

