package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ComposedEmailType extends js.Object

@JSGlobal("GoogleAppsScript.Card_Service.ComposedEmailType")
@js.native
object ComposedEmailType extends js.Object {
  @js.native
  sealed trait REPLY_AS_DRAFT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.ComposedEmailType
  
  @js.native
  sealed trait STANDALONE_DRAFT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.ComposedEmailType
  
  val REPLY_AS_DRAFT: REPLY_AS_DRAFT with java.lang.String = js.native
  val STANDALONE_DRAFT: STANDALONE_DRAFT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.ComposedEmailType with java.lang.String
  ] = js.native
}

