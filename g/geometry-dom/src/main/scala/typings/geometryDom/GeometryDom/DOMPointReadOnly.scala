package typings.geometryDom.GeometryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMPointReadOnly extends js.Object {
  
  /**
    * Post-multiply point with matrix.
    * @param matrix
    */
  def matrixTransform(matrix: DOMMatrixReadOnly): DOMPoint = js.native
  
  /**
    * w coordinate / readonly
    */
  var w: Double = js.native
  
  /**
    * x coordinate / readonly
    */
  var x: Double = js.native
  
  /**
    * y coordinate / readonly
    */
  var y: Double = js.native
  
  /**
    * z coordinate / readonly
    */
  var z: Double = js.native
}
object DOMPointReadOnly {
  
  @scala.inline
  def apply(matrixTransform: DOMMatrixReadOnly => DOMPoint, w: Double, x: Double, y: Double, z: Double): DOMPointReadOnly = {
    val __obj = js.Dynamic.literal(matrixTransform = js.Any.fromFunction1(matrixTransform), w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMPointReadOnly]
  }
  
  @scala.inline
  implicit class DOMPointReadOnlyOps[Self <: DOMPointReadOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMatrixTransform(value: DOMMatrixReadOnly => DOMPoint): Self = this.set("matrixTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
  }
}
