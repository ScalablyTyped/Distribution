package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppPackageOptional extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var isObjectEnabler: js.UndefOr[Boolean] = js.undefined
  
  var isPublic: js.UndefOr[Boolean] = js.undefined
  
  var references: js.UndefOr[js.Array[String]] = js.undefined
  
  var requiredEngineVersion: js.UndefOr[String] = js.undefined
  
  var resource: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object AppPackageOptional {
  
  inline def apply(): AppPackageOptional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppPackageOptional]
  }
  
  extension [Self <: AppPackageOptional](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsObjectEnabler(value: Boolean): Self = StObject.set(x, "isObjectEnabler", value.asInstanceOf[js.Any])
    
    inline def setIsObjectEnablerUndefined: Self = StObject.set(x, "isObjectEnabler", js.undefined)
    
    inline def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
    
    inline def setIsPublicUndefined: Self = StObject.set(x, "isPublic", js.undefined)
    
    inline def setReferences(value: js.Array[String]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    inline def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value :_*))
    
    inline def setRequiredEngineVersion(value: String): Self = StObject.set(x, "requiredEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setRequiredEngineVersionUndefined: Self = StObject.set(x, "requiredEngineVersion", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
