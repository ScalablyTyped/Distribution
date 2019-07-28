package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

@JSGlobal("GoogleAppsScript.Card_Service.ContentType")
@js.native
object ContentType extends js.Object {
  @js.native
  sealed trait IMMUTABLE_HTML extends ContentType
  
  @js.native
  sealed trait MUTABLE_HTML extends ContentType
  
  @js.native
  sealed trait TEXT extends ContentType
  
  /* 2 */ val IMMUTABLE_HTML: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs.ContentType.IMMUTABLE_HTML with Double = js.native
  /* 1 */ val MUTABLE_HTML: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs.ContentType.MUTABLE_HTML with Double = js.native
  /* 0 */ val TEXT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs.ContentType.TEXT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
}

