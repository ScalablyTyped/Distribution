package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `Constraint` that allows or disallows a list of string values, which are
  * configured by an Organization&#39;s policy administrator with a `Policy`.
  */
trait SchemaListConstraint extends StObject {
  
  /**
    * Optional. The Google Cloud Console will try to default to a configuration
    * that matches the value specified in this `Constraint`.
    */
  var suggestedValue: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether subtrees of Cloud Resource Manager resource hierarchy
    * can be used in `Policy.allowed_values` and `Policy.denied_values`. For
    * example, `&quot;under:folders/123&quot;` would match any resource under
    * the &#39;folders/123&#39; folder.
    */
  var supportsUnder: js.UndefOr[Boolean] = js.undefined
}
object SchemaListConstraint {
  
  inline def apply(): SchemaListConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListConstraint]
  }
  
  extension [Self <: SchemaListConstraint](x: Self) {
    
    inline def setSuggestedValue(value: String): Self = StObject.set(x, "suggestedValue", value.asInstanceOf[js.Any])
    
    inline def setSuggestedValueUndefined: Self = StObject.set(x, "suggestedValue", js.undefined)
    
    inline def setSupportsUnder(value: Boolean): Self = StObject.set(x, "supportsUnder", value.asInstanceOf[js.Any])
    
    inline def setSupportsUnderUndefined: Self = StObject.set(x, "supportsUnder", js.undefined)
  }
}
