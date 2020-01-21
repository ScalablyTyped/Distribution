package typings.googleAppsScript.GoogleAppsScript.Calendar

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Visibility extends js.Object

/**
  * An enum representing the visibility of an event.
  */
@JSGlobal("GoogleAppsScript.Calendar.Visibility")
@js.native
object Visibility extends js.Object {
  @js.native
  sealed trait CONFIDENTIAL extends Visibility
  
  @js.native
  sealed trait DEFAULT extends Visibility
  
  @js.native
  sealed trait PRIVATE extends Visibility
  
  @js.native
  sealed trait PUBLIC extends Visibility
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Visibility with Double] = js.native
  /* 0 */ @js.native
  object CONFIDENTIAL extends TopLevel[CONFIDENTIAL with Double]
  
  /* 1 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
  /* 2 */ @js.native
  object PRIVATE extends TopLevel[PRIVATE with Double]
  
  /* 3 */ @js.native
  object PUBLIC extends TopLevel[PUBLIC with Double]
  
}

