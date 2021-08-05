package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLookupGroupNameResponse extends StObject {
  
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Group in the format: `groups/{group_id}`, where `group_id` is the
    * unique ID assigned to the Group.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaLookupGroupNameResponse {
  
  inline def apply(): SchemaLookupGroupNameResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupGroupNameResponse]
  }
  
  extension [Self <: SchemaLookupGroupNameResponse](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
