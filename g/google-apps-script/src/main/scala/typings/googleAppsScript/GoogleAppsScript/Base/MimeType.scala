package typings.googleAppsScript.GoogleAppsScript.Base

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait MimeType extends StObject {
  
  var BMP: String
  
  var CSS: String
  
  var CSV: String
  
  var FOLDER: String
  
  var GIF: String
  
  var GOOGLE_APPS_SCRIPT: String
  
  var GOOGLE_DOCS: String
  
  var GOOGLE_DRAWINGS: String
  
  var GOOGLE_FORMS: String
  
  var GOOGLE_SHEETS: String
  
  var GOOGLE_SITES: String
  
  var GOOGLE_SLIDES: String
  
  var HTML: String
  
  var JAVASCRIPT: String
  
  var JPEG: String
  
  var MICROSOFT_EXCEL: String
  
  var MICROSOFT_EXCEL_LEGACY: String
  
  var MICROSOFT_POWERPOINT: String
  
  var MICROSOFT_POWERPOINT_LEGACY: String
  
  var MICROSOFT_WORD: String
  
  var MICROSOFT_WORD_LEGACY: String
  
  var OPENDOCUMENT_GRAPHICS: String
  
  var OPENDOCUMENT_PRESENTATION: String
  
  var OPENDOCUMENT_SPREADSHEET: String
  
  var OPENDOCUMENT_TEXT: String
  
  var PDF: String
  
  var PLAIN_TEXT: String
  
  var PNG: String
  
  var RTF: String
  
  var SHORTCUT: String
  
  var SVG: String
  
  var ZIP: String
}
object MimeType {
  
