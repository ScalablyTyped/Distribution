package typings.dojo.dojox.gfx3d.base

import typings.dojo.dojox.gfx3d.matrix.Matrix3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base.Scene.html
  *
  * the Scene is just a container.
  *
  */
@JSGlobal("dojox.gfx3d._base.Scene")
@js.native
class Scene () extends js.Object {
  /**
    * removes a shape from the list
    *
    * @param obj
    * @param silently               Optionalif true, do not redraw a picture yet
    */
  def abandon(obj: js.Any, silently: Boolean): js.Function = js.native
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
    * @param matrix a matrix or a matrix-like object(see an argument of dojox.gfx.matrix.Matrixconstructor for a list of acceptable arguments)
    */
  def applyLeftTransform(matrix: Matrix3D): js.Function = js.native
  /**
    * multiplies the existing matrix with an argument on right side
    * (this.matrix * matrix)
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox.gfx.matrix.Matrixconstructor for a list of acceptable arguments)
    */
  def applyRightTransform(matrix: Matrix3D): js.Function = js.native
  /**
    * a shortcut for dojox.gfx.shape.Shape.applyRightTransform
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox.gfx.matrix.Matrixconstructor for a list of acceptable arguments)
    */
  def applyTransform(matrix: Matrix3D): js.Function = js.native
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
    */
  def destroy(): Unit = js.native
  /**
    *
    * @param lighting
    */
  def draw(lighting: js.Any): Unit = js.native
  /**
    *
    */
  def getOutline(): js.Any = js.native
  /**
    *
    */
  def getZOrder(): Double = js.native
  /**
    *
    */
  def invalidate(): Unit = js.native
  /**
    *
    * @param camera
    * @param deep
    */
  def render(camera: js.Any, deep: js.Any): Unit = js.native
  /**
    *
    * @param drawer
    */
  def setDrawer(drawer: js.Any): Unit = js.native
  /**
    *
    * @param fill
    */
  def setFill(fill: js.Any): js.Function = js.native
  /**
    * sets a Object object
    *
    * @param newObject
    */
  def setObject(newObject: js.Any): js.Function = js.native
  /**
    *
    * @param scheduler
    */
  def setScheduler(scheduler: js.Any): Unit = js.native
  /**
    *
    * @param stroke
    */
  def setStroke(stroke: js.Any): js.Function = js.native
  /**
    * sets a transformation matrix
    *
    * @param matrix
    */
  def setTransform(matrix: js.Any): js.Function = js.native
  /**
    *
    * @param lighting
    * @param normal
    */
  def toStdFill(lighting: js.Any, normal: js.Any): js.Any = js.native
}

