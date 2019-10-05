package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait globalize extends js.Object {
  def addCulture(name: String): Unit = js.native
  def addCulture(name: String, culture: js.Any): Unit = js.native
  def findCulture(): culture = js.native
  def findCulture(culture: String): culture = js.native
  def format(value: js.Any, format: String): String = js.native
  def format(value: js.Any, format: String, culture: String): String = js.native
  def getLocalizedConstants(controlName: String): js.Any = js.native
  def getLocalizedConstants(controlName: String, culture: String): js.Any = js.native
  def parseDate(value: String, format: String): Date = js.native
  def parseDate(value: String, format: String, culture: String): Date = js.native
  def parseFloat(value: String): Double = js.native
  def parseFloat(value: String, radix: js.Any): Double = js.native
  def parseFloat(value: String, radix: js.Any, culture: String): Double = js.native
  def parseInt(value: String): Double = js.native
  def parseInt(value: String, radix: js.Any): Double = js.native
  def parseInt(value: String, radix: js.Any, culture: String): Double = js.native
  def preferredCulture(): culture = js.native
  def preferredCulture(culture: String): culture = js.native
}

@JSGlobal("ej.globalize")
@js.native
object globalize extends TopLevel[globalize]

