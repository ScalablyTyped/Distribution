package typings.dojo.dojox.validate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/validate/regexp.html
  *
  *
  */
trait regexp_ extends js.Object {
  /**
    *
    */
  var ca: js.Object
  /**
    *
    */
  var us: js.Object
  /**
    * Builds a regular expression that matches an email address
    *
    * @param flags               Optionalflags.allowCruft  Allow address like <mailto:foo@yahoo.com>.  Default is false.flags in regexp.host can be applied.flags in regexp.ipAddress can be applied.
    */
  def emailAddress(flags: js.Object): String
  /**
    * Builds a regular expression that matches a list of email addresses.
    *
    * @param flags               Optionalflags.listSeparator  The character used to separate email addresses.  Default is ";", ",", "\n" or " ".flags in regexp.emailAddress can be applied.flags in regexp.host can be applied.flags in regexp.ipAddress can be applied.
    */
  def emailAddressList(flags: js.Object): String
  /**
    * Builds a RE that matches a host
    * A host is a named host (A-z0-9_- but not starting with -), a domain name or an IP address, possibly followed by a port number.
    *
    * @param flags               Optionalflags.allowNamed Allow a named host for local networks. Default is false.flags.allowIP  Allow an IP address for hostname.  Default is true.flags.allowLocal  Allow the host to be "localhost".  Default is false.flags.allowPort  Allow a port number to be present.  Default is true.flags in regexp.ipAddress can be applied.
    */
  def host(flags: js.Object): String
  /**
    * Builds a RE that matches an IP Address
    * Supports 5 formats for IPv4: dotted decimal, dotted hex, dotted octal, decimal and hexadecimal.
    * Supports 2 formats for Ipv6.
    *
    * @param flags               OptionalAll flags are boolean with default = true.flags.allowDottedDecimal  Example, 207.142.131.235.  No zero padding.flags.allowDottedHex  Example, 0x18.0x11.0x9b.0x28.  Case insensitive.  Zero padding allowed.flags.allowDottedOctal  Example, 0030.0021.0233.0050.  Zero padding allowed.flags.allowDecimal  Example, 3482223595.  A decimal number between 0-4294967295.flags.allowHex  Example, 0xCF8E83EB.  Hexadecimal number between 0x0-0xFFFFFFFF.Case insensitive.  Zero padding allowed.flags.allowIPv6   IPv6 address written as eight groups of four hexadecimal digits.
    */
  def ipAddress(flags: js.Object): String
  /**
    * Builds a regular expression to match any sort of number based format
    * Use this method for phone numbers, social security numbers, zip-codes, etc.
    * The RE can match one format or one of multiple formats.
    *
    * Format:
    *
    * Stands for a digit, 0-9.
    * ?        Stands for an optional digit, 0-9 or nothing.
    * All other characters must appear literally in the expression.
    *
    * @param flags               Optionalflags.format  A string or an Array of strings for multiple formats.
    */
  def numberFormat(flags: js.Object): js.Any
  /**
    * Builds a regular expression that matches a URL
    *
    * @param flags               Optionalflags.scheme  Can be true, false, or [true, false].This means: required, not allowed, or match either one.flags in regexp.host can be applied.flags in regexp.ipAddress can be applied.
    */
  def url(flags: js.Object): String
}

object regexp_ {
  @scala.inline
  def apply(
    ca: js.Object,
    emailAddress: js.Object => String,
    emailAddressList: js.Object => String,
    host: js.Object => String,
    ipAddress: js.Object => String,
    numberFormat: js.Object => js.Any,
    url: js.Object => String,
    us: js.Object
  ): regexp_ = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], emailAddress = js.Any.fromFunction1(emailAddress), emailAddressList = js.Any.fromFunction1(emailAddressList), host = js.Any.fromFunction1(host), ipAddress = js.Any.fromFunction1(ipAddress), numberFormat = js.Any.fromFunction1(numberFormat), url = js.Any.fromFunction1(url), us = us.asInstanceOf[js.Any])
    __obj.asInstanceOf[regexp_]
  }
}

