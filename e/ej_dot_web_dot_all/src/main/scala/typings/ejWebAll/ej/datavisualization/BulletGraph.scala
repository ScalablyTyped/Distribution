package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulletGraph extends Widget_ {
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_BulletGraph: Model = js.native
  
  /** To redraw the bullet graph
    * @returns {void}
    */
  def redraw(): Unit = js.native
  
  /** To set the value for comparative measure in bullet graph.
    * @param {number} value for the graph
    * @param {number} value for the graph
    * @returns {void}
    */
  def setComparativeMeasureSymbol(index: Double, measure: Double): Unit = js.native
  
  /** To set the value for feature measure bar.
    * @param {number} value for the graph
    * @param {number} value for the graph
    * @returns {void}
    */
  def setFeatureMeasureBarValue(index: Double, measure: Double): Unit = js.native
}
object BulletGraph {
  
  @js.native
  sealed trait FlowDirection extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.FlowDirection")
  @js.native
  object FlowDirection extends StObject {
    
    //string
    @js.native
    sealed trait Backward extends FlowDirection
    
    //string
    @js.native
    sealed trait Forward extends FlowDirection
  }
  
  @js.native
  sealed trait FontStyle extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    //string
    @js.native
    sealed trait Italic extends FontStyle
    
    //string
    @js.native
    sealed trait Normal extends FontStyle
    
