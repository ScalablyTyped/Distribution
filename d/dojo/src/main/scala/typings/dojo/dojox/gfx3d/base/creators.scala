package typings.dojo.dojox.gfx3d.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base._creators.html
  *
  * object creators
  *
  */
@js.native
trait creators extends js.Object {
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
    * @param obj
    */
  def adopt(obj: js.Any): js.Function = js.native
  /**
    * creates an instance of the passed objectType class
    *
    * @param objectType a class constructor to create an instance of
    * @param rawObject properties to be passed in to the classes "setShape" method
    * @param style
    */
  def create3DObject(objectType: js.Function, rawObject: Object, style: js.Any): js.Any = js.native
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
    * creates an Orbit object
    *
    * @param orbit
    */
  def createOrbit(orbit: js.Any): js.Any = js.native
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
    * creates an quads object
    *
    * @param quads
    * @param style
    */
  def createQuads(quads: js.Any, style: js.Any): js.Any = js.native
  /**
    * creates a scene object
    *
    */
  def createScene(): js.Any = js.native
  /**
    * creates an triangle object
    *
    * @param tris
    * @param style
    */
  def createTriangles(tris: js.Any, style: js.Any): js.Any = js.native
  /**
    *
    * @param drawer
    */
  def setDrawer(drawer: js.Any): Unit = js.native
  /**
    *
    * @param scheduler
    */
  def setScheduler(scheduler: js.Any): Unit = js.native
}

