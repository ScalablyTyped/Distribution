package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEntry extends StObject {
  
  /**
    * Number of items being predicted as this label.
    */
  var itemCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The predicted label. For confidence_threshold \> 0, we will also add an entry indicating the number of items under the confidence threshold.
    */
  var predictedLabel: js.UndefOr[String | Null] = js.undefined
}
object SchemaEntry {
  
  inline def apply(): SchemaEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntry]
  }
  
  extension [Self <: SchemaEntry](x: Self) {
    
    inline def setItemCount(value: String): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountNull: Self = StObject.set(x, "itemCount", null)
    
    inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
    
    inline def setPredictedLabel(value: String): Self = StObject.set(x, "predictedLabel", value.asInstanceOf[js.Any])
    
    inline def setPredictedLabelNull: Self = StObject.set(x, "predictedLabel", null)
    
    inline def setPredictedLabelUndefined: Self = StObject.set(x, "predictedLabel", js.undefined)
  }
}
