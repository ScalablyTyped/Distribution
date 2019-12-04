package typings.dojo.dojox.gfx3d._base

import typings.dojo.dojo._base.Color
import typings.dojo.dojox.gfx.matrix.Matrix2D
import typings.dojo.dojox.gfx.shape.Shape
import typings.dojo.dojox.gfx3d.matrix.Matrix3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base.Viewport.html
  *
  *
  */
@JSGlobal("dojox.gfx3d._base.Viewport")
@js.native
class Viewport () extends js.Object {
  /**
    *
    */
  var nodeType: Object = js.native
  /**
    * removes a shape from the list
    *
    * @param obj
    * @param silently               Optionalif true, do not redraw a picture yet
    */
  def abandon(obj: js.Any, silently: Boolean): js.Function = js.native
  /**
    * adds a shape to the list
    *
    * @param shape the shape to add to the list
    */
  def add(shape: Shape): js.Any = js.native
  /**
    * add new light/lights to the viewport.
    *
    * @param lights light object(s)
    */
  def addLights(lights: js.Array[_]): js.Any = js.native
  /**
    * add new light/lights to the viewport.
    *
    * @param lights light object(s)
    */
  def addLights(lights: Object): js.Any = js.native
  /**
    *
    * @param newObject
    */
  def addTodo(newObject: js.Any): Unit = js.native
  /**
    * adds a shape to the list
    *
    * @param obj
    */
  def adopt(obj: js.Any): js.Function = js.native
  /**
    * multiplies the existing matrix with an argument on left side
    * (matrix * this.matrix)
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox.gfx3d.matrix.Matrix3Dconstructor for a list of acceptable arguments)
    */
  def applyCameraLeftTransform(matrix: Matrix3D): js.Function = js.native
  /**
    * multiplies the existing matrix with an argument on right side
    * (this.matrix * matrix)
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox.gfx3d.matrix.Matrix3Dconstructor for a list of acceptable arguments)
    */
  def applyCameraRightTransform(matrix: Matrix3D): js.Function = js.native
  /**
    * a shortcut for dojox.gfx3d.Object.applyRightTransform
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox.gfx3d.matrix.Matrix3Dconstructor for a list of acceptable arguments)
    */
  def applyCameraTransform(matrix: Matrix3D): js.Any = js.native
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
    * removes all shapes from a group/surface.
    *
    * @param destroy               OptionalIndicates whether the children should be destroyed. Optional.
    */
  def clear(destroy: Boolean): js.Function = js.native
  /**
    * submits the current batch, append all pending child shapes to DOM
    * On canvas, this method flushes the pending redraws queue.
    *
    */
  def closeBatch(): js.Function = js.native
  /**
    * connects a handler to an event on this shape
    *
    * @param name
    * @param object
    * @param method
    */
  def connect(name: js.Any, `object`: js.Any, method: js.Any): js.Any = js.native
  /**
    * creates an instance of the passed objectType class
    *
    * @param objectType a class constructor to create an instance of
    * @param rawObject properties to be passed in to the classes "setShape" method
    * @param style
    */
  def create3DObject(objectType: js.Function, rawObject: Object, style: js.Any): js.Any = js.native
  /**
    * creates a circle shape
    *
    * @param circle a circle object (see dojox/gfx.defaultCircle)
    */
  def createCircle(circle: Object): js.Any = js.native
  /**
    * creates an cube object
    *
    * @param cube
    */
  def createCube(cube: js.Any): js.Any = js.native
  /**
    * creates an cylinder object
    *
    * @param cylinder
    */
  def createCylinder(cylinder: js.Any): js.Any = js.native
  /**
    * creates an edge object
    *
    * @param edges
    * @param style
    */
  def createEdges(edges: js.Any, style: js.Any): js.Any = js.native
  /**
    * creates an ellipse shape
    *
    * @param ellipse an ellipse object (see dojox/gfx.defaultEllipse)
    */
  def createEllipse(ellipse: Object): js.Any = js.native
  /**
    * creates a group shape
    *
    */
  def createGroup(): js.Any = js.native
  /**
    * creates a image shape
    *
    * @param image an image object (see dojox/gfx.defaultImage)
    */
  def createImage(image: Object): js.Any = js.native
  /**
    * creates a line shape
    *
    * @param line a line object (see dojox/gfx.defaultLine)
    */
  def createLine(line: Object): js.Any = js.native
  /**
    * creates an instance of the passed shapeType class
    *
    * @param shapeType a class constructor to create an instance of
    * @param rawShape properties to be passed in to the classes 'setShape' method
    */
  def createObject(shapeType: js.Function, rawShape: Object): js.Any = js.native
  /**
    * creates an Orbit object
    *
    * @param orbit
    */
  def createOrbit(orbit: js.Any): js.Any = js.native
  /**
    * creates a path shape
    *
    * @param path a path object (see dojox/gfx.defaultPath)
    */
  def createPath(path: Object): js.Any = js.native
  /**
    * creates an 3d path object
    *
    * @param path
    */
  def createPath3d(path: js.Any): js.Any = js.native
  /**
    * creates an polygon object
    *
    * @param points
    */
  def createPolygon(points: js.Array[Object]): js.Any = js.native
  /**
    * creates an polygon object
    *
    * @param points
    */
  def createPolygon(points: Object): js.Any = js.native
  /**
    * creates a polyline/polygon shape
    *
    * @param points a points object (see dojox/gfx.defaultPolyline)or an Array of points
    */
  def createPolyline(points: Object): js.Any = js.native
  /**
    * creates an quads object
    *
    * @param quads
    * @param style
    */
  def createQuads(quads: js.Any, style: js.Any): js.Any = js.native
  /**
    * creates a rectangle shape
    *
    * @param rect a path object (see dojox/gfx.defaultRect)
    */
  def createRect(rect: Object): js.Any = js.native
  /**
    * creates a scene object
    *
    */
  def createScene(): js.Any = js.native
  /**
    * creates a shape object based on its type; it is meant to be used
    * by group-like objects
    *
    * @param shape a shape descriptor object
    */
  def createShape(shape: Object): js.Any = js.native
  /**
    * creates a text shape
    *
    * @param text a text object (see dojox/gfx.defaultText)
    */
  def createText(text: Object): js.Any = js.native
  /**
    * creates a text shape
    *
    * @param text a textpath object (see dojox/gfx.defaultTextPath)
    */
  def createTextPath(text: Object): js.Any = js.native
  /**
    * creates an triangle object
    *
    * @param tris
    * @param style
    */
  def createTriangles(tris: js.Any, style: js.Any): js.Any = js.native
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
    * Returns the bounding box Rectangle for this shape.
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
    *
    */
  def invalidate(): Unit = js.native
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
    * starts a new batch, subsequent new child shapes will be held in
    * the batch instead of appending to the container directly.
    * Because the canvas renderer has no DOM hierarchy, the canvas implementation differs
    * such that it suspends the repaint requests for this container until the current batch is closed by a call to closeBatch().
    *
    */
  def openBatch(): js.Function = js.native
  /**
    * removes a shape from the list
    *
    * @param shape the shape to remove
    * @param silently if true, do not redraw a picture yet
    */
  def remove(shape: Shape, silently: Boolean): js.Function = js.native
  /**
    * removes the shape from its parent's list of shapes
    *
    * @param silently if true, do not redraw a picture yet
    */
  def removeShape(silently: Boolean): js.Function = js.native
  /**
    * iterate all children and call their render callback function.
    *
    */
  def render(): Unit = js.native
  /**
    * sets a transformation matrix
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox.gfx.matrix.Matrixconstructor for a list of acceptable arguments)
    */
  def setCameraTransform(matrix: Matrix3D): js.Function = js.native
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
    *
    * @param dim
    */
  def setDimensions(dim: js.Any): Unit = js.native
  /**
    *
    * @param drawer
    */
  def setDrawer(drawer: js.Any): Unit = js.native
  /**
    * sets a fill object
    * (the default implementation simply ignores it)
    *
    * @param fill a fill object(see dojox/gfx.defaultLinearGradient,dojox/gfx.defaultRadialGradient,dojox/gfx.defaultPattern,or dojo/_base/Color)
    */
  def setFill(fill: Object): js.Function = js.native
  /**
    * set the lights
    *
    * @param lights an array of light objector lights object
    * @param ambient               Optionalan ambient object
    * @param specular               Optionalan specular object
    */
  def setLights(lights: js.Array[_], ambient: Color, specular: Color): js.Function = js.native
  /**
    *
    * @param scheduler
    */
  def setScheduler(scheduler: js.Any): Unit = js.native
  /**
    * sets a shape object
    * (the default implementation simply ignores it)
    *
    * @param shape a shape object(see dojox/gfx.defaultPath,dojox/gfx.defaultPolyline,dojox/gfx.defaultRect,dojox/gfx.defaultEllipse,dojox/gfx.defaultCircle,dojox/gfx.defaultLine,or dojox/gfx.defaultImage)
    */
  def setShape(shape: Object): js.Function = js.native
  /**
    * sets a stroke object
    * (the default implementation simply ignores it)
    *
    * @param stroke a stroke object(see dojox/gfx.defaultStroke)
    */
  def setStroke(stroke: Object): js.Function = js.native
  /**
    * sets a transformation matrix
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox/gfx/matrix.Matrix2Dconstructor for a list of acceptable arguments)
    */
  def setTransform(matrix: Matrix2D): js.Any = js.native
}

