package typings.fabric.fabricMod

import org.scalablytyped.runtime.StringDictionary
import typings.fabric.Anon_X
import typings.fabric.fabricDashImplMod.FilterBackend
import typings.fabric.fabricDashImplMod.IAllFilters
import typings.fabric.fabricDashImplMod.ICanvasOptions
import typings.fabric.fabricDashImplMod.ICircleOptions
import typings.fabric.fabricDashImplMod.IEllipseOptions
import typings.fabric.fabricDashImplMod.IGradientOptions
import typings.fabric.fabricDashImplMod.IGroupOptions
import typings.fabric.fabricDashImplMod.IImageOptions
import typings.fabric.fabricDashImplMod.ILineOptions
import typings.fabric.fabricDashImplMod.IObjectOptions
import typings.fabric.fabricDashImplMod.IPathOptions
import typings.fabric.fabricDashImplMod.IPatternOptions
import typings.fabric.fabricDashImplMod.IPolylineOptions
import typings.fabric.fabricDashImplMod.IRectOptions
import typings.fabric.fabricDashImplMod.IShadowOptions
import typings.fabric.fabricDashImplMod.ITextOptions
import typings.fabric.fabricDashImplMod.ITextboxOptions
import typings.fabric.fabricDashImplMod.ITriangleOptions
import typings.fabric.fabricDashImplMod.IUtil
import typings.fabric.fabricDashImplMod.TextOptions
import typings.fabric.fabricDashImplMod.WebglFilterBackendOptions
import typings.fabric.fabricStrings.getImageData
import typings.fabric.fabricStrings.setLineDash
import typings.fabric.fabricStrings.toDataURL
import typings.fabric.fabricStrings.toDataURLWithQuality
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.RegExp
import typings.std.SVGElement
import typings.std.SVGGradientElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric")
@js.native
object fabricNs extends js.Object {
  @js.native
  /**
  	 * Constructor
  	 * @param objects ActiveSelection objects
  	 * @param [options] Options object
  	 */
  class ActiveSelection ()
    extends typings.fabric.fabricDashImplMod.ActiveSelection {
    def this(objects: js.Array[typings.fabric.fabricDashImplMod.Object]) = this()
    def this(objects: js.Array[typings.fabric.fabricDashImplMod.Object], options: IObjectOptions) = this()
  }
  
  @js.native
  class BaseBrush ()
    extends typings.fabric.fabricDashImplMod.BaseBrush
  
  @js.native
  class Canvas protected ()
    extends typings.fabric.fabricDashImplMod.Canvas {
    def this(element: String) = this()
    /**
    	 * Constructor
    	 * @param element <canvas> element to initialize instance on
    	 * @param [options] Options object
    	 */
    def this(element: HTMLCanvasElement) = this()
    def this(element: String, options: ICanvasOptions) = this()
    def this(element: HTMLCanvasElement, options: ICanvasOptions) = this()
  }
  
  @js.native
  class Canvas2dFilterBackend ()
    extends typings.fabric.fabricDashImplMod.Canvas2dFilterBackend
  
  @js.native
  class Circle ()
    extends typings.fabric.fabricDashImplMod.Circle {
    def this(options: ICircleOptions) = this()
  }
  
  @js.native
  class CircleBrush ()
    extends typings.fabric.fabricDashImplMod.CircleBrush
  
  @js.native
  /**
  	 * Color class
  	 * The purpose of Color is to abstract and encapsulate common color operations;
  	 * @param color optional in hex or rgb(a) format
  	 */
  class Color ()
    extends typings.fabric.fabricDashImplMod.Color {
    def this(color: String) = this()
  }
  
  @js.native
  class Ellipse ()
    extends typings.fabric.fabricDashImplMod.Ellipse {
    def this(options: IEllipseOptions) = this()
  }
  
  @js.native
  class Gradient ()
    extends typings.fabric.fabricDashImplMod.Gradient
  
