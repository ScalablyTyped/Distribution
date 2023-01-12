package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulletGraph
  extends StObject
     with Widget_ {
  
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
    sealed trait Backward
      extends StObject
         with FlowDirection
    
    //string
    @js.native
    sealed trait Forward
      extends StObject
         with FlowDirection
  }
  
  @js.native
  sealed trait FontStyle extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
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
    sealed trait Oblique
      extends StObject
         with FontStyle
  }
  
  @js.native
  sealed trait FontWeight extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    //string
    @js.native
    sealed trait Bold
      extends StObject
         with FontWeight
    
    //string
    @js.native
    sealed trait Bolder
      extends StObject
         with FontWeight
    
    //string
    @js.native
    sealed trait Lighter
      extends StObject
         with FontWeight
    
    //string
    @js.native
    sealed trait Normal
      extends StObject
         with FontWeight
  }
  
  @js.native
  sealed trait LabelPlacement extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.LabelPlacement")
  @js.native
  object LabelPlacement extends StObject {
    
    //string
    @js.native
    sealed trait Inside
      extends StObject
         with LabelPlacement
    
    //string
    @js.native
    sealed trait Outside
      extends StObject
         with LabelPlacement
  }
  
  @js.native
  sealed trait LabelPosition extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.LabelPosition")
  @js.native
  object LabelPosition extends StObject {
    
    //string
    @js.native
    sealed trait Above
      extends StObject
         with LabelPosition
    
    //string
    @js.native
    sealed trait Below
      extends StObject
         with LabelPosition
  }
  
  @js.native
  sealed trait Orientation extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.Orientation")
  @js.native
  object Orientation extends StObject {
    
    //string
    @js.native
    sealed trait Horizontal
      extends StObject
         with Orientation
    
    //string
    @js.native
    sealed trait Vertical
      extends StObject
         with Orientation
  }
  
  @js.native
  sealed trait TextAlignment extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.TextAlignment")
  @js.native
  object TextAlignment extends StObject {
    
    //string
    @js.native
    sealed trait Center
      extends StObject
         with TextAlignment
    
    //string
    @js.native
    sealed trait Far
      extends StObject
         with TextAlignment
    
    //string
    @js.native
    sealed trait Near
      extends StObject
         with TextAlignment
  }
  
  @js.native
  sealed trait TextAnchor extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.TextAnchor")
  @js.native
  object TextAnchor extends StObject {
    
    //string
    @js.native
    sealed trait End
      extends StObject
         with TextAnchor
    
    //string
    @js.native
    sealed trait Middle
      extends StObject
         with TextAnchor
    
    //string
    @js.native
    sealed trait Start
      extends StObject
         with TextAnchor
  }
  
  @js.native
  sealed trait TextPosition extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.TextPosition")
  @js.native
  object TextPosition extends StObject {
    
    //string
    @js.native
    sealed trait Bottom
      extends StObject
         with TextPosition
    
    //string
    @js.native
    sealed trait Float
      extends StObject
         with TextPosition
    
    //string
    @js.native
    sealed trait Left
      extends StObject
         with TextPosition
    
    //string
    @js.native
    sealed trait Right
      extends StObject
         with TextPosition
    
    //string
    @js.native
    sealed trait Top
      extends StObject
         with TextPosition
  }
  
  @js.native
  sealed trait TickPlacement extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.TickPlacement")
  @js.native
  object TickPlacement extends StObject {
    
    //string
    @js.native
    sealed trait Inside
      extends StObject
         with TickPlacement
    
    //string
    @js.native
    sealed trait Outside
      extends StObject
         with TickPlacement
  }
  
  @js.native
  sealed trait TickPosition extends StObject
  @JSGlobal("ej.datavisualization.BulletGraph.TickPosition")
  @js.native
  object TickPosition extends StObject {
    
    //string
    @js.native
    sealed trait Above
      extends StObject
         with TickPosition
    
    //string
    @js.native
    sealed trait Below
      extends StObject
         with TickPosition
    
    //string
    @js.native
    sealed trait Cross
      extends StObject
         with TickPosition
  }
  
  trait CaptionSettings extends StObject {
    
    /** Specifies whether trim the labels will be true or false.
      * @Default {true}
      */
    var enableTrim: js.UndefOr[Boolean] = js.undefined
    
    /** Contains property to customize the font of caption.
      */
    var font: js.UndefOr[CaptionSettingsFont] = js.undefined
    
    /** Contains property to customize the indicator.
      */
    var indicator: js.UndefOr[CaptionSettingsIndicator] = js.undefined
    
    /** Contains property to customize the location.
      */
    var location: js.UndefOr[CaptionSettingsLocation] = js.undefined
    
    /** Specifies the padding to be applied when text position is used.
      * @Default {5}
      */
    var padding: js.UndefOr[Double] = js.undefined
    
    /** Contains property to customize the subtitle.
      */
    var subTitle: js.UndefOr[CaptionSettingsSubTitle] = js.undefined
    
    /** Specifies the text to be displayed on bullet graph.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the alignment of caption text with respect to scale. This property will not be applied when text position is float.
      * @Default {'Near'}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.undefined
    
    /** Specifies caption text anchoring when caption text overlaps with other caption group text. Text will be anchored when overlapping caption group text are at same position.
      * Anchoring is not applicable for float position.
      * @Default {'start'}
      */
    var textAnchor: js.UndefOr[TextAnchor | String] = js.undefined
    
    /** Specifies the angel in which the caption is rendered.
      * @Default {0}
      */
    var textAngle: js.UndefOr[Double] = js.undefined
    
    /** Specifies how caption text should be placed.
      * @Default {'float'}
      */
    var textPosition: js.UndefOr[TextPosition | String] = js.undefined
  }
  object CaptionSettings {
    
    inline def apply(): CaptionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaptionSettings] (val x: Self) extends AnyVal {
      
      inline def setEnableTrim(value: Boolean): Self = StObject.set(x, "enableTrim", value.asInstanceOf[js.Any])
      
      inline def setEnableTrimUndefined: Self = StObject.set(x, "enableTrim", js.undefined)
      
      inline def setFont(value: CaptionSettingsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setIndicator(value: CaptionSettingsIndicator): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      inline def setLocation(value: CaptionSettingsLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setSubTitle(value: CaptionSettingsSubTitle): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      inline def setTextAnchor(value: TextAnchor | String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      inline def setTextAngle(value: Double): Self = StObject.set(x, "textAngle", value.asInstanceOf[js.Any])
      
      inline def setTextAngleUndefined: Self = StObject.set(x, "textAngle", js.undefined)
      
      inline def setTextPosition(value: TextPosition | String): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
      
      inline def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait CaptionSettingsFont extends StObject {
    
    /** Specifies the color of the text in caption.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the fontFamily of caption. Caption text render with this fontFamily
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Specifies the fontStyle of caption
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Specifies the fontWeight of caption
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Specifies the opacity of caption. Caption text render with this opacity.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the size of caption. Caption text render with this size
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object CaptionSettingsFont {
    
    inline def apply(): CaptionSettingsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaptionSettingsFont] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait CaptionSettingsIndicator extends StObject {
    
    /** Contains property to customize the font of indicator.
      */
    var font: js.UndefOr[CaptionSettingsIndicatorFont] = js.undefined
    
    /** Contains property to customize the location of indicator.
      */
    var location: js.UndefOr[CaptionSettingsIndicatorLocation] = js.undefined
    
    /** Specifies the padding to be applied when text position is used.
      * @Default {2}
      */
    var padding: js.UndefOr[Double] = js.undefined
    
    /** Contains property to customize the symbol of indicator.
      */
    var symbol: js.UndefOr[CaptionSettingsIndicatorSymbol] = js.undefined
    
    /** Specifies the text to be displayed as indicator text. By default difference between current value and target will be displayed
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the alignment of indicator with respect to scale based on text position
      * @Default {'Near'}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.undefined
    
    /** Specifies where indicator text should be anchored when indicator overlaps with other caption group text. Text will be anchored when overlapping caption group text are at same
      * position. Anchoring is not applicable for float position.
      * @Default {'start'}
      */
    var textAnchor: js.UndefOr[TextAnchor | String] = js.undefined
    
    /** indicator text render in the specified angle.
      * @Default {0}
      */
    var textAngle: js.UndefOr[Double] = js.undefined
    
    /** Specifies where indicator should be placed
      * @Default {'float'}
      */
    var textPosition: js.UndefOr[TextPosition | String] = js.undefined
    
    /** Specifies the space between indicator symbol and text.
      * @Default {3}
      */
    var textSpacing: js.UndefOr[Double] = js.undefined
    
    /** Specifies whether indicator will be visible or not.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object CaptionSettingsIndicator {
    
    inline def apply(): CaptionSettingsIndicator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsIndicator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaptionSettingsIndicator] (val x: Self) extends AnyVal {
      
      inline def setFont(value: CaptionSettingsIndicatorFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setLocation(value: CaptionSettingsIndicatorLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setSymbol(value: CaptionSettingsIndicatorSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      inline def setTextAnchor(value: TextAnchor | String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      inline def setTextAngle(value: Double): Self = StObject.set(x, "textAngle", value.asInstanceOf[js.Any])
      
      inline def setTextAngleUndefined: Self = StObject.set(x, "textAngle", js.undefined)
      
      inline def setTextPosition(value: TextPosition | String): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
      
      inline def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
      
      inline def setTextSpacing(value: Double): Self = StObject.set(x, "textSpacing", value.asInstanceOf[js.Any])
      
      inline def setTextSpacingUndefined: Self = StObject.set(x, "textSpacing", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait CaptionSettingsIndicatorFont extends StObject {
    
    /** Specifies the color of the indicator's text.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the fontFamily of indicator. Indicator text render with this fontFamily.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Specifies the fontStyle of indicator. Indicator text render with this fontStyle. See FontStyle
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Specifies the fontWeight of indicator. Indicator text render with this fontWeight. See FontWeight
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Specifies the opacity of indicator text. Indicator text render with this Opacity.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the size of indicator. Indicator text render with this size.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object CaptionSettingsIndicatorFont {
    
    inline def apply(): CaptionSettingsIndicatorFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsIndicatorFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaptionSettingsIndicatorFont] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait CaptionSettingsIndicatorLocation extends StObject {
    
    /** Specifies the horizontal position of the indicator.
      * @Default {10}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Specifies the vertical position of the indicator.
      * @Default {60}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object CaptionSettingsIndicatorLocation {
    
    inline def apply(): CaptionSettingsIndicatorLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsIndicatorLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaptionSettingsIndicatorLocation] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait CaptionSettingsIndicatorSymbol extends StObject {
    
    /** Contains property to customize the border of indicator symbol.
      */
    var border: js.UndefOr[CaptionSettingsIndicatorSymbolBorder] = js.undefined
    
    /** Specifies the color of indicator symbol.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the URL of image that represents indicator symbol.
      */
    var imageURL: js.UndefOr[String] = js.undefined
    
    /** Specifies the opacity of indicator symbol.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the shape of indicator symbol.
      */
    var shape: js.UndefOr[String] = js.undefined
    
    /** Contains property to customize the size of indicator symbol.
      */
    var size: js.UndefOr[CaptionSettingsIndicatorSymbolSize] = js.undefined
  }
  object CaptionSettingsIndicatorSymbol {
    
    inline def apply(): CaptionSettingsIndicatorSymbol = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsIndicatorSymbol]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaptionSettingsIndicatorSymbol] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: CaptionSettingsIndicatorSymbolBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setImageURL(value: String): Self = StObject.set(x, "imageURL", value.asInstanceOf[js.Any])
      
      inline def setImageURLUndefined: Self = StObject.set(x, "imageURL", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: CaptionSettingsIndicatorSymbolSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait CaptionSettingsIndicatorSymbolBorder extends StObject {
    
    /** Specifies the border color of indicator symbol.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the border width of indicator symbol.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CaptionSettingsIndicatorSymbolBorder {
    
    inline def apply(): CaptionSettingsIndicatorSymbolBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsIndicatorSymbolBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaptionSettingsIndicatorSymbolBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CaptionSettingsIndicatorSymbolSize extends StObject {
    
    /** Specifies the height of indicator symbol.
      * @Default {10}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Specifies the width of indicator symbol.
      * @Default {10}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CaptionSettingsIndicatorSymbolSize {
    
    inline def apply(): CaptionSettingsIndicatorSymbolSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsIndicatorSymbolSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaptionSettingsIndicatorSymbolSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CaptionSettingsLocation extends StObject {
    
    /** Specifies the position in horizontal direction
      * @Default {17}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Specifies the position in horizontal direction
      * @Default {30}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object CaptionSettingsLocation {
    
    inline def apply(): CaptionSettingsLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaptionSettingsLocation] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait CaptionSettingsSubTitle extends StObject {
    
    /** Contains property to customize the font of subtitle.
      */
    var font: js.UndefOr[CaptionSettingsSubTitleFont] = js.undefined
    
    /** Contains property to customize the location of subtitle.
      */
    var location: js.UndefOr[CaptionSettingsSubTitleLocation] = js.undefined
    
    /** Specifies the padding to be applied when text position is used.
      * @Default {5}
      */
    var padding: js.UndefOr[Double] = js.undefined
    
    /** Specifies the text to be displayed as subtitle.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the alignment of sub title text with respect to scale. Alignment will not be applied in float position.
      * @Default {'Near'}
      */
    var textAlignment: js.UndefOr[TextAlignment | String] = js.undefined
    
    /** Specifies where subtitle text should be anchored when sub title text overlaps with other caption group text. Text will be anchored when overlapping caption group text are at same
      * position. Anchoring is not applicable for float position.
      * @Default {'start'}
      */
    var textAnchor: js.UndefOr[TextAnchor | String] = js.undefined
    
    /** Subtitle render in the specified angle.
      * @Default {0}
      */
    var textAngle: js.UndefOr[Double] = js.undefined
    
    /** Specifies where sub title text should be placed.
      * @Default {'float'}
      */
    var textPosition: js.UndefOr[TextPosition | String] = js.undefined
  }
  object CaptionSettingsSubTitle {
    
    inline def apply(): CaptionSettingsSubTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsSubTitle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaptionSettingsSubTitle] (val x: Self) extends AnyVal {
      
      inline def setFont(value: CaptionSettingsSubTitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setLocation(value: CaptionSettingsSubTitleLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlignment(value: TextAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      inline def setTextAnchor(value: TextAnchor | String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      inline def setTextAngle(value: Double): Self = StObject.set(x, "textAngle", value.asInstanceOf[js.Any])
      
      inline def setTextAngleUndefined: Self = StObject.set(x, "textAngle", js.undefined)
      
      inline def setTextPosition(value: TextPosition | String): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
      
      inline def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait CaptionSettingsSubTitleFont extends StObject {
    
    /** Specifies the color of the subtitle's text.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the fontFamily of subtitle. Subtitle text render with this fontFamily.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Specifies the fontStyle of subtitle. Subtitle text render with this fontStyle. See FontStyle
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Specifies the fontWeight of subtitle. Subtitle text render with this fontWeight. See FontWeight
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Specifies the opacity of subtitle. Subtitle text render with this opacity.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the size of subtitle. Subtitle text render with this size.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object CaptionSettingsSubTitleFont {
    
    inline def apply(): CaptionSettingsSubTitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsSubTitleFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaptionSettingsSubTitleFont] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait CaptionSettingsSubTitleLocation extends StObject {
    
    /** Specifies the horizontal position of the subtitle.
      * @Default {10}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Specifies the vertical position of the subtitle.
      * @Default {45}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object CaptionSettingsSubTitleLocation {
    
    inline def apply(): CaptionSettingsSubTitleLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionSettingsSubTitleLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaptionSettingsSubTitleLocation] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - X and Y co-ordinate of the points with respect to bullet graph area.id - ID of the target element.    size - Width and height of the bullet graph.    pageX -
      * x-coordinate of the pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the bullet graph model object
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
    
    /** location - X and Y co-ordinate of the points with respect to bullet graph area.id - ID of the target element.    size - Width and height of the bullet graph.    pageX -
      * x-coordinate of the pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the bullet graph model object
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
  
  trait DrawCaptionEventArgs extends StObject {
    
    /** returns the object of the bullet graph.
      */
    var Object: js.UndefOr[Any] = js.undefined
    
    /** returns the current captionSettings element.
      */
    var captionElement: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns the type of the captionSettings.
      */
    var captionType: js.UndefOr[String] = js.undefined
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[HTMLElement] = js.undefined
  }
  object DrawCaptionEventArgs {
    
    inline def apply(): DrawCaptionEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawCaptionEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawCaptionEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCaptionElement(value: HTMLElement): Self = StObject.set(x, "captionElement", value.asInstanceOf[js.Any])
      
      inline def setCaptionElementUndefined: Self = StObject.set(x, "captionElement", js.undefined)
      
      inline def setCaptionType(value: String): Self = StObject.set(x, "captionType", value.asInstanceOf[js.Any])
      
      inline def setCaptionTypeUndefined: Self = StObject.set(x, "captionType", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "Object", js.undefined)
      
      inline def setScaleElement(value: HTMLElement): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
    }
  }
  
  trait DrawCategoryEventArgs extends StObject {
    
    /** returns the object of the bullet graph.
      */
    var Object: js.UndefOr[Any] = js.undefined
    
    /** returns the text value of the category that is drawn.
      */
    var Value: js.UndefOr[String] = js.undefined
    
    /** returns the options of category element.
      */
    var categoryElement: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[HTMLElement] = js.undefined
  }
  object DrawCategoryEventArgs {
    
    inline def apply(): DrawCategoryEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawCategoryEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawCategoryEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCategoryElement(value: HTMLElement): Self = StObject.set(x, "categoryElement", value.asInstanceOf[js.Any])
      
      inline def setCategoryElementUndefined: Self = StObject.set(x, "categoryElement", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "Object", js.undefined)
      
      inline def setScaleElement(value: HTMLElement): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  trait DrawComparativeMeasureSymbolEventArgs extends StObject {
    
    /** returns the object of the bullet graph.
      */
    var Object: js.UndefOr[Any] = js.undefined
    
    /** returns the value of the comparative measure symbol.
      */
    var Value: js.UndefOr[Double] = js.undefined
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns the options of comparative measure element.
      */
    var targetElement: js.UndefOr[HTMLElement] = js.undefined
  }
  object DrawComparativeMeasureSymbolEventArgs {
    
    inline def apply(): DrawComparativeMeasureSymbolEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawComparativeMeasureSymbolEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawComparativeMeasureSymbolEventArgs] (val x: Self) extends AnyVal {
      
      inline def setObject(value: Any): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "Object", js.undefined)
      
      inline def setScaleElement(value: HTMLElement): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setTargetElement(value: HTMLElement): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
      
      inline def setTargetElementUndefined: Self = StObject.set(x, "targetElement", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  trait DrawFeatureMeasureBarEventArgs extends StObject {
    
    /** returns the object of the bullet graph.
      */
    var Object: js.UndefOr[Any] = js.undefined
    
    /** returns the value of the feature measure bar.
      */
    var Value: js.UndefOr[Double] = js.undefined
    
    /** returns the options of feature measure element.
      */
    var currentElement: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[HTMLElement] = js.undefined
  }
  object DrawFeatureMeasureBarEventArgs {
    
    inline def apply(): DrawFeatureMeasureBarEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawFeatureMeasureBarEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawFeatureMeasureBarEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCurrentElement(value: HTMLElement): Self = StObject.set(x, "currentElement", value.asInstanceOf[js.Any])
      
      inline def setCurrentElementUndefined: Self = StObject.set(x, "currentElement", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "Object", js.undefined)
      
      inline def setScaleElement(value: HTMLElement): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  trait DrawIndicatorEventArgs extends StObject {
    
    /** for canceling the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns an object to customize bullet graph indicator text and symbol before rendering it.
      */
    var indicatorSettings: js.UndefOr[Any] = js.undefined
    
    /** returns the object of bullet graph.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the type of event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DrawIndicatorEventArgs {
    
    inline def apply(): DrawIndicatorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawIndicatorEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawIndicatorEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIndicatorSettings(value: Any): Self = StObject.set(x, "indicatorSettings", value.asInstanceOf[js.Any])
      
      inline def setIndicatorSettingsUndefined: Self = StObject.set(x, "indicatorSettings", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DrawLabelsEventArgs extends StObject {
    
    /** returns the object of the bullet graph.
      */
    var Object: js.UndefOr[Any] = js.undefined
    
    /** returns the label type.
      */
    var labelType: js.UndefOr[String] = js.undefined
    
    /** returns the options of the scale element.
      */
    var scaleElement: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns the current label element.
      */
    var tickElement: js.UndefOr[HTMLElement] = js.undefined
  }
  object DrawLabelsEventArgs {
    
    inline def apply(): DrawLabelsEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawLabelsEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawLabelsEventArgs] (val x: Self) extends AnyVal {
      
      inline def setLabelType(value: String): Self = StObject.set(x, "labelType", value.asInstanceOf[js.Any])
      
      inline def setLabelTypeUndefined: Self = StObject.set(x, "labelType", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "Object", js.undefined)
      
      inline def setScaleElement(value: HTMLElement): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleElementUndefined: Self = StObject.set(x, "scaleElement", js.undefined)
      
      inline def setTickElement(value: HTMLElement): Self = StObject.set(x, "tickElement", value.asInstanceOf[js.Any])
      
      inline def setTickElementUndefined: Self = StObject.set(x, "tickElement", js.undefined)
    }
  }
  
  trait DrawQualitativeRangesEventArgs extends StObject {
    
    /** returns the object of the bullet graph.
      */
    var Object: js.UndefOr[Any] = js.undefined
    
    /** returns the end value of current range.
      */
    var rangeEndValue: js.UndefOr[Double] = js.undefined
    
    /** returns the index of current range.
      */
    var rangeIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the settings for current range.
      */
    var rangeOptions: js.UndefOr[Any] = js.undefined
  }
  object DrawQualitativeRangesEventArgs {
    
    inline def apply(): DrawQualitativeRangesEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawQualitativeRangesEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawQualitativeRangesEventArgs] (val x: Self) extends AnyVal {
      
      inline def setObject(value: Any): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "Object", js.undefined)
      
      inline def setRangeEndValue(value: Double): Self = StObject.set(x, "rangeEndValue", value.asInstanceOf[js.Any])
      
      inline def setRangeEndValueUndefined: Self = StObject.set(x, "rangeEndValue", js.undefined)
      
      inline def setRangeIndex(value: Double): Self = StObject.set(x, "rangeIndex", value.asInstanceOf[js.Any])
      
      inline def setRangeIndexUndefined: Self = StObject.set(x, "rangeIndex", js.undefined)
      
      inline def setRangeOptions(value: Any): Self = StObject.set(x, "rangeOptions", value.asInstanceOf[js.Any])
      
      inline def setRangeOptionsUndefined: Self = StObject.set(x, "rangeOptions", js.undefined)
    }
  }
  
  trait DrawTicksEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the interval value.
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /** returns the settings for majorTicks.
      */
    var majorTickSettings: js.UndefOr[Any] = js.undefined
    
    /** returns the maximum value.
      */
    var maximum: js.UndefOr[Double] = js.undefined
    
    /** returns the minimum value.
      */
    var minimum: js.UndefOr[Double] = js.undefined
    
    /** returns the value of minorTicksPerInterval.
      */
    var minorTickPerInterval: js.UndefOr[Double] = js.undefined
    
    /** returns the settings for minorTicks.
      */
    var minorTickSettings: js.UndefOr[Any] = js.undefined
    
    /** returns the model of the bullet graph.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DrawTicksEventArgs {
    
    inline def apply(): DrawTicksEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawTicksEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawTicksEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setMajorTickSettings(value: Any): Self = StObject.set(x, "majorTickSettings", value.asInstanceOf[js.Any])
      
      inline def setMajorTickSettingsUndefined: Self = StObject.set(x, "majorTickSettings", js.undefined)
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setMinorTickPerInterval(value: Double): Self = StObject.set(x, "minorTickPerInterval", value.asInstanceOf[js.Any])
      
      inline def setMinorTickPerIntervalUndefined: Self = StObject.set(x, "minorTickPerInterval", js.undefined)
      
      inline def setMinorTickSettings(value: Any): Self = StObject.set(x, "minorTickSettings", value.asInstanceOf[js.Any])
      
      inline def setMinorTickSettingsUndefined: Self = StObject.set(x, "minorTickSettings", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait LoadEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the model of the bullet graph.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
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
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Fires, on clicking the bullet graph.
      */
    var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
    
    /** Toggles the visibility of the range stroke color of the labels.
      * @Default {false}
      */
    var applyRangeStrokeToLabels: js.UndefOr[Boolean] = js.undefined
    
    /** Toggles the visibility of the range stroke color of the ticks.
      * @Default {false}
      */
    var applyRangeStrokeToTicks: js.UndefOr[Boolean] = js.undefined
    
    /** Contains property to customize the caption in bullet graph.
      */
    var captionSettings: js.UndefOr[CaptionSettings] = js.undefined
    
    /** Comparative measure bar in bullet graph render till the specified value.
      * @Default {0}
      */
    var comparativeMeasureValue: js.UndefOr[Double] = js.undefined
    
    /** Fires, on double clicking the bullet graph.
      */
    var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
    
    /** Fires on rendering the caption of bullet graph.
      */
    var drawCaption: js.UndefOr[js.Function1[/* e */ DrawCaptionEventArgs, Unit]] = js.undefined
    
    /** Fires on rendering the category.
      */
    var drawCategory: js.UndefOr[js.Function1[/* e */ DrawCategoryEventArgs, Unit]] = js.undefined
    
    /** Fires on rendering the comparative measure symbol.
      */
    var drawComparativeMeasureSymbol: js.UndefOr[js.Function1[/* e */ DrawComparativeMeasureSymbolEventArgs, Unit]] = js.undefined
    
    /** Fires on rendering the feature measure bar.
      */
    var drawFeatureMeasureBar: js.UndefOr[js.Function1[/* e */ DrawFeatureMeasureBarEventArgs, Unit]] = js.undefined
    
    /** Fires on rendering the indicator of bullet graph.
      */
    var drawIndicator: js.UndefOr[js.Function1[/* e */ DrawIndicatorEventArgs, Unit]] = js.undefined
    
    /** Fires on rendering the labels.
      */
    var drawLabels: js.UndefOr[js.Function1[/* e */ DrawLabelsEventArgs, Unit]] = js.undefined
    
    /** Fires on rendering the qualitative ranges.
      */
    var drawQualitativeRanges: js.UndefOr[js.Function1[/* e */ DrawQualitativeRangesEventArgs, Unit]] = js.undefined
    
    /** Fires on rendering the ticks.
      */
    var drawTicks: js.UndefOr[js.Function1[/* e */ DrawTicksEventArgs, Unit]] = js.undefined
    
    /** Toggles the animation of bullet graph.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies to convert the date object to string, using locale settings.
      * @Default {false}
      */
    var enableGroupSeparator: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether bullet graph has to be responsive while resizing.
      * @Default {true}
      */
    var enableResizing: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the direction of flow in bullet graph. Neither it may be backward nor forward.
      * @Default {forward}
      */
    var flowDirection: js.UndefOr[FlowDirection | String] = js.undefined
    
    /** Specifies the height of the bullet graph.
      * @Default {90}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Sets a value whether to make the bullet graph responsive on resize.
      * @Default {true}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Fires on loading bullet graph.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
    
    /** Name of the culture based on which bulletgraph should be localized.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Bullet graph will render in the specified orientation.
      * @Default {horizontal}
      */
    var orientation: js.UndefOr[typings.ejWebAll.ej.Orientation | String] = js.undefined
    
    /** Size of the qualitative range depends up on the specified value.
      * @Default {32}
      */
    var qualitativeRangeSize: js.UndefOr[Double] = js.undefined
    
    /** Contains property to customize the qualitative ranges.
      */
    var qualitativeRanges: js.UndefOr[js.Array[QualitativeRange]] = js.undefined
    
    /** Length of the quantitative range depends up on the specified value.
      * @Default {475}
      */
    var quantitativeScaleLength: js.UndefOr[Double] = js.undefined
    
    /** Contains all the properties to customize quantitative scale.
      */
    var quantitativeScaleSettings: js.UndefOr[QuantitativeScaleSettings] = js.undefined
    
    /** Fires, on right clicking the bullet graph.
      */
    var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
    
    /** By specifying this property the user can change the theme of the bullet graph.
      * @Default {flatlight}
      */
    var theme: js.UndefOr[String] = js.undefined
    
    /** Contains all the properties to customize tooltip.
      */
    var tooltipSettings: js.UndefOr[TooltipSettings] = js.undefined
    
    /** Feature measure bar in bullet graph render till the specified value.
      * @Default {0}
      */
    var value: js.UndefOr[Double] = js.undefined
    
    /** Specifies the width of the bullet graph.
      * @Default {595}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.datavisualization.BulletGraph.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.BulletGraph.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.datavisualization.BulletGraph.Model] (val x: Self) extends AnyVal {
      
      inline def setApplyRangeStrokeToLabels(value: Boolean): Self = StObject.set(x, "applyRangeStrokeToLabels", value.asInstanceOf[js.Any])
      
      inline def setApplyRangeStrokeToLabelsUndefined: Self = StObject.set(x, "applyRangeStrokeToLabels", js.undefined)
      
      inline def setApplyRangeStrokeToTicks(value: Boolean): Self = StObject.set(x, "applyRangeStrokeToTicks", value.asInstanceOf[js.Any])
      
      inline def setApplyRangeStrokeToTicksUndefined: Self = StObject.set(x, "applyRangeStrokeToTicks", js.undefined)
      
      inline def setCaptionSettings(value: CaptionSettings): Self = StObject.set(x, "captionSettings", value.asInstanceOf[js.Any])
      
      inline def setCaptionSettingsUndefined: Self = StObject.set(x, "captionSettings", js.undefined)
      
      inline def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "Click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "Click", js.undefined)
      
      inline def setComparativeMeasureValue(value: Double): Self = StObject.set(x, "comparativeMeasureValue", value.asInstanceOf[js.Any])
      
      inline def setComparativeMeasureValueUndefined: Self = StObject.set(x, "comparativeMeasureValue", js.undefined)
      
      inline def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
      
      inline def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
      
      inline def setDrawCaption(value: /* e */ DrawCaptionEventArgs => Unit): Self = StObject.set(x, "drawCaption", js.Any.fromFunction1(value))
      
      inline def setDrawCaptionUndefined: Self = StObject.set(x, "drawCaption", js.undefined)
      
      inline def setDrawCategory(value: /* e */ DrawCategoryEventArgs => Unit): Self = StObject.set(x, "drawCategory", js.Any.fromFunction1(value))
      
      inline def setDrawCategoryUndefined: Self = StObject.set(x, "drawCategory", js.undefined)
      
      inline def setDrawComparativeMeasureSymbol(value: /* e */ DrawComparativeMeasureSymbolEventArgs => Unit): Self = StObject.set(x, "drawComparativeMeasureSymbol", js.Any.fromFunction1(value))
      
      inline def setDrawComparativeMeasureSymbolUndefined: Self = StObject.set(x, "drawComparativeMeasureSymbol", js.undefined)
      
      inline def setDrawFeatureMeasureBar(value: /* e */ DrawFeatureMeasureBarEventArgs => Unit): Self = StObject.set(x, "drawFeatureMeasureBar", js.Any.fromFunction1(value))
      
      inline def setDrawFeatureMeasureBarUndefined: Self = StObject.set(x, "drawFeatureMeasureBar", js.undefined)
      
      inline def setDrawIndicator(value: /* e */ DrawIndicatorEventArgs => Unit): Self = StObject.set(x, "drawIndicator", js.Any.fromFunction1(value))
      
      inline def setDrawIndicatorUndefined: Self = StObject.set(x, "drawIndicator", js.undefined)
      
      inline def setDrawLabels(value: /* e */ DrawLabelsEventArgs => Unit): Self = StObject.set(x, "drawLabels", js.Any.fromFunction1(value))
      
      inline def setDrawLabelsUndefined: Self = StObject.set(x, "drawLabels", js.undefined)
      
      inline def setDrawQualitativeRanges(value: /* e */ DrawQualitativeRangesEventArgs => Unit): Self = StObject.set(x, "drawQualitativeRanges", js.Any.fromFunction1(value))
      
      inline def setDrawQualitativeRangesUndefined: Self = StObject.set(x, "drawQualitativeRanges", js.undefined)
      
      inline def setDrawTicks(value: /* e */ DrawTicksEventArgs => Unit): Self = StObject.set(x, "drawTicks", js.Any.fromFunction1(value))
      
      inline def setDrawTicksUndefined: Self = StObject.set(x, "drawTicks", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setEnableGroupSeparator(value: Boolean): Self = StObject.set(x, "enableGroupSeparator", value.asInstanceOf[js.Any])
      
      inline def setEnableGroupSeparatorUndefined: Self = StObject.set(x, "enableGroupSeparator", js.undefined)
      
      inline def setEnableResizing(value: Boolean): Self = StObject.set(x, "enableResizing", value.asInstanceOf[js.Any])
      
      inline def setEnableResizingUndefined: Self = StObject.set(x, "enableResizing", js.undefined)
      
      inline def setFlowDirection(value: FlowDirection | String): Self = StObject.set(x, "flowDirection", value.asInstanceOf[js.Any])
      
      inline def setFlowDirectionUndefined: Self = StObject.set(x, "flowDirection", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOrientation(value: typings.ejWebAll.ej.Orientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setQualitativeRangeSize(value: Double): Self = StObject.set(x, "qualitativeRangeSize", value.asInstanceOf[js.Any])
      
      inline def setQualitativeRangeSizeUndefined: Self = StObject.set(x, "qualitativeRangeSize", js.undefined)
      
      inline def setQualitativeRanges(value: js.Array[QualitativeRange]): Self = StObject.set(x, "qualitativeRanges", value.asInstanceOf[js.Any])
      
      inline def setQualitativeRangesUndefined: Self = StObject.set(x, "qualitativeRanges", js.undefined)
      
      inline def setQualitativeRangesVarargs(value: QualitativeRange*): Self = StObject.set(x, "qualitativeRanges", js.Array(value*))
      
      inline def setQuantitativeScaleLength(value: Double): Self = StObject.set(x, "quantitativeScaleLength", value.asInstanceOf[js.Any])
      
      inline def setQuantitativeScaleLengthUndefined: Self = StObject.set(x, "quantitativeScaleLength", js.undefined)
      
      inline def setQuantitativeScaleSettings(value: QuantitativeScaleSettings): Self = StObject.set(x, "quantitativeScaleSettings", value.asInstanceOf[js.Any])
      
      inline def setQuantitativeScaleSettingsUndefined: Self = StObject.set(x, "quantitativeScaleSettings", js.undefined)
      
      inline def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = StObject.set(x, "rightClick", js.Any.fromFunction1(value))
      
      inline def setRightClickUndefined: Self = StObject.set(x, "rightClick", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltipSettings(value: TooltipSettings): Self = StObject.set(x, "tooltipSettings", value.asInstanceOf[js.Any])
      
      inline def setTooltipSettingsUndefined: Self = StObject.set(x, "tooltipSettings", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait QualitativeRange extends StObject {
    
    /** Specifies the ending range to which the qualitative ranges will render.
      * @Default {3}
      */
    var rangeEnd: js.UndefOr[Double] = js.undefined
    
    /** Specifies the opacity for the qualitative ranges.
      * @Default {1}
      */
    var rangeOpacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies the stroke for the qualitative ranges.
      * @Default {null}
      */
    var rangeStroke: js.UndefOr[String] = js.undefined
  }
  object QualitativeRange {
    
    inline def apply(): QualitativeRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QualitativeRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QualitativeRange] (val x: Self) extends AnyVal {
      
      inline def setRangeEnd(value: Double): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
      
      inline def setRangeEndUndefined: Self = StObject.set(x, "rangeEnd", js.undefined)
      
      inline def setRangeOpacity(value: Double): Self = StObject.set(x, "rangeOpacity", value.asInstanceOf[js.Any])
      
      inline def setRangeOpacityUndefined: Self = StObject.set(x, "rangeOpacity", js.undefined)
      
      inline def setRangeStroke(value: String): Self = StObject.set(x, "rangeStroke", value.asInstanceOf[js.Any])
      
      inline def setRangeStrokeUndefined: Self = StObject.set(x, "rangeStroke", js.undefined)
    }
  }
  
  trait QuantitativeScaleSettings extends StObject {
    
    /** Contains property to customize the comparative measure.
      */
    var comparativeMeasureSettings: js.UndefOr[QuantitativeScaleSettingsComparativeMeasureSettings] = js.undefined
    
    /** Contains property to customize the featured measure.
      */
    var featureMeasures: js.UndefOr[js.Array[QuantitativeScaleSettingsFeatureMeasure]] = js.undefined
    
    /** Contains property to customize the featured measure.
      */
    var featuredMeasureSettings: js.UndefOr[QuantitativeScaleSettingsFeaturedMeasureSettings] = js.undefined
    
    /** Contains property to customize the fields.
      */
    var fields: js.UndefOr[QuantitativeScaleSettingsFields] = js.undefined
    
    /** Specifies the interval for the Graph.
      * @Default {1}
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /** Contains property to customize the labels.
      */
    var labelSettings: js.UndefOr[QuantitativeScaleSettingsLabelSettings] = js.undefined
    
    /** Contains property to customize the position of the quantitative scale
      */
    var location: js.UndefOr[QuantitativeScaleSettingsLocation] = js.undefined
    
    /** Contains property to customize the major tick lines.
      */
    var majorTickSettings: js.UndefOr[QuantitativeScaleSettingsMajorTickSettings] = js.undefined
    
    /** Specifies the maximum value of the Graph.
      * @Default {10}
      */
    var maximum: js.UndefOr[Double] = js.undefined
    
    /** Specifies the minimum value of the Graph.
      * @Default {0}
      */
    var minimum: js.UndefOr[Double] = js.undefined
    
    /** Contains property to customize the minor ticks.
      */
    var minorTickSettings: js.UndefOr[QuantitativeScaleSettingsMinorTickSettings] = js.undefined
    
    /** The specified number of minor ticks will be rendered per interval.
      * @Default {4}
      */
    var minorTicksPerInterval: js.UndefOr[Double] = js.undefined
    
    /** Specifies the placement of ticks to render either inside or outside the scale.
      * @Default {ej.datavisualization.BulletGraph.TickPlacement.Outside}
      */
    var tickPlacement: js.UndefOr[TickPlacement | String] = js.undefined
    
    /** Specifies the position of the ticks to render either above,below or inside
      * @Default {ej.datavisualization.BulletGraph.TickPosition.Far}
      */
    var tickPosition: js.UndefOr[TickPosition | String] = js.undefined
  }
  object QuantitativeScaleSettings {
    
    inline def apply(): QuantitativeScaleSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuantitativeScaleSettings] (val x: Self) extends AnyVal {
      
      inline def setComparativeMeasureSettings(value: QuantitativeScaleSettingsComparativeMeasureSettings): Self = StObject.set(x, "comparativeMeasureSettings", value.asInstanceOf[js.Any])
      
      inline def setComparativeMeasureSettingsUndefined: Self = StObject.set(x, "comparativeMeasureSettings", js.undefined)
      
      inline def setFeatureMeasures(value: js.Array[QuantitativeScaleSettingsFeatureMeasure]): Self = StObject.set(x, "featureMeasures", value.asInstanceOf[js.Any])
      
      inline def setFeatureMeasuresUndefined: Self = StObject.set(x, "featureMeasures", js.undefined)
      
      inline def setFeatureMeasuresVarargs(value: QuantitativeScaleSettingsFeatureMeasure*): Self = StObject.set(x, "featureMeasures", js.Array(value*))
      
      inline def setFeaturedMeasureSettings(value: QuantitativeScaleSettingsFeaturedMeasureSettings): Self = StObject.set(x, "featuredMeasureSettings", value.asInstanceOf[js.Any])
      
      inline def setFeaturedMeasureSettingsUndefined: Self = StObject.set(x, "featuredMeasureSettings", js.undefined)
      
      inline def setFields(value: QuantitativeScaleSettingsFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setLabelSettings(value: QuantitativeScaleSettingsLabelSettings): Self = StObject.set(x, "labelSettings", value.asInstanceOf[js.Any])
      
      inline def setLabelSettingsUndefined: Self = StObject.set(x, "labelSettings", js.undefined)
      
      inline def setLocation(value: QuantitativeScaleSettingsLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMajorTickSettings(value: QuantitativeScaleSettingsMajorTickSettings): Self = StObject.set(x, "majorTickSettings", value.asInstanceOf[js.Any])
      
      inline def setMajorTickSettingsUndefined: Self = StObject.set(x, "majorTickSettings", js.undefined)
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setMinorTickSettings(value: QuantitativeScaleSettingsMinorTickSettings): Self = StObject.set(x, "minorTickSettings", value.asInstanceOf[js.Any])
      
      inline def setMinorTickSettingsUndefined: Self = StObject.set(x, "minorTickSettings", js.undefined)
      
      inline def setMinorTicksPerInterval(value: Double): Self = StObject.set(x, "minorTicksPerInterval", value.asInstanceOf[js.Any])
      
      inline def setMinorTicksPerIntervalUndefined: Self = StObject.set(x, "minorTicksPerInterval", js.undefined)
      
      inline def setTickPlacement(value: TickPlacement | String): Self = StObject.set(x, "tickPlacement", value.asInstanceOf[js.Any])
      
      inline def setTickPlacementUndefined: Self = StObject.set(x, "tickPlacement", js.undefined)
      
      inline def setTickPosition(value: TickPosition | String): Self = StObject.set(x, "tickPosition", value.asInstanceOf[js.Any])
      
      inline def setTickPositionUndefined: Self = StObject.set(x, "tickPosition", js.undefined)
    }
  }
  
  trait QuantitativeScaleSettingsComparativeMeasureSettings extends StObject {
    
    /** Specifies the stroke of the comparative measure.
      * @Default {null}
      */
    var stroke: js.UndefOr[Double] = js.undefined
    
    /** Specifies the width of the comparative measure.
      * @Default {5}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object QuantitativeScaleSettingsComparativeMeasureSettings {
    
    inline def apply(): QuantitativeScaleSettingsComparativeMeasureSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsComparativeMeasureSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuantitativeScaleSettingsComparativeMeasureSettings] (val x: Self) extends AnyVal {
      
      inline def setStroke(value: Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait QuantitativeScaleSettingsFeatureMeasure extends StObject {
    
    /** Specifies the category of feature measure.
      * @Default {null}
      */
    var category: js.UndefOr[String] = js.undefined
    
    /** Comparative measure render till the specified value.
      * @Default {null}
      */
    var comparativeMeasureValue: js.UndefOr[Double] = js.undefined
    
    /** Feature measure render till the specified value.
      * @Default {null}
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object QuantitativeScaleSettingsFeatureMeasure {
    
    inline def apply(): QuantitativeScaleSettingsFeatureMeasure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsFeatureMeasure]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuantitativeScaleSettingsFeatureMeasure] (val x: Self) extends AnyVal {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setComparativeMeasureValue(value: Double): Self = StObject.set(x, "comparativeMeasureValue", value.asInstanceOf[js.Any])
      
      inline def setComparativeMeasureValueUndefined: Self = StObject.set(x, "comparativeMeasureValue", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait QuantitativeScaleSettingsFeaturedMeasureSettings extends StObject {
    
    /** Specifies the Stroke of the featured measure in bullet graph.
      * @Default {null}
      */
    var stroke: js.UndefOr[Double] = js.undefined
    
    /** Specifies the width of the featured measure in bullet graph.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object QuantitativeScaleSettingsFeaturedMeasureSettings {
    
    inline def apply(): QuantitativeScaleSettingsFeaturedMeasureSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsFeaturedMeasureSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuantitativeScaleSettingsFeaturedMeasureSettings] (val x: Self) extends AnyVal {
      
      inline def setStroke(value: Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait QuantitativeScaleSettingsFields extends StObject {
    
    /** Specifies the category of the bullet graph.
      * @Default {null}
      */
    var category: js.UndefOr[String] = js.undefined
    
    /** Comparative measure render based on the values in the specified field.
      * @Default {null}
      */
    var comparativeMeasure: js.UndefOr[String] = js.undefined
    
    /** Specifies the dataSource for the bullet graph.
      * @Default {null}
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Feature measure render based on the values in the specified field.
      * @Default {null}
      */
    var featureMeasures: js.UndefOr[String] = js.undefined
    
    /** Specifies the query for fetching the values form data source to render the bullet graph.
      * @Default {null}
      */
    var query: js.UndefOr[String] = js.undefined
    
    /** Specifies the name of the table.
      * @Default {null}
      */
    var tableName: js.UndefOr[String] = js.undefined
  }
  object QuantitativeScaleSettingsFields {
    
    inline def apply(): QuantitativeScaleSettingsFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuantitativeScaleSettingsFields] (val x: Self) extends AnyVal {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setComparativeMeasure(value: String): Self = StObject.set(x, "comparativeMeasure", value.asInstanceOf[js.Any])
      
      inline def setComparativeMeasureUndefined: Self = StObject.set(x, "comparativeMeasure", js.undefined)
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setFeatureMeasures(value: String): Self = StObject.set(x, "featureMeasures", value.asInstanceOf[js.Any])
      
      inline def setFeatureMeasuresUndefined: Self = StObject.set(x, "featureMeasures", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    }
  }
  
  trait QuantitativeScaleSettingsLabelSettings extends StObject {
    
    /** Contains property to customize the font of the labels in bullet graph.
      */
    var font: js.UndefOr[QuantitativeScaleSettingsLabelSettingsFont] = js.undefined
    
    /** Specifies the placement of labels in bullet graph scale.
      * @Default {outside}
      */
    var labelPlacement: js.UndefOr[LabelPlacement | String] = js.undefined
    
    /** Specifies the prefix to be added with labels in bullet graph.
      * @Default {Empty string}
      */
    var labelPrefix: js.UndefOr[String] = js.undefined
    
    /** Specifies the suffix to be added after labels in bullet graph.
      * @Default {Empty string}
      */
    var labelSuffix: js.UndefOr[String] = js.undefined
    
    /** Specifies the horizontal/vertical padding of labels.
      * @Default {15}
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /** Specifies the position of the labels to render either above or below the graph. See
      * @Default {below}
      */
    var position: js.UndefOr[LabelPosition | String] = js.undefined
    
    /** Specifies the Size of the labels.
      * @Default {12}
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Specifies the stroke color of the labels in bullet graph.
      * @Default {null}
      */
    var stroke: js.UndefOr[String] = js.undefined
  }
  object QuantitativeScaleSettingsLabelSettings {
    
    inline def apply(): QuantitativeScaleSettingsLabelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsLabelSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuantitativeScaleSettingsLabelSettings] (val x: Self) extends AnyVal {
      
      inline def setFont(value: QuantitativeScaleSettingsLabelSettingsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setLabelPlacement(value: LabelPlacement | String): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setLabelPrefix(value: String): Self = StObject.set(x, "labelPrefix", value.asInstanceOf[js.Any])
      
      inline def setLabelPrefixUndefined: Self = StObject.set(x, "labelPrefix", js.undefined)
      
      inline def setLabelSuffix(value: String): Self = StObject.set(x, "labelSuffix", value.asInstanceOf[js.Any])
      
      inline def setLabelSuffixUndefined: Self = StObject.set(x, "labelSuffix", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPosition(value: LabelPosition | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
  
  trait QuantitativeScaleSettingsLabelSettingsFont extends StObject {
    
    /** Specifies the fontFamily of labels in bullet graph. Labels render with this fontFamily.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Specifies the fontStyle of labels in bullet graph. Labels render with this fontStyle. See FontStyle
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Specifies the fontWeight of labels in bullet graph. Labels render with this fontWeight. See FontWeight
      * @Default {regular}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Specifies the opacity of labels in bullet graph. Labels render with this opacity
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object QuantitativeScaleSettingsLabelSettingsFont {
    
    inline def apply(): QuantitativeScaleSettingsLabelSettingsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsLabelSettingsFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuantitativeScaleSettingsLabelSettingsFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  trait QuantitativeScaleSettingsLocation extends StObject {
    
    /** This property specifies the x position for rendering quantitative scale.
      * @Default {10}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** This property specifies the y position for rendering quantitative scale.
      * @Default {10}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object QuantitativeScaleSettingsLocation {
    
    inline def apply(): QuantitativeScaleSettingsLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuantitativeScaleSettingsLocation] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait QuantitativeScaleSettingsMajorTickSettings extends StObject {
    
    /** Specifies the size of the major ticks.
      * @Default {13}
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Specifies the stroke color of the major tick lines.
      * @Default {null}
      */
    var stroke: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of the major tick lines.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object QuantitativeScaleSettingsMajorTickSettings {
    
    inline def apply(): QuantitativeScaleSettingsMajorTickSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsMajorTickSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuantitativeScaleSettingsMajorTickSettings] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait QuantitativeScaleSettingsMinorTickSettings extends StObject {
    
    /** Specifies the size of minor ticks.
      * @Default {7}
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Specifies the stroke color of minor ticks in bullet graph.
      * @Default {null}
      */
    var stroke: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of the minor ticks in bullet graph.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object QuantitativeScaleSettingsMinorTickSettings {
    
    inline def apply(): QuantitativeScaleSettingsMinorTickSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuantitativeScaleSettingsMinorTickSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuantitativeScaleSettingsMinorTickSettings] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait RightClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** location - X and Y co-ordinate of the points with respect to bullet graph area.id - ID of the target element.    size - Width and height of the bullet graph.    pageX -
      * x-coordinate of the pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Instance of the bullet graph model object
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
  
  trait TooltipSettings extends StObject {
    
    /** Specifies template for caption tooltip
      * @Default {null}
      */
    var captionTemplate: js.UndefOr[String] = js.undefined
    
    /** Toggles the visibility of caption tooltip
      * @Default {false}
      */
    var enableCaptionTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the ID of a div, which is to be displayed as tooltip.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Toggles the visibility of tooltip
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object TooltipSettings {
    
    inline def apply(): TooltipSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipSettings] (val x: Self) extends AnyVal {
      
      inline def setCaptionTemplate(value: String): Self = StObject.set(x, "captionTemplate", value.asInstanceOf[js.Any])
      
      inline def setCaptionTemplateUndefined: Self = StObject.set(x, "captionTemplate", js.undefined)
      
      inline def setEnableCaptionTooltip(value: Boolean): Self = StObject.set(x, "enableCaptionTooltip", value.asInstanceOf[js.Any])
      
      inline def setEnableCaptionTooltipUndefined: Self = StObject.set(x, "enableCaptionTooltip", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
