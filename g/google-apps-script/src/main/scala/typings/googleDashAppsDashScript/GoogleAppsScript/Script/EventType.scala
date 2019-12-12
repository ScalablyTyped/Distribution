package typings.googleDashAppsDashScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.EventType.CLOCK
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.EventType.ON_CHANGE
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.EventType.ON_EDIT
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.EventType.ON_EVENT_UPDATED
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.EventType.ON_FORM_SUBMIT
import typings.googleDashAppsDashScript.GoogleAppsScript.Script.EventType.ON_OPEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
  /* 0 */ @js.native
  object CLOCK extends TopLevel[CLOCK with Double]
  
  /* 4 */ @js.native
  object ON_CHANGE extends TopLevel[ON_CHANGE with Double]
  
  /* 2 */ @js.native
  object ON_EDIT extends TopLevel[ON_EDIT with Double]
  
  /* 5 */ @js.native
  object ON_EVENT_UPDATED extends TopLevel[ON_EVENT_UPDATED with Double]
  
  /* 3 */ @js.native
  object ON_FORM_SUBMIT extends TopLevel[ON_FORM_SUBMIT with Double]
  
  /* 1 */ @js.native
  object ON_OPEN extends TopLevel[ON_OPEN with Double]
  
}