  @js.native
  /**
  	 * Constructor
  	 * @param objects Group objects
  	 * @param [options] Options object
  	 */
  class Group ()
    extends typings.fabric.fabricDashImplMod.Group {
    def this(objects: js.Array[typings.fabric.fabricDashImplMod.Object]) = this()
    def this(objects: js.Array[typings.fabric.fabricDashImplMod.Object], options: IGroupOptions) = this()
    def this(
      objects: js.Array[typings.fabric.fabricDashImplMod.Object],
      options: IGroupOptions,
      isAlreadyGrouped: Boolean
    ) = this()
  }
  
  @js.native
  class IText protected ()
    extends typings.fabric.fabricDashImplMod.IText {
    /**
    	 * Constructor
    	 * @param text Text string
    	 * @param [options] Options object
    	 */
    def this(text: String) = this()
    def this(text: String, options: ITextOptions) = this()
  }
  
  @js.native
  /**
  	 * Constructor
  	 * @param element Image element
  	 * @param [options] Options object
  	 */
  class Image ()
    extends typings.fabric.fabricDashImplMod.Image {
    def this(element: String) = this()
    def this(element: HTMLImageElement) = this()
    def this(element: String, options: IImageOptions) = this()
    def this(element: HTMLImageElement, options: IImageOptions) = this()
  }
  
  @js.native
  class Intersection ()
    extends typings.fabric.fabricDashImplMod.Intersection {
    def this(status: String) = this()
  }
  
  @js.native
  /**
  	 * Constructor
  	 * @param [points] Array of points
  	 * @param [options] Options object
  	 */
  class Line ()
    extends typings.fabric.fabricDashImplMod.Line {
    def this(points: js.Array[Double]) = this()
    def this(points: js.Array[Double], objObjects: ILineOptions) = this()
  }
  
  @js.native
  class Object ()
    extends typings.fabric.fabricDashImplMod.Object {
    def this(options: IObjectOptions) = this()
  }
  
  @js.native
  /**
  	 * Constructor
  	 * @param path Path data (sequence of coordinates and corresponding "command" tokens)
  	 * @param [options] Options object
  	 */
  class Path ()
    extends typings.fabric.fabricDashImplMod.Path {
    def this(path: String) = this()
    def this(path: js.Array[typings.fabric.fabricDashImplMod.Point]) = this()
    def this(path: String, options: IPathOptions) = this()
    def this(path: js.Array[typings.fabric.fabricDashImplMod.Point], options: IPathOptions) = this()
  }
  
  @js.native
  class Pattern ()
    extends typings.fabric.fabricDashImplMod.Pattern {
    def this(options: IPatternOptions) = this()
  }
  
  @js.native
  class PatternBrush ()
    extends typings.fabric.fabricDashImplMod.PatternBrush
  
  @js.native
  class PencilBrush ()
    extends typings.fabric.fabricDashImplMod.PencilBrush
  
  @js.native
  class Point protected ()
    extends typings.fabric.fabricDashImplMod.Point {
    def this(x: Double, y: Double) = this()
  }
  
  @js.native
  class Polygon protected ()
    extends typings.fabric.fabricDashImplMod.Polygon {
    /**
    	 * Constructor
    	 * @param points Array of points
    	 * @param [options] Options object
    	 */
    def this(points: js.Array[Anon_X]) = this()
    def this(points: js.Array[Anon_X], options: IPolylineOptions) = this()
  }
  
  @js.native
  class Polyline protected ()
    extends typings.fabric.fabricDashImplMod.Polyline {
    /**
    	 * Constructor
    	 * @param points Array of points (where each point is an object with x and y)
    	 * @param [options] Options object
    	 * @param [skipOffset] Whether points offsetting should be skipped
    	 */
    def this(points: js.Array[Anon_X]) = this()
    def this(points: js.Array[Anon_X], options: IPolylineOptions) = this()
  }
  
  @js.native
  /**
  	 * Constructor
  	 * @param [options] Options object
  	 */
  class Rect ()
    extends typings.fabric.fabricDashImplMod.Rect {
    def this(options: IRectOptions) = this()
  }
  
  @js.native
  class Shadow ()
    extends typings.fabric.fabricDashImplMod.Shadow {
    def this(options: String) = this()
    def this(options: IShadowOptions) = this()
  }
  
