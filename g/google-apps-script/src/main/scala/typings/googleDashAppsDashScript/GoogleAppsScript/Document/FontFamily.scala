package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.AMARANTH
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.ARIAL
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.ARIAL_BLACK
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.ARIAL_NARROW
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.ARVO
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.CALIBRI
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.CAMBRIA
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.COMIC_SANS_MS
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.CONSOLAS
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.CORSIVA
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.COURIER_NEW
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.DANCING_SCRIPT
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.DROID_SANS
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.DROID_SERIF
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.GARAMOND
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.GEORGIA
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.GLORIA_HALLELUJAH
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.GREAT_VIBES
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.LOBSTER
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.MERRIWEATHER
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.PACIFICO
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.PHILOSOPHER
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.POIRET_ONE
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.QUATTROCENTO
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.ROBOTO
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.SHADOWS_INTO_LIGHT
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.SYNCOPATE
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.TAHOMA
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.TIMES_NEW_ROMAN
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.TREBUCHET_MS
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.UBUNTU
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.VERDANA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontFamily extends js.Object

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
object FontFamily extends js.Object {
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontFamily with Double] = js.native
  /* 0 */ @js.native
  object AMARANTH extends TopLevel[AMARANTH with Double]
  
  /* 1 */ @js.native
  object ARIAL extends TopLevel[ARIAL with Double]
  
  /* 2 */ @js.native
  object ARIAL_BLACK extends TopLevel[ARIAL_BLACK with Double]
  
  /* 3 */ @js.native
  object ARIAL_NARROW extends TopLevel[ARIAL_NARROW with Double]
  
  /* 4 */ @js.native
  object ARVO extends TopLevel[ARVO with Double]
  
  /* 5 */ @js.native
  object CALIBRI extends TopLevel[CALIBRI with Double]
  
  /* 6 */ @js.native
  object CAMBRIA extends TopLevel[CAMBRIA with Double]
  
  /* 7 */ @js.native
  object COMIC_SANS_MS extends TopLevel[COMIC_SANS_MS with Double]
  
  /* 8 */ @js.native
  object CONSOLAS extends TopLevel[CONSOLAS with Double]
  
  /* 9 */ @js.native
  object CORSIVA extends TopLevel[CORSIVA with Double]
  
  /* 10 */ @js.native
  object COURIER_NEW extends TopLevel[COURIER_NEW with Double]
  
  /* 11 */ @js.native
  object DANCING_SCRIPT extends TopLevel[DANCING_SCRIPT with Double]
  
  /* 12 */ @js.native
  object DROID_SANS extends TopLevel[DROID_SANS with Double]
  
  /* 13 */ @js.native
  object DROID_SERIF extends TopLevel[DROID_SERIF with Double]
  
  /* 14 */ @js.native
  object GARAMOND extends TopLevel[GARAMOND with Double]
  
  /* 15 */ @js.native
  object GEORGIA extends TopLevel[GEORGIA with Double]
  
  /* 16 */ @js.native
  object GLORIA_HALLELUJAH extends TopLevel[GLORIA_HALLELUJAH with Double]
  
  /* 17 */ @js.native
  object GREAT_VIBES extends TopLevel[GREAT_VIBES with Double]
  
  /* 18 */ @js.native
  object LOBSTER extends TopLevel[LOBSTER with Double]
  
  /* 19 */ @js.native
  object MERRIWEATHER extends TopLevel[MERRIWEATHER with Double]
  
  /* 20 */ @js.native
  object PACIFICO extends TopLevel[PACIFICO with Double]
  
  /* 21 */ @js.native
  object PHILOSOPHER extends TopLevel[PHILOSOPHER with Double]
  
  /* 22 */ @js.native
  object POIRET_ONE extends TopLevel[POIRET_ONE with Double]
  
  /* 23 */ @js.native
  object QUATTROCENTO extends TopLevel[QUATTROCENTO with Double]
  
  /* 24 */ @js.native
  object ROBOTO extends TopLevel[ROBOTO with Double]
  
  /* 25 */ @js.native
  object SHADOWS_INTO_LIGHT extends TopLevel[SHADOWS_INTO_LIGHT with Double]
  
  /* 26 */ @js.native
  object SYNCOPATE extends TopLevel[SYNCOPATE with Double]
  
  /* 27 */ @js.native
  object TAHOMA extends TopLevel[TAHOMA with Double]
  
  /* 28 */ @js.native
  object TIMES_NEW_ROMAN extends TopLevel[TIMES_NEW_ROMAN with Double]
  
  /* 29 */ @js.native
  object TREBUCHET_MS extends TopLevel[TREBUCHET_MS with Double]
  
  /* 30 */ @js.native
  object UBUNTU extends TopLevel[UBUNTU with Double]
  
  /* 31 */ @js.native
  object VERDANA extends TopLevel[VERDANA with Double]
  
}

