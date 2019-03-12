package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var Languages: java.lang.String
  var LicenseChecker: java.lang.String
  var OutputFormat: EnumDWT_OCRProOutputFormat
  var PDFAVersion: EnumDWT_OCRProPDFAVersion
  var PDFVersion: EnumDWT_OCRProPDFVersion
  var RecognitionModule: java.lang.String
  var Redaction: dwtLib.Redaction
}

object Settings {
  @scala.inline
  def apply(
    Languages: java.lang.String,
    LicenseChecker: java.lang.String,
    OutputFormat: EnumDWT_OCRProOutputFormat,
    PDFAVersion: EnumDWT_OCRProPDFAVersion,
    PDFVersion: EnumDWT_OCRProPDFVersion,
    RecognitionModule: java.lang.String,
    Redaction: Redaction
  ): Settings = {
    val __obj = js.Dynamic.literal(Languages = Languages, LicenseChecker = LicenseChecker, OutputFormat = OutputFormat, PDFAVersion = PDFAVersion, PDFVersion = PDFVersion, RecognitionModule = RecognitionModule, Redaction = Redaction)
  
    __obj.asInstanceOf[Settings]
  }
}

