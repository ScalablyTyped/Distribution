package typings.dojo.dojox.gfx3d

import typings.dojo.dojox.gfx3d.lighting.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base.html
  *
  *
  */
trait base_ extends js.Object {
  /**
    *
    */
  var defaultCube: js.Object
  /**
    *
    */
  var defaultCylinder: js.Object
  /**
    *
    */
  var defaultEdges: js.Object
  /**
    *
    */
  var defaultOrbit: js.Object
  /**
    *
    */
  var defaultPath3d: js.Object
  /**
    *
    */
  var defaultPolygon: js.Object
  /**
    *
    */
  var defaultQuads: js.Object
  /**
    *
    */
  var defaultTriangles: js.Object
  /**
    *
    */
  var drawer: js.Object
  /**
    *
    */
  var lighting: js.Object
  /**
    *
    */
  var matrix: js.Object
  /**
    *
    */
  var scheduler: js.Object
  /**
    *
    */
  var vector: js.Object
  /**
    *
    */
  def Cube(): Unit
  /**
    *
    */
  def Cylinder(): Unit
  /**
    *
    */
  def Edges(): Unit
  /**
    * a 3D matrix object
    * Normalizes a 3D matrix-like object. If arrays is passed,
    * all objects of the array are normalized and multiplied sequentially.
    *
    * @param arg a 3D matrix-like object, a number, or an array of such objects
    */
  def Matrix3D(arg: js.Object): Unit
  /**
    *
    */
  def Object(): Unit
  /**
    *
    */
  def Orbit(): Unit
  /**
    *
    */
  def Path3d(): Unit
  /**
    *
    */
  def Polygon(): Unit
  /**
    *
    */
  def Quads(): Unit
  /**
    *
    */
  def Scene(): Unit
  /**
    *
    */
  def Triangles(): Unit
  /**
    *
    */
  def Viewport(): Unit
  /**
    * calculate a cylindrical gradient
    *
    * @param model color model
    * @param material defines visual properties
    * @param center center of the cylinder's bottom
    * @param radius radius of the cylinder
    * @param from from position in radians
    * @param to from position in radians
    * @param matrix the cumulative transformation matrix
    */
  def gradient(
    model: Model,
    material: js.Object,
    center: js.Object,
    radius: Double,
    from: Double,
    to: Double,
    matrix: js.Object
  ): js.Object
}

object base_ {
  @scala.inline
  def apply(
    Cube: () => Unit,
    Cylinder: () => Unit,
    Edges: () => Unit,
    Matrix3D: js.Object => Unit,
    Object: () => Unit,
    Orbit: () => Unit,
    Path3d: () => Unit,
    Polygon: () => Unit,
    Quads: () => Unit,
    Scene: () => Unit,
    Triangles: () => Unit,
    Viewport: () => Unit,
    defaultCube: js.Object,
    defaultCylinder: js.Object,
    defaultEdges: js.Object,
    defaultOrbit: js.Object,
    defaultPath3d: js.Object,
    defaultPolygon: js.Object,
    defaultQuads: js.Object,
    defaultTriangles: js.Object,
    drawer: js.Object,
    gradient: (Model, js.Object, js.Object, Double, Double, Double, js.Object) => js.Object,
    lighting: js.Object,
    matrix: js.Object,
    scheduler: js.Object,
    vector: js.Object
  ): base_ = {
    val __obj = js.Dynamic.literal(Cube = js.Any.fromFunction0(Cube), Cylinder = js.Any.fromFunction0(Cylinder), Edges = js.Any.fromFunction0(Edges), Matrix3D = js.Any.fromFunction1(Matrix3D), Object = js.Any.fromFunction0(Object), Orbit = js.Any.fromFunction0(Orbit), Path3d = js.Any.fromFunction0(Path3d), Polygon = js.Any.fromFunction0(Polygon), Quads = js.Any.fromFunction0(Quads), Scene = js.Any.fromFunction0(Scene), Triangles = js.Any.fromFunction0(Triangles), Viewport = js.Any.fromFunction0(Viewport), defaultCube = defaultCube.asInstanceOf[js.Any], defaultCylinder = defaultCylinder.asInstanceOf[js.Any], defaultEdges = defaultEdges.asInstanceOf[js.Any], defaultOrbit = defaultOrbit.asInstanceOf[js.Any], defaultPath3d = defaultPath3d.asInstanceOf[js.Any], defaultPolygon = defaultPolygon.asInstanceOf[js.Any], defaultQuads = defaultQuads.asInstanceOf[js.Any], defaultTriangles = defaultTriangles.asInstanceOf[js.Any], drawer = drawer.asInstanceOf[js.Any], gradient = js.Any.fromFunction7(gradient), lighting = lighting.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], scheduler = scheduler.asInstanceOf[js.Any], vector = vector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[base_]
  }
}

