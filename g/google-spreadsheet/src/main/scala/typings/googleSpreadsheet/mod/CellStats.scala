package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellStats extends StObject {
  
  var loaded: Double
  
  var nonEmpty: Double
  
  var total: Double
}
object CellStats {
  
  inline def apply(loaded: Double, nonEmpty: Double, total: Double): CellStats = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellStats] (val x: Self) extends AnyVal {
    
    inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setNonEmpty(value: Double): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
