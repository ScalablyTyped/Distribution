package typings.dwt.addonOCRProMod

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProOutputFormat
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProPDFAVersion
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProPDFVersion
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTOCRProRecognitionModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  /**
    * Specify the target language.
    */
  var Languages: String = js.native
  /**
    * Specify the URL for the license checker.
    */
  var LicenseChecker: String = js.native
  /**
    * Specify the output format.
    */
  var OutputFormat: EnumDWTOCRProOutputFormat | String = js.native
  /**
    * Specify the PDF/A version.
    */
  var PDFAVersion: EnumDWTOCRProPDFAVersion | String = js.native
  /**
    * Specify the PDF version.
    */
  var PDFVersion: EnumDWTOCRProPDFVersion | String = js.native
  /**
    * Specify the recognition module.
    */
  var RecognitionModule: EnumDWTOCRProRecognitionModule | String = js.native
  /**
    * Configure the redaction.
    */
  var Redaction: typings.dwt.addonOCRProMod.Redaction = js.native
}

object Settings {
  @scala.inline
  def apply(
    Languages: String,
    LicenseChecker: String,
    OutputFormat: EnumDWTOCRProOutputFormat | String,
    PDFAVersion: EnumDWTOCRProPDFAVersion | String,
    PDFVersion: EnumDWTOCRProPDFVersion | String,
    RecognitionModule: EnumDWTOCRProRecognitionModule | String,
    Redaction: Redaction
  ): Settings = {
    val __obj = js.Dynamic.literal(Languages = Languages.asInstanceOf[js.Any], LicenseChecker = LicenseChecker.asInstanceOf[js.Any], OutputFormat = OutputFormat.asInstanceOf[js.Any], PDFAVersion = PDFAVersion.asInstanceOf[js.Any], PDFVersion = PDFVersion.asInstanceOf[js.Any], RecognitionModule = RecognitionModule.asInstanceOf[js.Any], Redaction = Redaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLanguages(value: String): Self = this.set("Languages", value.asInstanceOf[js.Any])
    @scala.inline
    def setLicenseChecker(value: String): Self = this.set("LicenseChecker", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputFormat(value: EnumDWTOCRProOutputFormat | String): Self = this.set("OutputFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setPDFAVersion(value: EnumDWTOCRProPDFAVersion | String): Self = this.set("PDFAVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setPDFVersion(value: EnumDWTOCRProPDFVersion | String): Self = this.set("PDFVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecognitionModule(value: EnumDWTOCRProRecognitionModule | String): Self = this.set("RecognitionModule", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedaction(value: Redaction): Self = this.set("Redaction", value.asInstanceOf[js.Any])
  }
  
}

