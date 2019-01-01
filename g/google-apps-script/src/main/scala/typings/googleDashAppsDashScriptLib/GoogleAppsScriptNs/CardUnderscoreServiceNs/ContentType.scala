package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

@JSGlobal("GoogleAppsScript.Card_Service.ContentType")
@js.native
object ContentType extends js.Object {
  @js.native
  sealed trait IMMUTABLE_HTML
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.ContentType
  
  @js.native
  sealed trait MUTABLE_HTML
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.ContentType
  
  @js.native
  sealed trait TEXT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.ContentType
  
  val IMMUTABLE_HTML: IMMUTABLE_HTML with java.lang.String = js.native
  val MUTABLE_HTML: MUTABLE_HTML with java.lang.String = js.native
  val TEXT: TEXT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs.ContentType with java.lang.String
  ] = js.native
}

