package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var Languages: String
  var LicenseChecker: String
  var OutputFormat: EnumDWT_OCRProOutputFormat
  var PDFAVersion: EnumDWT_OCRProPDFAVersion
  var PDFVersion: EnumDWT_OCRProPDFVersion
  var RecognitionModule: String
  var Redaction: typings.dwt.Redaction
}

object Settings {
  @scala.inline
  def apply(
    Languages: String,
    LicenseChecker: String,
    OutputFormat: EnumDWT_OCRProOutputFormat,
    PDFAVersion: EnumDWT_OCRProPDFAVersion,
    PDFVersion: EnumDWT_OCRProPDFVersion,
    RecognitionModule: String,
    Redaction: Redaction
  ): Settings = {
    val __obj = js.Dynamic.literal(Languages = Languages.asInstanceOf[js.Any], LicenseChecker = LicenseChecker.asInstanceOf[js.Any], OutputFormat = OutputFormat.asInstanceOf[js.Any], PDFAVersion = PDFAVersion.asInstanceOf[js.Any], PDFVersion = PDFVersion.asInstanceOf[js.Any], RecognitionModule = RecognitionModule.asInstanceOf[js.Any], Redaction = Redaction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Settings]
  }
}

