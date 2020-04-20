package typings.dojo.dojox.gfx3d

import typings.dojo.dojox.gfx3d.matrix.Matrix3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait objectInstance extends js.Object {
  /**
    * multiplies the existing matrix with an argument on left side
    * (matrix * this.matrix)
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox.gfx.matrix.Matrixconstructor for a list of acceptable arguments)
    */
  def applyLeftTransform(matrix: Matrix3D): js.Function
  /**
    * multiplies the existing matrix with an argument on right side
    * (this.matrix * matrix)
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox.gfx.matrix.Matrixconstructor for a list of acceptable arguments)
    */
  def applyRightTransform(matrix: Matrix3D): js.Function
  /**
    * a shortcut for dojox.gfx.shape.Shape.applyRightTransform
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox.gfx.matrix.Matrixconstructor for a list of acceptable arguments)
    */
  def applyTransform(matrix: Matrix3D): js.Function
  /**
    *
    */
  def destroy(): Unit
  /**
    *
    * @param lighting
    */
  def draw(lighting: js.Any): Unit
  /**
    *
    */
  def getOutline(): js.Any
  /**
    *
    */
  def getZOrder(): Double
  /**
    *
    */
  def invalidate(): Unit
  /**
    *
    * @param camera
    */
  def render(camera: js.Any): Unit
  /**
    * sets a fill object
    * (the default implementation is to delegate to
    * the underlying 2D shape).
    *
    * @param fill a fill object(see dojox.gfx.defaultLinearGradient,dojox.gfx.defaultRadialGradient,dojox.gfx.defaultPattern,dojo._base.Coloror dojox.gfx.MODEL)
    */
  def setFill(fill: js.Object): js.Function
  /**
    * sets a Object object
    *
    * @param newObject
    */
  def setObject(newObject: js.Any): js.Function
  /**
    * sets a stroke object
    * (the default implementation simply ignores it)
    *
    * @param stroke a stroke object(see dojox.gfx.defaultStroke)
    */
  def setStroke(stroke: js.Object): js.Function
  /**
    * sets a transformation matrix
    *
    * @param matrix
    */
  def setTransform(matrix: js.Any): js.Function
  /**
    *
    * @param lighting
    * @param normal
    */
  def toStdFill(lighting: js.Any, normal: js.Any): js.Any
}

object objectInstance {
  @scala.inline
  def apply(
    applyLeftTransform: Matrix3D => js.Function,
    applyRightTransform: Matrix3D => js.Function,
    applyTransform: Matrix3D => js.Function,
    destroy: () => Unit,
    draw: js.Any => Unit,
    getOutline: () => js.Any,
    getZOrder: () => Double,
    invalidate: () => Unit,
    render: js.Any => Unit,
    setFill: js.Object => js.Function,
    setObject: js.Any => js.Function,
    setStroke: js.Object => js.Function,
    setTransform: js.Any => js.Function,
    toStdFill: (js.Any, js.Any) => js.Any
  ): objectInstance = {
    val __obj = js.Dynamic.literal(applyLeftTransform = js.Any.fromFunction1(applyLeftTransform), applyRightTransform = js.Any.fromFunction1(applyRightTransform), applyTransform = js.Any.fromFunction1(applyTransform), destroy = js.Any.fromFunction0(destroy), draw = js.Any.fromFunction1(draw), getOutline = js.Any.fromFunction0(getOutline), getZOrder = js.Any.fromFunction0(getZOrder), invalidate = js.Any.fromFunction0(invalidate), render = js.Any.fromFunction1(render), setFill = js.Any.fromFunction1(setFill), setObject = js.Any.fromFunction1(setObject), setStroke = js.Any.fromFunction1(setStroke), setTransform = js.Any.fromFunction1(setTransform), toStdFill = js.Any.fromFunction2(toStdFill))
    __obj.asInstanceOf[objectInstance]
  }
}

