package typings.googleDashAppsDashScript.GoogleAppsScript.Content

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
  
  /* 0 */ val ATOM: typings.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.ATOM with Double = js.native
  /* 1 */ val CSV: typings.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.CSV with Double = js.native
  /* 2 */ val ICAL: typings.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.ICAL with Double = js.native
  /* 3 */ val JAVASCRIPT: typings.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.JAVASCRIPT with Double = js.native
  /* 4 */ val JSON: typings.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.JSON with Double = js.native
  /* 5 */ val RSS: typings.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.RSS with Double = js.native
  /* 6 */ val TEXT: typings.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.TEXT with Double = js.native
  /* 7 */ val VCARD: typings.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.VCARD with Double = js.native
  /* 8 */ val XML: typings.googleDashAppsDashScript.GoogleAppsScript.Content.MimeType.XML with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MimeType with Double] = js.native
}

