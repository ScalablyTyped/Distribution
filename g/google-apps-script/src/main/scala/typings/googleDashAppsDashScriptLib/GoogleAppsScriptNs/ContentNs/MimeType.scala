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
  
  /* 0 */ val ATOM: ATOM with scala.Double = js.native
  /* 1 */ val CSV: CSV with scala.Double = js.native
  /* 2 */ val ICAL: ICAL with scala.Double = js.native
  /* 3 */ val JAVASCRIPT: JAVASCRIPT with scala.Double = js.native
  /* 4 */ val JSON: JSON with scala.Double = js.native
  /* 5 */ val RSS: RSS with scala.Double = js.native
  /* 6 */ val TEXT: TEXT with scala.Double = js.native
  /* 7 */ val VCARD: VCARD with scala.Double = js.native
  /* 8 */ val XML: XML with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.MimeType with scala.Double
  ] = js.native
}

