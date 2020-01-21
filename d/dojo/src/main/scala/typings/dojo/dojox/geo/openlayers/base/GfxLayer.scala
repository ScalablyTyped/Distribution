package typings.dojo.dojox.geo.openlayers.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.GfxLayer.html
  *
  * A layer dedicated to render dojox.geo.openlayers.GeometryFeature
  * A layer class for rendering geometries as dojox.gfx.shape.Shape objects.
  * This layer class accepts Features which encapsulates graphic objects to be added to the map.
  * All objects should be added to this group.
  *
  * @param name
  * @param options
  */
@JSGlobal("dojox.geo.openlayers._base.GfxLayer")
@js.native
class GfxLayer protected ()
  extends typings.dojo.dojox.geo.openlayers.Layer {
  def this(name: js.Any, options: js.Any) = this()
  /**
    * Get the underlying dojox.gfx.Surface
    *
    */
  def getSurface(): js.Any = js.native
  /**
    * Gets the viewport
    *
    */
  def getViewport(): js.Any = js.native
  /**
    * Called when this layer is moved or zoomed.
    *
    * @param event The event
    */
  def moveTo(event: js.Any): Unit = js.native
  /**
    * Called when map is resized.
    *
    */
  def onMapResize(): Unit = js.native
  /**
    * Sets the map for this layer.
    *
    * @param map
    */
  def setMap(map: js.Any): Unit = js.native
  /**
    * Sets the viewport
    *
    * @param g An object with the following properties:destroy: Releases all internal resources owned by this shape. Once this method has been called,the instance is considered destroyed and should not be used anymore.getNode: Different graphics rendering subsystems implement shapes in different ways.  Thismethod provides access to the underlying graphics subsystem object.  Clients calling thismethod and using the return value must be careful not to try sharing or using the underlying nodein a general way across renderer implementation.Returns the underlying graphics Node, or null if no underlying graphics node is used by this shape.getShape: returns the current Shape object or null(see dojox/gfx.defaultPath,dojox/gfx.defaultPolyline,dojox/gfx.defaultRect,dojox/gfx.defaultEllipse,dojox/gfx.defaultCircle,dojox/gfx.defaultLine,or dojox/gfx.defaultImage)getTransform: Returns the current transformation matrix applied to this Shape or nullgetFill: Returns the current fill object or null(see dojox/gfx.defaultLinearGradient,dojox/gfx.defaultRadialGradient,dojox/gfx.defaultPattern,or dojo/Color)getStroke: Returns the current stroke object or null(see dojox/gfx.defaultStroke)getParent: Returns the parent Shape, Group or null if this Shape is unparented.(see dojox/gfx/shape.Surface,or dojox/gfx.Group)getBoundingBox: Returns the bounding box Rectangle for this shape.getTransformedBoundingBox: returns an array of four points or nullfour points represent four corners of the untransformed bounding boxgetEventSource: returns a Node, which is used asa source of events for this shapesetClip: sets the clipping area of this shape.getClipsetShape: sets a shape object(the default implementation simply ignores it)setFill: sets a fill object(the default implementation simply ignores it)setStroke: sets a stroke object(the default implementation simply ignores it)setTransform: sets a transformation matrix_applyTransform: physically sets a matrixmoveToFront: moves a shape to front of its parent's list of shapesmoveToBack: moves a shape to back of its parent's list of shapes_moveToFront: renderer-specific hook, see dojox/gfx/shape.Shape.moveToFront()_moveToBack: renderer-specific hook, see dojox/gfx/shape.Shape.moveToFront()applyRightTransform: multiplies the existing matrix with an argument on right side(this.matrix * matrix)applyLeftTransform: multiplies the existing matrix with an argument on left side(matrix * this.matrix)applyTransform: a shortcut for dojox/gfx/shape.Shape.applyRightTransformremoveShape: removes the shape from its parent's list of shapes_setParent: sets a parent_updateParentMatrix: updates the parent matrix with new matrix_getRealMatrix: returns the cumulative ('real') transformation matrixby combining the shape's matrix with its parent's matrixon: Connects an event to this shape.connect: connects a handler to an event on this shapedisconnect: connects a handler by token from an event on this shape_initopenBatch: starts a new batch, subsequent new child shapes will be held inthe batch instead of appending to the container directly.closeBatch: submits the current batch, append all pending child shapes to DOMadd: adds a shape to the listremove: removes a shape from the listclear: removes all shapes from a group/surface._moveChildToFront: moves a shape to front of the list of shapes_moveChildToBack: moves a shape to back of the list of shapescreateShape: creates a shape object based on its type; it is meant to be usedby group-like objectscreateGroup: creates a group shapecreateRect: creates a rectangle shapecreateEllipse: creates an ellipse shapecreateCircle: creates a circle shapecreateLine: creates a line shapecreatePolyline: creates a polyline/polygon shapecreateImage: creates a image shapecreateText: creates a text shapecreatePath: creates a path shapecreateTextPath: creates a text shapecreateObject: creates an instance of the passed shapeType classtextDir (String): Will be used for inheritance, or as default for text objectsthat textDir wasn't directly specified for them but the bidi support was required.setTextDir: Used for propagation and change of textDir.newTextDir will be forced as textDir for all of it's children (Group/Text/TextPath).getTextDir
    */
  def setViewport(g: js.Object): Unit = js.native
}

