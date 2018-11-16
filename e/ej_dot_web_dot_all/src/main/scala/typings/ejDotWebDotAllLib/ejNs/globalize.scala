package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait globalize extends js.Object {
  def addCulture(name: java.lang.String): scala.Unit = js.native
  def addCulture(name: java.lang.String, culture: js.Any): scala.Unit = js.native
  def findCulture(): culture = js.native
  def findCulture(culture: java.lang.String): culture = js.native
  def format(value: js.Any, format: java.lang.String): java.lang.String = js.native
  def format(value: js.Any, format: java.lang.String, culture: java.lang.String): java.lang.String = js.native
  def getLocalizedConstants(controlName: java.lang.String): js.Any = js.native
  def getLocalizedConstants(controlName: java.lang.String, culture: java.lang.String): js.Any = js.native
  def parseDate(value: java.lang.String, format: java.lang.String): stdLib.Date = js.native
  def parseDate(value: java.lang.String, format: java.lang.String, culture: java.lang.String): stdLib.Date = js.native
  def parseFloat(value: java.lang.String): scala.Double = js.native
  def parseFloat(value: java.lang.String, radix: js.Any): scala.Double = js.native
  def parseFloat(value: java.lang.String, radix: js.Any, culture: java.lang.String): scala.Double = js.native
  def parseInt(value: java.lang.String): scala.Double = js.native
  def parseInt(value: java.lang.String, radix: js.Any): scala.Double = js.native
  def parseInt(value: java.lang.String, radix: js.Any, culture: java.lang.String): scala.Double = js.native
  def preferredCulture(): culture = js.native
  def preferredCulture(culture: java.lang.String): culture = js.native
}

