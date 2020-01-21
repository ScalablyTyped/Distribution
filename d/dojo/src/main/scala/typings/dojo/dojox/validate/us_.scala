package typings.dojo.dojox.validate

import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/validate/us.html
  *
  *
  */
@js.native
trait us_ extends js.Object {
  /**
    * validates user input of an HTML form based on input profile
    * returns an object that contains several methods summarizing the results of the validation
    *
    * @param form form to be validated
    * @param profile specifies how the form fields are to be validated{trim:Array, uppercase:Array, lowercase:Array, ucfirst:Array, digit:Array,required:Array, dependencies:Object, constraints:Object, confirm:Object}
    */
  def check(form: HTMLFormElement, profile: js.Object): Unit = js.native
  /**
    * Generate the DV code (checksum part) for a Cnpj number
    *
    * @param value The CGC number in ##.###.###/#### or ############ format
    */
  def computeCnpjDv(value: String): Unit = js.native
  /**
    * Generate the DV code (checksum part) for a CPF number
    *
    * @param value The CPF number in ######### format
    */
  def computeCpfDv(value: String): Unit = js.native
  /**
    * Evaluates dojo.validate.check() constraints that are specified as array
    * arguments
    * The arrays are expected to be in the format of:
    *
    * constraints:{
    *         fieldName: [functionToCall, param1, param2, etc.],
    *         fieldName: [[functionToCallFirst, param1],[functionToCallSecond,param2]]
    * }
    * This function evaluates a single array function in the format of:
    * [functionName, argument1, argument2, etc]
    *
    * The function will be parsed out and evaluated against the incoming parameters.
    *
    * @param profile The dojo.validate.check() profile that this evaluation is against.
    * @param constraint The single [] array of function and arguments for the function.
    * @param fieldName The form dom name of the field being validated.
    * @param elem The form element field.
    */
  def evaluateConstraint(profile: js.Any, constraint: js.Array[_], fieldName: js.Any, elem: js.Any): Unit = js.native
  /**
    * Check if value is an email address list. If an empty list
    * is returned, the value didn't pass the test or it was empty.
    *
    * @param value
    * @param flags               OptionalAn object (same as dojo.validate.isEmailAddressList)
    */
  def getEmailAddressList(value: String, flags: js.Object): Unit = js.native
  /**
    * Checks if a string could be a valid email address
    *
    * @param value
    * @param flags               Optionalflags.allowCruft  Allow address like <mailto:foo@yahoo.com>.  Default is false.flags in regexp.host can be applied.flags in regexp.ipAddress can be applied.flags in regexp.tld can be applied.
    */
  def isEmailAddress(value: String, flags: js.Object): Unit = js.native
  /**
    * Checks if a string could be a valid email address list.
    *
    * @param value
    * @param flags               Optionalflags.listSeparator  The character used to separate email addresses.  Default is ";", ",", "\n" or " ".flags in regexp.emailAddress can be applied.flags in regexp.host can be applied.flags in regexp.ipAddress can be applied.flags in regexp.tld can be applied.
    */
  def isEmailAddressList(value: String, flags: js.Object): Unit = js.native
  /**
    * Validates whether a string denoting a number
    * is between a max and min.
    *
    * @param value
    * @param flags               Optional{max:Number, min:Number, decimal:String}flags.max  A number, which the value must be less than or equal to for the validation to be true.flags.min  A number, which the value must be greater than or equal to for the validation to be true.flags.decimal  The character used for the decimal point.  Default is ".".
    */
  def isInRange(value: String, flags: js.Object): Unit = js.native
  /**
    * Validates an IP address
    * Supports 5 formats for IPv4: dotted decimal, dotted hex, dotted octal, decimal and hexadecimal.
    * Supports 2 formats for Ipv6.
    *
    * @param value
    * @param flags               OptionalAll flags are boolean with default = true.flags.allowDottedDecimal  Example, 207.142.131.235.  No zero padding.flags.allowDottedHex  Example, 0x18.0x11.0x9b.0x28.  Case insensitive.  Zero padding allowed.flags.allowDottedOctal  Example, 0030.0021.0233.0050.  Zero padding allowed.flags.allowDecimal  Example, 3482223595.  A decimal number between 0-4294967295.flags.allowHex  Example, 0xCF8E83EB.  Hexadecimal number between 0x0-0xFFFFFFFF.Case insensitive.  Zero padding allowed.flags.allowIPv6   IPv6 address written as eight groups of four hexadecimal digits.flags.allowHybrid   IPv6 address written as six groups of four hexadecimal digitsfollowed by the usual 4 dotted decimal digit notation of IPv4. x:x:x:x:x:x:d.d.d.d
    */
  def isIpAddress(value: String, flags: js.Object): Unit = js.native
  /**
    * Validates any sort of number based format
    * Validates any sort of number based format. Use it for phone numbers,
    * social security numbers, zip-codes, etc. The value can be validated
    * against one format or one of multiple formats.
    *
    * Format Definition
    *
    * #        Stands for a digit, 0-9.
    * ?        Stands for an optional digit, 0-9 or nothing.
    * All other characters must appear literally in the expression.
    *
    * @param value
    * @param flags               Optionalflags.format  A string or an Array of strings for multiple formats.
    */
  def isNumberFormat(value: String, flags: js.Object): js.Any = js.native
  /**
    * Validates 10 US digit phone number for several common formats
    *
    * @param value The telephone number string
    */
  def isPhoneNumber(value: String): Boolean = js.native
  /**
    * Validates social security number
    *
    * @param value
    */
  def isSocialSecurityNumber(value: String): Unit = js.native
  /**
    * Validates US state and territory abbreviations.
    *
    * @param value A two character string
    * @param flags               Optionalflags.allowTerritories  Allow Guam, Puerto Rico, etc.  Default is true.flags.allowMilitary  Allow military 'states', e.g. Armed Forces Europe (AE).  Default is true.
    */
  def isState(value: String, flags: js.Object): Unit = js.native
  /**
    * Checks if a string has non whitespace characters.
    * Parameters allow you to constrain the length.
    *
    * @param value
    * @param flags               Optional{length: Number, minlength: Number, maxlength: Number}flags.length  If set, checks if there are exactly flags.length number of characters.flags.minlength  If set, checks if there are at least flags.minlength number of characters.flags.maxlength  If set, checks if there are at most flags.maxlength number of characters.
    */
  def isText(value: String, flags: js.Object): Unit = js.native
  /**
    * Checks if a string could be a valid URL
    *
    * @param value
    * @param flags               Optionalflags.scheme  Can be true, false, or [true, false].This means: required, not allowed, or either.flags in regexp.host can be applied.flags in regexp.ipAddress can be applied.flags in regexp.tld can be applied.
    */
  def isUrl(value: String, flags: js.Object): Unit = js.native
  /**
    * Validates a CNPJ/CGC number
    *
    * @param value The CNPJ/CGC number in ##.###.###/####-##, ########/####-##,######-## or ############## format
    */
  def isValidCnpj(value: String): Unit = js.native
  /**
    * Validates a CPF number
    *
    * @param value The CPF number in #########-## or ###########,format
    */
  def isValidCpf(value: String): Unit = js.native
  /**
    * Validate a credit card number by type with Luhn checking.
    * Checks if a credit card type matches the # scheme in a passed value, and if
    * the Luhn checksum is accurate (unless its an Enroute card, in which case
    * the checkSum is skipped), returning a Boolean to check against.
    *
    * @param value A Value (credit card number) to validate
    * @param ccType A credit-card abbreviation.
    */
  def isValidCreditCard(value: String, ccType: String): Unit = js.native
  /**
    * Validate a credit card number by type with Luhn checking.
    * Checks if a credit card type matches the # scheme in a passed value, and if
    * the Luhn checksum is accurate (unless its an Enroute card, in which case
    * the checkSum is skipped), returning a Boolean to check against.
    *
    * @param value A Value (credit card number) to validate
    * @param ccType A credit-card abbreviation.
    */
  def isValidCreditCard(value: Double, ccType: String): Unit = js.native
  /**
    * Checks if value matches the pattern for that card or any card types if none is specified
    *
    * @param value CC #, white spaces and dashes are ignored
    * @param ccType               OptionalOne of the abbreviation values in dojox.validate._cardInfo --if Omitted, function returns a | delimited string of matching card types,or false if no matches found.
    */
  def isValidCreditCardNumber(value: String, ccType: String): Unit = js.native
  /**
    * Checks if value matches the pattern for that card or any card types if none is specified
    *
    * @param value CC #, white spaces and dashes are ignored
    * @param ccType               OptionalOne of the abbreviation values in dojox.validate._cardInfo --if Omitted, function returns a | delimited string of matching card types,or false if no matches found.
    */
  def isValidCreditCardNumber(value: Double, ccType: String): Unit = js.native
  /**
    * Validate the security code (CCV) for a passed credit-card type.
    *
    * @param value
    * @param ccType
    */
  def isValidCvv(value: String, ccType: String): Unit = js.native
  /**
    * Validate the security code (CCV) for a passed credit-card type.
    *
    * @param value
    * @param ccType
    */
  def isValidCvv(value: Double, ccType: String): Unit = js.native
  /**
    * Validate ISBN-10 or ISBN-13 based on the length of value
    *
    * @param value An ISBN to validate
    */
  def isValidIsbn(value: String): Boolean = js.native
  /**
    * Validate a String value against the Luhn algorithm.
    * Validate a String value against the Luhn algorithm to verify
    * its integrity.
    *
    * @param value
    */
  def isValidLuhn(value: String): Unit = js.native
  /**
    * Validates U.S. zip-code
    *
    * @param value
    */
  def isZipCode(value: String): Unit = js.native
}

