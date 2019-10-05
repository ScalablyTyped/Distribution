package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ComposedEmailType extends js.Object

@JSGlobal("GoogleAppsScript.Card_Service.ComposedEmailType")
@js.native
object ComposedEmailType extends js.Object {
  @js.native
  sealed trait REPLY_AS_DRAFT extends ComposedEmailType
  
  @js.native
  sealed trait STANDALONE_DRAFT extends ComposedEmailType
  
  /* 0 */ val REPLY_AS_DRAFT: typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service.ComposedEmailType.REPLY_AS_DRAFT with Double = js.native
  /* 1 */ val STANDALONE_DRAFT: typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service.ComposedEmailType.STANDALONE_DRAFT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ComposedEmailType with Double] = js.native
}

