package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import typings.gitlab.resourceAccessRequestsMod.AccessLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/templates/ResourceMembers", JSImport.Namespace)
@js.native
object resourceMembersMod extends js.Object {
  @js.native
  class ResourceMembers protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    def add(resourceId: String, userId: Double, accessLevel: AccessLevel): js.Promise[js.Object] = js.native
    def add(resourceId: String, userId: Double, accessLevel: AccessLevel, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def add(resourceId: Double, userId: Double, accessLevel: AccessLevel): js.Promise[js.Object] = js.native
    def add(resourceId: Double, userId: Double, accessLevel: AccessLevel, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def all(resourceId: String): js.Promise[GetResponse] = js.native
    def all(resourceId: String, includeInherited: Boolean): js.Promise[GetResponse] = js.native
    def all(resourceId: String, includeInherited: Boolean, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, includeInherited: Boolean): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, includeInherited: Boolean, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def edit(resourceId: String, userId: Double, accessLevel: AccessLevel): js.Promise[js.Object] = js.native
    def edit(resourceId: String, userId: Double, accessLevel: AccessLevel, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, userId: Double, accessLevel: AccessLevel): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, userId: Double, accessLevel: AccessLevel, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(resourceId: String, userId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: String, userId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, userId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, userId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def show(resourceId: String, userId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: String, userId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, userId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, userId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
}

