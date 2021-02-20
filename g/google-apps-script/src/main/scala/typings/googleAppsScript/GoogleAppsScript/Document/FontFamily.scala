package typings.googleAppsScript.GoogleAppsScript.Document

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FontFamily extends StObject
/**
  *
  * Deprecated. The methods getFontFamily() and setFontFamily(String) now use string
  *     names for fonts instead of this enum. Although this enum is deprecated, it will remain
  *     available for compatibility with older scripts.
  * An enumeration of the supported fonts.
  *
  * Use the FontFamily enumeration to set the font for a range of text, element or
  * document.
  *
  *     var body = DocumentApp.getActiveDocument().getBody();
  *
  *     // Insert a paragraph at the start of the document.
  *     body.insertParagraph(0, "Hello, Apps Script!");
  *
  *     // Set the document font to Calibri.
  *     body.editAsText().setFontFamily(DocumentApp.FontFamily.CALIBRI);
  *
  *     // Set the first paragraph font to Arial.
  *     body.getParagraphs()[0].setFontFamily(DocumentApp.FontFamily.ARIAL);
  *
  *     // Set "Apps Script" to Comic Sans MS.
  *     var text = 'Apps Script';
  *     var a = body.getText().indexOf(text);
  *     var b = a + text.length - 1;
  *     body.editAsText().setFontFamily(a, b, DocumentApp.FontFamily.COMIC_SANS_MS);
  */
@JSGlobal("GoogleAppsScript.Document.FontFamily")
@js.native
object FontFamily extends StObject {
  
  @js.native
  sealed trait AMARANTH extends FontFamily
  
  @js.native
  sealed trait ARIAL extends FontFamily
  
  @js.native
  sealed trait ARIAL_BLACK extends FontFamily
  
  @js.native
  sealed trait ARIAL_NARROW extends FontFamily
  
  @js.native
  sealed trait ARVO extends FontFamily
  
  @js.native
  sealed trait CALIBRI extends FontFamily
  
  @js.native
  sealed trait CAMBRIA extends FontFamily
  
  @js.native
  sealed trait COMIC_SANS_MS extends FontFamily
  
  @js.native
  sealed trait CONSOLAS extends FontFamily
  
  @js.native
  sealed trait CORSIVA extends FontFamily
  
  @js.native
  sealed trait COURIER_NEW extends FontFamily
  
  @js.native
  sealed trait DANCING_SCRIPT extends FontFamily
  
  @js.native
  sealed trait DROID_SANS extends FontFamily
  
  @js.native
  sealed trait DROID_SERIF extends FontFamily
  
  @js.native
  sealed trait GARAMOND extends FontFamily
  
  @js.native
  sealed trait GEORGIA extends FontFamily
  
  @js.native
  sealed trait GLORIA_HALLELUJAH extends FontFamily
  
  @js.native
  sealed trait GREAT_VIBES extends FontFamily
  
  @js.native
  sealed trait LOBSTER extends FontFamily
  
  @js.native
  sealed trait MERRIWEATHER extends FontFamily
  
  @js.native
  sealed trait PACIFICO extends FontFamily
  
  @js.native
  sealed trait PHILOSOPHER extends FontFamily
  
  @js.native
  sealed trait POIRET_ONE extends FontFamily
  
  @js.native
  sealed trait QUATTROCENTO extends FontFamily
  
  @js.native
  sealed trait ROBOTO extends FontFamily
  
  @js.native
  sealed trait SHADOWS_INTO_LIGHT extends FontFamily
  
  @js.native
  sealed trait SYNCOPATE extends FontFamily
  
  @js.native
  sealed trait TAHOMA extends FontFamily
  
  @js.native
  sealed trait TIMES_NEW_ROMAN extends FontFamily
  
  @js.native
  sealed trait TREBUCHET_MS extends FontFamily
  
  @js.native
  sealed trait UBUNTU extends FontFamily
  
  @js.native
  sealed trait VERDANA extends FontFamily
}
