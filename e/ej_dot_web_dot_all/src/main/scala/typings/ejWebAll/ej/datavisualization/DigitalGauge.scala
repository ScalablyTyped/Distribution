package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DigitalGauge
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** To export Digital Gauge as Image
    * @param {string} fileName for the Image
    * @param {string} fileType for the Image
    * @returns {boolean}
    */
  def exportImage(fileName: String, fileType: String): Boolean = js.native
  
  /** Gets the location of an item that is displayed on the gauge.
    * @param {number} Position value of an item that is displayed on the gauge.
    * @returns {any}
    */
  def getPosition(itemIndex: Double): Any = js.native
  
  /** ClientSideMethod getValue Gets the value of an item that is displayed on the gauge
    * @param {number} Index value of an item that displayed on the gauge
    * @returns {any}
    */
  def getValue(itemIndex: Double): Any = js.native
  
  @JSName("model")
  var model_DigitalGauge: Model = js.native
  
  /** Refresh the digital gauge widget
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  /** ClientSideMethod Set Position Sets the location of an item to be displayed in the gauge
    * @param {number} Index value of the digital gauge item
    * @param {any} Location value of the digital gauge
    * @returns {void}
    */
  def setPosition(itemIndex: Double, value: Any): Unit = js.native
  
  /** ClientSideMethod SetValue Sets the value of an item to be displayed in the gauge.
    * @param {number} Index value of the digital gauge item
    * @param {string} Text value to be displayed in the gaugeS
    * @returns {void}
    */
  def setValue(itemIndex: Double, value: String): Unit = js.native
}
object DigitalGauge {
  
  @js.native
  sealed trait CharacterType extends StObject
  @JSGlobal("ej.datavisualization.DigitalGauge.CharacterType")
  @js.native
  object CharacterType extends StObject {
    
    //string
    @js.native
    sealed trait EightCrossEightDotMatrix
      extends StObject
         with CharacterType
    
    //string
    @js.native
    sealed trait EightCrossEightSquareMatrix
      extends StObject
         with CharacterType
    
    //string
    @js.native
    sealed trait FourteenSegment
      extends StObject
         with CharacterType
    
    //string
    @js.native
    sealed trait SevenSegment
      extends StObject
         with CharacterType
    
    //string
    @js.native
    sealed trait SixteenSegment
      extends StObject
         with CharacterType
  }
  
  @js.native
  sealed trait ExportingMode extends StObject
  @JSGlobal("ej.datavisualization.DigitalGauge.ExportingMode")
  @js.native
  object ExportingMode extends StObject {
    
    //string
    @js.native
    sealed trait ClientSide
      extends StObject
         with ExportingMode
    
    //string
    @js.native
    sealed trait ServerSide
      extends StObject
         with ExportingMode
  }
  
  @js.native
  sealed trait ExportingType extends StObject
  @JSGlobal("ej.datavisualization.DigitalGauge.ExportingType")
  @js.native
  object ExportingType extends StObject {
    
    //string
    @js.native
    sealed trait JPG
      extends StObject
         with ExportingType
    
    //string
    @js.native
    sealed trait PNG
      extends StObject
         with ExportingType
  }
  
  @js.native
  sealed trait FontStyle extends StObject
  @JSGlobal("ej.datavisualization.DigitalGauge.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    //string
    @js.native
    sealed trait Bold
      extends StObject
         with FontStyle
    
    //string
    @js.native
    sealed trait Italic
      extends StObject
         with FontStyle
    
    //string
    @js.native
    sealed trait Normal
      extends StObject
         with FontStyle
    
    //string
    @js.native
    sealed trait Strikeout
      extends StObject
         with FontStyle
    
    //string
    @js.native
    sealed trait Underline
      extends StObject
         with FontStyle
  }
  
