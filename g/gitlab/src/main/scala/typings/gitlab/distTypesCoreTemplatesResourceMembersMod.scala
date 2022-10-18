package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import typings.gitlab.distTypesCoreTemplatesResourceAccessRequestsMod.AccessLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreTemplatesResourceMembersMod {
  
  @JSImport("gitlab/dist/types/core/templates/ResourceMembers", "ResourceMembers")
  @js.native
  open class ResourceMembers protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    
    def add(resourceId: String, userId: Double, accessLevel: AccessLevel): js.Promise[js.Object] = js.native
    def add(resourceId: String, userId: Double, accessLevel: AccessLevel, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def add(resourceId: Double, userId: Double, accessLevel: AccessLevel): js.Promise[js.Object] = js.native
    def add(resourceId: Double, userId: Double, accessLevel: AccessLevel, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def all(resourceId: String): js.Promise[GetResponse] = js.native
    def all(resourceId: String, hasIncludeInheritedOptions: IncludeInherited & PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, hasIncludeInheritedOptions: IncludeInherited & PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def edit(resourceId: String, userId: Double, accessLevel: AccessLevel): js.Promise[js.Object] = js.native
    def edit(resourceId: String, userId: Double, accessLevel: AccessLevel, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, userId: Double, accessLevel: AccessLevel): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, userId: Double, accessLevel: AccessLevel, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(resourceId: String, userId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: String, userId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, userId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, userId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(resourceId: String, userId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: String, userId: Double, hasIncludeInheritedOptions: IncludeInherited & Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, userId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, userId: Double, hasIncludeInheritedOptions: IncludeInherited & Sudo): js.Promise[GetResponse] = js.native
  }
  
  trait IncludeInherited extends StObject {
    
    var includeInherited: js.UndefOr[Boolean] = js.undefined
  }
  object IncludeInherited {
    
    inline def apply(): IncludeInherited = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncludeInherited]
    }
    
    extension [Self <: IncludeInherited](x: Self) {
      
      inline def setIncludeInherited(value: Boolean): Self = StObject.set(x, "includeInherited", value.asInstanceOf[js.Any])
      
      inline def setIncludeInheritedUndefined: Self = StObject.set(x, "includeInherited", js.undefined)
    }
  }
}