  @js.native
  class SprayBrush ()
    extends typings.fabric.fabricDashImplMod.SprayBrush
  
  @js.native
  class StaticCanvas protected ()
    extends typings.fabric.fabricDashImplMod.StaticCanvas {
    def this(element: String) = this()
    /**
    	 * Constructor
    	 * @param {HTMLElement | String} el <canvas> element to initialize instance on
    	 * @param {Object} [options] Options object
    	 * @return {Object} thisArg
    	 */
    def this(element: HTMLCanvasElement) = this()
    def this(element: String, options: ICanvasOptions) = this()
    def this(element: HTMLCanvasElement, options: ICanvasOptions) = this()
  }
  
  @js.native
  class Text protected ()
    extends typings.fabric.fabricDashImplMod.Text {
    /**
    	 * Constructor
    	 * @param text Text string
    	 * @param [options] Options object
    	 */
    def this(text: String) = this()
    def this(text: String, options: TextOptions) = this()
  }
  
  @js.native
  class Textbox protected ()
    extends typings.fabric.fabricDashImplMod.Textbox {
    /**
    	 * Constructor
    	 * @param text Text string
    	 * @param [options] Options object
    	 */
    def this(text: String) = this()
    def this(text: String, options: ITextboxOptions) = this()
  }
  
  @js.native
  /**
  	 * Constructor
  	 * @param [options] Options object
  	 */
  class Triangle ()
    extends typings.fabric.fabricDashImplMod.Triangle {
    def this(options: ITriangleOptions) = this()
  }
  
  @js.native
  class WebglFilterBackend ()
    extends typings.fabric.fabricDashImplMod.WebglFilterBackend {
    def this(options: WebglFilterBackendOptions) = this()
  }
  
