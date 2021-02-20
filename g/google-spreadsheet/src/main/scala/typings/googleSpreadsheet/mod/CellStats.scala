package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellStats extends StObject {
  
  var loaded: Double = js.native
  
  var nonEmpty: Double = js.native
  
  var total: Double = js.native
}
object CellStats {
  
  @scala.inline
  def apply(loaded: Double, nonEmpty: Double, total: Double): CellStats = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellStats]
  }
  
  @scala.inline
  implicit class CellStatsMutableBuilder[Self <: CellStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonEmpty(value: Double): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
