package typings.googleAppsScript.GoogleAppsScript.Calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
