package typings.forgeViewer.Autodesk.Viewing.Private

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectSetItem extends StObject {
  
  var explodeScale: Double
  
  var hidden: js.Array[Double]
  
  var id: js.Array[Double]
  
  var isolated: js.Array[Double]
  
  var seedUrn: String
}
object ObjectSetItem {
  
  inline def apply(
    explodeScale: Double,
    hidden: js.Array[Double],
    id: js.Array[Double],
    isolated: js.Array[Double],
    seedUrn: String
  ): ObjectSetItem = {
    val __obj = js.Dynamic.literal(explodeScale = explodeScale.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isolated = isolated.asInstanceOf[js.Any], seedUrn = seedUrn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectSetItem]
  }
  
  extension [Self <: ObjectSetItem](x: Self) {
    
    inline def setExplodeScale(value: Double): Self = StObject.set(x, "explodeScale", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: js.Array[Double]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenVarargs(value: Double*): Self = StObject.set(x, "hidden", js.Array(value*))
    
    inline def setId(value: js.Array[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdVarargs(value: Double*): Self = StObject.set(x, "id", js.Array(value*))
    
    inline def setIsolated(value: js.Array[Double]): Self = StObject.set(x, "isolated", value.asInstanceOf[js.Any])
    
    inline def setIsolatedVarargs(value: Double*): Self = StObject.set(x, "isolated", js.Array(value*))
    
    inline def setSeedUrn(value: String): Self = StObject.set(x, "seedUrn", value.asInstanceOf[js.Any])
  }
}
