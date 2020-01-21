package typings.googleAppsScript.GoogleAppsScript.Calendar

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GuestStatus extends js.Object

/**
  * An enum representing the statuses a guest can have for an event.
  */
@JSGlobal("GoogleAppsScript.Calendar.GuestStatus")
@js.native
object GuestStatus extends js.Object {
  @js.native
  sealed trait INVITED extends GuestStatus
  
  @js.native
  sealed trait MAYBE extends GuestStatus
  
  @js.native
  sealed trait NO extends GuestStatus
  
  @js.native
  sealed trait OWNER extends GuestStatus
  
  @js.native
  sealed trait YES extends GuestStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GuestStatus with Double] = js.native
  /* 0 */ @js.native
  object INVITED extends TopLevel[INVITED with Double]
  
  /* 1 */ @js.native
  object MAYBE extends TopLevel[MAYBE with Double]
  
  /* 2 */ @js.native
  object NO extends TopLevel[NO with Double]
  
  /* 3 */ @js.native
  object OWNER extends TopLevel[OWNER with Double]
  
  /* 4 */ @js.native
  object YES extends TopLevel[YES with Double]
  
}

