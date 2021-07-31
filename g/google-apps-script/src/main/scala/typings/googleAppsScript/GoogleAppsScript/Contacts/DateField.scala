package typings.googleAppsScript.GoogleAppsScript.Contacts

import typings.googleAppsScript.GoogleAppsScript.Base.Month
import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A date field in a Contact.
  *
  * This class is only used by the Contacts service, and dates used elsewhere in App Script use
  * JavaScript's standard
  * Date object.
  */
@js.native
trait DateField extends StObject {
  
  def deleteDateField(): Unit = js.native
  
  def getDay(): Integer = js.native
  
  def getLabel(): Field | ExtendedField | String = js.native
  
  def getMonth(): Month = js.native
  
  def getYear(): Integer = js.native
  
  def setDate(month: Month, day: Integer): DateField = js.native
  def setDate(month: Month, day: Integer, year: Integer): DateField = js.native
  
  def setLabel(label: String): DateField = js.native
  def setLabel(label: Field): DateField = js.native
}
