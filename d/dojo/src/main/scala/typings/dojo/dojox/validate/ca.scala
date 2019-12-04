package typings.dojo.dojox.validate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/validate/ca.html
  *
  * Module which includes Canadian-specific methods for dojox.validate
  *
  */
trait ca extends js.Object {
  /**
    * Validates Canadian 10-digit phone number for several common formats
    *
    * @param value
    */
  def isPhoneNumber(value: String): js.Any
  /**
    * Validates Canadian 6 digit postal code
    * Validates Canadian 6 digit postal code.
    * Canadian postal codes are in the format ANA NAN,
    * where A is a letter and N is a digit, with a space
    * separating the third and fourth characters.
    *
    * @param value
    */
  def isPostalCode(value: js.Any): js.Any
  /**
    * Validates Canadian province abbreviations (2 characters)
    *
    * @param value
    */
  def isProvince(value: String): js.Any
  /**
    * Validates Canadian 9 digit social insurance number for several
    * common formats
    * Validates Canadian 9 digit social insurance number for several
    * common formats. This routine only pattern matches and does not
    * use the Luhn Algorithm to validate number.
    *
    * @param value
    */
  def isSocialInsuranceNumber(value: String): js.Any
}

object ca {
  @scala.inline
  def apply(
    isPhoneNumber: String => js.Any,
    isPostalCode: js.Any => js.Any,
    isProvince: String => js.Any,
    isSocialInsuranceNumber: String => js.Any
  ): ca = {
    val __obj = js.Dynamic.literal(isPhoneNumber = js.Any.fromFunction1(isPhoneNumber), isPostalCode = js.Any.fromFunction1(isPostalCode), isProvince = js.Any.fromFunction1(isProvince), isSocialInsuranceNumber = js.Any.fromFunction1(isSocialInsuranceNumber))
  
    __obj.asInstanceOf[ca]
  }
}

