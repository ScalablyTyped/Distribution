package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppPackage extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var isObjectEnabler: js.UndefOr[Boolean] = js.native
  
  var isPublic: js.UndefOr[Boolean] = js.native
  
  var references: js.Array[String] = js.native
  
  var requiredEngineVersion: String = js.native
  
  var resource: String = js.native
  
  var version: Double = js.native
}
object AppPackage {
  
  @scala.inline
  def apply(
    id: String,
    references: js.Array[String],
    requiredEngineVersion: String,
    resource: String,
    version: Double
  ): AppPackage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], requiredEngineVersion = requiredEngineVersion.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppPackage]
  }
  
  @scala.inline
  implicit class AppPackageMutableBuilder[Self <: AppPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
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
    def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value :_*))
    
    @scala.inline
    def setRequiredEngineVersion(value: String): Self = StObject.set(x, "requiredEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
