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
  var Redaction: Redaction
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Languages")(Languages)
    __obj.updateDynamic("LicenseChecker")(LicenseChecker)
    __obj.updateDynamic("OutputFormat")(OutputFormat)
    __obj.updateDynamic("PDFAVersion")(PDFAVersion)
    __obj.updateDynamic("PDFVersion")(PDFVersion)
    __obj.updateDynamic("RecognitionModule")(RecognitionModule)
    __obj.updateDynamic("Redaction")(Redaction)
    __obj.asInstanceOf[Settings]
  }
}

