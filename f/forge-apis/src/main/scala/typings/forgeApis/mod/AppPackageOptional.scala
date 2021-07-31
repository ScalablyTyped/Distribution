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
  
  @scala.inline
  def apply(): AppPackageOptional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppPackageOptional]
  }
  
  @scala.inline
  implicit class AppPackageOptionalMutableBuilder[Self <: AppPackageOptional] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsObjectEnabler(value: Boolean): Self = StObject.set(x, "isObjectEnabler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsObjectEnablerUndefined: Self = StObject.set(x, "isObjectEnabler", js.undefined)
    
    @scala.inline
    def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPublicUndefined: Self = StObject.set(x, "isPublic", js.undefined)
    
    @scala.inline
    def setReferences(value: js.Array[String]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    @scala.inline
    def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value :_*))
    
    @scala.inline
    def setRequiredEngineVersion(value: String): Self = StObject.set(x, "requiredEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredEngineVersionUndefined: Self = StObject.set(x, "requiredEngineVersion", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
