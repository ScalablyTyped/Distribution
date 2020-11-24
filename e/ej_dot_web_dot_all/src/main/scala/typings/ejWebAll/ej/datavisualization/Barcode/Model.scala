package typings.ejWebAll.ej.datavisualization.Barcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Specifies the height of bars in the Barcode. By modifying the barHeight, the entire barcode height can be customized. Please refer to xDimension for two dimensional barcode height
    * customization.
    */
  var barHeight: js.UndefOr[Double] = js.native
  
  /** Specifies the distance between the barcode and text below it.
    */
  var barcodeToTextGapHeight: js.UndefOr[Double] = js.native
  
  /** Specifies the dark bar color of the Barcode. One dimensional barcode contains a series of dark and light bars which are usually colored as black and white respectively.
    */
  var darkBarColor: js.UndefOr[js.Any] = js.native
  
  /** Specifies whether the text below the barcode is visible or hidden.
    */
  var displayText: js.UndefOr[Boolean] = js.native
  
  /** Specifies whether the control is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Specifies the start and stop encode symbol in the Barcode. In one dimensional barcodes, an additional character is added as start and stop delimiters. These symbols are optional
    * and the unique of the symbol allows the reader to determine the direction of the barcode being scanned.
    */
  var encodeStartStopSymbol: js.UndefOr[Double] = js.native
  
  /** Specifies the light bar color of the Barcode. One dimensional barcode contains a series of dark and light bars which are usually colored as black and white respectively.
    */
  var lightBarColor: js.UndefOr[js.Any] = js.native
  
  /** Fires after Barcode control is loaded.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  
  /** Specifies the width of the narrow bars in the barcode. The dark bars in the one dimensional barcode contains random narrow and wide bars based on the provided input which can be
    * specified during initialization.
    */
  var narrowBarWidth: js.UndefOr[Double] = js.native
  
  /** Specifies the width of the quiet zone. In barcode, a quiet zone is the blank margin on either side of a barcode which informs the reader where a barcode's symbology starts and
    * stops. The purpose of a quiet zone is to prevent the reader from picking up unrelated information.
    */
  var quietZone: js.UndefOr[QuietZone] = js.native
  
  /** Specifies the type of the Barcode. See SymbologyType
    */
  var symbologyType: js.UndefOr[SymbologyType | String] = js.native
  
  /** Specifies the text to be encoded in the barcode.
    */
  var text: js.UndefOr[String] = js.native
  
  /** Specifies the color of the text/data at the bottom of the barcode.
    */
  var textColor: js.UndefOr[js.Any] = js.native
  
  /** Specifies the width of the wide bars in the barcode. One dimensional barcode usually contains random narrow and wide bars based on the provided which can be customized during
    * initialization.
    */
  var wideBarWidth: js.UndefOr[Double] = js.native
  
  /** Specifies the width of the narrowest element(bar or space) in a barcode. The greater the x dimension, the more easily a barcode reader will scan.
    */
  var xDimension: js.UndefOr[Double] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setBarHeight(value: Double): Self = this.set("barHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarHeight: Self = this.set("barHeight", js.undefined)
    
    @scala.inline
    def setBarcodeToTextGapHeight(value: Double): Self = this.set("barcodeToTextGapHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarcodeToTextGapHeight: Self = this.set("barcodeToTextGapHeight", js.undefined)
    
    @scala.inline
    def setDarkBarColor(value: js.Any): Self = this.set("darkBarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDarkBarColor: Self = this.set("darkBarColor", js.undefined)
    
    @scala.inline
    def setDisplayText(value: Boolean): Self = this.set("displayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayText: Self = this.set("displayText", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setEncodeStartStopSymbol(value: Double): Self = this.set("encodeStartStopSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodeStartStopSymbol: Self = this.set("encodeStartStopSymbol", js.undefined)
    
    @scala.inline
    def setLightBarColor(value: js.Any): Self = this.set("lightBarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightBarColor: Self = this.set("lightBarColor", js.undefined)
    
    @scala.inline
    def setLoad(value: /* e */ LoadEventArgs => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setNarrowBarWidth(value: Double): Self = this.set("narrowBarWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNarrowBarWidth: Self = this.set("narrowBarWidth", js.undefined)
    
    @scala.inline
    def setQuietZone(value: QuietZone): Self = this.set("quietZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuietZone: Self = this.set("quietZone", js.undefined)
    
    @scala.inline
    def setSymbologyType(value: SymbologyType | String): Self = this.set("symbologyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbologyType: Self = this.set("symbologyType", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextColor(value: js.Any): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    
    @scala.inline
    def setWideBarWidth(value: Double): Self = this.set("wideBarWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWideBarWidth: Self = this.set("wideBarWidth", js.undefined)
    
    @scala.inline
    def setXDimension(value: Double): Self = this.set("xDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXDimension: Self = this.set("xDimension", js.undefined)
  }
}
