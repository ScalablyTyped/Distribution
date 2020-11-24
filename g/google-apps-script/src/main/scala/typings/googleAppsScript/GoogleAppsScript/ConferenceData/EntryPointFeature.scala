package typings.googleAppsScript.GoogleAppsScript.ConferenceData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EntryPointFeature extends js.Object
/**
  * Enum that defines the features of the entry point that can be created by a conferencing add-on.
  */
@JSGlobal("GoogleAppsScript.Conference_Data.EntryPointFeature")
@js.native
object EntryPointFeature extends js.Object {
  
  @js.native
  sealed trait TOLL extends EntryPointFeature
  
  @js.native
  sealed trait TOLL_FREE extends EntryPointFeature
  
  @js.native
  sealed trait UNKNOWN_FEATURE extends EntryPointFeature
}
