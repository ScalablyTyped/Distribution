package typings
package expressDashValidatorLib.filterSanitizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sanitizer extends js.Object {
  def blacklist(chars: java.lang.String): this.type = js.native
  def customSanitizer(sanitizer: CustomSanitizer): this.type = js.native
  def escape(): this.type = js.native
  def ltrim(): this.type = js.native
  def ltrim(chars: java.lang.String): this.type = js.native
  def normalizeEmail(): this.type = js.native
  def normalizeEmail(options: expressDashValidatorLib.filterSanitizeMod.OptionsNs.NormalizeEmailOptions): this.type = js.native
  def rtrim(): this.type = js.native
  def rtrim(chars: java.lang.String): this.type = js.native
  def stripLow(): this.type = js.native
  def stripLow(keep_new_lines: scala.Boolean): this.type = js.native
  def toBoolean(): this.type = js.native
  def toBoolean(strict: scala.Boolean): this.type = js.native
  def toDate(): this.type = js.native
  def toFloat(): this.type = js.native
  def toInt(): this.type = js.native
  def toInt(radix: scala.Double): this.type = js.native
  def trim(): this.type = js.native
  def trim(chars: java.lang.String): this.type = js.native
  def unescape(): this.type = js.native
  def whitelist(chars: java.lang.String): this.type = js.native
}

