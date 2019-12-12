package typings.googleDashAppsDashScript.GoogleAppsScript.Base

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.BMP
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.CSS
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.CSV
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.FOLDER
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.GIF
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.GOOGLE_APPS_SCRIPT
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.GOOGLE_DOCS
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.GOOGLE_DRAWINGS
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.GOOGLE_FORMS
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.GOOGLE_SHEETS
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.GOOGLE_SITES
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.GOOGLE_SLIDES
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.JAVASCRIPT
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.JPEG
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.MICROSOFT_EXCEL
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.MICROSOFT_EXCEL_LEGACY
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.MICROSOFT_POWERPOINT
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.MICROSOFT_POWERPOINT_LEGACY
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.MICROSOFT_WORD
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.MICROSOFT_WORD_LEGACY
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.OPENDOCUMENT_GRAPHICS
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.OPENDOCUMENT_PRESENTATION
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.OPENDOCUMENT_SPREADSHEET
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.OPENDOCUMENT_TEXT
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.PDF
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.PLAIN_TEXT
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.PNG
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.RTF
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.SVG
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.ZIP
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MimeType with Double] = js.native
  /* 8 */ @js.native
  object BMP extends TopLevel[BMP with Double]
  
  /* 14 */ @js.native
  object CSS extends TopLevel[CSS with Double]
  
  /* 15 */ @js.native
  object CSV extends TopLevel[CSV with Double]
  
  /* 7 */ @js.native
  object FOLDER extends TopLevel[FOLDER with Double]
  
  /* 9 */ @js.native
  object GIF extends TopLevel[GIF with Double]
  
  /* 0 */ @js.native
  object GOOGLE_APPS_SCRIPT extends TopLevel[GOOGLE_APPS_SCRIPT with Double]
  
  /* 2 */ @js.native
  object GOOGLE_DOCS extends TopLevel[GOOGLE_DOCS with Double]
  
  /* 1 */ @js.native
  object GOOGLE_DRAWINGS extends TopLevel[GOOGLE_DRAWINGS with Double]
  
  /* 3 */ @js.native
  object GOOGLE_FORMS extends TopLevel[GOOGLE_FORMS with Double]
  
  /* 4 */ @js.native
  object GOOGLE_SHEETS extends TopLevel[GOOGLE_SHEETS with Double]
  
  /* 5 */ @js.native
  object GOOGLE_SITES extends TopLevel[GOOGLE_SITES with Double]
  
  /* 6 */ @js.native
  object GOOGLE_SLIDES extends TopLevel[GOOGLE_SLIDES with Double]
  
  /* 16 */ @js.native
  object HTML
    extends TopLevel[typings.googleDashAppsDashScript.GoogleAppsScript.Base.MimeType.HTML with Double]
  
  /* 17 */ @js.native
  object JAVASCRIPT extends TopLevel[JAVASCRIPT with Double]
  
  /* 10 */ @js.native
  object JPEG extends TopLevel[JPEG with Double]
  
  /* 24 */ @js.native
  object MICROSOFT_EXCEL extends TopLevel[MICROSOFT_EXCEL with Double]
  
  /* 25 */ @js.native
  object MICROSOFT_EXCEL_LEGACY extends TopLevel[MICROSOFT_EXCEL_LEGACY with Double]
  
  /* 26 */ @js.native
  object MICROSOFT_POWERPOINT extends TopLevel[MICROSOFT_POWERPOINT with Double]
  
  /* 27 */ @js.native
  object MICROSOFT_POWERPOINT_LEGACY extends TopLevel[MICROSOFT_POWERPOINT_LEGACY with Double]
  
  /* 28 */ @js.native
  object MICROSOFT_WORD extends TopLevel[MICROSOFT_WORD with Double]
  
  /* 29 */ @js.native
  object MICROSOFT_WORD_LEGACY extends TopLevel[MICROSOFT_WORD_LEGACY with Double]
  
  /* 20 */ @js.native
  object OPENDOCUMENT_GRAPHICS extends TopLevel[OPENDOCUMENT_GRAPHICS with Double]
  
  /* 21 */ @js.native
  object OPENDOCUMENT_PRESENTATION extends TopLevel[OPENDOCUMENT_PRESENTATION with Double]
  
  /* 22 */ @js.native
  object OPENDOCUMENT_SPREADSHEET extends TopLevel[OPENDOCUMENT_SPREADSHEET with Double]
  
  /* 23 */ @js.native
  object OPENDOCUMENT_TEXT extends TopLevel[OPENDOCUMENT_TEXT with Double]
  
  /* 13 */ @js.native
  object PDF extends TopLevel[PDF with Double]
  
  /* 18 */ @js.native
  object PLAIN_TEXT extends TopLevel[PLAIN_TEXT with Double]
  
  /* 11 */ @js.native
  object PNG extends TopLevel[PNG with Double]
  
  /* 19 */ @js.native
  object RTF extends TopLevel[RTF with Double]
  
  /* 12 */ @js.native
  object SVG extends TopLevel[SVG with Double]
  
  /* 30 */ @js.native
  object ZIP extends TopLevel[ZIP with Double]
  
}

