package typings.ejWebAll.ej.datavisualization.Barcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Specifies the height of bars in the Barcode. By modifying the barHeight, the entire barcode height can be customized. Please refer to xDimension for two dimensional barcode height
    * customization.
    */
  var barHeight: js.UndefOr[Double] = js.undefined
  /** Specifies the distance between the barcode and text below it.
    */
  var barcodeToTextGapHeight: js.UndefOr[Double] = js.undefined
  /** Specifies the dark bar color of the Barcode. One dimensional barcode contains a series of dark and light bars which are usually colored as black and white respectively.
    */
  var darkBarColor: js.UndefOr[js.Any] = js.undefined
  /** Specifies whether the text below the barcode is visible or hidden.
    */
  var displayText: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether the control is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the start and stop encode symbol in the Barcode. In one dimensional barcodes, an additional character is added as start and stop delimiters. These symbols are optional
    * and the unique of the symbol allows the reader to determine the direction of the barcode being scanned.
    */
  var encodeStartStopSymbol: js.UndefOr[Double] = js.undefined
  /** Specifies the light bar color of the Barcode. One dimensional barcode contains a series of dark and light bars which are usually colored as black and white respectively.
    */
  var lightBarColor: js.UndefOr[js.Any] = js.undefined
  /** Fires after Barcode control is loaded.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Specifies the width of the narrow bars in the barcode. The dark bars in the one dimensional barcode contains random narrow and wide bars based on the provided input which can be
    * specified during initialization.
    */
  var narrowBarWidth: js.UndefOr[Double] = js.undefined
  /** Specifies the width of the quiet zone. In barcode, a quiet zone is the blank margin on either side of a barcode which informs the reader where a barcode's symbology starts and
    * stops. The purpose of a quiet zone is to prevent the reader from picking up unrelated information.
    */
  var quietZone: js.UndefOr[QuietZone] = js.undefined
  /** Specifies the type of the Barcode. See SymbologyType
    */
  var symbologyType: js.UndefOr[SymbologyType | String] = js.undefined
  /** Specifies the text to be encoded in the barcode.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the color of the text/data at the bottom of the barcode.
    */
  var textColor: js.UndefOr[js.Any] = js.undefined
  /** Specifies the width of the wide bars in the barcode. One dimensional barcode usually contains random narrow and wide bars based on the provided which can be customized during
    * initialization.
    */
  var wideBarWidth: js.UndefOr[Double] = js.undefined
  /** Specifies the width of the narrowest element(bar or space) in a barcode. The greater the x dimension, the more easily a barcode reader will scan.
    */
  var xDimension: js.UndefOr[Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    barHeight: js.UndefOr[Double] = js.undefined,
    barcodeToTextGapHeight: js.UndefOr[Double] = js.undefined,
    darkBarColor: js.Any = null,
    displayText: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    encodeStartStopSymbol: js.UndefOr[Double] = js.undefined,
    lightBarColor: js.Any = null,
    load: /* e */ LoadEventArgs => Unit = null,
    narrowBarWidth: js.UndefOr[Double] = js.undefined,
    quietZone: QuietZone = null,
    symbologyType: SymbologyType | String = null,
    text: String = null,
    textColor: js.Any = null,
    wideBarWidth: js.UndefOr[Double] = js.undefined,
    xDimension: js.UndefOr[Double] = js.undefined
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(barHeight)) __obj.updateDynamic("barHeight")(barHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barcodeToTextGapHeight)) __obj.updateDynamic("barcodeToTextGapHeight")(barcodeToTextGapHeight.get.asInstanceOf[js.Any])
    if (darkBarColor != null) __obj.updateDynamic("darkBarColor")(darkBarColor.asInstanceOf[js.Any])
    if (!js.isUndefined(displayText)) __obj.updateDynamic("displayText")(displayText.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(encodeStartStopSymbol)) __obj.updateDynamic("encodeStartStopSymbol")(encodeStartStopSymbol.get.asInstanceOf[js.Any])
    if (lightBarColor != null) __obj.updateDynamic("lightBarColor")(lightBarColor.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (!js.isUndefined(narrowBarWidth)) __obj.updateDynamic("narrowBarWidth")(narrowBarWidth.get.asInstanceOf[js.Any])
    if (quietZone != null) __obj.updateDynamic("quietZone")(quietZone.asInstanceOf[js.Any])
    if (symbologyType != null) __obj.updateDynamic("symbologyType")(symbologyType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (!js.isUndefined(wideBarWidth)) __obj.updateDynamic("wideBarWidth")(wideBarWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xDimension)) __obj.updateDynamic("xDimension")(xDimension.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

