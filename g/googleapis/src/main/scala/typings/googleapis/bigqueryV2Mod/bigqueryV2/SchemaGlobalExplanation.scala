package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGlobalExplanation extends StObject {
  
  /**
    * Class label for this set of global explanations. Will be empty/null for binary logistic and linear regression models. Sorted alphabetically in descending order.
    */
  var classLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of the top global explanations. Sorted by absolute value of attribution in descending order.
    */
  var explanations: js.UndefOr[js.Array[SchemaExplanation]] = js.undefined
}
object SchemaGlobalExplanation {
  
  inline def apply(): SchemaGlobalExplanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGlobalExplanation]
  }
  
  extension [Self <: SchemaGlobalExplanation](x: Self) {
    
    inline def setClassLabel(value: String): Self = StObject.set(x, "classLabel", value.asInstanceOf[js.Any])
    
    inline def setClassLabelNull: Self = StObject.set(x, "classLabel", null)
    
    inline def setClassLabelUndefined: Self = StObject.set(x, "classLabel", js.undefined)
    
    inline def setExplanations(value: js.Array[SchemaExplanation]): Self = StObject.set(x, "explanations", value.asInstanceOf[js.Any])
    
    inline def setExplanationsUndefined: Self = StObject.set(x, "explanations", js.undefined)
    
    inline def setExplanationsVarargs(value: SchemaExplanation*): Self = StObject.set(x, "explanations", js.Array(value*))
  }
}
