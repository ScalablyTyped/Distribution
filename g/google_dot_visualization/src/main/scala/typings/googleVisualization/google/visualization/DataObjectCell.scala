package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataObjectCell extends StObject {
  
  var f: js.UndefOr[String] = js.undefined
  
  var p: js.UndefOr[js.Any] = js.undefined
  
  var v: js.UndefOr[js.Any] = js.undefined
}
object DataObjectCell {
  
  inline def apply(): DataObjectCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataObjectCell]
  }
  
  extension [Self <: DataObjectCell](x: Self) {
    
    inline def setF(value: String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
    
    inline def setP(value: js.Any): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setV(value: js.Any): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
