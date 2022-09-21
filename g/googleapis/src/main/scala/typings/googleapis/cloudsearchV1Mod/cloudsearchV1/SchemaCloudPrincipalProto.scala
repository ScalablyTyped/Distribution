package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudPrincipalProto extends StObject {
  
  /**
    * Format: "{identity-pool\}:{subject\}#" Details: go/cloud-principal-identifiers
    */
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloudPrincipalProto {
  
  inline def apply(): SchemaCloudPrincipalProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudPrincipalProto]
  }
  
  extension [Self <: SchemaCloudPrincipalProto](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
