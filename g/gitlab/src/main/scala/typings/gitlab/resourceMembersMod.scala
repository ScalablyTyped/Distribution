package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import typings.gitlab.resourceAccessRequestsMod.AccessLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceMembersMod {
  
  @JSImport("gitlab/dist/types/core/templates/ResourceMembers", "ResourceMembers")
  @js.native
  class ResourceMembers protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    
    def add(resourceId: String, userId: Double, accessLevel: AccessLevel): js.Promise[js.Object] = js.native
    def add(resourceId: String, userId: Double, accessLevel: AccessLevel, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def add(resourceId: Double, userId: Double, accessLevel: AccessLevel): js.Promise[js.Object] = js.native
    def add(resourceId: Double, userId: Double, accessLevel: AccessLevel, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def all(resourceId: String): js.Promise[GetResponse] = js.native
    def all(resourceId: String, hasIncludeInheritedOptions: IncludeInherited with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, hasIncludeInheritedOptions: IncludeInherited with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def edit(resourceId: String, userId: Double, accessLevel: AccessLevel): js.Promise[js.Object] = js.native
    def edit(resourceId: String, userId: Double, accessLevel: AccessLevel, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, userId: Double, accessLevel: AccessLevel): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, userId: Double, accessLevel: AccessLevel, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(resourceId: String, userId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: String, userId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, userId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, userId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(resourceId: String, userId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: String, userId: Double, hasIncludeInheritedOptions: IncludeInherited with Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, userId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, userId: Double, hasIncludeInheritedOptions: IncludeInherited with Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  trait IncludeInherited extends StObject {
    
    var includeInherited: js.UndefOr[Boolean] = js.native
  }
  object IncludeInherited {
    
    @scala.inline
    def apply(): IncludeInherited = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncludeInherited]
    }
    
    @scala.inline
    implicit class IncludeInheritedMutableBuilder[Self <: IncludeInherited] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeInherited(value: Boolean): Self = StObject.set(x, "includeInherited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeInheritedUndefined: Self = StObject.set(x, "includeInherited", js.undefined)
    }
  }
}
