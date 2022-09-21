package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLookupGroupNameResponse extends StObject {
  
  /**
    * Output only. The [resource name](https://cloud.google.com/apis/design/resource_names) of the looked-up `Group`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaLookupGroupNameResponse {
  
  inline def apply(): SchemaLookupGroupNameResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupGroupNameResponse]
  }
  
  extension [Self <: SchemaLookupGroupNameResponse](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