  inline def apply(
    BMP: String,
    CSS: String,
    CSV: String,
    FOLDER: String,
    GIF: String,
    GOOGLE_APPS_SCRIPT: String,
    GOOGLE_DOCS: String,
    GOOGLE_DRAWINGS: String,
    GOOGLE_FORMS: String,
    GOOGLE_SHEETS: String,
    GOOGLE_SITES: String,
    GOOGLE_SLIDES: String,
    HTML: String,
    JAVASCRIPT: String,
    JPEG: String,
    MICROSOFT_EXCEL: String,
    MICROSOFT_EXCEL_LEGACY: String,
    MICROSOFT_POWERPOINT: String,
    MICROSOFT_POWERPOINT_LEGACY: String,
    MICROSOFT_WORD: String,
    MICROSOFT_WORD_LEGACY: String,
    OPENDOCUMENT_GRAPHICS: String,
    OPENDOCUMENT_PRESENTATION: String,
    OPENDOCUMENT_SPREADSHEET: String,
    OPENDOCUMENT_TEXT: String,
    PDF: String,
    PLAIN_TEXT: String,
    PNG: String,
    RTF: String,
    SHORTCUT: String,
    SVG: String,
    ZIP: String
  ): MimeType = {
    val __obj = js.Dynamic.literal(BMP = BMP.asInstanceOf[js.Any], CSS = CSS.asInstanceOf[js.Any], CSV = CSV.asInstanceOf[js.Any], FOLDER = FOLDER.asInstanceOf[js.Any], GIF = GIF.asInstanceOf[js.Any], GOOGLE_APPS_SCRIPT = GOOGLE_APPS_SCRIPT.asInstanceOf[js.Any], GOOGLE_DOCS = GOOGLE_DOCS.asInstanceOf[js.Any], GOOGLE_DRAWINGS = GOOGLE_DRAWINGS.asInstanceOf[js.Any], GOOGLE_FORMS = GOOGLE_FORMS.asInstanceOf[js.Any], GOOGLE_SHEETS = GOOGLE_SHEETS.asInstanceOf[js.Any], GOOGLE_SITES = GOOGLE_SITES.asInstanceOf[js.Any], GOOGLE_SLIDES = GOOGLE_SLIDES.asInstanceOf[js.Any], HTML = HTML.asInstanceOf[js.Any], JAVASCRIPT = JAVASCRIPT.asInstanceOf[js.Any], JPEG = JPEG.asInstanceOf[js.Any], MICROSOFT_EXCEL = MICROSOFT_EXCEL.asInstanceOf[js.Any], MICROSOFT_EXCEL_LEGACY = MICROSOFT_EXCEL_LEGACY.asInstanceOf[js.Any], MICROSOFT_POWERPOINT = MICROSOFT_POWERPOINT.asInstanceOf[js.Any], MICROSOFT_POWERPOINT_LEGACY = MICROSOFT_POWERPOINT_LEGACY.asInstanceOf[js.Any], MICROSOFT_WORD = MICROSOFT_WORD.asInstanceOf[js.Any], MICROSOFT_WORD_LEGACY = MICROSOFT_WORD_LEGACY.asInstanceOf[js.Any], OPENDOCUMENT_GRAPHICS = OPENDOCUMENT_GRAPHICS.asInstanceOf[js.Any], OPENDOCUMENT_PRESENTATION = OPENDOCUMENT_PRESENTATION.asInstanceOf[js.Any], OPENDOCUMENT_SPREADSHEET = OPENDOCUMENT_SPREADSHEET.asInstanceOf[js.Any], OPENDOCUMENT_TEXT = OPENDOCUMENT_TEXT.asInstanceOf[js.Any], PDF = PDF.asInstanceOf[js.Any], PLAIN_TEXT = PLAIN_TEXT.asInstanceOf[js.Any], PNG = PNG.asInstanceOf[js.Any], RTF = RTF.asInstanceOf[js.Any], SHORTCUT = SHORTCUT.asInstanceOf[js.Any], SVG = SVG.asInstanceOf[js.Any], ZIP = ZIP.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimeType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MimeType] (val x: Self) extends AnyVal {
    
    inline def setBMP(value: String): Self = StObject.set(x, "BMP", value.asInstanceOf[js.Any])
    
    inline def setCSS(value: String): Self = StObject.set(x, "CSS", value.asInstanceOf[js.Any])
    
    inline def setCSV(value: String): Self = StObject.set(x, "CSV", value.asInstanceOf[js.Any])
    
    inline def setFOLDER(value: String): Self = StObject.set(x, "FOLDER", value.asInstanceOf[js.Any])
    
    inline def setGIF(value: String): Self = StObject.set(x, "GIF", value.asInstanceOf[js.Any])
    
    inline def setGOOGLE_APPS_SCRIPT(value: String): Self = StObject.set(x, "GOOGLE_APPS_SCRIPT", value.asInstanceOf[js.Any])
    
    inline def setGOOGLE_DOCS(value: String): Self = StObject.set(x, "GOOGLE_DOCS", value.asInstanceOf[js.Any])
    
    inline def setGOOGLE_DRAWINGS(value: String): Self = StObject.set(x, "GOOGLE_DRAWINGS", value.asInstanceOf[js.Any])
    
    inline def setGOOGLE_FORMS(value: String): Self = StObject.set(x, "GOOGLE_FORMS", value.asInstanceOf[js.Any])
    
    inline def setGOOGLE_SHEETS(value: String): Self = StObject.set(x, "GOOGLE_SHEETS", value.asInstanceOf[js.Any])
    
    inline def setGOOGLE_SITES(value: String): Self = StObject.set(x, "GOOGLE_SITES", value.asInstanceOf[js.Any])
    
    inline def setGOOGLE_SLIDES(value: String): Self = StObject.set(x, "GOOGLE_SLIDES", value.asInstanceOf[js.Any])
    
    inline def setHTML(value: String): Self = StObject.set(x, "HTML", value.asInstanceOf[js.Any])
    
    inline def setJAVASCRIPT(value: String): Self = StObject.set(x, "JAVASCRIPT", value.asInstanceOf[js.Any])
    
    inline def setJPEG(value: String): Self = StObject.set(x, "JPEG", value.asInstanceOf[js.Any])
    
    inline def setMICROSOFT_EXCEL(value: String): Self = StObject.set(x, "MICROSOFT_EXCEL", value.asInstanceOf[js.Any])
    
    inline def setMICROSOFT_EXCEL_LEGACY(value: String): Self = StObject.set(x, "MICROSOFT_EXCEL_LEGACY", value.asInstanceOf[js.Any])
    
    inline def setMICROSOFT_POWERPOINT(value: String): Self = StObject.set(x, "MICROSOFT_POWERPOINT", value.asInstanceOf[js.Any])
    
    inline def setMICROSOFT_POWERPOINT_LEGACY(value: String): Self = StObject.set(x, "MICROSOFT_POWERPOINT_LEGACY", value.asInstanceOf[js.Any])
    
    inline def setMICROSOFT_WORD(value: String): Self = StObject.set(x, "MICROSOFT_WORD", value.asInstanceOf[js.Any])
    
    inline def setMICROSOFT_WORD_LEGACY(value: String): Self = StObject.set(x, "MICROSOFT_WORD_LEGACY", value.asInstanceOf[js.Any])
    
    inline def setOPENDOCUMENT_GRAPHICS(value: String): Self = StObject.set(x, "OPENDOCUMENT_GRAPHICS", value.asInstanceOf[js.Any])
    
    inline def setOPENDOCUMENT_PRESENTATION(value: String): Self = StObject.set(x, "OPENDOCUMENT_PRESENTATION", value.asInstanceOf[js.Any])
    
    inline def setOPENDOCUMENT_SPREADSHEET(value: String): Self = StObject.set(x, "OPENDOCUMENT_SPREADSHEET", value.asInstanceOf[js.Any])
    
    inline def setOPENDOCUMENT_TEXT(value: String): Self = StObject.set(x, "OPENDOCUMENT_TEXT", value.asInstanceOf[js.Any])
    
    inline def setPDF(value: String): Self = StObject.set(x, "PDF", value.asInstanceOf[js.Any])
    
    inline def setPLAIN_TEXT(value: String): Self = StObject.set(x, "PLAIN_TEXT", value.asInstanceOf[js.Any])
    
    inline def setPNG(value: String): Self = StObject.set(x, "PNG", value.asInstanceOf[js.Any])
    
    inline def setRTF(value: String): Self = StObject.set(x, "RTF", value.asInstanceOf[js.Any])
    
    inline def setSHORTCUT(value: String): Self = StObject.set(x, "SHORTCUT", value.asInstanceOf[js.Any])
    
    inline def setSVG(value: String): Self = StObject.set(x, "SVG", value.asInstanceOf[js.Any])
    
    inline def setZIP(value: String): Self = StObject.set(x, "ZIP", value.asInstanceOf[js.Any])
  }
}
