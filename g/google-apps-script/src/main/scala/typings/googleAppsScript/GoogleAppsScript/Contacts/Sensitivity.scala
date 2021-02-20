package typings.googleAppsScript.GoogleAppsScript.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Sensitivity extends StObject
/**
  * An enum for contact sensitivity.
  */
@JSGlobal("GoogleAppsScript.Contacts.Sensitivity")
@js.native
object Sensitivity extends StObject {
  
  @js.native
  sealed trait CONFIDENTIAL extends Sensitivity
  
  @js.native
  sealed trait NORMAL extends Sensitivity
  
  @js.native
  sealed trait PERSONAL extends Sensitivity
  
  @js.native
  sealed trait PRIVATE extends Sensitivity
}
