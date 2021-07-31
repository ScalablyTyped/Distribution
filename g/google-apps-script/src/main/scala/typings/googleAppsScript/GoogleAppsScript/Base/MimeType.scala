package typings.googleAppsScript.GoogleAppsScript.Base

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MimeType extends StObject
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
object MimeType extends StObject {
  
  @js.native
  sealed trait BMP
    extends StObject
       with MimeType
  
  @js.native
  sealed trait CSS
    extends StObject
       with MimeType
  
  @js.native
  sealed trait CSV
    extends StObject
       with MimeType
  
  @js.native
  sealed trait FOLDER
    extends StObject
       with MimeType
  
  @js.native
  sealed trait GIF
    extends StObject
       with MimeType
  
  @js.native
  sealed trait GOOGLE_APPS_SCRIPT
    extends StObject
       with MimeType
  
  @js.native
  sealed trait GOOGLE_DOCS
    extends StObject
       with MimeType
  
  @js.native
  sealed trait GOOGLE_DRAWINGS
    extends StObject
       with MimeType
  
  @js.native
  sealed trait GOOGLE_FORMS
    extends StObject
       with MimeType
  
  @js.native
  sealed trait GOOGLE_SHEETS
    extends StObject
       with MimeType
  
  @js.native
  sealed trait GOOGLE_SITES
    extends StObject
       with MimeType
  
  @js.native
  sealed trait GOOGLE_SLIDES
    extends StObject
       with MimeType
  
  @js.native
  sealed trait HTML
    extends StObject
       with MimeType
  
  @js.native
  sealed trait JAVASCRIPT
    extends StObject
       with MimeType
  
  @js.native
  sealed trait JPEG
    extends StObject
       with MimeType
  
  @js.native
  sealed trait MICROSOFT_EXCEL
    extends StObject
       with MimeType
  
  @js.native
  sealed trait MICROSOFT_EXCEL_LEGACY
    extends StObject
       with MimeType
  
  @js.native
  sealed trait MICROSOFT_POWERPOINT
    extends StObject
       with MimeType
  
  @js.native
  sealed trait MICROSOFT_POWERPOINT_LEGACY
    extends StObject
       with MimeType
  
  @js.native
  sealed trait MICROSOFT_WORD
    extends StObject
       with MimeType
  
  @js.native
  sealed trait MICROSOFT_WORD_LEGACY
    extends StObject
       with MimeType
  
  @js.native
  sealed trait OPENDOCUMENT_GRAPHICS
    extends StObject
       with MimeType
  
  @js.native
  sealed trait OPENDOCUMENT_PRESENTATION
    extends StObject
       with MimeType
  
  @js.native
  sealed trait OPENDOCUMENT_SPREADSHEET
    extends StObject
       with MimeType
  
  @js.native
  sealed trait OPENDOCUMENT_TEXT
    extends StObject
       with MimeType
  
  @js.native
  sealed trait PDF
    extends StObject
       with MimeType
  
  @js.native
  sealed trait PLAIN_TEXT
    extends StObject
       with MimeType
  
  @js.native
  sealed trait PNG
    extends StObject
       with MimeType
  
  @js.native
  sealed trait RTF
    extends StObject
       with MimeType
  
  @js.native
  sealed trait SVG
    extends StObject
       with MimeType
  
  @js.native
  sealed trait ZIP
    extends StObject
       with MimeType
}