  var filterBackend: js.UndefOr[FilterBackend] = js.native
  val isLikelyNode: Boolean = js.native
  val isTouchSupported: Boolean = js.native
  var textureSize: Double = js.native
  val util: IUtil = js.native
  val version: String = js.native
  def createCanvasForNode(width: Double, height: Double): typings.fabric.fabricDashImplMod.Canvas = js.native
  def createSVGFontFacesMarkup(objects: js.Array[typings.fabric.fabricDashImplMod.Object]): String = js.native
  def createSVGRefElementsMarkup(canvas: typings.fabric.fabricDashImplMod.StaticCanvas): String = js.native
  def getCSSRules(doc: SVGElement): js.Any = js.native
  def getGradientDefs(doc: SVGElement): StringDictionary[js.Any] = js.native
  def loadSVGFromString(
    string: String,
    callback: js.Function2[
      /* results */ js.Array[typings.fabric.fabricDashImplMod.Object], 
      /* options */ js.Any, 
      Unit
    ]
  ): Unit = js.native
  def loadSVGFromString(
    string: String,
    callback: js.Function2[
      /* results */ js.Array[typings.fabric.fabricDashImplMod.Object], 
      /* options */ js.Any, 
      Unit
    ],
    reviver: js.Function
  ): Unit = js.native
  def loadSVGFromURL(
    url: String,
    callback: js.Function2[
      /* results */ js.Array[typings.fabric.fabricDashImplMod.Object], 
      /* options */ js.Any, 
      Unit
    ]
  ): Unit = js.native
  def loadSVGFromURL(
    url: String,
    callback: js.Function2[
      /* results */ js.Array[typings.fabric.fabricDashImplMod.Object], 
      /* options */ js.Any, 
      Unit
    ],
    reviver: js.Function
  ): Unit = js.native
  def log(values: js.Any*): Unit = js.native
  def parseAttributes(element: HTMLElement, attributes: js.Array[String]): StringDictionary[String] = js.native
  def parseAttributes(element: HTMLElement, attributes: js.Array[String], svgUid: String): StringDictionary[String] = js.native
  def parseElements(elements: js.Array[SVGElement], callback: js.Function): Unit = js.native
  def parseElements(elements: js.Array[_ | SVGElement], callback: js.Function, options: js.Any): Unit = js.native
  def parseElements(elements: js.Array[_ | SVGElement], callback: js.Function, options: js.Any, reviver: js.Function): Unit = js.native
  def parseFontDeclaration(value: String, oStyle: js.Any): Unit = js.native
  def parsePointsAttribute(points: String): js.Array[_] = js.native
  def parseSVGDocument(
    doc: SVGElement,
    callback: js.Function2[
      /* results */ js.Array[typings.fabric.fabricDashImplMod.Object], 
      /* options */ js.Any, 
      Unit
    ]
  ): Unit = js.native
  def parseSVGDocument(
    doc: SVGElement,
    callback: js.Function2[
      /* results */ js.Array[typings.fabric.fabricDashImplMod.Object], 
      /* options */ js.Any, 
      Unit
    ],
    reviver: js.Function
  ): Unit = js.native
  def parseStyleAttribute(element: SVGElement): js.Any = js.native
  def parseTransformAttribute(attributeValue: String): js.Array[Double] = js.native
  def warn(values: js.Any*): Unit = js.native
  /* static members */
  @js.native
  object ActiveSelection extends js.Object {
    /**
    	 * Returns {@link fabric.ActiveSelection} instance from an object representation
    	 * @memberOf fabric.ActiveSelection
    	 * @param object Object to create a group from
    	 * @param [callback] Callback to invoke when an ActiveSelection instance is created
    	 */
    def fromObject(`object`: js.Any, callback: js.Function): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Canvas extends js.Object {
    var EMPTY_JSON: String = js.native
    /**
    	 * Provides a way to check support of some of the canvas methods
    	 * (either those of HTMLCanvasElement itself, or rendering context)
    	 * @param methodName Method to check support for; Could be one of "getImageData", "toDataURL", "toDataURLWithQuality" or "setLineDash"
    	 */
    @JSName("supports")
    def supports_getImageData(methodName: getImageData): Boolean = js.native
    @JSName("supports")
    def supports_setLineDash(methodName: setLineDash): Boolean = js.native
    @JSName("supports")
    def supports_toDataURL(methodName: toDataURL): Boolean = js.native
    @JSName("supports")
    def supports_toDataURLWithQuality(methodName: toDataURLWithQuality): Boolean = js.native
    /**
    	 * Returns JSON representation of canvas
    	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
    	 */
    def toJSON(): String = js.native
    def toJSON(propertiesToInclude: js.Array[String]): String = js.native
  }
  
  /* static members */
  @js.native
  object Circle extends js.Object {
    /**
    	 * List of attribute names to account for when parsing SVG element (used by {@link fabric.Circle.fromElement})
    	 */
    var ATTRIBUTE_NAMES: js.Array[String] = js.native
    /**
    	 * Returns Circle instance from an SVG element
    	 * @param element Element to parse
    	 * @param [options] Options object
    	 */
    def fromElement(element: SVGElement, options: ICircleOptions): typings.fabric.fabricDashImplMod.Circle = js.native
    /**
    	 * Returns Circle instance from an object representation
    	 * @param object Object to create an instance from
    	 */
    def fromObject(`object`: js.Any): typings.fabric.fabricDashImplMod.Circle = js.native
  }
  
