package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.gitlabStrings.env_var
import typings.gitlab.gitlabStrings.file
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceVariablesMod {
  
  @JSImport("gitlab/dist/types/core/templates/ResourceVariables", "ResourceVariables")
  @js.native
  open class ResourceVariables protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    
    def all(resourceId: String): js.Promise[js.Array[ResourceVariableSchema]] = js.native
    def all(resourceId: String, options: PaginatedRequestOptions): js.Promise[js.Array[ResourceVariableSchema]] = js.native
    def all(resourceId: Double): js.Promise[js.Array[ResourceVariableSchema]] = js.native
    def all(resourceId: Double, options: PaginatedRequestOptions): js.Promise[js.Array[ResourceVariableSchema]] = js.native
    
    def create(resourceId: String): js.Promise[js.Object] = js.native
    def create(resourceId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(resourceId: Double): js.Promise[js.Object] = js.native
    def create(resourceId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(resourceId: String, keyId: String): js.Promise[js.Object] = js.native
    def edit(resourceId: String, keyId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, keyId: String): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, keyId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(resourceId: String, keyId: String): js.Promise[js.Object] = js.native
    def remove(resourceId: String, keyId: String, options: PaginatedRequestOptions): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, keyId: String): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, keyId: String, options: PaginatedRequestOptions): js.Promise[js.Object] = js.native
    
    def show(resourceId: String, keyId: String): js.Promise[ResourceVariableSchema] = js.native
    def show(resourceId: String, keyId: String, options: PaginatedRequestOptions): js.Promise[ResourceVariableSchema] = js.native
    def show(resourceId: Double, keyId: String): js.Promise[ResourceVariableSchema] = js.native
    def show(resourceId: Double, keyId: String, options: PaginatedRequestOptions): js.Promise[ResourceVariableSchema] = js.native
  }
  
  trait ResourceVariableSchema extends StObject {
    
    var key: String
    
    var value: String
    
    var variable_type: env_var | file
  }
  object ResourceVariableSchema {
    
    inline def apply(key: String, value: String, variable_type: env_var | file): ResourceVariableSchema = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variable_type = variable_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceVariableSchema]
    }
    
    extension [Self <: ResourceVariableSchema](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVariable_type(value: env_var | file): Self = StObject.set(x, "variable_type", value.asInstanceOf[js.Any])
    }
  }
}
