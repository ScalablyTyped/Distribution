package typings.dojo.dojox.gfx

import typings.dojo.dojox.gfx.shape.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.Surface.html
  *
  * a surface object to be used for drawings
  *
  */
@JSGlobal("dojox.gfx.Surface")
@js.native
class Surface () extends js.Object {
  /**
    *
    */
  var isLoaded: Boolean = js.native
  /**
    * Will be used as default for Text/TextPath/Group objects that created by this surface
    * and textDir wasn't directly specified for them, though the bidi support was loaded.
    * Can be set in two ways:
    *
    * When the surface is created and textDir value passed to it as fourth
    * parameter.
    * Using the setTextDir(String) function, when this function is used the value
    * of textDir propagates to all of it's children and the children of children (for Groups) etc.
    *
    */
  var textDir: String = js.native
  /**
    * adds a shape to the list
    *
    * @param shape the shape to add to the list
    */
  def add(shape: Shape): js.Any = js.native
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
    * creates a circle shape
    *
    * @param circle a circle object (see dojox/gfx.defaultCircle)
    */
  def createCircle(circle: js.Object): js.Any = js.native
  /**
    * creates an ellipse shape
    *
    * @param ellipse an ellipse object (see dojox/gfx.defaultEllipse)
    */
  def createEllipse(ellipse: js.Object): js.Any = js.native
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
  def createImage(image: js.Object): js.Any = js.native
  /**
    * creates a line shape
    *
    * @param line a line object (see dojox/gfx.defaultLine)
    */
  def createLine(line: js.Object): js.Any = js.native
  /**
    * creates an instance of the passed shapeType class
    *
    * @param shapeType a class constructor to create an instance of
    * @param rawShape properties to be passed in to the classes 'setShape' method
    */
  def createObject(shapeType: js.Function, rawShape: js.Object): js.Any = js.native
  /**
    * creates a path shape
    *
    * @param path a path object (see dojox/gfx.defaultPath)
    */
  def createPath(path: js.Object): js.Any = js.native
  /**
    * creates a polyline/polygon shape
    *
    * @param points a points object (see dojox/gfx.defaultPolyline)or an Array of points
    */
  def createPolyline(points: js.Object): js.Any = js.native
  /**
    * creates a rectangle shape
    *
    * @param rect a path object (see dojox/gfx.defaultRect)
    */
  def createRect(rect: js.Object): js.Any = js.native
  /**
    * creates a shape object based on its type; it is meant to be used
    * by group-like objects
    *
    * @param shape a shape descriptor object
    */
  def createShape(shape: js.Object): js.Any = js.native
  /**
    * creates a text shape
    *
    * @param text a text object (see dojox/gfx.defaultText)
    */
  def createText(text: js.Object): js.Any = js.native
  /**
    * creates a text shape
    *
    * @param text a textpath object (see dojox/gfx.defaultTextPath)
    */
  def createTextPath(text: js.Object): js.Any = js.native
  /**
    *
    */
  def createViewport(): js.Any = js.native
  /**
    * destroy all relevant external resources and release all
    * external references to make this object garbage-collectible
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
    * gets current width and height in pixels
    *
    */
  def getDimensions(): js.Object = js.native
  /**
    * returns a node, which can be used to attach event listeners
    *
    */
  def getEventSource(): js.Any = js.native
  /**
    *
    */
  def getTextDir(): js.Any = js.native
  /**
    * Connects an event to this shape.
    *
    * @param type
    * @param listener
    */
  def on(`type`: js.Any, listener: js.Any): js.Any = js.native
  /**
    * local event, fired once when the surface is created
    * asynchronously, used only when isLoaded is false, required
    * only for Silverlight.
    *
    * @param surface
    */
  def onLoad(surface: typings.dojo.dojox.gfx.shape.Surface): Unit = js.native
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
    * sets the width and height of the rawNode
    *
    * @param width width of surface, e.g., "100px"
    * @param height height of surface, e.g., "100px"
    */
  def setDimensions(width: String, height: String): js.Function = js.native
  /**
    * Used for propagation and change of textDir.
    * newTextDir will be forced as textDir for all of it's children (Group/Text/TextPath).
    *
    * @param newTextDir
    */
  def setTextDir(newTextDir: String): Unit = js.native
  /**
    *
    * @param context
    * @param method
    */
  def whenLoaded(context: js.Any, method: String): Unit = js.native
  /**
    *
    * @param context
    * @param method
    */
  def whenLoaded(context: js.Any, method: js.Function): Unit = js.native
  /**
    *
    * @param context
    * @param method
    */
  def whenLoaded(context: js.Object, method: String): Unit = js.native
  /**
    *
    * @param context
    * @param method
    */
  def whenLoaded(context: js.Object, method: js.Function): Unit = js.native
}

