package typings.dojo.dojox.gfx.svg_attach

import typings.dojo.dojox.gfx.matrix.Matrix2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/svg_attach.Text.html
  *
  * an anchored text (SVG)
  *
  */
@JSGlobal("dojox.gfx.svg_attach.Text")
@js.native
class Text () extends js.Object {
  /**
    *
    */
  var nodeType: String = js.native
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
    *
    * @param newShape
    */
  def bidiPreprocess(newShape: js.Any): js.Any = js.native
  /**
    * connects a handler to an event on this shape
    *
    * @param name
    * @param object
    * @param method
    */
  def connect(name: js.Any, `object`: js.Any, method: js.Any): js.Any = js.native
  /**
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
    * Renderers (browser for testing):
    *
    * canvas (FF, Chrome, Safari),
    * vml (IE),
    * svg (FF, Chrome, Safari, Opera),
    * silverlight (IE, Chrome, Safari, Opera),
    * svgWeb(FF, Chrome, Safari, Opera, IE).
    * Browsers [browser version that was tested]:
    *
    * IE [6,7,8], FF [3.6],
    * Chrome (latest for March 2011),
    * Safari [5.0.3],
    * Opera [11.01].
    *
    * @param text the string for manipulation, by default return value.
    * @param textDir Text direction.Can be:"ltr" - for left to right layout."rtl" - for right to left layout"auto" - for contextual layout: the first strong letter decides the direction.
    */
  def formatText(text: String, textDir: String): js.Any = js.native
  /**
    *
    */
  def getBoundingBox(): js.Object = js.native
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
    * get the text width in pixels
    *
    */
  def getTextWidth(): Double = js.native
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
    * removes the shape from its parent's list of shapes
    *
    * @param silently if true, do not redraw a picture yet
    */
  def removeShape(silently: Boolean): js.Function = js.native
  /**
    * sets the clipping area of this shape.
    * This method overrides the dojox/gfx/shape.Shape.setClip() method.
    *
    * @param clip an object that defines the clipping geometry, or null to remove clip.
    */
  def setClip(clip: js.Object): js.Function = js.native
  /**
    * sets a fill object (SVG)
    *
    * @param fill a fill object(see dojox/gfx.defaultLinearGradient,dojox/gfx.defaultRadialGradient,dojox/gfx.defaultPattern,or dojo/_base/Color)
    */
  def setFill(fill: js.Object): js.Function = js.native
  /**
    * sets a font for text
    *
    * @param newFont a font object (see dojox/gfx.defaultFont) or a font string
    */
  def setFont(newFont: js.Object): js.Function = js.native
  /**
    * assigns and clears the underlying node that will represent this
    * shape. Once set, transforms, gradients, etc, can be applied.
    * (no fill & stroke by default)
    *
    * @param rawNode
    */
  def setRawNode(rawNode: js.Any): Unit = js.native
  /**
    * sets a text shape object (SVG)
    *
    * @param newShape a text shape object
    */
  def setShape(newShape: js.Object): js.Function = js.native
  /**
    * sets a stroke object (SVG)
    *
    * @param stroke a stroke object (see dojox/gfx.defaultStroke)
    */
  def setStroke(stroke: js.Object): js.Function = js.native
  /**
    * sets a transformation matrix
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox/gfx/matrix.Matrix2Dconstructor for a list of acceptable arguments)
    */
  def setTransform(matrix: Matrix2D): js.Any = js.native
}

