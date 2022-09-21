package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListConstraint extends StObject {
  
  /**
    * Optional. The Google Cloud Console will try to default to a configuration that matches the value specified in this `Constraint`.
    */
  var suggestedValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether subtrees of Cloud Resource Manager resource hierarchy can be used in `Policy.allowed_values` and `Policy.denied_values`. For example, `"under:folders/123"` would match any resource under the 'folders/123' folder.
    */
  var supportsUnder: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaListConstraint {
  
  inline def apply(): SchemaListConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListConstraint]
  }
  
  extension [Self <: SchemaListConstraint](x: Self) {
    
    inline def setSuggestedValue(value: String): Self = StObject.set(x, "suggestedValue", value.asInstanceOf[js.Any])
    
    inline def setSuggestedValueNull: Self = StObject.set(x, "suggestedValue", null)
    
    inline def setSuggestedValueUndefined: Self = StObject.set(x, "suggestedValue", js.undefined)
    
    inline def setSupportsUnder(value: Boolean): Self = StObject.set(x, "supportsUnder", value.asInstanceOf[js.Any])
    
    inline def setSupportsUnderNull: Self = StObject.set(x, "supportsUnder", null)
    
    inline def setSupportsUnderUndefined: Self = StObject.set(x, "supportsUnder", js.undefined)
  }
}
