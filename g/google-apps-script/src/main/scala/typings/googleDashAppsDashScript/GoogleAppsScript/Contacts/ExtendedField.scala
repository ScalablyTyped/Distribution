package typings.googleDashAppsDashScript.GoogleAppsScript.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtendedField extends js.Object

/**
  * An enum for extended contacts fields.
  */
@JSGlobal("GoogleAppsScript.Contacts.ExtendedField")
@js.native
object ExtendedField extends js.Object {
  @js.native
  sealed trait BILLING_INFORMATION extends ExtendedField
  
  @js.native
  sealed trait DIRECTORY_SERVER extends ExtendedField
  
  @js.native
  sealed trait GENDER extends ExtendedField
  
  @js.native
  sealed trait HOBBY extends ExtendedField
  
  @js.native
  sealed trait HOME extends ExtendedField
  
  @js.native
  sealed trait LANGUAGE extends ExtendedField
  
  @js.native
  sealed trait MILEAGE extends ExtendedField
  
  @js.native
  sealed trait OTHER extends ExtendedField
  
  @js.native
  sealed trait PRIORITY extends ExtendedField
  
  @js.native
  sealed trait SENSITIVITY extends ExtendedField
  
  @js.native
  sealed trait USER extends ExtendedField
  
  @js.native
  sealed trait WORK extends ExtendedField
  
  /* 4 */ val BILLING_INFORMATION: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.ExtendedField.BILLING_INFORMATION with Double = js.native
  /* 5 */ val DIRECTORY_SERVER: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.ExtendedField.DIRECTORY_SERVER with Double = js.native
  /* 3 */ val GENDER: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.ExtendedField.GENDER with Double = js.native
  /* 0 */ val HOBBY: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.ExtendedField.HOBBY with Double = js.native
  /* 8 */ val HOME: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.ExtendedField.HOME with Double = js.native
  /* 2 */ val LANGUAGE: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.ExtendedField.LANGUAGE with Double = js.native
  /* 1 */ val MILEAGE: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.ExtendedField.MILEAGE with Double = js.native
  /* 11 */ val OTHER: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.ExtendedField.OTHER with Double = js.native
  /* 7 */ val PRIORITY: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.ExtendedField.PRIORITY with Double = js.native
  /* 6 */ val SENSITIVITY: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.ExtendedField.SENSITIVITY with Double = js.native
  /* 10 */ val USER: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.ExtendedField.USER with Double = js.native
  /* 9 */ val WORK: typings.googleDashAppsDashScript.GoogleAppsScript.Contacts.ExtendedField.WORK with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtendedField with Double] = js.native
}

