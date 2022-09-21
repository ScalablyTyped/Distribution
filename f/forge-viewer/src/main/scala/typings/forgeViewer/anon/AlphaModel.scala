package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlphaModel extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var model: js.UndefOr[typings.forgeViewer.Autodesk.Viewing.Model] = js.undefined
}
object AlphaModel {
  
  inline def apply(): AlphaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlphaModel]
  }
  
  extension [Self <: AlphaModel](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setModel(value: typings.forgeViewer.Autodesk.Viewing.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