  /* static members */
  @js.native
  object Color extends js.Object {
    /**
    	 * Returns new color object, when given a color in HEX format
    	 * @param color Color value ex: FF5555
    	 */
    def fromHex(color: String): typings.fabric.fabricDashImplMod.Color = js.native
    /**
    	 * Returns new color object, when given a color in HSL format
    	 * @param color Color value ex: hsl(0-260,0%-100%,0%-100%)
    	 */
    def fromHsl(color: String): typings.fabric.fabricDashImplMod.Color = js.native
    /**
    	 * Returns new color object, when given a color in HSLA format
    	 * @param color Color value ex: hsl(0-260,0%-100%,0%-100%)
    	 */
    def fromHsla(color: String): typings.fabric.fabricDashImplMod.Color = js.native
    /**
    	 * Returns new color object, when given a color in RGB format
    	 * @param color Color value ex: rgb(0-255,0-255,0-255)
    	 */
    def fromRgb(color: String): typings.fabric.fabricDashImplMod.Color = js.native
    /**
    	 * Returns new color object, when given a color in RGBA format
    	 * @param color Color value ex: rgb(0-255,0-255,0-255)
    	 */
    def fromRgba(color: String): typings.fabric.fabricDashImplMod.Color = js.native
    /**
    	 * Returns new color object, when given color in array representation (ex: [200, 100, 100, 0.5])
    	 */
    def fromSource(source: js.Array[Double]): typings.fabric.fabricDashImplMod.Color = js.native
    /**
    	 * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in HEX format
    	 * @param color ex: FF5555
    	 */
    def sourceFromHex(color: String): js.Array[Double] = js.native
    /**
    	 * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in HSL or HSLA format.
    	 * @param color Color value ex: hsl(0-360,0%-100%,0%-100%) or hsla(0-360,0%-100%,0%-100%, 0-1)
    	 */
    def sourceFromHsl(color: String): js.Array[Double] = js.native
    /**
    	 * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in RGB or RGBA format
    	 * @param color Color value ex: rgb(0-255,0-255,0-255), rgb(0%-100%,0%-100%,0%-100%)
    	 */
    def sourceFromRgb(color: String): js.Array[Double] = js.native
  }
  
  /* static members */
  @js.native
  object Ellipse extends js.Object {
    /**
    	 * List of attribute names to account for when parsing SVG element (used by {@link fabric.Ellipse.fromElement})
    	 */
    var ATTRIBUTE_NAMES: js.Array[String] = js.native
    /**
    	 * Returns Ellipse instance from an SVG element
    	 * @param element Element to parse
    	 * @param [options] Options object
    	 */
    def fromElement(element: SVGElement): typings.fabric.fabricDashImplMod.Ellipse = js.native
    def fromElement(element: SVGElement, options: IEllipseOptions): typings.fabric.fabricDashImplMod.Ellipse = js.native
    /**
    	 * Returns Ellipse instance from an object representation
    	 * @param object Object to create an instance from
    	 */
    def fromObject(`object`: js.Any): typings.fabric.fabricDashImplMod.Ellipse = js.native
  }
  
  /* static members */
  @js.native
  object Gradient extends js.Object {
    /**
    	 * Returns {@link fabric.Gradient} instance from its object representation
    	 * @static
    	 * @memberOf fabric.Gradient
    	 * @param {Object} obj
    	 * @param {Object} [options] Options object
    	 */
    def forObject(obj: js.Any): typings.fabric.fabricDashImplMod.Gradient = js.native
    def forObject(obj: js.Any, options: IGradientOptions): typings.fabric.fabricDashImplMod.Gradient = js.native
    /**
    	 * Returns {@link fabric.Gradient} instance from an SVG element
    	 * @static
    	 * @memberOf fabric.Gradient
    	 * @param {SVGGradientElement} el SVG gradient element
    	 * @param {fabric.Object} instance
    	 * @return {fabric.Gradient} Gradient instance
    	 * @see http://www.w3.org/TR/SVG/pservers.html#LinearGradientElement
    	 * @see http://www.w3.org/TR/SVG/pservers.html#RadialGradientElement
    	 */
    def fromElement(el: SVGGradientElement, instance: typings.fabric.fabricDashImplMod.Object): typings.fabric.fabricDashImplMod.Gradient = js.native
  }
  
  /* static members */
  @js.native
  object Group extends js.Object {
    /**
    	 * Returns {@link fabric.Group} instance from an object representation
    	 * @param object Object to create a group from
    	 * @param [callback] Callback to invoke when an group instance is created
    	 */
    def fromObject(`object`: js.Any, callback: js.Function1[/* group */ this.type, _]): Unit = js.native
  }
  