  trait ClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - X and Y co-ordinate of the points with respect to gauge area.id - ID of the target element.    size - Width and height of the gauge.    pageX - x-coordinate of the
      * pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the gauge model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ClickEventArgs {
    
    inline def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DoubleClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - X and Y co-ordinate of the points with respect to digital gauge area.id - ID of the target element.    size - Width and height of the digital gauge.    pageX -
      * x-coordinate of the pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the digital gauge model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DoubleClickEventArgs {
    
    inline def apply(): DoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DoubleClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ExportSettings extends StObject {
    
    /** Specifies the name of the action URL
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** Specifies the downloading filename
      * @Default {DigitalGauge}
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /** Specifies the mode of exporting
      * @Default {client}
      */
    var mode: js.UndefOr[ExportingMode | String] = js.undefined
    
    /** Specifies the format of the file to export
      * @Default {png}
      */
    var `type`: js.UndefOr[ExportingType | String] = js.undefined
  }
  object ExportSettings {
    
    inline def apply(): ExportSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportSettings] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setMode(value: ExportingMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setType(value: ExportingType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Frame extends StObject {
    
    /** Specifies the URL of an image to be displayed as background of the Digital gauge.
      * @Default {null}
      */
    var backgroundImageUrl: js.UndefOr[String] = js.undefined
    
    /** Specifies the inner width for the frame, when the background image has been set for the Digital gauge..
      * @Default {6}
      */
    var innerWidth: js.UndefOr[Double] = js.undefined
    
    /** Specifies the outer width of the frame, when the background image has been set for the Digital gauge.
      * @Default {10}
      */
    var outerWidth: js.UndefOr[Double] = js.undefined
  }
  object Frame {
    
    inline def apply(): Frame = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Frame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
      
      inline def setBackgroundImageUrl(value: String): Self = StObject.set(x, "backgroundImageUrl", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageUrlUndefined: Self = StObject.set(x, "backgroundImageUrl", js.undefined)
      
      inline def setInnerWidth(value: Double): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
      
      inline def setInnerWidthUndefined: Self = StObject.set(x, "innerWidth", js.undefined)
      
      inline def setOuterWidth(value: Double): Self = StObject.set(x, "outerWidth", value.asInstanceOf[js.Any])
      
      inline def setOuterWidthUndefined: Self = StObject.set(x, "outerWidth", js.undefined)
    }
  }
  
  trait InitEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the all the options of the items.
      */
    var items: js.UndefOr[Any] = js.undefined
    
    /** returns the gauge model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object InitEventArgs {
    
    inline def apply(): InitEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InitEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Item extends StObject {
    
    /** Specifies the Character settings for the DigitalGauge.
      * @Default {null}
      */
    var characterSettings: js.UndefOr[ItemsCharacterSettings] = js.undefined
    
    /** Enable/Disable the custom font to be applied to the text in the gauge.
      * @Default {false}
      */
    var enableCustomFont: js.UndefOr[Boolean] = js.undefined
    
    /** Set the specific font for the text, when the enableCustomFont is set to true
      * @Default {null}
      */
    var font: js.UndefOr[ItemsFont] = js.undefined
    
    /** Set the location for the text, where it needs to be placed within the gauge.
      * @Default {null}
      */
    var position: js.UndefOr[ItemsPosition] = js.undefined
    
    /** Set the segment settings for the digital gauge.
      * @Default {null}
      */
    var segmentSettings: js.UndefOr[ItemsSegmentSettings] = js.undefined
    
    /** Set the value for enabling/disabling the blurring effect for the shadows of the text
      * @Default {0}
      */
    var shadowBlur: js.UndefOr[Double] = js.undefined
    
    /** Specifies the color of the text shadow.
      * @Default {null}
      */
    var shadowColor: js.UndefOr[String] = js.undefined
    
    /** Set the x offset value for the shadow of the text, indicating the location where it needs to be displayed.
      * @Default {1}
      */
    var shadowOffsetX: js.UndefOr[Double] = js.undefined
    
    /** Set the y offset value for the shadow of the text, indicating the location where it needs to be displayed.
      * @Default {1}
      */
    var shadowOffsetY: js.UndefOr[Double] = js.undefined
    
    /** Set the alignment of the text that is displayed within the gauge.See TextAlign
      * @Default {left}
      */
    var textAlign: js.UndefOr[String] = js.undefined
    
    /** Specifies the color of the text.
      * @Default {null}
      */
    var textColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the text value.
      * @Default {null}
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object Item {
    
    inline def apply(): Item = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      inline def setCharacterSettings(value: ItemsCharacterSettings): Self = StObject.set(x, "characterSettings", value.asInstanceOf[js.Any])
      
      inline def setCharacterSettingsUndefined: Self = StObject.set(x, "characterSettings", js.undefined)
      
      inline def setEnableCustomFont(value: Boolean): Self = StObject.set(x, "enableCustomFont", value.asInstanceOf[js.Any])
      
      inline def setEnableCustomFontUndefined: Self = StObject.set(x, "enableCustomFont", js.undefined)
      
      inline def setFont(value: ItemsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setPosition(value: ItemsPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSegmentSettings(value: ItemsSegmentSettings): Self = StObject.set(x, "segmentSettings", value.asInstanceOf[js.Any])
      
      inline def setSegmentSettingsUndefined: Self = StObject.set(x, "segmentSettings", js.undefined)
      
      inline def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
      
      inline def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
      
      inline def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
      
      inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
      
      inline def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
      
      inline def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
      
      inline def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
      
      inline def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
      
      inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ItemRenderingEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the all the options of the items.
      */
    var items: js.UndefOr[Any] = js.undefined
    
    /** returns the gauge model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ItemRenderingEventArgs {
    
    inline def apply(): ItemRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemRenderingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemRenderingEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ItemsCharacterSettings extends StObject {
    
    /** Specifies the CharacterCount value for the DigitalGauge.
      * @Default {4}
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /** Specifies the opacity value for the DigitalGauge.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the value for spacing between the characters
      * @Default {2}
      */
    var spacing: js.UndefOr[Double] = js.undefined
    
    /** Specifies the character type for the text to be displayed.
      * @Default {ej.datavisualization.DigitalGauge.CharacterType.EightCrossEightDotMatrix}
      */
    var `type`: js.UndefOr[CharacterType | String] = js.undefined
  }
  object ItemsCharacterSettings {
    
    inline def apply(): ItemsCharacterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsCharacterSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemsCharacterSettings] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setType(value: CharacterType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ItemsFont extends StObject {
    
    /** Set the font family value
      * @Default {Arial}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Set the font style for the font
      * @Default {italic}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Set the font size value
      * @Default {11px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object ItemsFont {
    
    inline def apply(): ItemsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemsFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ItemsPosition extends StObject {
    
    /** Set the horizontal location for the text, where it needs to be placed within the gauge.
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Set the vertical location for the text, where it needs to be placed within the gauge.
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object ItemsPosition {
    
    inline def apply(): ItemsPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemsPosition] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ItemsSegmentSettings extends StObject {
    
    /** Set the color for the text segments.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Set the gradient for the text segments.
      * @Default {null}
      */
    var gradient: js.UndefOr[Any] = js.undefined
    
    /** Set the length for the text segments.
      * @Default {2}
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /** Set the opacity for the text segments.
      * @Default {0}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Set the spacing for the text segments.
      * @Default {1}
      */
    var spacing: js.UndefOr[Double] = js.undefined
    
    /** Set the width for the text segments.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ItemsSegmentSettings {
    
    inline def apply(): ItemsSegmentSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsSegmentSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemsSegmentSettings] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setGradient(value: Any): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LoadEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the all the options of the items.
      */
    var items: js.UndefOr[Any] = js.undefined
    
    /** returns the gauge model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LoadEventArgs {
    
    inline def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Fires, on clicking the gauge.
      */
    var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
    
    /** Fires, on double clicking the digital gauge.
      */
    var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
    
    /** Specifies the responsiveness of the Digital gauge
      * @Default {false}
      */
    var enableResize: js.UndefOr[Boolean] = js.undefined
    
    /** This provides options for customizing export settings
      */
    var exportSettings: js.UndefOr[ExportSettings] = js.undefined
    
    /** Specifies the frame of the Digital gauge.
      * @Default {{backgroundImageUrl: null, innerWidth: 6, outerWidth: 10}}
      */
    var frame: js.UndefOr[Frame] = js.undefined
    
    /** Specifies the height of the DigitalGauge.
      * @Default {150}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Triggers when the gauge is initialized.
      */
    var init: js.UndefOr[js.Function1[/* e */ InitEventArgs, Unit]] = js.undefined
    
    /** Specifies the resize option of the DigitalGauge.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Triggers when the gauge item rendering.
      */
    var itemRendering: js.UndefOr[js.Function1[/* e */ ItemRenderingEventArgs, Unit]] = js.undefined
    
    /** Specifies the items for the DigitalGauge.
      * @Default {null}
      */
    var items: js.UndefOr[js.Array[Item]] = js.undefined
    
    /** Triggers when the gauge is start to load.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
    
    /** Specifies the matrixSegmentData for the DigitalGauge.
      */
    var matrixSegmentData: js.UndefOr[Any] = js.undefined
    
    /** Triggers when the gauge render is completed.
      */
    var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.undefined
    
    /** Fires, on right clicking the digital gauge.
      */
    var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
    
    /** Specifies the segmentData for the DigitalGauge.
      */
    var segmentData: js.UndefOr[Any] = js.undefined
    
    /** Specifies the themes for the Digital gauge. See Themes
      * @Default {flatlight}
      */
    var themes: js.UndefOr[String] = js.undefined
    
    /** Specifies the value to the DigitalGauge.
      * @Default {text}
      */
    var value: js.UndefOr[String] = js.undefined
    
    /** Specifies the width for the Digital gauge.
      * @Default {400}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.datavisualization.DigitalGauge.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.DigitalGauge.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.datavisualization.DigitalGauge.Model] (val x: Self) extends AnyVal {
      
      inline def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "Click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "Click", js.undefined)
      
      inline def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
      
      inline def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
      
      inline def setEnableResize(value: Boolean): Self = StObject.set(x, "enableResize", value.asInstanceOf[js.Any])
      
      inline def setEnableResizeUndefined: Self = StObject.set(x, "enableResize", js.undefined)
      
      inline def setExportSettings(value: ExportSettings): Self = StObject.set(x, "exportSettings", value.asInstanceOf[js.Any])
      
      inline def setExportSettingsUndefined: Self = StObject.set(x, "exportSettings", js.undefined)
      
      inline def setFrame(value: Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInit(value: /* e */ InitEventArgs => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setItemRendering(value: /* e */ ItemRenderingEventArgs => Unit): Self = StObject.set(x, "itemRendering", js.Any.fromFunction1(value))
      
      inline def setItemRenderingUndefined: Self = StObject.set(x, "itemRendering", js.undefined)
      
      inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setMatrixSegmentData(value: Any): Self = StObject.set(x, "matrixSegmentData", value.asInstanceOf[js.Any])
      
      inline def setMatrixSegmentDataUndefined: Self = StObject.set(x, "matrixSegmentData", js.undefined)
      
      inline def setRenderComplete(value: /* e */ RenderCompleteEventArgs => Unit): Self = StObject.set(x, "renderComplete", js.Any.fromFunction1(value))
      
      inline def setRenderCompleteUndefined: Self = StObject.set(x, "renderComplete", js.undefined)
      
      inline def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = StObject.set(x, "rightClick", js.Any.fromFunction1(value))
      
      inline def setRightClickUndefined: Self = StObject.set(x, "rightClick", js.undefined)
      
      inline def setSegmentData(value: Any): Self = StObject.set(x, "segmentData", value.asInstanceOf[js.Any])
      
      inline def setSegmentDataUndefined: Self = StObject.set(x, "segmentData", js.undefined)
      
      inline def setThemes(value: String): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
      
      inline def setThemesUndefined: Self = StObject.set(x, "themes", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait RenderCompleteEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the context element
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /** returns the all the options of the items.
      */
    var items: js.UndefOr[Any] = js.undefined
    
    /** returns the gauge model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the object of the gauge.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RenderCompleteEventArgs {
    
    inline def apply(): RenderCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderCompleteEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderCompleteEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RightClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - X and Y co-ordinate of the points with respect to digital gauge area.id - ID of the target element.    size - Width and height of the digital gauge.    pageX -
      * x-coordinate of the pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the digital gauge model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RightClickEventArgs {
    
    inline def apply(): RightClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RightClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RightClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
