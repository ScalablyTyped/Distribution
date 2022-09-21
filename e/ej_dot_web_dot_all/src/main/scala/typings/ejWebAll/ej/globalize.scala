package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait globalize extends StObject {
  
  def addCulture(name: String): Unit = js.native
  def addCulture(name: String, culture: Any): Unit = js.native
  
  def findCulture(): culture = js.native
  def findCulture(culture: String): culture = js.native
  
  def format(value: Any, format: String): String = js.native
  def format(value: Any, format: String, culture: String): String = js.native
  
  def getLocalizedConstants(controlName: String): Any = js.native
  def getLocalizedConstants(controlName: String, culture: String): Any = js.native
  
  def parseDate(value: String, format: String): js.Date = js.native
  def parseDate(value: String, format: String, culture: String): js.Date = js.native
  
  def parseFloat(value: String): Double = js.native
  def parseFloat(value: String, radix: Any): Double = js.native
  def parseFloat(value: String, radix: Any, culture: String): Double = js.native
  def parseFloat(value: String, radix: Unit, culture: String): Double = js.native
  
  def parseInt(value: String): Double = js.native
  def parseInt(value: String, radix: Any): Double = js.native
  def parseInt(value: String, radix: Any, culture: String): Double = js.native
  def parseInt(value: String, radix: Unit, culture: String): Double = js.native
  
  def preferredCulture(): culture = js.native
  def preferredCulture(culture: String): culture = js.native
}