  /* static members */
  @js.native
  object IText extends js.Object {
    /**
    	 * Returns fabric.IText instance from an object representation
    	 * @static
    	 * @memberOf fabric.IText
    	 * @param {Object} object Object to create an instance from
    	 * @param {function} [callback] invoked with new instance as argument
    	 */
    def fromObject(`object`: js.Any): typings.fabric.fabricDashImplMod.IText = js.native
    def fromObject(`object`: js.Any, callback: js.Function): typings.fabric.fabricDashImplMod.IText = js.native
  }
  
  /* static members */
  @js.native
  object Image extends js.Object {
    var ATTRIBUTE_NAMES: js.Array[String] = js.native
    /**
    	 * Default CSS class name for canvas
    	 */
    var CSS_CANVAS: String = js.native
    var filters: IAllFilters = js.native
    /**
    	 * Returns Image instance from an SVG element
    	 * @param element Element to parse
    	 * @param callback Callback to execute when fabric.Image object is created
    	 * @param [options] Options object
    	 */
    def fromElement(element: SVGElement, callback: js.Function): typings.fabric.fabricDashImplMod.Image = js.native
    def fromElement(element: SVGElement, callback: js.Function, options: IImageOptions): typings.fabric.fabricDashImplMod.Image = js.native
    /**
    	 * Creates an instance of fabric.Image from an URL string
    	 * @param url URL to create an image from
    	 * @param [callback] Callback to invoke when image is created (newly created image is passed as a first argument)
    	 * @param [imgOptions] Options object
    	 */
    def fromURL(url: String): typings.fabric.fabricDashImplMod.Image = js.native
    def fromURL(url: String, callback: js.Function1[/* image */ this.type, Unit]): typings.fabric.fabricDashImplMod.Image = js.native
    def fromURL(url: String, callback: js.Function1[/* image */ this.type, Unit], imgOptions: IImageOptions): typings.fabric.fabricDashImplMod.Image = js.native
  }
  
  /* static members */
  @js.native
  object Intersection extends js.Object {
    /**
    	 * Checks if one line intersects another
    	 */
    def intersectLineLine(
      a1: typings.fabric.fabricDashImplMod.Point,
      a2: typings.fabric.fabricDashImplMod.Point,
      b1: typings.fabric.fabricDashImplMod.Point,
      b2: typings.fabric.fabricDashImplMod.Point
    ): typings.fabric.fabricDashImplMod.Intersection = js.native
    /**
    	 * Checks if line intersects polygon
    	 */
    def intersectLinePolygon(
      a1: typings.fabric.fabricDashImplMod.Point,
      a2: typings.fabric.fabricDashImplMod.Point,
      points: js.Array[typings.fabric.fabricDashImplMod.Point]
    ): typings.fabric.fabricDashImplMod.Intersection = js.native
    /**
    	 * Checks if polygon intersects another polygon
    	 */
    def intersectPolygonPolygon(
      points1: js.Array[typings.fabric.fabricDashImplMod.Point],
      points2: js.Array[typings.fabric.fabricDashImplMod.Point]
    ): typings.fabric.fabricDashImplMod.Intersection = js.native
    /**
    	 * Checks if polygon intersects rectangle
    	 */
    def intersectPolygonRectangle(points: js.Array[typings.fabric.fabricDashImplMod.Point], r1: Double, r2: Double): typings.fabric.fabricDashImplMod.Intersection = js.native
  }
  
  /* static members */
  @js.native
  object Line extends js.Object {
    var ATTRIBUTE_NAMES: js.Array[String] = js.native
    /**
    	 * Returns fabric.Line instance from an SVG element
    	 * @static
    	 * @memberOf fabric.Line
    	 * @param {SVGElement} element Element to parse
    	 * @param {Object} [options] Options object
    	 * @param {Function} [callback] callback function invoked after parsing
    	 */
    def fromElement(element: SVGElement): typings.fabric.fabricDashImplMod.Line = js.native
    def fromElement(element: SVGElement, callback: js.Function): typings.fabric.fabricDashImplMod.Line = js.native
    def fromElement(element: SVGElement, callback: js.Function, options: ILineOptions): typings.fabric.fabricDashImplMod.Line = js.native
    /**
    	 * Returns fabric.Line instance from an object representation
    	 * @param object Object to create an instance from
    	 */
    def fromObject(`object`: js.Any): typings.fabric.fabricDashImplMod.Line = js.native
  }
  
