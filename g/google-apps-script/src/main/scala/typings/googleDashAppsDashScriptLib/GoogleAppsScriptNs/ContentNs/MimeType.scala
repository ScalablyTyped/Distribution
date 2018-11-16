package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MimeType extends js.Object

@JSGlobal("GoogleAppsScript.Content.MimeType")
@js.native
object MimeType extends js.Object {
  @js.native
  sealed trait ATOM
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.MimeType
  
  @js.native
  sealed trait CSV
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.MimeType
  
  @js.native
  sealed trait ICAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.MimeType
  
  @js.native
  sealed trait JAVASCRIPT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.MimeType
  
  @js.native
  sealed trait JSON
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.MimeType
  
  @js.native
  sealed trait RSS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.MimeType
  
  @js.native
  sealed trait TEXT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.MimeType
  
  @js.native
  sealed trait VCARD
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.MimeType
  
  @js.native
  sealed trait XML
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.MimeType
  
  val ATOM: ATOM with java.lang.String = js.native
  val CSV: CSV with java.lang.String = js.native
  val ICAL: ICAL with java.lang.String = js.native
  val JAVASCRIPT: JAVASCRIPT with java.lang.String = js.native
  val JSON: JSON with java.lang.String = js.native
  val RSS: RSS with java.lang.String = js.native
  val TEXT: TEXT with java.lang.String = js.native
  val VCARD: VCARD with java.lang.String = js.native
  val XML: XML with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.MimeType with java.lang.String
  ] = js.native
}

