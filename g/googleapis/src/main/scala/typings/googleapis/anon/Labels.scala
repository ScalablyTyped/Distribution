package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Labels extends StObject {
  
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  
  var lossType: js.UndefOr[String] = js.undefined
  
  var modelType: js.UndefOr[String] = js.undefined
}
object Labels {
  
  inline def apply(): Labels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Labels]
  }
  
  extension [Self <: Labels](x: Self) {
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    inline def setLossType(value: String): Self = StObject.set(x, "lossType", value.asInstanceOf[js.Any])
    
    inline def setLossTypeUndefined: Self = StObject.set(x, "lossType", js.undefined)
    
    inline def setModelType(value: String): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    inline def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
  }
}