  /* static members */
  @js.native
  object Object extends js.Object {
    /**
      * Creates fabric Object instance
      * @param {string} Class name
      * @param {fabric.Object} Original object
      * @param {Function} Callback when complete
      * @param {Object} Extra parameters for fabric.Object
      * @private
      * @return {fabric.Object}
      */
    def _fromObject(className: String, `object`: typings.fabric.fabricDashImplMod.Object): typings.fabric.fabricDashImplMod.Object = js.native
    def _fromObject(className: String, `object`: typings.fabric.fabricDashImplMod.Object, callback: js.Function): typings.fabric.fabricDashImplMod.Object = js.native
    def _fromObject(
      className: String,
      `object`: typings.fabric.fabricDashImplMod.Object,
      callback: js.Function,
      extraParam: js.Any
    ): typings.fabric.fabricDashImplMod.Object = js.native
  }
  
  /* static members */
  @js.native
  object Path extends js.Object {
    /**
    	 * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
    	 */
    var ATTRIBUTE_NAMES: js.Array[String] = js.native
    /**
    	 * Creates an instance of fabric.Path from an SVG <path> element
    	 * @param element to parse
    	 * @param callback Callback to invoke when an fabric.Path instance is created
    	 * @param [options] Options object
    	 */
    def fromElement(element: SVGElement, callback: js.Function): typings.fabric.fabricDashImplMod.Path = js.native
    def fromElement(element: SVGElement, callback: js.Function, options: IPathOptions): typings.fabric.fabricDashImplMod.Path = js.native
    /**
    	 * Creates an instance of fabric.Path from an object
    	 * @param callback Callback to invoke when an fabric.Path instance is created
    	 */
    def fromObject(`object`: js.Any, callback: js.Function): typings.fabric.fabricDashImplMod.Path = js.native
  }
  
  /* static members */
  @js.native
  object Polygon extends js.Object {
    /**
    	 * Returns Polygon instance from an SVG element
    	 * @param element Element to parse
    	 * @param [options] Options object
    	 */
    def fromElement(element: SVGElement): typings.fabric.fabricDashImplMod.Polygon = js.native
    def fromElement(element: SVGElement, options: IPolylineOptions): typings.fabric.fabricDashImplMod.Polygon = js.native
    /**
    	 * Returns fabric.Polygon instance from an object representation
    	 * @param object Object to create an instance from
    	 */
    def fromObject(`object`: js.Any): typings.fabric.fabricDashImplMod.Polygon = js.native
  }
  
  /* static members */
  @js.native
  object Polyline extends js.Object {
    /**
    	 * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
    	 */
    var ATTRIBUTE_NAMES: js.Array[String] = js.native
    /**
    	 * Returns Polyline  instance from an SVG element
    	 * @param element Element to parse
    	 * @param [options] Options object
    	 */
    def fromElement(element: SVGElement): typings.fabric.fabricDashImplMod.Polyline = js.native
    def fromElement(element: SVGElement, options: IPolylineOptions): typings.fabric.fabricDashImplMod.Polyline = js.native
    /**
    	 * Returns fabric.Polyline instance from an object representation
    	 * @param object Object to create an instance from
    	 */
    def fromObject(`object`: js.Any): typings.fabric.fabricDashImplMod.Polyline = js.native
  }
  
  /* static members */
  @js.native
  object Rect extends js.Object {
    /**
    	 * List of attribute names to account for when parsing SVG element (used by `fabric.Rect.fromElement`)
    	 */
    var ATTRIBUTE_NAMES: js.Array[String] = js.native
    /**
    	 * Returns Rect instance from an SVG element
    	 * @param element Element to parse
    	 * @param [options] Options object
    	 */
    def fromElement(element: SVGElement): typings.fabric.fabricDashImplMod.Rect = js.native
    def fromElement(element: SVGElement, options: IRectOptions): typings.fabric.fabricDashImplMod.Rect = js.native
    /**
    	 * Returns Rect instance from an object representation
    	 * @param object Object to create an instance from
    	 */
    def fromObject(`object`: js.Any): typings.fabric.fabricDashImplMod.Rect = js.native
  }
  
