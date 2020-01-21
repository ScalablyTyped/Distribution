package typings.dojo.dojox.gfx3d.base

import typings.dojo.dojox.gfx3d.matrix.Matrix3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base.Path3d.html
  *
  *
  */
@JSGlobal("dojox.gfx3d._base.Path3d")
@js.native
class Path3d () extends js.Object {
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
    * closes a path
    *
    */
  def closePath(): js.Function = js.native
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
    *
    * @param camera
    */
  def render(camera: js.Any): Unit = js.native
  /**
    * sets a fill object
    * (the default implementation is to delegate to
    * the underlying 2D shape).
    *
    * @param fill a fill object(see dojox.gfx.defaultLinearGradient,dojox.gfx.defaultRadialGradient,dojox.gfx.defaultPattern,dojo._base.Coloror dojox.gfx.MODEL)
    */
  def setFill(fill: Object): js.Function = js.native
  /**
    * sets a Object object
    *
    * @param newObject
    */
  def setObject(newObject: js.Any): js.Function = js.native
  /**
    * sets a stroke object
    * (the default implementation simply ignores it)
    *
    * @param stroke a stroke object(see dojox.gfx.defaultStroke)
    */
  def setStroke(stroke: Object): js.Function = js.native
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

