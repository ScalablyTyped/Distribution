package typings
package fechaLib.fechaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fecha extends js.Object {
  var i18n: i18nSettings = js.native
  var masks: Masks = js.native
  def format(dateObj: scala.Double, mask: java.lang.String): java.lang.String = js.native
  def format(dateObj: scala.Double, mask: java.lang.String, i18nSettings: i18nSettings): java.lang.String = js.native
  def format(dateObj: stdLib.Date, mask: java.lang.String): java.lang.String = js.native
  def format(dateObj: stdLib.Date, mask: java.lang.String, i18nSettings: i18nSettings): java.lang.String = js.native
  def parse(dateStr: java.lang.String, format: java.lang.String): stdLib.Date | scala.Null = js.native
  def parse(dateStr: java.lang.String, format: java.lang.String, i18nSettings: i18nSettings): stdLib.Date | scala.Null = js.native
}