  /* static members */
  @js.native
  object Shadow extends js.Object {
    /**
    	 * Regex matching shadow offsetX, offsetY and blur (ex: "2px 2px 10px rgba(0,0,0,0.2)", "rgb(0,255,0) 2px 2px")
    	 * @static
    	 * @field
    	 * @memberOf fabric.Shadow
    	 */
    var reOffsetsAndBlur: RegExp = js.native
  }
  
  /* static members */
  @js.native
  object StaticCanvas extends js.Object {
    /**
    	 * @static
    	 * @type String
    	 * @default
    	 */
    var EMPTY_JSON: String = js.native
    /**
    	 * Provides a way to check support of some of the canvas methods
    	 * (either those of HTMLCanvasElement itself, or rendering context)
    	 *
    	 * @param {String} methodName Method to check support for;
    	 *                            Could be one of "setLineDash"
    	 * @return {Boolean | null} `true` if method is supported (or at least exists),
    	 *                          `null` if canvas element or context can not be initialized
    	 */
    @JSName("supports")
    def supports_getImageData(methodName: getImageData): Boolean = js.native
    @JSName("supports")
    def supports_setLineDash(methodName: setLineDash): Boolean = js.native
    @JSName("supports")
    def supports_toDataURL(methodName: toDataURL): Boolean = js.native
    @JSName("supports")
    def supports_toDataURLWithQuality(methodName: toDataURLWithQuality): Boolean = js.native
    /**
    	 * Returns JSON representation of canvas
    	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
    	 */
    def toJSON(): String = js.native
    def toJSON(propertiesToInclude: js.Array[String]): String = js.native
  }
  
  /* static members */
  @js.native
  object Text extends js.Object {
    var DEFAULT_SVG_FONT_SIZE: Double = js.native
    /**
    	 * Returns fabric.Text instance from an SVG element (<b>not yet implemented</b>)
    	 * @static
    	 * @memberOf fabric.Text
    	 * @param {SVGElement} element Element to parse
    	 * @param {Function} callback callback function invoked after parsing
    	 * @param {Object} [options] Options object
    	 */
    def fromElement(element: SVGElement): typings.fabric.fabricDashImplMod.Text = js.native
    def fromElement(element: SVGElement, callback: js.Function): typings.fabric.fabricDashImplMod.Text = js.native
    def fromElement(element: SVGElement, callback: js.Function, options: TextOptions): typings.fabric.fabricDashImplMod.Text = js.native
    /**
    	 * Returns fabric.Text instance from an object representation
    	 * @static
    	 * @memberOf fabric.Text
    	 * @param {Object} object Object to create an instance from
    	 * @param {Function} [callback] Callback to invoke when an fabric.Text instance is created
    	 */
    def fromObject(`object`: js.Any): typings.fabric.fabricDashImplMod.Text = js.native
    def fromObject(`object`: js.Any, callback: js.Function): typings.fabric.fabricDashImplMod.Text = js.native
  }
  
  /* static members */
  @js.native
  object Textbox extends js.Object {
    /**
    	 * Returns fabric.Textbox instance from an object representation
    	 * @static
    	 * @memberOf fabric.Textbox
    	 * @param {Object} object Object to create an instance from
    	 * @param {Function} [callback] Callback to invoke when an fabric.Textbox instance is created
    	 */
    def fromObject(`object`: js.Any): typings.fabric.fabricDashImplMod.Textbox = js.native
    def fromObject(`object`: js.Any, callback: js.Function): typings.fabric.fabricDashImplMod.Textbox = js.native
  }
  
  /* static members */
  @js.native
  object Triangle extends js.Object {
    /**
    	 * Returns Triangle instance from an object representation
    	 * @param object Object to create an instance from
    	 */
    def fromObject(`object`: js.Any): typings.fabric.fabricDashImplMod.Triangle = js.native
  }
  
}

