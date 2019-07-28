package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MimeType extends js.Object

@JSGlobal("GoogleAppsScript.Content.MimeType")
@js.native
object MimeType extends js.Object {
  @js.native
  sealed trait ATOM extends MimeType
  
  @js.native
  sealed trait CSV extends MimeType
  
  @js.native
  sealed trait ICAL extends MimeType
  
  @js.native
  sealed trait JAVASCRIPT extends MimeType
  
  @js.native
  sealed trait JSON extends MimeType
  
  @js.native
  sealed trait RSS extends MimeType
  
  @js.native
  sealed trait TEXT extends MimeType
  
  @js.native
  sealed trait VCARD extends MimeType
  
  @js.native
  sealed trait XML extends MimeType
  
  /* 0 */ val ATOM: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.MimeType.ATOM with Double = js.native
  /* 1 */ val CSV: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.MimeType.CSV with Double = js.native
  /* 2 */ val ICAL: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.MimeType.ICAL with Double = js.native
  /* 3 */ val JAVASCRIPT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.MimeType.JAVASCRIPT with Double = js.native
  /* 4 */ val JSON: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.MimeType.JSON with Double = js.native
  /* 5 */ val RSS: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.MimeType.RSS with Double = js.native
  /* 6 */ val TEXT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.MimeType.TEXT with Double = js.native
  /* 7 */ val VCARD: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.MimeType.VCARD with Double = js.native
  /* 8 */ val XML: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.MimeType.XML with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MimeType with Double] = js.native
}

