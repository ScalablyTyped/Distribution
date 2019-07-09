package typings
package expressDashValidatorLib.srcChainSanitizersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sanitizers[Return] extends js.Object {
  def blacklist(chars: java.lang.String): Return = js.native
  def customSanitizer(sanitizer: expressDashValidatorLib.srcBaseMod.CustomSanitizer): Return = js.native
  def escape(): Return = js.native
  def ltrim(): Return = js.native
  def ltrim(chars: java.lang.String): Return = js.native
  def normalizeEmail(): Return = js.native
  def normalizeEmail(options: expressDashValidatorLib.srcOptionsMod.NormalizeEmailOptions): Return = js.native
  def rtrim(): Return = js.native
  def rtrim(chars: java.lang.String): Return = js.native
  def stripLow(): Return = js.native
  def stripLow(keep_new_lines: scala.Boolean): Return = js.native
  def toArray(): Return = js.native
  def toBoolean(): Return = js.native
  def toBoolean(strict: scala.Boolean): Return = js.native
  def toDate(): Return = js.native
  def toFloat(): Return = js.native
  def toInt(): Return = js.native
  def toInt(radix: scala.Double): Return = js.native
  def trim(): Return = js.native
  def trim(chars: java.lang.String): Return = js.native
  def unescape(): Return = js.native
  def whitelist(chars: java.lang.String): Return = js.native
}

