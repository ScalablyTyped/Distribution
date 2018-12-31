package typings
package fabricLib.fabricMod

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
    extends fabricLib.fabricDashImplMod.ActiveSelection {
    def this(items: js.Array[fabricLib.fabricDashImplMod.Object]) = this()
    def this(items: js.Array[fabricLib.fabricDashImplMod.Object], options: fabricLib.fabricDashImplMod.IObjectOptions) = this()
  }
  
  @js.native
  class BaseBrush ()
    extends fabricLib.fabricDashImplMod.BaseBrush
  
  @js.native
  class Canvas protected ()
    extends fabricLib.fabricDashImplMod.Canvas {
    def this(element: java.lang.String) = this()
    /**
    	 * Constructor
    	 * @param element <canvas> element to initialize instance on
    	 * @param [options] Options object
    	 */
    def this(element: stdLib.HTMLCanvasElement) = this()
    def this(element: java.lang.String, options: fabricLib.fabricDashImplMod.ICanvasOptions) = this()
    def this(element: stdLib.HTMLCanvasElement, options: fabricLib.fabricDashImplMod.ICanvasOptions) = this()
  }
  
  @js.native
  class Canvas2dFilterBackend ()
    extends fabricLib.fabricDashImplMod.Canvas2dFilterBackend
  
  @js.native
  class Circle ()
    extends fabricLib.fabricDashImplMod.Circle {
    def this(options: fabricLib.fabricDashImplMod.ICircleOptions) = this()
  }
  
  @js.native
  class CircleBrush ()
    extends fabricLib.fabricDashImplMod.CircleBrush
  
  @js.native
  /**
  	 * Color class
  	 * The purpose of Color is to abstract and encapsulate common color operations;
  	 * @param color optional in hex or rgb(a) format
  	 */
  class Color ()
    extends fabricLib.fabricDashImplMod.Color {
    def this(color: java.lang.String) = this()
  }
  
  @js.native
  class Ellipse ()
    extends fabricLib.fabricDashImplMod.Ellipse {
    def this(options: fabricLib.fabricDashImplMod.IEllipseOptions) = this()
  }
  
  @js.native
  /**
  	 * Constructor
  	 * @param objects Group objects
  	 * @param [options] Options object
  	 */
  class Group ()
    extends fabricLib.fabricDashImplMod.Group {
    def this(items: js.Array[_]) = this()
    def this(items: js.Array[_], options: fabricLib.fabricDashImplMod.IObjectOptions) = this()
  }
  
  @js.native
  class IText protected ()
    extends fabricLib.fabricDashImplMod.IText {
    /**
    	 * Constructor
    	 * @param text Text string
    	 * @param [options] Options object
    	 */
    def this(text: java.lang.String) = this()
    def this(text: java.lang.String, options: fabricLib.fabricDashImplMod.IITextOptions) = this()
  }
  
  @js.native
  class Image protected ()
    extends fabricLib.fabricDashImplMod.Image {
    /**
    	 * Constructor
    	 * @param element Image element
    	 * @param [options] Options object
    	 */
    def this(element: stdLib.HTMLImageElement, objObjects: fabricLib.fabricDashImplMod.IObjectOptions) = this()
  }
  
  @js.native
  class Intersection ()
    extends fabricLib.fabricDashImplMod.Intersection {
    def this(status: java.lang.String) = this()
  }
  
  @js.native
  /**
  	 * Constructor
  	 * @param [points] Array of points
  	 * @param [options] Options object
  	 */
  class Line ()
    extends fabricLib.fabricDashImplMod.Line {
    def this(points: js.Array[scala.Double]) = this()
    def this(points: js.Array[scala.Double], objObjects: fabricLib.fabricDashImplMod.IObjectOptions) = this()
  }
  
  @js.native
  class Object ()
    extends fabricLib.fabricDashImplMod.Object
  
  @js.native
  /**
  	 * Constructor
  	 * @param path Path data (sequence of coordinates and corresponding "command" tokens)
  	 * @param [options] Options object
  	 */
  class Path ()
    extends fabricLib.fabricDashImplMod.Path {
    def this(path: java.lang.String) = this()
    def this(path: js.Array[_]) = this()
    def this(path: java.lang.String, options: fabricLib.fabricDashImplMod.IPathOptions) = this()
    def this(path: js.Array[_], options: fabricLib.fabricDashImplMod.IPathOptions) = this()
  }
  
  @js.native
  class PathGroup protected ()
    extends fabricLib.fabricDashImplMod.PathGroup {
    /**
    	 * Constructor
    	 * @param [options] Options object
    	 */
    def this(paths: js.Array[fabricLib.fabricDashImplMod.Path]) = this()
    def this(paths: js.Array[fabricLib.fabricDashImplMod.Path], options: fabricLib.fabricDashImplMod.IObjectOptions) = this()
  }
  
  @js.native
  class Pattern ()
    extends fabricLib.fabricDashImplMod.Pattern {
    def this(options: fabricLib.fabricDashImplMod.IPatternOptions) = this()
  }
  
  @js.native
  class PatternBrush ()
    extends fabricLib.fabricDashImplMod.PatternBrush
  
  @js.native
  class PencilBrush ()
    extends fabricLib.fabricDashImplMod.PencilBrush
  
  @js.native
  class Point protected ()
    extends fabricLib.fabricDashImplMod.Point {
    def this(x: scala.Double, y: scala.Double) = this()
  }
  
  @js.native
  class Polygon protected ()
    extends fabricLib.fabricDashImplMod.Polygon {
    /**
    	 * Constructor
    	 * @param points Array of points
    	 * @param [options] Options object
    	 */
    def this(points: js.Array[fabricLib.Anon_Y]) = this()
    def this(points: js.Array[fabricLib.Anon_Y], options: fabricLib.fabricDashImplMod.IObjectOptions) = this()
    def this(points: js.Array[fabricLib.Anon_Y], options: fabricLib.fabricDashImplMod.IObjectOptions, skipOffset: scala.Boolean) = this()
  }
  
  @js.native
  class Polyline protected ()
    extends fabricLib.fabricDashImplMod.Polyline {
    /**
    	 * Constructor
    	 * @param points Array of points (where each point is an object with x and y)
    	 * @param [options] Options object
    	 * @param [skipOffset] Whether points offsetting should be skipped
    	 */
    def this(points: js.Array[fabricLib.Anon_Y]) = this()
    def this(points: js.Array[fabricLib.Anon_Y], options: fabricLib.fabricDashImplMod.IPolylineOptions) = this()
  }
  
  @js.native
  /**
  	 * Constructor
  	 * @param [options] Options object
  	 */
  class Rect ()
    extends fabricLib.fabricDashImplMod.Rect {
    def this(options: fabricLib.fabricDashImplMod.IRectOptions) = this()
  }
  
  @js.native
  class Shadow ()
    extends fabricLib.fabricDashImplMod.Shadow {
    def this(options: fabricLib.fabricDashImplMod.IShadowOptions) = this()
  }
  
  @js.native
  class SprayBrush ()
    extends fabricLib.fabricDashImplMod.SprayBrush
  
  @js.native
  class StaticCanvas protected ()
    extends fabricLib.fabricDashImplMod.StaticCanvas {
    def this(element: java.lang.String) = this()
    /**
    	 * Constructor
    	 * @param element <canvas> element to initialize instance on
    	 * @param [options] Options object
    	 */
    def this(element: stdLib.HTMLCanvasElement) = this()
    def this(element: java.lang.String, options: fabricLib.fabricDashImplMod.ICanvasOptions) = this()
    def this(element: stdLib.HTMLCanvasElement, options: fabricLib.fabricDashImplMod.ICanvasOptions) = this()
  }
  
  @js.native
  class Text protected ()
    extends fabricLib.fabricDashImplMod.Text {
    /**
    	 * Constructor
    	 * @param text Text string
    	 * @param [options] Options object
    	 */
    def this(text: java.lang.String) = this()
    def this(text: java.lang.String, options: fabricLib.fabricDashImplMod.ITextOptions) = this()
  }
  
  @js.native
  class Textbox protected ()
    extends fabricLib.fabricDashImplMod.Textbox {
    /**
      * Constructor
      * @param text Text string
      * @param [options] Options object
      */
    def this(text: java.lang.String) = this()
    def this(text: java.lang.String, options: fabricLib.fabricDashImplMod.IITextOptions) = this()
  }
  
  @js.native
  /**
  	 * Constructor
  	 * @param [options] Options object
  	 */
  class Triangle ()
    extends fabricLib.fabricDashImplMod.Triangle {
    def this(options: fabricLib.fabricDashImplMod.ITriangleOptions) = this()
  }
  
  @js.native
  class WebglFilterBackend ()
    extends fabricLib.fabricDashImplMod.WebglFilterBackend {
    def this(options: fabricLib.fabricDashImplMod.WebglFilterBackendOptions) = this()
  }
  
  var filterBackend: fabricLib.fabricDashImplMod.FilterBackend = js.native
  val isLikelyNode: scala.Boolean = js.native
  val isTouchSupported: scala.Boolean = js.native
  val util: fabricLib.fabricDashImplMod.IUtil = js.native
  def createCanvasForNode(width: scala.Double, height: scala.Double): fabricLib.fabricDashImplMod.Canvas = js.native
  def createSVGFontFacesMarkup(objects: js.Array[fabricLib.fabricDashImplMod.Object]): java.lang.String = js.native
  def createSVGRefElementsMarkup(canvas: fabricLib.fabricDashImplMod.StaticCanvas): java.lang.String = js.native
  def getCSSRules(doc: stdLib.SVGElement): js.Any = js.native
  def getGradientDefs(doc: stdLib.SVGElement): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def loadSVGFromString(
    string: java.lang.String,
    callback: js.Function2[
      /* results */ js.Array[fabricLib.fabricDashImplMod.Object], 
      /* options */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def loadSVGFromString(
    string: java.lang.String,
    callback: js.Function2[
      /* results */ js.Array[fabricLib.fabricDashImplMod.Object], 
      /* options */ js.Any, 
      scala.Unit
    ],
    reviver: js.Function
  ): scala.Unit = js.native
  def loadSVGFromURL(
    url: java.lang.String,
    callback: js.Function2[
      /* results */ js.Array[fabricLib.fabricDashImplMod.Object], 
      /* options */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def loadSVGFromURL(
    url: java.lang.String,
    callback: js.Function2[
      /* results */ js.Array[fabricLib.fabricDashImplMod.Object], 
      /* options */ js.Any, 
      scala.Unit
    ],
    reviver: js.Function
  ): scala.Unit = js.native
  def log(values: js.Any*): scala.Unit = js.native
  def parseAttributes(element: stdLib.HTMLElement, attributes: js.Array[java.lang.String]): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def parseAttributes(element: stdLib.HTMLElement, attributes: js.Array[java.lang.String], svgUid: java.lang.String): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def parseElements(elements: js.Array[stdLib.SVGElement], callback: js.Function): scala.Unit = js.native
  def parseElements(elements: js.Array[_ | stdLib.SVGElement], callback: js.Function, options: js.Any): scala.Unit = js.native
  def parseElements(
    elements: js.Array[_ | stdLib.SVGElement],
    callback: js.Function,
    options: js.Any,
    reviver: js.Function
  ): scala.Unit = js.native
  def parseFontDeclaration(value: java.lang.String, oStyle: js.Any): scala.Unit = js.native
  def parsePointsAttribute(points: java.lang.String): js.Array[_] = js.native
  def parseSVGDocument(
    doc: stdLib.SVGElement,
    callback: js.Function2[
      /* results */ js.Array[fabricLib.fabricDashImplMod.Object], 
      /* options */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def parseSVGDocument(
    doc: stdLib.SVGElement,
    callback: js.Function2[
      /* results */ js.Array[fabricLib.fabricDashImplMod.Object], 
      /* options */ js.Any, 
      scala.Unit
    ],
    reviver: js.Function
  ): scala.Unit = js.native
  def parseStyleAttribute(element: stdLib.SVGElement): js.Any = js.native
  def parseTransformAttribute(attributeValue: java.lang.String): js.Array[scala.Double] = js.native
  def warn(values: js.Any*): scala.Unit = js.native
  @js.native
  object ActiveSelection extends js.Object {
    /**
    	 * Returns {@link fabric.ActiveSelection} instance from an object representation
    	 * @memberOf fabric.ActiveSelection
    	 * @param object Object to create a group from
    	 * @param [callback] Callback to invoke when an ActiveSelection instance is created
    	 */
    def fromObject(
      `object`: fabricLib.fabricDashImplMod.Group,
      callback: js.Function1[/* activeSelection */ this.type, scala.Unit]
    ): scala.Unit = js.native
  }
  
  @js.native
  object Canvas extends js.Object {
    var EMPTY_JSON: java.lang.String = js.native
    /**
    	 * Provides a way to check support of some of the canvas methods
    	 * (either those of HTMLCanvasElement itself, or rendering context)
    	 * @param methodName Method to check support for; Could be one of "getImageData", "toDataURL", "toDataURLWithQuality" or "setLineDash"
    	 */
    @JSName("supports")
    def supports_getImageData(methodName: fabricLib.fabricLibStrings.getImageData): scala.Boolean = js.native
    @JSName("supports")
    def supports_setLineDash(methodName: fabricLib.fabricLibStrings.setLineDash): scala.Boolean = js.native
    @JSName("supports")
    def supports_toDataURL(methodName: fabricLib.fabricLibStrings.toDataURL): scala.Boolean = js.native
    @JSName("supports")
    def supports_toDataURLWithQuality(methodName: fabricLib.fabricLibStrings.toDataURLWithQuality): scala.Boolean = js.native
    /**
    	 * Returns JSON representation of canvas
    	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
    	 */
    def toJSON(): java.lang.String = js.native
    def toJSON(propertiesToInclude: js.Array[java.lang.String]): java.lang.String = js.native
  }
  
  @js.native
  object Circle extends js.Object {
    /**
    	 * List of attribute names to account for when parsing SVG element (used by {@link fabric.Circle.fromElement})
    	 */
    var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
    /**
    	 * Returns Circle instance from an SVG element
    	 * @param element Element to parse
    	 * @param [options] Options object
    	 */
    def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.ICircleOptions): fabricLib.fabricDashImplMod.Circle = js.native
    /**
    	 * Returns Circle instance from an object representation
    	 * @param object Object to create an instance from
    	 */
    def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Circle = js.native
  }
  
  @js.native
  object Color extends js.Object {
    /**
    	 * Returns new color object, when given a color in HEX format
    	 * @param color Color value ex: FF5555
    	 */
    def fromHex(color: java.lang.String): fabricLib.fabricDashImplMod.Color = js.native
    /**
    	 * Returns new color object, when given a color in HSL format
    	 * @param color Color value ex: hsl(0-260,0%-100%,0%-100%)
    	 */
    def fromHsl(color: java.lang.String): fabricLib.fabricDashImplMod.Color = js.native
    /**
    	 * Returns new color object, when given a color in HSLA format
    	 * @param color Color value ex: hsl(0-260,0%-100%,0%-100%)
    	 */
    def fromHsla(color: java.lang.String): fabricLib.fabricDashImplMod.Color = js.native
    /**
    	 * Returns new color object, when given a color in RGB format
    	 * @param color Color value ex: rgb(0-255,0-255,0-255)
    	 */
    def fromRgb(color: java.lang.String): fabricLib.fabricDashImplMod.Color = js.native
    /**
    	 * Returns new color object, when given a color in RGBA format
    	 * @param color Color value ex: rgb(0-255,0-255,0-255)
    	 */
    def fromRgba(color: java.lang.String): fabricLib.fabricDashImplMod.Color = js.native
    /**
    	 * Returns new color object, when given color in array representation (ex: [200, 100, 100, 0.5])
    	 */
    def fromSource(source: js.Array[scala.Double]): fabricLib.fabricDashImplMod.Color = js.native
    /**
    	 * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in HEX format
    	 * @param color ex: FF5555
    	 */
    def sourceFromHex(color: java.lang.String): js.Array[scala.Double] = js.native
    /**
    	 * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in HSL or HSLA format.
    	 * @param color Color value ex: hsl(0-360,0%-100%,0%-100%) or hsla(0-360,0%-100%,0%-100%, 0-1)
    	 */
    def sourceFromHsl(color: java.lang.String): js.Array[scala.Double] = js.native
    /**
    	 * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in RGB or RGBA format
    	 * @param color Color value ex: rgb(0-255,0-255,0-255), rgb(0%-100%,0%-100%,0%-100%)
    	 */
    def sourceFromRgb(color: java.lang.String): js.Array[scala.Double] = js.native
  }
  
  @js.native
  object Ellipse extends js.Object {
    /**
    	 * List of attribute names to account for when parsing SVG element (used by {@link fabric.Ellipse.fromElement})
    	 */
    var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
    /**
    	 * Returns Ellipse instance from an SVG element
    	 * @param element Element to parse
    	 * @param [options] Options object
    	 */
    def fromElement(element: stdLib.SVGElement): fabricLib.fabricDashImplMod.Ellipse = js.native
    def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.IEllipseOptions): fabricLib.fabricDashImplMod.Ellipse = js.native
    /**
    	 * Returns Ellipse instance from an object representation
    	 * @param object Object to create an instance from
    	 */
    def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Ellipse = js.native
  }
  
  @js.native
  object Group extends js.Object {
    /**
    	 * Returns {@link fabric.Group} instance from an object representation
    	 * @param object Object to create a group from
    	 * @param [callback] Callback to invoke when an group instance is created
    	 */
    def fromObject(`object`: js.Any, callback: js.Function1[/* group */ this.type, _]): scala.Unit = js.native
  }
  
  @js.native
  object IText extends js.Object {
    /**
    	 * Returns fabric.IText instance from an object representation
    	 * @param object Object to create an instance from
    	 */
    def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.IText = js.native
  }
  
  @js.native
  object Image extends js.Object {
    /**
    	 * Default CSS class name for canvas
    	 */
    var CSS_CANVAS: java.lang.String = js.native
    var filters: fabricLib.fabricDashImplMod.IAllFilters = js.native
    /**
    	 * Returns Image instance from an SVG element
    	 * @param element Element to parse
    	 * @param callback Callback to execute when fabric.Image object is created
    	 * @param [options] Options object
    	 */
    def fromElement(element: stdLib.SVGElement, callback: js.Function1[/* image */ this.type, scala.Unit]): scala.Unit = js.native
    def fromElement(
      element: stdLib.SVGElement,
      callback: js.Function1[/* image */ this.type, scala.Unit],
      options: fabricLib.fabricDashImplMod.IImageOptions
    ): scala.Unit = js.native
    /**
    	 * Creates an instance of fabric.Image from its object representation
    	 * @param object Object to create an instance from
    	 * @param [callback] Callback to invoke when an image instance is created
    	 */
    def fromObject(`object`: js.Any, callback: js.Function1[/* image */ this.type, scala.Unit]): scala.Unit = js.native
    /**
    	 * Creates an instance of fabric.Image from an URL string
    	 * @param url URL to create an image from
    	 * @param [callback] Callback to invoke when image is created (newly created image is passed as a first argument)
    	 * @param [imgOptions] Options object
    	 */
    def fromURL(url: java.lang.String): fabricLib.fabricDashImplMod.Image = js.native
    def fromURL(url: java.lang.String, callback: js.Function1[/* image */ this.type, scala.Unit]): fabricLib.fabricDashImplMod.Image = js.native
    def fromURL(
      url: java.lang.String,
      callback: js.Function1[/* image */ this.type, scala.Unit],
      imgOptions: fabricLib.fabricDashImplMod.IImageOptions
    ): fabricLib.fabricDashImplMod.Image = js.native
  }
  
  @js.native
  object Intersection extends js.Object {
    /**
    	 * Checks if one line intersects another
    	 */
    def intersectLineLine(
      a1: fabricLib.fabricDashImplMod.Point,
      a2: fabricLib.fabricDashImplMod.Point,
      b1: fabricLib.fabricDashImplMod.Point,
      b2: fabricLib.fabricDashImplMod.Point
    ): fabricLib.fabricDashImplMod.Intersection = js.native
    /**
    	 * Checks if line intersects polygon
    	 */
    def intersectLinePolygon(
      a1: fabricLib.fabricDashImplMod.Point,
      a2: fabricLib.fabricDashImplMod.Point,
      points: js.Array[fabricLib.fabricDashImplMod.Point]
    ): fabricLib.fabricDashImplMod.Intersection = js.native
    /**
    	 * Checks if polygon intersects another polygon
    	 */
    def intersectPolygonPolygon(
      points1: js.Array[fabricLib.fabricDashImplMod.Point],
      points2: js.Array[fabricLib.fabricDashImplMod.Point]
    ): fabricLib.fabricDashImplMod.Intersection = js.native
    /**
    	 * Checks if polygon intersects rectangle
    	 */
    def intersectPolygonRectangle(points: js.Array[fabricLib.fabricDashImplMod.Point], r1: scala.Double, r2: scala.Double): fabricLib.fabricDashImplMod.Intersection = js.native
  }
  
  @js.native
  object Line extends js.Object {
    var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
    /**
    	 * Returns fabric.Line instance from an SVG element
    	 * @param element Element to parse
    	 * @param [options] Options object
    	 */
    def fromElement(element: stdLib.SVGElement): fabricLib.fabricDashImplMod.Line = js.native
    def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.ILineOptions): fabricLib.fabricDashImplMod.Line = js.native
    /**
    	 * Returns fabric.Line instance from an object representation
    	 * @param object Object to create an instance from
    	 */
    def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Line = js.native
  }
  
  @js.native
  object Path extends js.Object {
    /**
    	 * Creates an instance of fabric.Path from an SVG <path> element
    	 * @param element to parse
    	 * @param callback Callback to invoke when an fabric.Path instance is created
    	 * @param [options] Options object
    	 */
    def fromElement(element: stdLib.SVGElement, callback: js.Function1[/* path */ this.type, _]): scala.Unit = js.native
    def fromElement(
      element: stdLib.SVGElement,
      callback: js.Function1[/* path */ this.type, _],
      options: fabricLib.fabricDashImplMod.IPathOptions
    ): scala.Unit = js.native
    /**
    	 * Creates an instance of fabric.Path from an object
    	 * @param callback Callback to invoke when an fabric.Path instance is created
    	 */
    def fromObject(`object`: js.Any, callback: js.Function1[/* path */ this.type, _]): scala.Unit = js.native
  }
  
  @js.native
  object PathGroup extends js.Object {
    def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.PathGroup = js.native
    /**
    	 * Creates fabric.PathGroup instance from an object representation
    	 * @param object Object to create an instance from
    	 * @param callback Callback to invoke when an fabric.PathGroup instance is created
    	 */
    def fromObject(`object`: js.Any, callback: js.Function1[/* group */ this.type, _]): scala.Unit = js.native
  }
  
  @js.native
  object Polygon extends js.Object {
    /**
    	 * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
    	 */
    var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
    /**
    	 * Returns Polygon instance from an SVG element
    	 * @param element Element to parse
    	 * @param [options] Options object
    	 */
    def fromElement(element: stdLib.SVGElement): fabricLib.fabricDashImplMod.Polygon = js.native
    def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.IPolygonOptions): fabricLib.fabricDashImplMod.Polygon = js.native
    /**
    	 * Returns fabric.Polygon instance from an object representation
    	 * @param object Object to create an instance from
    	 */
    def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Polygon = js.native
  }
  
  @js.native
  object Polyline extends js.Object {
    /**
    	 * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
    	 */
    var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
    /**
    	 * Returns Polyline  instance from an SVG element
    	 * @param element Element to parse
    	 * @param [options] Options object
    	 */
    def fromElement(element: stdLib.SVGElement): fabricLib.fabricDashImplMod.Polyline = js.native
    def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.IPolylineOptions): fabricLib.fabricDashImplMod.Polyline = js.native
    /**
    	 * Returns fabric.Polyline instance from an object representation
    	 * @param object Object to create an instance from
    	 */
    def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Polyline = js.native
  }
  
  @js.native
  object Rect extends js.Object {
    /**
    	 * List of attribute names to account for when parsing SVG element (used by `fabric.Rect.fromElement`)
    	 */
    var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
    /**
    	 * Returns Rect instance from an SVG element
    	 * @param element Element to parse
    	 * @param [options] Options object
    	 */
    def fromElement(element: stdLib.SVGElement): fabricLib.fabricDashImplMod.Rect = js.native
    def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.IRectOptions): fabricLib.fabricDashImplMod.Rect = js.native
    /**
    	 * Returns Rect instance from an object representation
    	 * @param object Object to create an instance from
    	 */
    def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Rect = js.native
  }
  
  @js.native
  object Shadow extends js.Object {
    var reOffsetsAndBlur: stdLib.RegExp = js.native
  }
  
  @js.native
  object StaticCanvas extends js.Object {
    var EMPTY_JSON: java.lang.String = js.native
    /**
    	 * Provides a way to check support of some of the canvas methods
    	 * (either those of HTMLCanvasElement itself, or rendering context)
    	 * @param methodName Method to check support for; Could be one of "getImageData", "toDataURL", "toDataURLWithQuality" or "setLineDash"
    	 */
    @JSName("supports")
    def supports_getImageData(methodName: fabricLib.fabricLibStrings.getImageData): scala.Boolean = js.native
    @JSName("supports")
    def supports_setLineDash(methodName: fabricLib.fabricLibStrings.setLineDash): scala.Boolean = js.native
    @JSName("supports")
    def supports_toDataURL(methodName: fabricLib.fabricLibStrings.toDataURL): scala.Boolean = js.native
    @JSName("supports")
    def supports_toDataURLWithQuality(methodName: fabricLib.fabricLibStrings.toDataURLWithQuality): scala.Boolean = js.native
    /**
    	 * Returns JSON representation of canvas
    	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
    	 */
    def toJSON(): java.lang.String = js.native
    def toJSON(propertiesToInclude: js.Array[java.lang.String]): java.lang.String = js.native
  }
  
  @js.native
  object Text extends js.Object {
    /**
    	 * List of attribute names to account for when parsing SVG element (used by `fabric.Text.fromElement`)
    	 */
    var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
    /**
    	 * Default SVG font size
    	 */
    var DEFAULT_SVG_FONT_SIZE: scala.Double = js.native
    /**
    	 * Returns fabric.Text instance from an SVG element (<b>not yet implemented</b>)
    	 * @param element Element to parse
    	 * @param [options] Options object
    	 */
    def fromElement(element: stdLib.SVGElement): fabricLib.fabricDashImplMod.Text = js.native
    def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.ITextOptions): fabricLib.fabricDashImplMod.Text = js.native
    /**
    	 * Returns fabric.Text instance from an object representation
    	 * @param object Object to create an instance from
    	 */
    def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Text = js.native
  }
  
  @js.native
  object Triangle extends js.Object {
    /**
    	 * Returns Triangle instance from an object representation
    	 * @param object Object to create an instance from
    	 */
    def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Triangle = js.native
  }
  
}

