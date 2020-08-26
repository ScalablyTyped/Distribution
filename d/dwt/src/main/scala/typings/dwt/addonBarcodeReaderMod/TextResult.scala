package typings.dwt.addonBarcodeReaderMod

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBarcodeFormat
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBarcodeFormat2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextResult extends js.Object {
  /**
    * Barcode result content in a byte array.
    */
  var barcodeBytes: js.Array[Double] = js.native
  /**
    * The barcode format.
    */
  var barcodeFormat: EnumBarcodeFormat | Double = js.native
  /**
    * Barcode formats as a string.
    */
  var barcodeFormatString: String = js.native
  /**
    * Extra barcode formats as a string.
    */
  var barcodeFormatString_2: String = js.native
  /**
    * Extra barcde formats.
    */
  var barcodeFormat_2: EnumBarcodeFormat2 | Double = js.native
  /**
    * The barcode result text.
    */
  var barcodeText: String = js.native
  /**
    * Detailed result information.
    */
  var detailedResult: js.Any = js.native
  /**
    * The corresponding localization result.
    */
  var localizationResult: LocalizationResult = js.native
  /**
    * Other information
    */
  var results: js.Array[Result] = js.native
}

object TextResult {
  @scala.inline
  def apply(
    barcodeBytes: js.Array[Double],
    barcodeFormat: EnumBarcodeFormat | Double,
    barcodeFormatString: String,
    barcodeFormatString_2: String,
    barcodeFormat_2: EnumBarcodeFormat2 | Double,
    barcodeText: String,
    detailedResult: js.Any,
    localizationResult: LocalizationResult,
    results: js.Array[Result]
  ): TextResult = {
    val __obj = js.Dynamic.literal(barcodeBytes = barcodeBytes.asInstanceOf[js.Any], barcodeFormat = barcodeFormat.asInstanceOf[js.Any], barcodeFormatString = barcodeFormatString.asInstanceOf[js.Any], barcodeFormatString_2 = barcodeFormatString_2.asInstanceOf[js.Any], barcodeFormat_2 = barcodeFormat_2.asInstanceOf[js.Any], barcodeText = barcodeText.asInstanceOf[js.Any], detailedResult = detailedResult.asInstanceOf[js.Any], localizationResult = localizationResult.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextResult]
  }
  @scala.inline
  implicit class TextResultOps[Self <: TextResult] (val x: Self) extends AnyVal {
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
    def setBarcodeBytesVarargs(value: Double*): Self = this.set("barcodeBytes", js.Array(value :_*))
    @scala.inline
    def setBarcodeBytes(value: js.Array[Double]): Self = this.set("barcodeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setBarcodeFormat(value: EnumBarcodeFormat | Double): Self = this.set("barcodeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setBarcodeFormatString(value: String): Self = this.set("barcodeFormatString", value.asInstanceOf[js.Any])
    @scala.inline
    def setBarcodeFormatString_2(value: String): Self = this.set("barcodeFormatString_2", value.asInstanceOf[js.Any])
    @scala.inline
    def setBarcodeFormat_2(value: EnumBarcodeFormat2 | Double): Self = this.set("barcodeFormat_2", value.asInstanceOf[js.Any])
    @scala.inline
    def setBarcodeText(value: String): Self = this.set("barcodeText", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetailedResult(value: js.Any): Self = this.set("detailedResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalizationResult(value: LocalizationResult): Self = this.set("localizationResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: Result*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[Result]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
  
}

