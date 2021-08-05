package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceAwardEmojisMod {
  
  @JSImport("gitlab/dist/types/core/templates/ResourceAwardEmojis", "ResourceAwardEmojis")
  @js.native
  class ResourceAwardEmojis protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    
    def all(projectId: String, resourceId: String, noteId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: String, resourceId: String, noteId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: String, resourceId: Double, noteId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: String, resourceId: Double, noteId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double, resourceId: String, noteId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, resourceId: String, noteId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double, resourceId: Double, noteId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, resourceId: Double, noteId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def award(projectId: String, resourceId: String, name: String, noteId: Double): js.Promise[js.Object] = js.native
    def award(projectId: String, resourceId: String, name: String, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def award(projectId: String, resourceId: Double, name: String, noteId: Double): js.Promise[js.Object] = js.native
    def award(projectId: String, resourceId: Double, name: String, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def award(projectId: Double, resourceId: String, name: String, noteId: Double): js.Promise[js.Object] = js.native
    def award(projectId: Double, resourceId: String, name: String, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def award(projectId: Double, resourceId: Double, name: String, noteId: Double): js.Promise[js.Object] = js.native
    def award(projectId: Double, resourceId: Double, name: String, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, resourceId: String, awardId: Double, noteId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, resourceId: String, awardId: Double, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: String, resourceId: Double, awardId: Double, noteId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, resourceId: Double, awardId: Double, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, resourceId: String, awardId: Double, noteId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, resourceId: String, awardId: Double, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, resourceId: Double, awardId: Double, noteId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, resourceId: Double, awardId: Double, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    /* protected */ var resourceType: String = js.native
    
    def show(projectId: String, resourceId: String, awardId: Double, noteId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, resourceId: String, awardId: Double, noteId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: String, resourceId: Double, awardId: Double, noteId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, resourceId: Double, awardId: Double, noteId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, resourceId: String, awardId: Double, noteId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, resourceId: String, awardId: Double, noteId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, resourceId: Double, awardId: Double, noteId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, resourceId: Double, awardId: Double, noteId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
