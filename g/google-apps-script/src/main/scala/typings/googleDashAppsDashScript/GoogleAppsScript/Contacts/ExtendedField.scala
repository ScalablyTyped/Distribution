package typings.googleDashAppsDashScript.GoogleAppsScript.Contacts

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtendedField with Double] = js.native
  /* 4 */ @js.native
  object BILLING_INFORMATION extends TopLevel[BILLING_INFORMATION with Double]
  
  /* 5 */ @js.native
  object DIRECTORY_SERVER extends TopLevel[DIRECTORY_SERVER with Double]
  
  /* 3 */ @js.native
  object GENDER extends TopLevel[GENDER with Double]
  
  /* 0 */ @js.native
  object HOBBY extends TopLevel[HOBBY with Double]
  
  /* 8 */ @js.native
  object HOME extends TopLevel[HOME with Double]
  
  /* 2 */ @js.native
  object LANGUAGE extends TopLevel[LANGUAGE with Double]
  
  /* 1 */ @js.native
  object MILEAGE extends TopLevel[MILEAGE with Double]
  
  /* 11 */ @js.native
  object OTHER extends TopLevel[OTHER with Double]
  
  /* 7 */ @js.native
  object PRIORITY extends TopLevel[PRIORITY with Double]
  
  /* 6 */ @js.native
  object SENSITIVITY extends TopLevel[SENSITIVITY with Double]
  
  /* 10 */ @js.native
  object USER extends TopLevel[USER with Double]
  
  /* 9 */ @js.native
  object WORK extends TopLevel[WORK with Double]
  
}

