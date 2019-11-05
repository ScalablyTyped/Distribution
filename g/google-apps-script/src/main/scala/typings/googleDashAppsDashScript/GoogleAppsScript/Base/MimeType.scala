package typings.googleDashAppsDashScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MimeType extends js.Object

/**
  * An enumeration that provides access to MIME-type declarations without typing the strings
  * explicitly. Methods that expect a MIME type rendered as a string (for example,
  * 'image/png') also accept any of the values below, so long as the method supports the
  * underlying MIME type.
  *
  *     // Use MimeType enum to log the name of every Google Doc in the user's Drive.
  *     var docs = DriveApp.getFilesByType(MimeType.GOOGLE_DOCS);
  *     while (docs.hasNext()) {
  *      var doc = docs.next();
  *      Logger.log(doc.getName())
  *     }
  *
  *     // Use plain string to log the size of every PNG in the user's Drive.
  *     var pngs = DriveApp.getFilesByType('image/png');
  *     while (pngs.hasNext()) {
  *      var png = pngs.next();
  *      Logger.log(png.getSize());
  *     }
  */
@JSGlobal("GoogleAppsScript.Base.MimeType")
@js.native
object MimeType extends js.Object {
  @js.native
  sealed trait BMP extends MimeType
  
  @js.native
  sealed trait CSS extends MimeType
  
  @js.native
  sealed trait CSV extends MimeType
  
  @js.native
  sealed trait FOLDER extends MimeType
  
  @js.native
  sealed trait GIF extends MimeType
  
  @js.native
  sealed trait GOOGLE_APPS_SCRIPT extends MimeType
  
  @js.native
  sealed trait GOOGLE_DOCS extends MimeType
  
  @js.native
  sealed trait GOOGLE_DRAWINGS extends MimeType
  
  @js.native
  sealed trait GOOGLE_FORMS extends MimeType
  
  @js.native
  sealed trait GOOGLE_SHEETS extends MimeType
  
  @js.native
  sealed trait GOOGLE_SITES extends MimeType
  
  @js.native
  sealed trait GOOGLE_SLIDES extends MimeType
  
  @js.native
  sealed trait HTML extends MimeType
  
  @js.native
  sealed trait JAVASCRIPT extends MimeType
  
  @js.native
  sealed trait JPEG extends MimeType
  
  @js.native
  sealed trait MICROSOFT_EXCEL extends MimeType
  
  @js.native
  sealed trait MICROSOFT_EXCEL_LEGACY extends MimeType
  
  @js.native
  sealed trait MICROSOFT_POWERPOINT extends MimeType
  
  @js.native
  sealed trait MICROSOFT_POWERPOINT_LEGACY extends MimeType
  
  @js.native
  sealed trait MICROSOFT_WORD extends MimeType
  
  @js.native
  sealed trait MICROSOFT_WORD_LEGACY extends MimeType
  
  @js.native
  sealed trait OPENDOCUMENT_GRAPHICS extends MimeType
  
  @js.native
  sealed trait OPENDOCUMENT_PRESENTATION extends MimeType
  
  @js.native
  sealed trait OPENDOCUMENT_SPREADSHEET extends MimeType
  
  @js.native
  sealed trait OPENDOCUMENT_TEXT extends MimeType
  
  @js.native
  sealed trait PDF extends MimeType
  
  @js.native
  sealed trait PLAIN_TEXT extends MimeType
  
  @js.native
  sealed trait PNG extends MimeType
  
  @js.native
  sealed trait RTF extends MimeType
  
  @js.native
  sealed trait SVG extends MimeType
  
  @js.native
  sealed trait ZIP extends MimeType
  
  /* 8 */ val BMP: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.BMP with Double = js.native
  /* 14 */ val CSS: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.CSS with Double = js.native
  /* 15 */ val CSV: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.CSV with Double = js.native
  /* 7 */ val FOLDER: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.FOLDER with Double = js.native
  /* 9 */ val GIF: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.GIF with Double = js.native
  /* 0 */ val GOOGLE_APPS_SCRIPT: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.GOOGLE_APPS_SCRIPT with Double = js.native
  /* 2 */ val GOOGLE_DOCS: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.GOOGLE_DOCS with Double = js.native
  /* 1 */ val GOOGLE_DRAWINGS: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.GOOGLE_DRAWINGS with Double = js.native
  /* 3 */ val GOOGLE_FORMS: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.GOOGLE_FORMS with Double = js.native
  /* 4 */ val GOOGLE_SHEETS: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.GOOGLE_SHEETS with Double = js.native
  /* 5 */ val GOOGLE_SITES: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.GOOGLE_SITES with Double = js.native
  /* 6 */ val GOOGLE_SLIDES: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.GOOGLE_SLIDES with Double = js.native
  /* 16 */ val HTML: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.HTML with Double = js.native
  /* 17 */ val JAVASCRIPT: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.JAVASCRIPT with Double = js.native
  /* 10 */ val JPEG: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.JPEG with Double = js.native
  /* 24 */ val MICROSOFT_EXCEL: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.MICROSOFT_EXCEL with Double = js.native
  /* 25 */ val MICROSOFT_EXCEL_LEGACY: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.MICROSOFT_EXCEL_LEGACY with Double = js.native
  /* 26 */ val MICROSOFT_POWERPOINT: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.MICROSOFT_POWERPOINT with Double = js.native
  /* 27 */ val MICROSOFT_POWERPOINT_LEGACY: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.MICROSOFT_POWERPOINT_LEGACY with Double = js.native
  /* 28 */ val MICROSOFT_WORD: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.MICROSOFT_WORD with Double = js.native
  /* 29 */ val MICROSOFT_WORD_LEGACY: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.MICROSOFT_WORD_LEGACY with Double = js.native
  /* 20 */ val OPENDOCUMENT_GRAPHICS: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.OPENDOCUMENT_GRAPHICS with Double = js.native
  /* 21 */ val OPENDOCUMENT_PRESENTATION: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.OPENDOCUMENT_PRESENTATION with Double = js.native
  /* 22 */ val OPENDOCUMENT_SPREADSHEET: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.OPENDOCUMENT_SPREADSHEET with Double = js.native
  /* 23 */ val OPENDOCUMENT_TEXT: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.OPENDOCUMENT_TEXT with Double = js.native
  /* 13 */ val PDF: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.PDF with Double = js.native
  /* 18 */ val PLAIN_TEXT: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.PLAIN_TEXT with Double = js.native
  /* 11 */ val PNG: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.PNG with Double = js.native
  /* 19 */ val RTF: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.RTF with Double = js.native
  /* 12 */ val SVG: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.SVG with Double = js.native
  /* 30 */ val ZIP: typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.ZIP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MimeType with Double] = js.native
}

