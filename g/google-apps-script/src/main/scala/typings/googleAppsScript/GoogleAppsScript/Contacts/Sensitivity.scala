package typings.googleAppsScript.GoogleAppsScript.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Sensitivity extends js.Object

/**
  * An enum for contact sensitivity.
  */
@JSGlobal("GoogleAppsScript.Contacts.Sensitivity")
@js.native
object Sensitivity extends js.Object {
  @js.native
  sealed trait CONFIDENTIAL extends Sensitivity
  
  @js.native
  sealed trait NORMAL extends Sensitivity
  
  @js.native
  sealed trait PERSONAL extends Sensitivity
  
  @js.native
  sealed trait PRIVATE extends Sensitivity
  
}

