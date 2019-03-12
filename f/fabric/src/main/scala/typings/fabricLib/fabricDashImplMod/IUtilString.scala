package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilString extends js.Object {
  /**
  	 * Camelizes a string
  	 * @param string String to camelize
  	 */
  def camelize(string: java.lang.String): java.lang.String
  /**
  	 * Capitalizes a string
  	 * @param string String to capitalize
  	 * @param [firstLetterOnly] If true only first letter is capitalized
  	 * and other letters stay untouched, if false first letter is capitalized
  	 * and other letters are converted to lowercase.
  	 */
  def capitalize(string: java.lang.String, firstLetterOnly: scala.Boolean): java.lang.String
  /**
  	 * Escapes XML in a string
  	 * @param string String to escape
  	 */
  def escapeXml(string: java.lang.String): java.lang.String
}

object IUtilString {
  @scala.inline
  def apply(
    camelize: java.lang.String => java.lang.String,
    capitalize: (java.lang.String, scala.Boolean) => java.lang.String,
    escapeXml: java.lang.String => java.lang.String
  ): IUtilString = {
    val __obj = js.Dynamic.literal(camelize = js.Any.fromFunction1(camelize), capitalize = js.Any.fromFunction2(capitalize), escapeXml = js.Any.fromFunction1(escapeXml))
  
    __obj.asInstanceOf[IUtilString]
  }
}

