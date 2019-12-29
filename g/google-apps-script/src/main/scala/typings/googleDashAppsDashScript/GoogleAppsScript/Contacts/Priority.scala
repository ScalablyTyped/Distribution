package typings.googleDashAppsDashScript.GoogleAppsScript.Contacts

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Priority extends js.Object

/**
  * An enum for contact priority.
  */
@JSGlobal("GoogleAppsScript.Contacts.Priority")
@js.native
object Priority extends js.Object {
  @js.native
  sealed trait HIGH extends Priority
  
  @js.native
  sealed trait LOW extends Priority
  
  @js.native
  sealed trait NORMAL extends Priority
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Priority with Double] = js.native
  /* 0 */ @js.native
  object HIGH extends TopLevel[HIGH with Double]
  
  /* 1 */ @js.native
  object LOW extends TopLevel[LOW with Double]
  
  /* 2 */ @js.native
  object NORMAL extends TopLevel[NORMAL with Double]
  
}

