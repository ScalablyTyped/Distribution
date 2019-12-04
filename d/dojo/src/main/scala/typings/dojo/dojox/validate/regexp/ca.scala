package typings.dojo.dojox.validate.regexp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/validate/regexp.ca.html
  *
  *
  */
trait ca extends js.Object {
  /**
    * String regular Express to match Canadain Postal Codes
    *
    */
  def postalCode(): String
  /**
    * a regular expression to match Canadian Province Abbreviations
    *
    */
  def province(): String
}

object ca {
  @scala.inline
  def apply(postalCode: () => String, province: () => String): ca = {
    val __obj = js.Dynamic.literal(postalCode = js.Any.fromFunction0(postalCode), province = js.Any.fromFunction0(province))
  
    __obj.asInstanceOf[ca]
  }
}

