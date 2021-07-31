package typings.googleAppsScript.GoogleAppsScript.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Gender extends StObject
/**
  * An enum for contact gender.
  */
@JSGlobal("GoogleAppsScript.Contacts.Gender")
@js.native
object Gender extends StObject {
  
  @js.native
  sealed trait FEMALE
    extends StObject
       with Gender
  
  @js.native
  sealed trait MALE
    extends StObject
       with Gender
}
