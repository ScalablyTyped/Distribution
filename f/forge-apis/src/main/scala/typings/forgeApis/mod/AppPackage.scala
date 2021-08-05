package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppPackage extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var isObjectEnabler: js.UndefOr[Boolean] = js.undefined
  
  var isPublic: js.UndefOr[Boolean] = js.undefined
  
  var references: js.Array[String]
  
  var requiredEngineVersion: String
  
  var resource: String
  
  var version: Double
}
object AppPackage {
  
  inline def apply(
    id: String,
    references: js.Array[String],
    requiredEngineVersion: String,
    resource: String,
    version: Double
  ): AppPackage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], requiredEngineVersion = requiredEngineVersion.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppPackage]
  }
  
  extension [Self <: AppPackage](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsObjectEnabler(value: Boolean): Self = StObject.set(x, "isObjectEnabler", value.asInstanceOf[js.Any])
    
    inline def setIsObjectEnablerUndefined: Self = StObject.set(x, "isObjectEnabler", js.undefined)
    
    inline def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
    
    inline def setIsPublicUndefined: Self = StObject.set(x, "isPublic", js.undefined)
    
    inline def setReferences(value: js.Array[String]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value :_*))
    
    inline def setRequiredEngineVersion(value: String): Self = StObject.set(x, "requiredEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
