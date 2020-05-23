package typings.googleAppsScript.GoogleAppsScript.ConferenceData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EntryPointType extends js.Object

/**
  * Enum that defines the types of entry points that can be created by a conferencing add-on.
  */
@JSGlobal("GoogleAppsScript.Conference_Data.EntryPointType")
@js.native
object EntryPointType extends js.Object {
  @js.native
  sealed trait MORE extends EntryPointType
  
  @js.native
  sealed trait PHONE extends EntryPointType
  
  @js.native
  sealed trait SIP extends EntryPointType
  
  @js.native
  sealed trait VIDEO extends EntryPointType
  
}

