package typings.googleAppsScript.GoogleAppsScript.Contacts

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Sensitivity with Double] = js.native
  /* 0 */ @js.native
  object CONFIDENTIAL extends TopLevel[CONFIDENTIAL with Double]
  
  /* 1 */ @js.native
  object NORMAL extends TopLevel[NORMAL with Double]
  
  /* 2 */ @js.native
  object PERSONAL extends TopLevel[PERSONAL with Double]
  
  /* 3 */ @js.native
  object PRIVATE extends TopLevel[PRIVATE with Double]
  
}

