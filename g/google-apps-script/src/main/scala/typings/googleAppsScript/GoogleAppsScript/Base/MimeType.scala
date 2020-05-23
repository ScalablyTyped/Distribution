package typings.googleAppsScript.GoogleAppsScript.Base

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
  
}

