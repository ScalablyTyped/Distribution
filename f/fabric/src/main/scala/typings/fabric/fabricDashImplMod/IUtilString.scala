package typings.fabric.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilString extends js.Object {
  /**
  	 * Camelizes a string
  	 * @param string String to camelize
  	 */
  def camelize(string: String): String
  /**
  	 * Capitalizes a string
  	 * @param string String to capitalize
  	 * @param [firstLetterOnly] If true only first letter is capitalized
  	 * and other letters stay untouched, if false first letter is capitalized
  	 * and other letters are converted to lowercase.
  	 */
  def capitalize(string: String, firstLetterOnly: Boolean): String
  /**
  	 * Escapes XML in a string
  	 * @param string String to escape
  	 */
  def escapeXml(string: String): String
  /**
  	 * Divide a string in the user perceived single units
  	 * @param {String} textstring String to escape
  	 * @return {Array} array containing the graphemes
  	 */
  def graphemeSplit(string: String): js.Array[String]
}

object IUtilString {
  @scala.inline
  def apply(
    camelize: String => String,
    capitalize: (String, Boolean) => String,
    escapeXml: String => String,
    graphemeSplit: String => js.Array[String]
  ): IUtilString = {
    val __obj = js.Dynamic.literal(camelize = js.Any.fromFunction1(camelize), capitalize = js.Any.fromFunction2(capitalize), escapeXml = js.Any.fromFunction1(escapeXml), graphemeSplit = js.Any.fromFunction1(graphemeSplit))
  
    __obj.asInstanceOf[IUtilString]
  }
}

