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
  
  inline def apply(): Opaque = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opaque]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Opaque] (val x: Self) extends AnyVal {
    
    inline def setMatrix(value: js.Array[Double]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    inline def setMatrixVarargs(value: Double*): Self = StObject.set(x, "matrix", js.Array(value*))
    
    inline def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
    
    inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
  }
}
