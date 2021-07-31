package typings.googleAppsScript.GoogleAppsScript.Document

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  sealed trait AMARANTH
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait ARIAL
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait ARIAL_BLACK
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait ARIAL_NARROW
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait ARVO
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait CALIBRI
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait CAMBRIA
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait COMIC_SANS_MS
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait CONSOLAS
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait CORSIVA
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait COURIER_NEW
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait DANCING_SCRIPT
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait DROID_SANS
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait DROID_SERIF
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait GARAMOND
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait GEORGIA
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait GLORIA_HALLELUJAH
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait GREAT_VIBES
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait LOBSTER
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait MERRIWEATHER
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait PACIFICO
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait PHILOSOPHER
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait POIRET_ONE
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait QUATTROCENTO
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait ROBOTO
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait SHADOWS_INTO_LIGHT
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait SYNCOPATE
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait TAHOMA
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait TIMES_NEW_ROMAN
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait TREBUCHET_MS
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait UBUNTU
    extends StObject
       with FontFamily
  
  @js.native
  sealed trait VERDANA
    extends StObject
       with FontFamily
}
