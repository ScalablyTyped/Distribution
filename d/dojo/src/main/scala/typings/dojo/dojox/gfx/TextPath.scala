package typings.dojo.dojox.gfx

import typings.dojo.dojox.gfx.matrix.Matrix2D
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.TextPath.html
  *
  * a generalized TextPath shape
  *
  * @param rawNode a DOM node to be used by this TextPath object
  */
@JSGlobal("dojox.gfx.TextPath")
@js.native
class TextPath protected () extends js.Object {
  def this(rawNode: HTMLElement) = this()
  /**
    * Used for displaying bidi scripts in right layout.
    * Defines the base direction of text that displayed, can have 3 values:
    *
    * "ltr" - base direction is left to right.
    * "rtl" - base direction is right to left.
    * "auto" - base direction is contextual (defined by first strong character).
    *
    */
  var textDir: String = js.native
  /**
    * multiplies the existing matrix with an argument on left side
    * (matrix * this.matrix)
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox/gfx/matrix.Matrix2Dconstructor for a list of acceptable arguments)
    */
  def applyLeftTransform(matrix: Matrix2D): js.Function = js.native
  /**
    * multiplies the existing matrix with an argument on right side
    * (this.matrix * matrix)
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox/gfx/matrix.Matrix2Dconstructor for a list of acceptable arguments)
    */
  def applyRightTransform(matrix: Matrix2D): js.Function = js.native
  /**
    * a shortcut for dojox/gfx/shape.Shape.applyRightTransform
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox/gfx/matrix.Matrix2Dconstructor for a list of acceptable arguments)
    */
  def applyTransform(matrix: Matrix2D): js.Function = js.native
  /**
    * forms an elliptic arc segment
    *
    */
  def arcTo(): js.Function = js.native
  /**
    *
    * @param newText
    */
  def bidiPreprocess(newText: js.Any): js.Any = js.native
  /**
    * closes a path
    *
    */
  def closePath(): js.Function = js.native
  /**
    * connects a handler to an event on this shape
    *
    * @param name
    * @param object
    * @param method
    */
  def connect(name: js.Any, `object`: js.Any, method: js.Any): js.Any = js.native
  /**
    * forms a curve segment
    *
    */
  def curveTo(): js.Function = js.native
  /**
    * Releases all internal resources owned by this shape. Once this method has been called,
    * the instance is considered destroyed and should not be used anymore.
    *
    */
  def destroy(): Unit = js.native
  /**
    * connects a handler by token from an event on this shape
    *
    * @param token
    */
  def disconnect(token: js.Any): js.Any = js.native
  /**
    * Applies the right transform on text, according to renderer.
    * Finds the right transformation that should be applied on the text, according to renderer.
    * Was tested in:
    *
    * Renderers:
    * canvas (FF, Chrome, Safari), vml (IE), svg (FF, Chrome, Safari, Opera), silverlight (IE8), svgWeb(FF, Chrome, Safari, Opera, IE).
    *
    * Browsers:
    * IE [6,7,8], FF [3.6], Chrome (latest for February 2011), Safari [5.0.3], Opera [11.01].
    *
    * @param text the string for manipulation, by default return value.
    * @param textDir text direction direction.Can be:"ltr" - for left to right layout."rtl" - for right to left layout"auto" - for contextual layout: the first strong letter decides the direction.
    */
  def formatText(text: String, textDir: String): js.Any = js.native
  /**
    * returns a current value of the absolute mode
    *
    */
  def getAbsoluteMode(): js.Any = js.native
  /**
    * returns the bounding box {x, y, width, height} or null
    *
    */
  def getBoundingBox(): js.Any = js.native
  /**
    *
    */
  def getClip(): js.Any = js.native
  /**
    * returns a Node, which is used as
    * a source of events for this shape
    *
    */
  def getEventSource(): js.Any = js.native
  /**
    * Returns the current fill object or null
    * (see dojox/gfx.defaultLinearGradient,
    * dojox/gfx.defaultRadialGradient,
    * dojox/gfx.defaultPattern,
    * or dojo/Color)
    *
    */
  def getFill(): js.Any = js.native
  /**
    * returns the current font object or null
    *
    */
  def getFont(): js.Any = js.native
  /**
    * returns the last point in the path, or null
    *
    */
  def getLastPosition(): js.Any = js.native
  /**
    * Different graphics rendering subsystems implement shapes in different ways.  This
    * method provides access to the underlying graphics subsystem object.  Clients calling this
    * method and using the return value must be careful not to try sharing or using the underlying node
    * in a general way across renderer implementation.
    * Returns the underlying graphics Node, or null if no underlying graphics node is used by this shape.
    *
    */
  def getNode(): js.Any = js.native
  /**
    * Returns the parent Shape, Group or null if this Shape is unparented.
    * (see dojox/gfx/shape.Surface,
    * or dojox/gfx.Group)
    *
    */
  def getParent(): js.Any = js.native
  /**
    * returns the current Shape object or null
    * (see dojox/gfx.defaultPath,
    * dojox/gfx.defaultPolyline,
    * dojox/gfx.defaultRect,
    * dojox/gfx.defaultEllipse,
    * dojox/gfx.defaultCircle,
    * dojox/gfx.defaultLine,
    * or dojox/gfx.defaultImage)
    *
    */
  def getShape(): js.Any = js.native
  /**
    * Returns the current stroke object or null
    * (see dojox/gfx.defaultStroke)
    *
    */
  def getStroke(): js.Any = js.native
  /**
    * returns the current text object or null
    *
    */
  def getText(): js.Any = js.native
  /**
    * Returns the current transformation matrix applied to this Shape or null
    *
    */
  def getTransform(): js.Any = js.native
  /**
    * returns an array of four points or null
    * four points represent four corners of the untransformed bounding box
    *
    */
  def getTransformedBoundingBox(): js.Any = js.native
  /**
    * forms a horizontal line segment
    *
    */
  def hLineTo(): js.Function = js.native
  /**
    * forms a line segment
    *
    */
  def lineTo(): js.Function = js.native
  /**
    * forms a move segment
    *
    */
  def moveTo(): js.Function = js.native
  /**
    * moves a shape to back of its parent's list of shapes
    *
    */
  def moveToBack(): js.Function = js.native
  /**
    * moves a shape to front of its parent's list of shapes
    *
    */
  def moveToFront(): js.Function = js.native
  /**
    * Connects an event to this shape.
    *
    * @param type
    * @param listener
    */
  def on(`type`: js.Any, listener: js.Any): js.Any = js.native
  /**
    * forms a quadratic curve segment
    *
    */
  def qCurveTo(): js.Function = js.native
  /**
    * forms a quadratic smooth curve segment
    *
    */
  def qSmoothCurveTo(): js.Function = js.native
  /**
    * removes the shape from its parent's list of shapes
    *
    * @param silently if true, do not redraw a picture yet
    */
  def removeShape(silently: Boolean): js.Function = js.native
  /**
    * sets an absolute or relative mode for path points
    *
    * @param mode true/false or "absolute"/"relative" to specify the mode
    */
  def setAbsoluteMode(mode: Boolean): js.Function = js.native
  /**
    * sets the clipping area of this shape.
    * The clipping area defines the shape area that will be effectively visible. Everything that
    * would be drawn outside of the clipping area will not be rendered.
    * The possible clipping area types are rectangle, ellipse, polyline and path, but all are not
    * supported by all the renderers. vml only supports rectangle clipping, while the gfx silverlight renderer does not
    * support path clipping.
    * The clip parameter defines the clipping area geometry, and should be an object with the following properties:
    *
    * {x:Number, y:Number, width:Number, height:Number} for rectangular clip
    * {cx:Number, cy:Number, rx:Number, ry:Number} for ellipse clip
    * {points:Array} for polyline clip
    * {d:String} for a path clip.
    * The clip geometry coordinates are expressed in the coordinate system used to draw the shape. In other
    * words, the clipping area is defined in the shape parent coordinate system and the shape transform is automatically applied.
    *
    * @param clip
    */
  def setClip(clip: js.Any): Unit = js.native
  /**
    * sets a fill object
    * (the default implementation simply ignores it)
    *
    * @param fill a fill object(see dojox/gfx.defaultLinearGradient,dojox/gfx.defaultRadialGradient,dojox/gfx.defaultPattern,or dojo/_base/Color)
    */
  def setFill(fill: js.Object): js.Function = js.native
  /**
    * sets a font for text
    *
    * @param newFont
    */
  def setFont(newFont: js.Any): js.Function = js.native
  /**
    * forms a path using a shape
    *
    * @param newShape an SVG path string or a path object (see dojox/gfx.defaultPath)
    */
  def setShape(newShape: js.Object): js.Function = js.native
  /**
    * sets a stroke object
    * (the default implementation simply ignores it)
    *
    * @param stroke a stroke object(see dojox/gfx.defaultStroke)
    */
  def setStroke(stroke: js.Object): js.Function = js.native
  /**
    * sets a text to be drawn along the path
    *
    * @param newText
    */
  def setText(newText: js.Any): js.Function = js.native
  /**
    * sets a transformation matrix
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox/gfx/matrix.Matrix2Dconstructor for a list of acceptable arguments)
    */
  def setTransform(matrix: Matrix2D): js.Any = js.native
  /**
    * forms a smooth curve segment
    *
    */
  def smoothCurveTo(): js.Function = js.native
  /**
    * forms a vertical line segment
    *
    */
  def vLineTo(): js.Function = js.native
}