    //string
    @js.native
    sealed trait Oblique extends FontStyle
  }
  
  @js.native
  sealed trait FontWeight extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    //string
    @js.native
    sealed trait Bold extends FontWeight
    
    //string
    @js.native
    sealed trait Bolder extends FontWeight
    
    //string
    @js.native
    sealed trait Lighter extends FontWeight
    
    //string
    @js.native
    sealed trait Normal extends FontWeight
  }
  
  @js.native
  sealed trait LabelPlacement extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.LabelPlacement")
  @js.native
  object LabelPlacement extends StObject {
    
    //string
    @js.native
    sealed trait Inside extends LabelPlacement
    
    //string
    @js.native
    sealed trait Outside extends LabelPlacement
  }
  
  @js.native
  sealed trait LabelPosition extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.LabelPosition")
  @js.native
  object LabelPosition extends StObject {
    
    //string
    @js.native
    sealed trait Above extends LabelPosition
    
    //string
    @js.native
    sealed trait Below extends LabelPosition
  }
  
  @js.native
  sealed trait Orientation extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.Orientation")
  @js.native
  object Orientation extends StObject {
    
    //string
    @js.native
    sealed trait Horizontal extends Orientation
    
    //string
    @js.native
    sealed trait Vertical extends Orientation
  }
  
  @js.native
  sealed trait TextAlignment extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.TextAlignment")
  @js.native
  object TextAlignment extends StObject {
    
    //string
    @js.native
    sealed trait Center extends TextAlignment
    
    //string
    @js.native
    sealed trait Far extends TextAlignment
    
    //string
    @js.native
    sealed trait Near extends TextAlignment
  }
  
  @js.native
  sealed trait TextAnchor extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.TextAnchor")
  @js.native
  object TextAnchor extends StObject {
    
    //string
    @js.native
    sealed trait End extends TextAnchor
    
    //string
    @js.native
    sealed trait Middle extends TextAnchor
    
    //string
    @js.native
    sealed trait Start extends TextAnchor
  }
  
  @js.native
  sealed trait TextPosition extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.TextPosition")
  @js.native
  object TextPosition extends StObject {
    
    //string
    @js.native
    sealed trait Bottom extends TextPosition
    
    //string
    @js.native
    sealed trait Float extends TextPosition
    
    //string
    @js.native
    sealed trait Left extends TextPosition
    
    //string
    @js.native
    sealed trait Right extends TextPosition
    
    //string
    @js.native
    sealed trait Top extends TextPosition
  }
  
  @js.native
  sealed trait TickPlacement extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.TickPlacement")
  @js.native
  object TickPlacement extends StObject {
    
    //string
    @js.native
    sealed trait Inside extends TickPlacement
    
    //string
    @js.native
    sealed trait Outside extends TickPlacement
  }
  
  @js.native
  sealed trait TickPosition extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.TickPosition")
  @js.native
  object TickPosition extends StObject {
    
    //string
    @js.native
    sealed trait Above extends TickPosition
    
    //string
    @js.native
    sealed trait Below extends TickPosition
    
    //string
    @js.native
    sealed trait Cross extends TickPosition
  }
  
  @js.native
  trait CaptionSettings extends StObject {
    
    /** Specifies whether trim the labels will be true or false.
      * @Default {true}
      */
    var enableTrim: js.UndefOr[Boolean] = js.native
    
    /** Contains property to customize the font of caption.
      */
    var font: js.UndefOr[CaptionSettingsFont] = js.native
    
    /** Contains property to customize the indicator.
      */
    var indicator: js.UndefOr[CaptionSettingsIndicator] = js.native
    
    /** Contains property to customize the location.
      */
    var location: js.UndefOr[CaptionSettingsLocation] = js.native
    
    /** Specifies the padding to be applied when text position is used.
      * @Default {5}
      */
    var padding: js.UndefOr[Double] = js.native
    
    /** Contains property to customize the subtitle.
      */
    var subTitle: js.UndefOr[CaptionSettingsSubTitle] = js.native
    
    /** Specifies the text to be displayed on bullet graph.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Specifies the alignment of caption text with respect to scale. This property will not be applied when text position is float.
      * @Default {'Near'}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.native
    
    /** Specifies caption text anchoring when caption text overlaps with other caption group text. Text will be anchored when overlapping caption group text are at same position.
      * Anchoring is not applicable for float position.
      * @Default {'start'}
      */
    var textAnchor: js.UndefOr[TextAnchor | String] = js.native
    
    /** Specifies the angel in which the caption is rendered.
      * @Default {0}
      */
    var textAngle: js.UndefOr[Double] = js.native
    
    /** Specifies how caption text should be placed.
      * @Default {'float'}
      */
    var textPosition: js.UndefOr[TextPosition | String] = js.native
  }
  object CaptionSettings {
    
    @scala.inline
    def apply(): CaptionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettings]
    }
    
    @scala.inline
    implicit class CaptionSettingsMutableBuilder[Self <: CaptionSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      @scala.inline
      def setFont(value: CaptionSettingsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setIndicator(value: CaptionSettingsIndicator): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      @scala.inline
      def setLocation(value: CaptionSettingsLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setSubTitle(value: CaptionSettingsSubTitle): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      @scala.inline
      def setTextAnchor(value: TextAnchor | String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      @scala.inline
      def setTextAngle(value: Double): Self = StObject.set(x, "textAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAngleUndefined: Self = StObject.set(x, "textAngle", js.undefined)
      
      @scala.inline
      def setTextPosition(value: TextPosition | String): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait CaptionSettingsFont extends StObject {
    
    /** Specifies the color of the text in caption.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specifies the fontFamily of caption. Caption text render with this fontFamily
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Specifies the fontStyle of caption
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Specifies the fontWeight of caption
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Specifies the opacity of caption. Caption text render with this opacity.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specifies the size of caption. Caption text render with this size
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object CaptionSettingsFont {
    
    @scala.inline
    def apply(): CaptionSettingsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsFont]
    }
    
    @scala.inline
    implicit class CaptionSettingsFontMutableBuilder[Self <: CaptionSettingsFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait CaptionSettingsIndicator extends StObject {
    
    /** Contains property to customize the font of indicator.
      */
    var font: js.UndefOr[CaptionSettingsIndicatorFont] = js.native
    
    /** Contains property to customize the location of indicator.
      */
    var location: js.UndefOr[CaptionSettingsIndicatorLocation] = js.native
    
    /** Specifies the padding to be applied when text position is used.
      * @Default {2}
      */
    var padding: js.UndefOr[Double] = js.native
    
    /** Contains property to customize the symbol of indicator.
      */
    var symbol: js.UndefOr[CaptionSettingsIndicatorSymbol] = js.native
    
    /** Specifies the text to be displayed as indicator text. By default difference between current value and target will be displayed
      */
    var text: js.UndefOr[String] = js.native
    
    /** Specifies the alignment of indicator with respect to scale based on text position
      * @Default {'Near'}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.native
    
    /** Specifies where indicator text should be anchored when indicator overlaps with other caption group text. Text will be anchored when overlapping caption group text are at same
      * position. Anchoring is not applicable for float position.
      * @Default {'start'}
      */
    var textAnchor: js.UndefOr[TextAnchor | String] = js.native
    
    /** indicator text render in the specified angle.
      * @Default {0}
      */
    var textAngle: js.UndefOr[Double] = js.native
    
    /** Specifies where indicator should be placed
      * @Default {'float'}
      */
    var textPosition: js.UndefOr[TextPosition | String] = js.native
    
    /** Specifies the space between indicator symbol and text.
      * @Default {3}
      */
    var textSpacing: js.UndefOr[Double] = js.native
    
    /** Specifies whether indicator will be visible or not.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object CaptionSettingsIndicator {
    
    @scala.inline
    def apply(): CaptionSettingsIndicator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsIndicator]
    }
    
    @scala.inline
    implicit class CaptionSettingsIndicatorMutableBuilder[Self <: CaptionSettingsIndicator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFont(value: CaptionSettingsIndicatorFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setLocation(value: CaptionSettingsIndicatorLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setSymbol(value: CaptionSettingsIndicatorSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      @scala.inline
      def setTextAnchor(value: TextAnchor | String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      @scala.inline
      def setTextAngle(value: Double): Self = StObject.set(x, "textAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAngleUndefined: Self = StObject.set(x, "textAngle", js.undefined)
      
      @scala.inline
      def setTextPosition(value: TextPosition | String): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
      
      @scala.inline
      def setTextSpacing(value: Double): Self = StObject.set(x, "textSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSpacingUndefined: Self = StObject.set(x, "textSpacing", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait CaptionSettingsIndicatorFont extends StObject {
    
    /** Specifies the color of the indicator's text.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specifies the fontFamily of indicator. Indicator text render with this fontFamily.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Specifies the fontStyle of indicator. Indicator text render with this fontStyle. See FontStyle
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Specifies the fontWeight of indicator. Indicator text render with this fontWeight. See FontWeight
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Specifies the opacity of indicator text. Indicator text render with this Opacity.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specifies the size of indicator. Indicator text render with this size.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object CaptionSettingsIndicatorFont {
    
    @scala.inline
    def apply(): CaptionSettingsIndicatorFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsIndicatorFont]
    }
    
    @scala.inline
    implicit class CaptionSettingsIndicatorFontMutableBuilder[Self <: CaptionSettingsIndicatorFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait CaptionSettingsIndicatorLocation extends StObject {
    
    /** Specifies the horizontal position of the indicator.
      * @Default {10}
      */
    var x: js.UndefOr[Double] = js.native
    
    /** Specifies the vertical position of the indicator.
      * @Default {60}
      */
    var y: js.UndefOr[Double] = js.native
  }
  object CaptionSettingsIndicatorLocation {
    
    @scala.inline
    def apply(): CaptionSettingsIndicatorLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsIndicatorLocation]
    }
    
    @scala.inline
    implicit class CaptionSettingsIndicatorLocationMutableBuilder[Self <: CaptionSettingsIndicatorLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait CaptionSettingsIndicatorSymbol extends StObject {
    
    /** Contains property to customize the border of indicator symbol.
      */
    var border: js.UndefOr[CaptionSettingsIndicatorSymbolBorder] = js.native
    
    /** Specifies the color of indicator symbol.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specifies the URL of image that represents indicator symbol.
      */
    var imageURL: js.UndefOr[String] = js.native
    
    /** Specifies the opacity of indicator symbol.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specifies the shape of indicator symbol.
      */
    var shape: js.UndefOr[String] = js.native
    
    /** Contains property to customize the size of indicator symbol.
      */
    var size: js.UndefOr[CaptionSettingsIndicatorSymbolSize] = js.native
  }
  object CaptionSettingsIndicatorSymbol {
    
    @scala.inline
    def apply(): CaptionSettingsIndicatorSymbol = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsIndicatorSymbol]
    }
    
    @scala.inline
    implicit class CaptionSettingsIndicatorSymbolMutableBuilder[Self <: CaptionSettingsIndicatorSymbol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: CaptionSettingsIndicatorSymbolBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setImageURL(value: String): Self = StObject.set(x, "imageURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageURLUndefined: Self = StObject.set(x, "imageURL", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: CaptionSettingsIndicatorSymbolSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait CaptionSettingsIndicatorSymbolBorder extends StObject {
    
    /** Specifies the border color of indicator symbol.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specifies the border width of indicator symbol.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CaptionSettingsIndicatorSymbolBorder {
    
    @scala.inline
    def apply(): CaptionSettingsIndicatorSymbolBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsIndicatorSymbolBorder]
    }
    
    @scala.inline
    implicit class CaptionSettingsIndicatorSymbolBorderMutableBuilder[Self <: CaptionSettingsIndicatorSymbolBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CaptionSettingsIndicatorSymbolSize extends StObject {
    
    /** Specifies the height of indicator symbol.
      * @Default {10}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Specifies the width of indicator symbol.
      * @Default {10}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CaptionSettingsIndicatorSymbolSize {
    
    @scala.inline
    def apply(): CaptionSettingsIndicatorSymbolSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsIndicatorSymbolSize]
    }
    
    @scala.inline
    implicit class CaptionSettingsIndicatorSymbolSizeMutableBuilder[Self <: CaptionSettingsIndicatorSymbolSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CaptionSettingsLocation extends StObject {
    
    /** Specifies the position in horizontal direction
      * @Default {17}
      */
    var x: js.UndefOr[Double] = js.native
    
    /** Specifies the position in horizontal direction
      * @Default {30}
      */
    var y: js.UndefOr[Double] = js.native
  }
  object CaptionSettingsLocation {
    
    @scala.inline
    def apply(): CaptionSettingsLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsLocation]
    }
    
    @scala.inline
    implicit class CaptionSettingsLocationMutableBuilder[Self <: CaptionSettingsLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait CaptionSettingsSubTitle extends StObject {
    
    /** Contains property to customize the font of subtitle.
      */
    var font: js.UndefOr[CaptionSettingsSubTitleFont] = js.native
    
    /** Contains property to customize the location of subtitle.
      */
    var location: js.UndefOr[CaptionSettingsSubTitleLocation] = js.native
    
    /** Specifies the padding to be applied when text position is used.
      * @Default {5}
      */
    var padding: js.UndefOr[Double] = js.native
    
    /** Specifies the text to be displayed as subtitle.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Specifies the alignment of sub title text with respect to scale. Alignment will not be applied in float position.
      * @Default {'Near'}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.native
    
    /** Specifies where subtitle text should be anchored when sub title text overlaps with other caption group text. Text will be anchored when overlapping caption group text are at same
      * position. Anchoring is not applicable for float position.
      * @Default {'start'}
      */
    var textAnchor: js.UndefOr[TextAnchor | String] = js.native
    
    /** Subtitle render in the specified angle.
      * @Default {0}
      */
    var textAngle: js.UndefOr[Double] = js.native
    
    /** Specifies where sub title text should be placed.
      * @Default {'float'}
      */
    var textPosition: js.UndefOr[TextPosition | String] = js.native
  }
  object CaptionSettingsSubTitle {
    
    @scala.inline
    def apply(): CaptionSettingsSubTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsSubTitle]
    }
    
    @scala.inline
    implicit class CaptionSettingsSubTitleMutableBuilder[Self <: CaptionSettingsSubTitle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFont(value: CaptionSettingsSubTitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setLocation(value: CaptionSettingsSubTitleLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      @scala.inline
      def setTextAnchor(value: TextAnchor | String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      @scala.inline
      def setTextAngle(value: Double): Self = StObject.set(x, "textAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAngleUndefined: Self = StObject.set(x, "textAngle", js.undefined)
      
      @scala.inline
      def setTextPosition(value: TextPosition | String): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait CaptionSettingsSubTitleFont extends StObject {
    
    /** Specifies the color of the subtitle's text.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specifies the fontFamily of subtitle. Subtitle text render with this fontFamily.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Specifies the fontStyle of subtitle. Subtitle text render with this fontStyle. See FontStyle
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Specifies the fontWeight of subtitle. Subtitle text render with this fontWeight. See FontWeight
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Specifies the opacity of subtitle. Subtitle text render with this opacity.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specifies the size of subtitle. Subtitle text render with this size.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object CaptionSettingsSubTitleFont {
    
    @scala.inline
    def apply(): CaptionSettingsSubTitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsSubTitleFont]
    }
    
    @scala.inline
    implicit class CaptionSettingsSubTitleFontMutableBuilder[Self <: CaptionSettingsSubTitleFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait CaptionSettingsSubTitleLocation extends StObject {
    
    /** Specifies the horizontal position of the subtitle.
      * @Default {10}
      */
    var x: js.UndefOr[Double] = js.native
    
    /** Specifies the vertical position of the subtitle.
      * @Default {45}
      */
    var y: js.UndefOr[Double] = js.native
  }
  object CaptionSettingsSubTitleLocation {
    
    @scala.inline
    def apply(): CaptionSettingsSubTitleLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsSubTitleLocation]
    }
    
    @scala.inline
    implicit class CaptionSettingsSubTitleLocationMutableBuilder[Self <: CaptionSettingsSubTitleLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait ClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - X and Y co-ordinate of the points with respect to bullet graph area.id - ID of the target element.    size - Width and height of the bullet graph.    pageX -
      * x-coordinate of the pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the bullet graph model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ClickEventArgs {
    
    @scala.inline
    def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    @scala.inline
    implicit class ClickEventArgsMutableBuilder[Self <: ClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DoubleClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - X and Y co-ordinate of the points with respect to bullet graph area.id - ID of the target element.    size - Width and height of the bullet graph.    pageX -
      * x-coordinate of the pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the bullet graph model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DoubleClickEventArgs {
    
    @scala.inline
    def apply(): DoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleClickEventArgs]
    }
    
    @scala.inline
    implicit class DoubleClickEventArgsMutableBuilder[Self <: DoubleClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DrawCaptionEventArgs extends StObject {
    
    /** returns the object of the bullet graph.
      */
    var Object: js.UndefOr[js.Any] = js.native
    
    /** returns the current captionSettings element.
      */
    var captionElement: js.UndefOr[HTMLElement] = js.native
    
    /** returns the type of the captionSettings.
      */
    var captionType: js.UndefOr[String] = js.native
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[HTMLElement] = js.native
  }
  object DrawCaptionEventArgs {
    
    @scala.inline
    def apply(): DrawCaptionEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawCaptionEventArgs]
    }
    
    @scala.inline
    implicit class DrawCaptionEventArgsMutableBuilder[Self <: DrawCaptionEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptionElement(value: HTMLElement): Self = StObject.set(x, "captionElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionElementUndefined: Self = StObject.set(x, "captionElement", js.undefined)
      
      @scala.inline
      def setCaptionType(value: String): Self = StObject.set(x, "captionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionTypeUndefined: Self = StObject.set(x, "captionType", js.undefined)
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "Object", js.undefined)
      
      @scala.inline
      def setScaleElement(value: HTMLElement): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
    }
  }
  
  @js.native
  trait DrawCategoryEventArgs extends StObject {
    
    /** returns the object of the bullet graph.
      */
    var Object: js.UndefOr[js.Any] = js.native
    
    /** returns the text value of the category that is drawn.
      */
    var Value: js.UndefOr[String] = js.native
    
    /** returns the options of category element.
      */
    var categoryElement: js.UndefOr[HTMLElement] = js.native
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[HTMLElement] = js.native
  }
  object DrawCategoryEventArgs {
    
    @scala.inline
    def apply(): DrawCategoryEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawCategoryEventArgs]
    }
    
    @scala.inline
    implicit class DrawCategoryEventArgsMutableBuilder[Self <: DrawCategoryEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategoryElement(value: HTMLElement): Self = StObject.set(x, "categoryElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryElementUndefined: Self = StObject.set(x, "categoryElement", js.undefined)
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "Object", js.undefined)
      
      @scala.inline
      def setScaleElement(value: HTMLElement): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  @js.native
  trait DrawComparativeMeasureSymbolEventArgs extends StObject {
    
    /** returns the object of the bullet graph.
      */
    var Object: js.UndefOr[js.Any] = js.native
    
    /** returns the value of the comparative measure symbol.
      */
    var Value: js.UndefOr[Double] = js.native
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[HTMLElement] = js.native
    
    /** returns the options of comparative measure element.
      */
    var targetElement: js.UndefOr[HTMLElement] = js.native
  }
  object DrawComparativeMeasureSymbolEventArgs {
    
    @scala.inline
    def apply(): DrawComparativeMeasureSymbolEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawComparativeMeasureSymbolEventArgs]
    }
    
    @scala.inline
    implicit class DrawComparativeMeasureSymbolEventArgsMutableBuilder[Self <: DrawComparativeMeasureSymbolEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "Object", js.undefined)
      
      @scala.inline
      def setScaleElement(value: HTMLElement): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      @scala.inline
      def setTargetElement(value: HTMLElement): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementUndefined: Self = StObject.set(x, "targetElement", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  @js.native
  trait DrawFeatureMeasureBarEventArgs extends StObject {
    
    /** returns the object of the bullet graph.
      */
    var Object: js.UndefOr[js.Any] = js.native
    
    /** returns the value of the feature measure bar.
      */
    var Value: js.UndefOr[Double] = js.native
    
    /** returns the options of feature measure element.
      */
    var currentElement: js.UndefOr[HTMLElement] = js.native
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[HTMLElement] = js.native
  }
  object DrawFeatureMeasureBarEventArgs {
    
    @scala.inline
    def apply(): DrawFeatureMeasureBarEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawFeatureMeasureBarEventArgs]
    }
    
    @scala.inline
    implicit class DrawFeatureMeasureBarEventArgsMutableBuilder[Self <: DrawFeatureMeasureBarEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentElement(value: HTMLElement): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "Object", js.undefined)
      
      @scala.inline
      def setScaleElement(value: HTMLElement): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  @js.native
  trait DrawIndicatorEventArgs extends StObject {
    
    /** for canceling the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns an object to customize bullet graph indicator text and symbol before rendering it.
      */
    var indicatorSettings: js.UndefOr[js.Any] = js.native
    
    /** returns the object of bullet graph.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the type of event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DrawIndicatorEventArgs {
    
    @scala.inline
    def apply(): DrawIndicatorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawIndicatorEventArgs]
    }
    
    @scala.inline
    implicit class DrawIndicatorEventArgsMutableBuilder[Self <: DrawIndicatorEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setIndicatorSettings(value: js.Any): Self = StObject.set(x, "indicatorSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorSettingsUndefined: Self = StObject.set(x, "indicatorSettings", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DrawLabelsEventArgs extends StObject {
    
    /** returns the object of the bullet graph.
      */
    var Object: js.UndefOr[js.Any] = js.native
    
    /** returns the label type.
      */
    var labelType: js.UndefOr[String] = js.native
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[HTMLElement] = js.native
    
    /** returns the current label element.
      */
    var tickElement: js.UndefOr[HTMLElement] = js.native
  }
  object DrawLabelsEventArgs {
    
    @scala.inline
    def apply(): DrawLabelsEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawLabelsEventArgs]
    }
    
    @scala.inline
    implicit class DrawLabelsEventArgsMutableBuilder[Self <: DrawLabelsEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabelType(value: String): Self = StObject.set(x, "labelType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelTypeUndefined: Self = StObject.set(x, "labelType", js.undefined)
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "Object", js.undefined)
      
      @scala.inline
      def setScaleElement(value: HTMLElement): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      @scala.inline
      def setTickElement(value: HTMLElement): Self = StObject.set(x, "tickElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickElementUndefined: Self = StObject.set(x, "tickElement", js.undefined)
    }
  }
  
  @js.native
  trait DrawQualitativeRangesEventArgs extends StObject {
    
    /** returns the object of the bullet graph.
      */
    var Object: js.UndefOr[js.Any] = js.native
    
    /** returns the end value of current range.
      */
    var rangeEndValue: js.UndefOr[Double] = js.native
    
    /** returns the index of current range.
      */
    var rangeIndex: js.UndefOr[Double] = js.native
    
    /** returns the settings for current range.
      */
    var rangeOptions: js.UndefOr[js.Any] = js.native
  }
  object DrawQualitativeRangesEventArgs {
    
    @scala.inline
    def apply(): DrawQualitativeRangesEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawQualitativeRangesEventArgs]
    }
    
    @scala.inline
    implicit class DrawQualitativeRangesEventArgsMutableBuilder[Self <: DrawQualitativeRangesEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "Object", js.undefined)
      
      @scala.inline
      def setRangeEndValue(value: Double): Self = StObject.set(x, "rangeEndValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeEndValueUndefined: Self = StObject.set(x, "rangeEndValue", js.undefined)
      
      @scala.inline
      def setRangeIndex(value: Double): Self = StObject.set(x, "rangeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeIndexUndefined: Self = StObject.set(x, "rangeIndex", js.undefined)
      
      @scala.inline
      def setRangeOptions(value: js.Any): Self = StObject.set(x, "rangeOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeOptionsUndefined: Self = StObject.set(x, "rangeOptions", js.undefined)
    }
  }
  
  @js.native
  trait DrawTicksEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the interval value.
      */
    var interval: js.UndefOr[Double] = js.native
    
    /** returns the settings for majorTicks.
      */
    var majorTickSettings: js.UndefOr[js.Any] = js.native
    
    /** returns the maximum value.
      */
    var maximum: js.UndefOr[Double] = js.native
    
    /** returns the minimum value.
      */
    var minimum: js.UndefOr[Double] = js.native
    
    /** returns the value of minorTicksPerInterval.
      */
    var minorTickPerInterval: js.UndefOr[Double] = js.native
    
    /** returns the settings for minorTicks.
      */
    var minorTickSettings: js.UndefOr[js.Any] = js.native
    
    /** returns the model of the bullet graph.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DrawTicksEventArgs {
    
    @scala.inline
    def apply(): DrawTicksEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawTicksEventArgs]
    }
    
    @scala.inline
    implicit class DrawTicksEventArgsMutableBuilder[Self <: DrawTicksEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setMajorTickSettings(value: js.Any): Self = StObject.set(x, "majorTickSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorTickSettingsUndefined: Self = StObject.set(x, "majorTickSettings", js.undefined)
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      @scala.inline
      def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      @scala.inline
      def setMinorTickPerInterval(value: Double): Self = StObject.set(x, "minorTickPerInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorTickPerIntervalUndefined: Self = StObject.set(x, "minorTickPerInterval", js.undefined)
      
      @scala.inline
      def setMinorTickSettings(value: js.Any): Self = StObject.set(x, "minorTickSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorTickSettingsUndefined: Self = StObject.set(x, "minorTickSettings", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait LoadEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the model of the bullet graph.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
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
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Fires, on clicking the bullet graph.
      */
    var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
    
    /** Toggles the visibility of the range stroke color of the labels.
      * @Default {false}
      */
    var applyRangeStrokeToLabels: js.UndefOr[Boolean] = js.native
    
    /** Toggles the visibility of the range stroke color of the ticks.
      * @Default {false}
      */
    var applyRangeStrokeToTicks: js.UndefOr[Boolean] = js.native
    
    /** Contains property to customize the caption in bullet graph.
      */
    var captionSettings: js.UndefOr[CaptionSettings] = js.native
    
    /** Comparative measure bar in bullet graph render till the specified value.
      * @Default {0}
      */
    var comparativeMeasureValue: js.UndefOr[Double] = js.native
    
    /** Fires, on double clicking the bullet graph.
      */
    var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
    
    /** Fires on rendering the caption of bullet graph.
      */
    var drawCaption: js.UndefOr[js.Function1[/* e */ DrawCaptionEventArgs, Unit]] = js.native
    
    /** Fires on rendering the category.
      */
    var drawCategory: js.UndefOr[js.Function1[/* e */ DrawCategoryEventArgs, Unit]] = js.native
    
    /** Fires on rendering the comparative measure symbol.
      */
    var drawComparativeMeasureSymbol: js.UndefOr[js.Function1[/* e */ DrawComparativeMeasureSymbolEventArgs, Unit]] = js.native
    
    /** Fires on rendering the feature measure bar.
      */
    var drawFeatureMeasureBar: js.UndefOr[js.Function1[/* e */ DrawFeatureMeasureBarEventArgs, Unit]] = js.native
    
    /** Fires on rendering the indicator of bullet graph.
      */
    var drawIndicator: js.UndefOr[js.Function1[/* e */ DrawIndicatorEventArgs, Unit]] = js.native
    
    /** Fires on rendering the labels.
      */
    var drawLabels: js.UndefOr[js.Function1[/* e */ DrawLabelsEventArgs, Unit]] = js.native
    
    /** Fires on rendering the qualitative ranges.
      */
    var drawQualitativeRanges: js.UndefOr[js.Function1[/* e */ DrawQualitativeRangesEventArgs, Unit]] = js.native
    
    /** Fires on rendering the ticks.
      */
    var drawTicks: js.UndefOr[js.Function1[/* e */ DrawTicksEventArgs, Unit]] = js.native
    
    /** Toggles the animation of bullet graph.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Specifies to convert the date object to string, using locale settings.
      * @Default {false}
      */
    var enableGroupSeparator: js.UndefOr[Boolean] = js.native
    
    /** Controls whether bullet graph has to be responsive while resizing.
      * @Default {true}
      */
    var enableResizing: js.UndefOr[Boolean] = js.native
    
    /** Specifies the direction of flow in bullet graph. Neither it may be backward nor forward.
      * @Default {forward}
      */
    var flowDirection: js.UndefOr[FlowDirection | String] = js.native
    
    /** Specifies the height of the bullet graph.
      * @Default {90}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Sets a value whether to make the bullet graph responsive on resize.
      * @Default {true}
      */
    var isResponsive: js.UndefOr[Boolean] = js.native
    
    /** Fires on loading bullet graph.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
    
    /** Name of the culture based on which bulletgraph should be localized.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.native
    
    /** Bullet graph will render in the specified orientation.
      * @Default {horizontal}
      */
    var orientation: js.UndefOr[typings.ejWebAll.ej.Orientation | String] = js.native
    
    /** Size of the qualitative range depends up on the specified value.
      * @Default {32}
      */
    var qualitativeRangeSize: js.UndefOr[Double] = js.native
    
    /** Contains property to customize the qualitative ranges.
      */
    var qualitativeRanges: js.UndefOr[js.Array[QualitativeRange]] = js.native
    
    /** Length of the quantitative range depends up on the specified value.
      * @Default {475}
      */
    var quantitativeScaleLength: js.UndefOr[Double] = js.native
    
    /** Contains all the properties to customize quantitative scale.
      */
    var quantitativeScaleSettings: js.UndefOr[QuantitativeScaleSettings] = js.native
    
    /** Fires, on right clicking the bullet graph.
      */
    var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
    
    /** By specifying this property the user can change the theme of the bullet graph.
      * @Default {flatlight}
      */
    var theme: js.UndefOr[String] = js.native
    
    /** Contains all the properties to customize tooltip.
      */
    var tooltipSettings: js.UndefOr[TooltipSettings] = js.native
    
    /** Feature measure bar in bullet graph render till the specified value.
      * @Default {0}
      */
    var value: js.UndefOr[Double] = js.native
    
    /** Specifies the width of the bullet graph.
      * @Default {595}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.datavisualization.BulletGraph.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.BulletGraph.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.datavisualization.BulletGraph.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyRangeStrokeToLabels(value: Boolean): Self = StObject.set(x, "applyRangeStrokeToLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyRangeStrokeToLabelsUndefined: Self = StObject.set(x, "applyRangeStrokeToLabels", js.undefined)
      
      @scala.inline
      def setApplyRangeStrokeToTicks(value: Boolean): Self = StObject.set(x, "applyRangeStrokeToTicks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyRangeStrokeToTicksUndefined: Self = StObject.set(x, "applyRangeStrokeToTicks", js.undefined)
      
      @scala.inline
      def setCaptionSettings(value: CaptionSettings): Self = StObject.set(x, "captionSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionSettingsUndefined: Self = StObject.set(x, "captionSettings", js.undefined)
      
      @scala.inline
      def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "Click", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "Click", js.undefined)
      
      @scala.inline
      def setComparativeMeasureValue(value: Double): Self = StObject.set(x, "comparativeMeasureValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparativeMeasureValueUndefined: Self = StObject.set(x, "comparativeMeasureValue", js.undefined)
      
      @scala.inline
      def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
      
      @scala.inline
      def setDrawCaption(value: /* e */ DrawCaptionEventArgs => Unit): Self = StObject.set(x, "drawCaption", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawCaptionUndefined: Self = StObject.set(x, "drawCaption", js.undefined)
      
      @scala.inline
      def setDrawCategory(value: /* e */ DrawCategoryEventArgs => Unit): Self = StObject.set(x, "drawCategory", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawCategoryUndefined: Self = StObject.set(x, "drawCategory", js.undefined)
      
      @scala.inline
      def setDrawComparativeMeasureSymbol(value: /* e */ DrawComparativeMeasureSymbolEventArgs => Unit): Self = StObject.set(x, "drawComparativeMeasureSymbol", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawComparativeMeasureSymbolUndefined: Self = StObject.set(x, "drawComparativeMeasureSymbol", js.undefined)
      
      @scala.inline
      def setDrawFeatureMeasureBar(value: /* e */ DrawFeatureMeasureBarEventArgs => Unit): Self = StObject.set(x, "drawFeatureMeasureBar", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawFeatureMeasureBarUndefined: Self = StObject.set(x, "drawFeatureMeasureBar", js.undefined)
      
      @scala.inline
      def setDrawIndicator(value: /* e */ DrawIndicatorEventArgs => Unit): Self = StObject.set(x, "drawIndicator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawIndicatorUndefined: Self = StObject.set(x, "drawIndicator", js.undefined)
      
      @scala.inline
      def setDrawLabels(value: /* e */ DrawLabelsEventArgs => Unit): Self = StObject.set(x, "drawLabels", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawLabelsUndefined: Self = StObject.set(x, "drawLabels", js.undefined)
      
      @scala.inline
      def setDrawQualitativeRanges(value: /* e */ DrawQualitativeRangesEventArgs => Unit): Self = StObject.set(x, "drawQualitativeRanges", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawQualitativeRangesUndefined: Self = StObject.set(x, "drawQualitativeRanges", js.undefined)
      
      @scala.inline
      def setDrawTicks(value: /* e */ DrawTicksEventArgs => Unit): Self = StObject.set(x, "drawTicks", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrawTicksUndefined: Self = StObject.set(x, "drawTicks", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setEnableGroupSeparator(value: Boolean): Self = StObject.set(x, "enableGroupSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGroupSeparatorUndefined: Self = StObject.set(x, "enableGroupSeparator", js.undefined)
      
      @scala.inline
      def setEnableResizing(value: Boolean): Self = StObject.set(x, "enableResizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableResizingUndefined: Self = StObject.set(x, "enableResizing", js.undefined)
      
      @scala.inline
      def setFlowDirection(value: FlowDirection | String): Self = StObject.set(x, "flowDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowDirectionUndefined: Self = StObject.set(x, "flowDirection", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setOrientation(value: typings.ejWebAll.ej.Orientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setQualitativeRangeSize(value: Double): Self = StObject.set(x, "qualitativeRangeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualitativeRangeSizeUndefined: Self = StObject.set(x, "qualitativeRangeSize", js.undefined)
      
      @scala.inline
      def setQualitativeRanges(value: js.Array[QualitativeRange]): Self = StObject.set(x, "qualitativeRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualitativeRangesUndefined: Self = StObject.set(x, "qualitativeRanges", js.undefined)
      
      @scala.inline
      def setQualitativeRangesVarargs(value: QualitativeRange*): Self = StObject.set(x, "qualitativeRanges", js.Array(value :_*))
      
      @scala.inline
      def setQuantitativeScaleLength(value: Double): Self = StObject.set(x, "quantitativeScaleLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantitativeScaleLengthUndefined: Self = StObject.set(x, "quantitativeScaleLength", js.undefined)
      
      @scala.inline
      def setQuantitativeScaleSettings(value: QuantitativeScaleSettings): Self = StObject.set(x, "quantitativeScaleSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantitativeScaleSettingsUndefined: Self = StObject.set(x, "quantitativeScaleSettings", js.undefined)
      
      @scala.inline
      def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = StObject.set(x, "rightClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRightClickUndefined: Self = StObject.set(x, "rightClick", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTooltipSettings(value: TooltipSettings): Self = StObject.set(x, "tooltipSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipSettingsUndefined: Self = StObject.set(x, "tooltipSettings", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait QualitativeRange extends StObject {
    
    /** Specifies the ending range to which the qualitative ranges will render.
      * @Default {3}
      */
    var rangeEnd: js.UndefOr[Double] = js.native
    
    /** Specifies the opacity for the qualitative ranges.
      * @Default {1}
      */
    var rangeOpacity: js.UndefOr[Double] = js.native
    
    /** Specifies the stroke for the qualitative ranges.
      * @Default {null}
      */
    var rangeStroke: js.UndefOr[String] = js.native
  }
  object QualitativeRange {
    
    @scala.inline
    def apply(): QualitativeRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QualitativeRange]
    }
    
    @scala.inline
    implicit class QualitativeRangeMutableBuilder[Self <: QualitativeRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRangeEnd(value: Double): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeEndUndefined: Self = StObject.set(x, "rangeEnd", js.undefined)
      
      @scala.inline
      def setRangeOpacity(value: Double): Self = StObject.set(x, "rangeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeOpacityUndefined: Self = StObject.set(x, "rangeOpacity", js.undefined)
      
      @scala.inline
      def setRangeStroke(value: String): Self = StObject.set(x, "rangeStroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeStrokeUndefined: Self = StObject.set(x, "rangeStroke", js.undefined)
    }
  }
  
  @js.native
  trait QuantitativeScaleSettings extends StObject {
    
    /** Contains property to customize the comparative measure.
      */
    var comparativeMeasureSettings: js.UndefOr[QuantitativeScaleSettingsComparativeMeasureSettings] = js.native
    
    /** Contains property to customize the featured measure.
      */
    var featureMeasures: js.UndefOr[js.Array[QuantitativeScaleSettingsFeatureMeasure]] = js.native
    
    /** Contains property to customize the featured measure.
      */
    var featuredMeasureSettings: js.UndefOr[QuantitativeScaleSettingsFeaturedMeasureSettings] = js.native
    
    /** Contains property to customize the fields.
      */
    var fields: js.UndefOr[QuantitativeScaleSettingsFields] = js.native
    
    /** Specifies the interval for the Graph.
      * @Default {1}
      */
    var interval: js.UndefOr[Double] = js.native
    
    /** Contains property to customize the labels.
      */
    var labelSettings: js.UndefOr[QuantitativeScaleSettingsLabelSettings] = js.native
    
    /** Contains property to customize the position of the quantitative scale
      */
    var location: js.UndefOr[QuantitativeScaleSettingsLocation] = js.native
    
    /** Contains property to customize the major tick lines.
      */
    var majorTickSettings: js.UndefOr[QuantitativeScaleSettingsMajorTickSettings] = js.native
    
    /** Specifies the maximum value of the Graph.
      * @Default {10}
      */
    var maximum: js.UndefOr[Double] = js.native
    
    /** Specifies the minimum value of the Graph.
      * @Default {0}
      */
    var minimum: js.UndefOr[Double] = js.native
    
    /** Contains property to customize the minor ticks.
      */
    var minorTickSettings: js.UndefOr[QuantitativeScaleSettingsMinorTickSettings] = js.native
    
    /** The specified number of minor ticks will be rendered per interval.
      * @Default {4}
      */
    var minorTicksPerInterval: js.UndefOr[Double] = js.native
    
    /** Specifies the placement of ticks to render either inside or outside the scale.
      * @Default {ej.datavisualization.BulletGraph.TickPlacement.Outside}
      */
    var tickPlacement: js.UndefOr[TickPlacement | String] = js.native
    
    /** Specifies the position of the ticks to render either above,below or inside
      * @Default {ej.datavisualization.BulletGraph.TickPosition.Far}
      */
    var tickPosition: js.UndefOr[TickPosition | String] = js.native
  }
  object QuantitativeScaleSettings {
    
    @scala.inline
    def apply(): QuantitativeScaleSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettings]
    }
    
    @scala.inline
    implicit class QuantitativeScaleSettingsMutableBuilder[Self <: QuantitativeScaleSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComparativeMeasureSettings(value: QuantitativeScaleSettingsComparativeMeasureSettings): Self = StObject.set(x, "comparativeMeasureSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparativeMeasureSettingsUndefined: Self = StObject.set(x, "comparativeMeasureSettings", js.undefined)
      
      @scala.inline
      def setFeatureMeasures(value: js.Array[QuantitativeScaleSettingsFeatureMeasure]): Self = StObject.set(x, "featureMeasures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureMeasuresUndefined: Self = StObject.set(x, "featureMeasures", js.undefined)
      
      @scala.inline
      def setFeatureMeasuresVarargs(value: QuantitativeScaleSettingsFeatureMeasure*): Self = StObject.set(x, "featureMeasures", js.Array(value :_*))
      
      @scala.inline
      def setFeaturedMeasureSettings(value: QuantitativeScaleSettingsFeaturedMeasureSettings): Self = StObject.set(x, "featuredMeasureSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturedMeasureSettingsUndefined: Self = StObject.set(x, "featuredMeasureSettings", js.undefined)
      
      @scala.inline
      def setFields(value: QuantitativeScaleSettingsFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setLabelSettings(value: QuantitativeScaleSettingsLabelSettings): Self = StObject.set(x, "labelSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelSettingsUndefined: Self = StObject.set(x, "labelSettings", js.undefined)
      
      @scala.inline
      def setLocation(value: QuantitativeScaleSettingsLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMajorTickSettings(value: QuantitativeScaleSettingsMajorTickSettings): Self = StObject.set(x, "majorTickSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorTickSettingsUndefined: Self = StObject.set(x, "majorTickSettings", js.undefined)
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      @scala.inline
      def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      @scala.inline
      def setMinorTickSettings(value: QuantitativeScaleSettingsMinorTickSettings): Self = StObject.set(x, "minorTickSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorTickSettingsUndefined: Self = StObject.set(x, "minorTickSettings", js.undefined)
      
      @scala.inline
      def setMinorTicksPerInterval(value: Double): Self = StObject.set(x, "minorTicksPerInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorTicksPerIntervalUndefined: Self = StObject.set(x, "minorTicksPerInterval", js.undefined)
      
      @scala.inline
      def setTickPlacement(value: TickPlacement | String): Self = StObject.set(x, "tickPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickPlacementUndefined: Self = StObject.set(x, "tickPlacement", js.undefined)
      
      @scala.inline
      def setTickPosition(value: TickPosition | String): Self = StObject.set(x, "tickPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickPositionUndefined: Self = StObject.set(x, "tickPosition", js.undefined)
    }
  }
  
  @js.native
  trait QuantitativeScaleSettingsComparativeMeasureSettings extends StObject {
    
    /** Specifies the stroke of the comparative measure.
      * @Default {null}
      */
    var stroke: js.UndefOr[Double] = js.native
    
    /** Specifies the width of the comparative measure.
      * @Default {5}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object QuantitativeScaleSettingsComparativeMeasureSettings {
    
    @scala.inline
    def apply(): QuantitativeScaleSettingsComparativeMeasureSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsComparativeMeasureSettings]
    }
    
    @scala.inline
    implicit class QuantitativeScaleSettingsComparativeMeasureSettingsMutableBuilder[Self <: QuantitativeScaleSettingsComparativeMeasureSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStroke(value: Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait QuantitativeScaleSettingsFeatureMeasure extends StObject {
    
    /** Specifies the category of feature measure.
      * @Default {null}
      */
    var category: js.UndefOr[String] = js.native
    
    /** Comparative measure render till the specified value.
      * @Default {null}
      */
    var comparativeMeasureValue: js.UndefOr[Double] = js.native
    
    /** Feature measure render till the specified value.
      * @Default {null}
      */
    var value: js.UndefOr[Double] = js.native
  }
  object QuantitativeScaleSettingsFeatureMeasure {
    
    @scala.inline
    def apply(): QuantitativeScaleSettingsFeatureMeasure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsFeatureMeasure]
    }
    
    @scala.inline
    implicit class QuantitativeScaleSettingsFeatureMeasureMutableBuilder[Self <: QuantitativeScaleSettingsFeatureMeasure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setComparativeMeasureValue(value: Double): Self = StObject.set(x, "comparativeMeasureValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparativeMeasureValueUndefined: Self = StObject.set(x, "comparativeMeasureValue", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait QuantitativeScaleSettingsFeaturedMeasureSettings extends StObject {
    
    /** Specifies the Stroke of the featured measure in bullet graph.
      * @Default {null}
      */
    var stroke: js.UndefOr[Double] = js.native
    
    /** Specifies the width of the featured measure in bullet graph.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object QuantitativeScaleSettingsFeaturedMeasureSettings {
    
    @scala.inline
    def apply(): QuantitativeScaleSettingsFeaturedMeasureSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsFeaturedMeasureSettings]
    }
    
    @scala.inline
    implicit class QuantitativeScaleSettingsFeaturedMeasureSettingsMutableBuilder[Self <: QuantitativeScaleSettingsFeaturedMeasureSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStroke(value: Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait QuantitativeScaleSettingsFields extends StObject {
    
    /** Specifies the category of the bullet graph.
      * @Default {null}
      */
    var category: js.UndefOr[String] = js.native
    
    /** Comparative measure render based on the values in the specified field.
      * @Default {null}
      */
    var comparativeMeasure: js.UndefOr[String] = js.native
    
    /** Specifies the dataSource for the bullet graph.
      * @Default {null}
      */
    var dataSource: js.UndefOr[js.Any] = js.native
    
    /** Feature measure render based on the values in the specified field.
      * @Default {null}
      */
    var featureMeasures: js.UndefOr[String] = js.native
    
    /** Specifies the query for fetching the values form data source to render the bullet graph.
      * @Default {null}
      */
    var query: js.UndefOr[String] = js.native
    
    /** Specifies the name of the table.
      * @Default {null}
      */
    var tableName: js.UndefOr[String] = js.native
  }
  object QuantitativeScaleSettingsFields {
    
    @scala.inline
    def apply(): QuantitativeScaleSettingsFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsFields]
    }
    
    @scala.inline
    implicit class QuantitativeScaleSettingsFieldsMutableBuilder[Self <: QuantitativeScaleSettingsFields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setComparativeMeasure(value: String): Self = StObject.set(x, "comparativeMeasure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparativeMeasureUndefined: Self = StObject.set(x, "comparativeMeasure", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setFeatureMeasures(value: String): Self = StObject.set(x, "featureMeasures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureMeasuresUndefined: Self = StObject.set(x, "featureMeasures", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    }
  }
  
  @js.native
  trait QuantitativeScaleSettingsLabelSettings extends StObject {
    
    /** Contains property to customize the font of the labels in bullet graph.
      */
    var font: js.UndefOr[QuantitativeScaleSettingsLabelSettingsFont] = js.native
    
    /** Specifies the placement of labels in bullet graph scale.
      * @Default {outside}
      */
    var labelPlacement: js.UndefOr[LabelPlacement | String] = js.native
    
    /** Specifies the prefix to be added with labels in bullet graph.
      * @Default {Empty string}
      */
    var labelPrefix: js.UndefOr[String] = js.native
    
    /** Specifies the suffix to be added after labels in bullet graph.
      * @Default {Empty string}
      */
    var labelSuffix: js.UndefOr[String] = js.native
    
    /** Specifies the horizontal/vertical padding of labels.
      * @Default {15}
      */
    var offset: js.UndefOr[Double] = js.native
    
    /** Specifies the position of the labels to render either above or below the graph. See
      * @Default {below}
      */
    var position: js.UndefOr[LabelPosition | String] = js.native
    
    /** Specifies the Size of the labels.
      * @Default {12}
      */
    var size: js.UndefOr[Double] = js.native
    
    /** Specifies the stroke color of the labels in bullet graph.
      * @Default {null}
      */
    var stroke: js.UndefOr[String] = js.native
  }
  object QuantitativeScaleSettingsLabelSettings {
    
    @scala.inline
    def apply(): QuantitativeScaleSettingsLabelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsLabelSettings]
    }
    
    @scala.inline
    implicit class QuantitativeScaleSettingsLabelSettingsMutableBuilder[Self <: QuantitativeScaleSettingsLabelSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFont(value: QuantitativeScaleSettingsLabelSettingsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setLabelPlacement(value: LabelPlacement | String): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      @scala.inline
      def setLabelPrefix(value: String): Self = StObject.set(x, "labelPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPrefixUndefined: Self = StObject.set(x, "labelPrefix", js.undefined)
      
      @scala.inline
      def setLabelSuffix(value: String): Self = StObject.set(x, "labelSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelSuffixUndefined: Self = StObject.set(x, "labelSuffix", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPosition(value: LabelPosition | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
  
  @js.native
  trait QuantitativeScaleSettingsLabelSettingsFont extends StObject {
    
    /** Specifies the fontFamily of labels in bullet graph. Labels render with this fontFamily.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Specifies the fontStyle of labels in bullet graph. Labels render with this fontStyle. See FontStyle
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Specifies the fontWeight of labels in bullet graph. Labels render with this fontWeight. See FontWeight
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Specifies the opacity of labels in bullet graph. Labels render with this opacity
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
  }
  object QuantitativeScaleSettingsLabelSettingsFont {
    
    @scala.inline
    def apply(): QuantitativeScaleSettingsLabelSettingsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsLabelSettingsFont]
    }
    
    @scala.inline
    implicit class QuantitativeScaleSettingsLabelSettingsFontMutableBuilder[Self <: QuantitativeScaleSettingsLabelSettingsFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  @js.native
  trait QuantitativeScaleSettingsLocation extends StObject {
    
    /** This property specifies the x position for rendering quantitative scale.
      * @Default {10}
      */
    var x: js.UndefOr[Double] = js.native
    
    /** This property specifies the y position for rendering quantitative scale.
      * @Default {10}
      */
    var y: js.UndefOr[Double] = js.native
  }
  object QuantitativeScaleSettingsLocation {
    
    @scala.inline
    def apply(): QuantitativeScaleSettingsLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsLocation]
    }
    
    @scala.inline
    implicit class QuantitativeScaleSettingsLocationMutableBuilder[Self <: QuantitativeScaleSettingsLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait QuantitativeScaleSettingsMajorTickSettings extends StObject {
    
    /** Specifies the size of the major ticks.
      * @Default {13}
      */
    var size: js.UndefOr[Double] = js.native
    
    /** Specifies the stroke color of the major tick lines.
      * @Default {null}
      */
    var stroke: js.UndefOr[String] = js.native
    
    /** Specifies the width of the major tick lines.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object QuantitativeScaleSettingsMajorTickSettings {
    
    @scala.inline
    def apply(): QuantitativeScaleSettingsMajorTickSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsMajorTickSettings]
    }
    
    @scala.inline
    implicit class QuantitativeScaleSettingsMajorTickSettingsMutableBuilder[Self <: QuantitativeScaleSettingsMajorTickSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait QuantitativeScaleSettingsMinorTickSettings extends StObject {
    
    /** Specifies the size of minor ticks.
      * @Default {7}
      */
    var size: js.UndefOr[Double] = js.native
    
    /** Specifies the stroke color of minor ticks in bullet graph.
      * @Default {null}
      */
    var stroke: js.UndefOr[String] = js.native
    
    /** Specifies the width of the minor ticks in bullet graph.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object QuantitativeScaleSettingsMinorTickSettings {
    
    @scala.inline
    def apply(): QuantitativeScaleSettingsMinorTickSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsMinorTickSettings]
    }
    
    @scala.inline
    implicit class QuantitativeScaleSettingsMinorTickSettingsMutableBuilder[Self <: QuantitativeScaleSettingsMinorTickSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait RightClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** location - X and Y co-ordinate of the points with respect to bullet graph area.id - ID of the target element.    size - Width and height of the bullet graph.    pageX -
      * x-coordinate of the pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Instance of the bullet graph model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object RightClickEventArgs {
    
    @scala.inline
    def apply(): RightClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RightClickEventArgs]
    }
    
    @scala.inline
    implicit class RightClickEventArgsMutableBuilder[Self <: RightClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait TooltipSettings extends StObject {
    
    /** Specifies template for caption tooltip
      * @Default {null}
      */
    var captionTemplate: js.UndefOr[String] = js.native
    
    /** Toggles the visibility of caption tooltip
      * @Default {false}
      */
    var enableCaptionTooltip: js.UndefOr[Boolean] = js.native
    
    /** Specifies the ID of a div, which is to be displayed as tooltip.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.native
    
    /** Toggles the visibility of tooltip
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object TooltipSettings {
    
    @scala.inline
    def apply(): TooltipSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipSettings]
    }
    
    @scala.inline
    implicit class TooltipSettingsMutableBuilder[Self <: TooltipSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptionTemplate(value: String): Self = StObject.set(x, "captionTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionTemplateUndefined: Self = StObject.set(x, "captionTemplate", js.undefined)
      
      @scala.inline
      def setEnableCaptionTooltip(value: Boolean): Self = StObject.set(x, "enableCaptionTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCaptionTooltipUndefined: Self = StObject.set(x, "enableCaptionTooltip", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
