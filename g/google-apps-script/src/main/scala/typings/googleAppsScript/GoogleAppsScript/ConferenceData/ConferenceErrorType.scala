package typings.googleAppsScript.GoogleAppsScript.ConferenceData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConferenceErrorType extends js.Object

/**
  * Enum that defines the types of errors that you can specify in a ConferenceError.
  */
@JSGlobal("GoogleAppsScript.Conference_Data.ConferenceErrorType")
@js.native
object ConferenceErrorType extends js.Object {
  @js.native
  sealed trait AUTHENTICATION extends ConferenceErrorType
  
  @js.native
  sealed trait CONFERENCE_SOLUTION_FORBIDDEN extends ConferenceErrorType
  
  @js.native
  sealed trait PERMANENT extends ConferenceErrorType
  
  @js.native
  sealed trait PERMISSION_DENIED extends ConferenceErrorType
  
  @js.native
  sealed trait TEMPORARY extends ConferenceErrorType
  
  @js.native
  sealed trait UNKNOWN extends ConferenceErrorType
  
}

