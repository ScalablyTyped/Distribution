package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Opaque extends js.Object {
  
  /** Filter matrix */
  var matrix: js.UndefOr[js.Array[Double]] = js.native
  
  var opaque: js.UndefOr[Boolean] = js.native
}
object Opaque {
  
  @scala.inline
  def apply(): Opaque = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opaque]
  }
  
  @scala.inline
  implicit class OpaqueOps[Self <: Opaque] (val x: Self) extends AnyVal {
    
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
    def setMatrixVarargs(value: Double*): Self = this.set("matrix", js.Array(value :_*))
    
    @scala.inline
    def setMatrix(value: js.Array[Double]): Self = this.set("matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatrix: Self = this.set("matrix", js.undefined)
    
    @scala.inline
    def setOpaque(value: Boolean): Self = this.set("opaque", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpaque: Self = this.set("opaque", js.undefined)
  }
}
