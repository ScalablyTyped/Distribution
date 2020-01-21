package typings.dojo.dojox.gfx

import typings.dojo.dojo.base.Color
import typings.dojo.dojox.gfx.matrix.Matrix2D
import typings.std.HTMLElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/_base.html
  *
  *
  */
@js.native
trait base extends js.Object {
  /**
    * Defines how to fill a shape. Four types of fills can be used: solid, linear gradient, radial gradient and pattern.
    * See dojox/gfx.LinearGradient, dojox/gfx.RadialGradient and dojox/gfx.Pattern respectively for more information about the properties supported by each type.
    *
    */
  var Fill: js.Object = js.native
  /**
    * An object specifying the properties for a Font used in text operations.
    *
    */
  var Font: js.Object = js.native
  /**
    * An object defining the default stylistic properties used for Linear Gradient fills.
    * Linear gradients are drawn along a virtual line, which results in appearance of a rotated pattern in a given direction/orientation.
    *
    */
  var LinearGradient: js.Object = js.native
  /**
    * An object specifying the default properties for a Pattern using in fill operations.
    *
    */
  var Pattern: js.Object = js.native
  /**
    * Specifies the properties for RadialGradients using in fills patterns.
    *
    */
  var RadialGradient: js.Object = js.native
  /**
    * A stroke defines stylistic properties that are used when drawing a path.
    *
    */
  var Stroke: js.Object = js.native
  /**
    *
    */
  var VectorText: js.Object = js.native
  /**
    * This module contains the core graphics Arc functions.
    *
    */
  var arc: js.Object = js.native
  /**
    *
    */
  var bezierutils: js.Object = js.native
  /**
    * This the graphics rendering bridge for W3C Canvas compliant browsers.
    * Since Canvas is an immediate mode graphics api, with no object graph or
    * eventing capabilities, use of this module alone will only add in drawing support.
    * The additional module, canvasWithEvents extends this module with additional support
    * for handling events on Canvas.  By default, the support for events is now included
    * however, if only drawing capabilities are needed, canvas event module can be disabled
    * using the dojoConfig option, canvasEvents:true|false.
    * The id of the Canvas renderer is 'canvas'.  This id can be used when switch Dojo's
    * graphics context between renderer implementations.  See dojox/gfx/_base.switchRenderer
    * API.
    *
    */
  var canvas: js.Object = js.native
  /**
    * This the graphics rendering bridge for W3C Canvas compliant browsers which extends
    * the basic canvas drawing renderer bridge to add additional support for graphics events
    * on Shapes.
    * Since Canvas is an immediate mode graphics api, with no object graph or
    * eventing capabilities, use of the canvas module alone will only add in drawing support.
    * This additional module, canvasWithEvents extends this module with additional support
    * for handling events on Canvas.  By default, the support for events is now included
    * however, if only drawing capabilities are needed, canvas event module can be disabled
    * using the dojoConfig option, canvasEvents:true|false.
    *
    */
  var canvasWithEvents: js.Object = js.native
  /**
    *
    */
  var canvas_attach: js.Object = js.native
  /**
    *
    */
  var canvasext: js.Object = js.native
  /**
    * points per centimeter (constant)
    *
    */
  var cm_in_pt: Double = js.native
  /**
    * An object defining the default Circle prototype.
    *
    */
  var defaultCircle: js.Object = js.native
  /**
    * Defines the default Ellipse prototype.
    *
    */
  var defaultEllipse: js.Object = js.native
  /**
    * An object specifying the default properties for a Font used in text operations.
    *
    */
  var defaultFont: js.Object = js.native
  /**
    * Defines the default Image prototype.
    *
    */
  var defaultImage: js.Object = js.native
  /**
    * An object defining the default Line prototype.
    *
    */
  var defaultLine: js.Object = js.native
  /**
    * An object defining the default stylistic properties used for Linear Gradient fills.
    * Linear gradients are drawn along a virtual line, which results in appearance of a rotated pattern in a given direction/orientation.
    *
    */
  var defaultLinearGradient: js.Object = js.native
  /**
    * Defines the default Path prototype object.
    *
    */
  var defaultPath: js.Object = js.native
  /**
    * An object specifying the default properties for a Pattern using in fill operations.
    *
    */
  var defaultPattern: js.Object = js.native
  /**
    * Defines the default PolyLine prototype.
    *
    */
  var defaultPolyline: js.Object = js.native
  /**
    * An object specifying the default properties for RadialGradients using in fills patterns.
    *
    */
  var defaultRadialGradient: js.Object = js.native
  /**
    * Defines the default Rect prototype.
    *
    */
  var defaultRect: js.Object = js.native
  /**
    * A stroke defines stylistic properties that are used when drawing a path.
    * This object defines the default Stroke prototype.
    *
    */
  var defaultStroke: js.Object = js.native
  /**
    * Defines the default Text prototype.
    *
    */
  var defaultText: js.Object = js.native
  /**
    * Defines the default TextPath prototype.
    *
    */
  var defaultTextPath: js.Object = js.native
  /**
    *
    */
  var defaultVectorFont: js.Object = js.native
  /**
    *
    */
  var defaultVectorText: js.Object = js.native
  /**
    *
    */
  var fx: js.Object = js.native
  /**
    *
    */
  var getDefault: js.Object = js.native
  /**
    *
    */
  var gradient: js.Object = js.native
  /**
    *
    */
  var gradutils: js.Object = js.native
  /**
    *
    */
  var matrix: js.Object = js.native
  /**
    * points per millimeter (constant)
    *
    */
  var mm_in_pt: Double = js.native
  /**
    *
    */
  var move: js.Object = js.native
  /**
    * This module contains the core graphics Path API.
    * Path command format follows the W3C SVG 1.0 Path api.
    *
    */
  var path: js.Object = js.native
  /**
    *
    */
  var pathSvgRegExp: RegExp = js.native
  /**
    * a constant regular expression used to split a SVG/VML path into primitive components
    *
    */
  var pathVmlRegExp: RegExp = js.native
  /**
    * Either the string name of a renderer (eg. 'canvas', 'svg, ...) or the renderer
    * object to switch to.
    *
    */
  var renderer: String = js.native
  /**
    * This module contains the core graphics Shape API.
    * Different graphics renderer implementation modules (svg, canvas, vml, silverlight, etc.) extend this
    * basic api to provide renderer-specific implementations for each shape.
    *
    */
  var shape: js.Object = js.native
  /**
    * This the graphics rendering bridge for the Microsoft Silverlight plugin.
    * Silverlight is a faster implementation on IE6-8 than the default 2d graphics, VML
    *
    */
  var silverlight: js.Object = js.native
  /**
    *
    */
  var silverlight_attach: js.Object = js.native
  /**
    * This the graphics rendering bridge for browsers compliant with W3C SVG1.0.
    * This is the preferred renderer to use for interactive and accessible graphics.
    *
    */
  var svg: js.Object = js.native
  /**
    *
    */
  var svgext: js.Object = js.native
  /**
    *
    */
  var utils: js.Object = js.native
  /**
    *
    */
  var vectorFontFitting: js.Object = js.native
  /**
    * This the default graphics rendering bridge for IE6-7.
    * This renderer is very slow.  For best performance on IE6-8, use Silverlight plugin.
    * IE9+ defaults to the standard W3C SVG renderer.
    *
    */
  var vml: js.Object = js.native
  /**
    *
    */
  def Circle(): Unit = js.native
  /**
    *
    */
  def Ellipse(): Unit = js.native
  /**
    *
    */
  def Group(): Unit = js.native
  /**
    *
    */
  def Line(): Unit = js.native
  /**
    * a 2D matrix object
    * Normalizes a 2D matrix-like object. If arrays is passed,
    * all objects of the array are normalized and multiplied sequentially.
    *
    * @param arg a 2D matrix-like object, a number, or an array of such objects
    */
  def Matrix2D(arg: js.Object): Unit = js.native
  /**
    *
    */
  def Moveable(): Unit = js.native
  /**
    *
    */
  def Mover(): Unit = js.native
  /**
    *
    */
  def Path(): Unit = js.native
  /**
    *
    */
  def Point(): Unit = js.native
  /**
    *
    */
  def Polyline(): Unit = js.native
  /**
    *
    */
  def Rect(): Unit = js.native
  /**
    *
    */
  def Rectangle(): Unit = js.native
  /**
    *
    */
  def Surface(): Unit = js.native
  /**
    *
    */
  def Text(): Unit = js.native
  /**
    *
    */
  def TextPath(): Unit = js.native
  /**
    *
    */
  def VectorFont(): Unit = js.native
  /**
    * creates a surface
    *
    * @param parentNode a parent node
    * @param width width of surface, e.g., "100px" or 100
    * @param height height of surface, e.g., "100px" or 100
    */
  def createSurface(parentNode: HTMLElement, width: String, height: String): Surface = js.native
  /**
    * creates a surface
    *
    * @param parentNode a parent node
    * @param width width of surface, e.g., "100px" or 100
    * @param height height of surface, e.g., "100px" or 100
    */
  def createSurface(parentNode: HTMLElement, width: String, height: Double): Surface = js.native
  /**
    * creates a surface
    *
    * @param parentNode a parent node
    * @param width width of surface, e.g., "100px" or 100
    * @param height height of surface, e.g., "100px" or 100
    */
  def createSurface(parentNode: HTMLElement, width: Double, height: String): Surface = js.native
  /**
    * creates a surface
    *
    * @param parentNode a parent node
    * @param width width of surface, e.g., "100px" or 100
    * @param height height of surface, e.g., "100px" or 100
    */
  def createSurface(parentNode: HTMLElement, width: Double, height: Double): Surface = js.native
  /**
    * Decompose a 2D matrix into translation, scaling, and rotation components.
    * This function decompose a matrix into four logical components:
    * translation, rotation, scaling, and one more rotation using SVD.
    * The components should be applied in following order:
    *
    * [translate, rotate(angle2), scale, rotate(angle1)]
    *
    * @param matrix a 2D matrix-like object
    */
  def decompose(matrix: Matrix2D): Unit = js.native
  /**
    * compares event sources, returns true if they are equal
    *
    * @param a
    * @param b
    */
  def equalSources(a: js.Any, b: js.Any): Unit = js.native
  /**
    * converts a number to a string using a fixed notation
    *
    * @param x number to be converted
    * @param addSpace whether to add a space before a positive number
    */
  def formatNumber(x: Double, addSpace: Boolean): String = js.native
  /**
    *
    * @param url
    */
  def getVectorFont(url: String): js.Any = js.native
  /**
    * converts a font object to a CSS font string
    *
    * @param font font object (see dojox/gfx.defaultFont)
    */
  def makeFontString(font: js.Object): String = js.native
  /**
    * copies the original object, and all copied properties from the
    * 'update' object
    *
    * @param defaults the object to be cloned before updating
    * @param update the object, which properties are to be cloned during updating
    */
  def makeParameters(defaults: js.Object, update: js.Object): js.Object = js.native
  /**
    * converts any legal color representation to normalized
    * dojo/Color object
    *
    * @param color A color representation.
    */
  def normalizeColor(color: String): js.Any = js.native
  /**
    * converts any legal color representation to normalized
    * dojo/Color object
    *
    * @param color A color representation.
    */
  def normalizeColor(color: js.Array[_]): js.Any = js.native
  /**
    * converts any legal color representation to normalized
    * dojo/Color object
    *
    * @param color A color representation.
    */
  def normalizeColor(color: js.Object): js.Any = js.native
  /**
    * converts any legal color representation to normalized
    * dojo/Color object
    *
    * @param color A color representation.
    */
  def normalizeColor(color: Color): js.Any = js.native
  /**
    * updates an existing object with properties from an 'update'
    * object
    *
    * @param existed the target object to be updated
    * @param update the 'update' object, whose properties will be used to updatethe existed object
    */
  def normalizeParameters(existed: js.Object, update: js.Object): js.Object = js.native
  /**
    * converts any length value to pixels
    *
    * @param len a length, e.g., '12pc'
    */
  def normalizedLength(len: String): Double = js.native
  /**
    * converts points to pixels
    *
    * @param len a value in points
    */
  def pt2px(len: Double): Double = js.native
  /**
    * converts pixels to points
    *
    * @param len a value in pixels
    */
  def px2pt(len: Double): Double = js.native
  /**
    * returns the current number of pixels per point.
    *
    */
  def px_in_pt(): Double = js.native
  /**
    * converts a CSS font string to a font object
    * Converts a CSS font string to a gfx font object. The CSS font
    * string components should follow the W3C specified order
    * (see http://www.w3.org/TR/CSS2/fonts.html#font-shorthand):
    * style, variant, weight, size, optional line height (will be
    * ignored), and family. Note that the Font.size attribute is limited to numeric CSS length.
    *
    * @param str a CSS font string.
    */
  def splitFontString(str: String): js.Object = js.native
  /**
    * switch the graphics implementation to the specified renderer.
    *
    * @param renderer Either the string name of a renderer (eg. 'canvas', 'svg, ...) or the rendererobject to switch to.
    */
  def switchTo(renderer: String): Unit = js.native
  /**
    * switch the graphics implementation to the specified renderer.
    *
    * @param renderer Either the string name of a renderer (eg. 'canvas', 'svg, ...) or the rendererobject to switch to.
    */
  def switchTo(renderer: js.Object): Unit = js.native
}

