package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityAccesscontextmanagerV1IngressTo extends StObject {
  
  /**
    * A list of ApiOperations allowed to be performed by the sources specified in corresponding IngressFrom in this ServicePerimeter.
    */
  var operations: js.UndefOr[js.Array[SchemaGoogleIdentityAccesscontextmanagerV1ApiOperation]] = js.undefined
  
  /**
    * A list of resources, currently only projects in the form `projects/`, protected by this ServicePerimeter that are allowed to be accessed by sources defined in the corresponding IngressFrom. If a single `*` is specified, then access to all resources inside the perimeter are allowed.
    */
  var resources: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleIdentityAccesscontextmanagerV1IngressTo {
  
  inline def apply(): SchemaGoogleIdentityAccesscontextmanagerV1IngressTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityAccesscontextmanagerV1IngressTo]
  }
  
  extension [Self <: SchemaGoogleIdentityAccesscontextmanagerV1IngressTo](x: Self) {
    
    inline def setOperations(value: js.Array[SchemaGoogleIdentityAccesscontextmanagerV1ApiOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: SchemaGoogleIdentityAccesscontextmanagerV1ApiOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesNull: Self = StObject.set(x, "resources", null)
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
