package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1PolicyValue extends StObject {
  
  /**
    * The fully qualified name of the policy schema associated with this policy.
    */
  var policySchema: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the policy that is compatible with the schema that it is associated with.
    */
  var value: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGoogleChromePolicyV1PolicyValue {
  
  inline def apply(): SchemaGoogleChromePolicyV1PolicyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1PolicyValue]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1PolicyValue](x: Self) {
    
    inline def setPolicySchema(value: String): Self = StObject.set(x, "policySchema", value.asInstanceOf[js.Any])
    
    inline def setPolicySchemaNull: Self = StObject.set(x, "policySchema", null)
    
    inline def setPolicySchemaUndefined: Self = StObject.set(x, "policySchema", js.undefined)
    
    inline def setValue(value: StringDictionary[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
