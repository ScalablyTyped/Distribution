package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRollbackApiDeploymentRequest extends StObject {
  
  /**
    * Required. The revision ID to roll back to. It must be a revision of the same deployment. Example: c7cfa2a8
    */
  var revisionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaRollbackApiDeploymentRequest {
  
  inline def apply(): SchemaRollbackApiDeploymentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRollbackApiDeploymentRequest]
  }
  
  extension [Self <: SchemaRollbackApiDeploymentRequest](x: Self) {
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdNull: Self = StObject.set(x, "revisionId", null)
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
