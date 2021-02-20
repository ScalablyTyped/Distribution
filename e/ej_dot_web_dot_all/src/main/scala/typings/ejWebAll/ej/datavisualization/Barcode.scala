package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Barcode extends Widget_ {
  
  var defaults: Model = js.native
  
  /** To disable the barcode
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** To enable the barcode
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  @JSName("model")
  var model_Barcode: Model = js.native
}
object Barcode {
  
  @js.native
  sealed trait SymbologyType extends StObject
  @JSGlobal("ej.datavisualization.Barcode.SymbologyType")
  @js.native
  object SymbologyType extends StObject {
    
    //Represents the Codabar barcode
    @js.native
    sealed trait Codabar extends SymbologyType
    
    //Represents the Code 11 barcode
    @js.native
    sealed trait Code11 extends SymbologyType
    
    //Represents the Code 128 A barcode
    @js.native
    sealed trait Code128A extends SymbologyType
    
    //Represents the Code 128 B barcode
    @js.native
    sealed trait Code128B extends SymbologyType
    
    //Represents the Code 128 C barcode
    @js.native
    sealed trait Code128C extends SymbologyType
    
    //Represents the Code 32 barcode
    @js.native
    sealed trait Code32 extends SymbologyType
    
    //Represents the Code 39 barcode
    @js.native
    sealed trait Code39 extends SymbologyType
    
    //Represents the Code 39 Extended barcode
    @js.native
    sealed trait Code39Extended extends SymbologyType
    
    //Represents the Code 93 barcode
    @js.native
    sealed trait Code93 extends SymbologyType
    
    //Represents the Code 93 Extended barcode
    @js.native
    sealed trait Code93Extended extends SymbologyType
    
    //Represents the Data Matrix barcode
    @js.native
    sealed trait DataMatrix extends SymbologyType
    
    //Represents the QR code
    @js.native
    sealed trait QRBarcode extends SymbologyType
  }
  
  @js.native
  trait LoadEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the barcode model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** return the barcode state
      */
    var status: js.UndefOr[Boolean] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LoadEventArgs {
    
    @scala.inline
    def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    @scala.inline
    implicit class LoadEventArgsMutableBuilder[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
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
    def apply(): typings.ejWebAll.ej.datavisualization.Barcode.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.Barcode.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.datavisualization.Barcode.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBarHeight(value: Double): Self = StObject.set(x, "barHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarHeightUndefined: Self = StObject.set(x, "barHeight", js.undefined)
      
      @scala.inline
      def setBarcodeToTextGapHeight(value: Double): Self = StObject.set(x, "barcodeToTextGapHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarcodeToTextGapHeightUndefined: Self = StObject.set(x, "barcodeToTextGapHeight", js.undefined)
      
      @scala.inline
      def setDarkBarColor(value: js.Any): Self = StObject.set(x, "darkBarColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkBarColorUndefined: Self = StObject.set(x, "darkBarColor", js.undefined)
      
      @scala.inline
      def setDisplayText(value: Boolean): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setEncodeStartStopSymbol(value: Double): Self = StObject.set(x, "encodeStartStopSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodeStartStopSymbolUndefined: Self = StObject.set(x, "encodeStartStopSymbol", js.undefined)
      
      @scala.inline
      def setLightBarColor(value: js.Any): Self = StObject.set(x, "lightBarColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightBarColorUndefined: Self = StObject.set(x, "lightBarColor", js.undefined)
      
      @scala.inline
      def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setNarrowBarWidth(value: Double): Self = StObject.set(x, "narrowBarWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNarrowBarWidthUndefined: Self = StObject.set(x, "narrowBarWidth", js.undefined)
      
      @scala.inline
      def setQuietZone(value: QuietZone): Self = StObject.set(x, "quietZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietZoneUndefined: Self = StObject.set(x, "quietZone", js.undefined)
      
      @scala.inline
      def setSymbologyType(value: SymbologyType | String): Self = StObject.set(x, "symbologyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbologyTypeUndefined: Self = StObject.set(x, "symbologyType", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColor(value: js.Any): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setWideBarWidth(value: Double): Self = StObject.set(x, "wideBarWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWideBarWidthUndefined: Self = StObject.set(x, "wideBarWidth", js.undefined)
      
      @scala.inline
      def setXDimension(value: Double): Self = StObject.set(x, "xDimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXDimensionUndefined: Self = StObject.set(x, "xDimension", js.undefined)
    }
  }
  
  @js.native
  trait QuietZone extends StObject {
    
    /** Specifies the quiet zone around the Barcode.
      */
    var all: js.UndefOr[Double] = js.native
    
    /** Specifies the bottom quiet zone of the Barcode.
      */
    var bottom: js.UndefOr[Double] = js.native
    
    /** Specifies the left quiet zone of the Barcode.
      */
    var left: js.UndefOr[Double] = js.native
    
    /** Specifies the right quiet zone of the Barcode.
      */
    var right: js.UndefOr[Double] = js.native
    
    /** Specifies the top quiet zone of the Barcode.
      */
    var top: js.UndefOr[Double] = js.native
  }
  object QuietZone {
    
    @scala.inline
    def apply(): QuietZone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuietZone]
    }
    
    @scala.inline
    implicit class QuietZoneMutableBuilder[Self <: QuietZone] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
