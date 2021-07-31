package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opaque extends StObject {
  
  /** Filter matrix */
  var matrix: js.UndefOr[js.Array[Double]] = js.undefined
  
  var opaque: js.UndefOr[Boolean] = js.undefined
}
object Opaque {
  
  @scala.inline
  def apply(): Opaque = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opaque]
  }
  
  @scala.inline
  implicit class OpaqueMutableBuilder[Self <: Opaque] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatrix(value: js.Array[Double]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    @scala.inline
    def setMatrixVarargs(value: Double*): Self = StObject.set(x, "matrix", js.Array(value :_*))
    
    @scala.inline
    def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
  }
}
