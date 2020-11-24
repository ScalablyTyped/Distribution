package typings.googleAppsScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends js.Object
/**
  * An enumeration denoting the type of triggered event.
  */
@JSGlobal("GoogleAppsScript.Script.EventType")
@js.native
object EventType extends js.Object {
  
  @js.native
  sealed trait CLOCK extends EventType
  
  @js.native
  sealed trait ON_CHANGE extends EventType
  
  @js.native
  sealed trait ON_EDIT extends EventType
  
  @js.native
  sealed trait ON_EVENT_UPDATED extends EventType
  
  @js.native
  sealed trait ON_FORM_SUBMIT extends EventType
  
  @js.native
  sealed trait ON_OPEN extends EventType
}
