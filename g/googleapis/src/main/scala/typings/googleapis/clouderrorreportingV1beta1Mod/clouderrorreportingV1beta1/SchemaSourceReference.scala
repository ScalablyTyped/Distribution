package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceReference extends StObject {
  
  /**
    * Optional. A URI string identifying the repository. Example: "https://github.com/GoogleCloudPlatform/kubernetes.git"
    */
  var repository: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The canonical and persistent identifier of the deployed revision. Example (git): "0035781c50ec7aa23385dc841529ce8a4b70db1b"
    */
  var revisionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSourceReference {
  
  inline def apply(): SchemaSourceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceReference]
  }
  
  extension [Self <: SchemaSourceReference](x: Self) {
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNull: Self = StObject.set(x, "repository", null)
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdNull: Self = StObject.set(x, "revisionId", null)
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
