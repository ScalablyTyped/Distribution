package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceDiscussionsMod {
  
  @JSImport("gitlab/dist/types/core/templates/ResourceDiscussions", "ResourceDiscussions")
  @js.native
  class ResourceDiscussions protected () extends BaseService {
    def this(resourceType: String, resource2Type: String, options: BaseServiceOptions) = this()
    
    def addNote(resourceId: String, resource2Id: String, discussionId: String, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def addNote(
      resourceId: String,
      resource2Id: String,
      discussionId: String,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def addNote(resourceId: String, resource2Id: String, discussionId: Double, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def addNote(
      resourceId: String,
      resource2Id: String,
      discussionId: Double,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def addNote(resourceId: String, resource2Id: Double, discussionId: String, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def addNote(
      resourceId: String,
      resource2Id: Double,
      discussionId: String,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def addNote(resourceId: String, resource2Id: Double, discussionId: Double, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def addNote(
      resourceId: String,
      resource2Id: Double,
      discussionId: Double,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def addNote(resourceId: Double, resource2Id: String, discussionId: String, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def addNote(
      resourceId: Double,
      resource2Id: String,
      discussionId: String,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def addNote(resourceId: Double, resource2Id: String, discussionId: Double, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def addNote(
      resourceId: Double,
      resource2Id: String,
      discussionId: Double,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def addNote(resourceId: Double, resource2Id: Double, discussionId: String, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def addNote(
      resourceId: Double,
      resource2Id: Double,
      discussionId: String,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def addNote(resourceId: Double, resource2Id: Double, discussionId: Double, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def addNote(
      resourceId: Double,
      resource2Id: Double,
      discussionId: Double,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    
    def all(resourceId: String, resource2Id: String): js.Promise[GetResponse] = js.native
    def all(resourceId: String, resource2Id: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: String, resource2Id: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: String, resource2Id: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, resource2Id: String): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, resource2Id: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, resource2Id: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, resource2Id: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(resourceId: String, resource2Id: String, content: String): js.Promise[js.Object] = js.native
    def create(resourceId: String, resource2Id: String, content: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(resourceId: String, resource2Id: Double, content: String): js.Promise[js.Object] = js.native
    def create(resourceId: String, resource2Id: Double, content: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(resourceId: Double, resource2Id: String, content: String): js.Promise[js.Object] = js.native
    def create(resourceId: Double, resource2Id: String, content: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(resourceId: Double, resource2Id: Double, content: String): js.Promise[js.Object] = js.native
    def create(resourceId: Double, resource2Id: Double, content: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def editNote(resourceId: String, resource2Id: String, discussionId: String, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def editNote(
      resourceId: String,
      resource2Id: String,
      discussionId: String,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def editNote(resourceId: String, resource2Id: String, discussionId: Double, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def editNote(
      resourceId: String,
      resource2Id: String,
      discussionId: Double,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def editNote(resourceId: String, resource2Id: Double, discussionId: String, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def editNote(
      resourceId: String,
      resource2Id: Double,
      discussionId: String,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def editNote(resourceId: String, resource2Id: Double, discussionId: Double, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def editNote(
      resourceId: String,
      resource2Id: Double,
      discussionId: Double,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def editNote(resourceId: Double, resource2Id: String, discussionId: String, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def editNote(
      resourceId: Double,
      resource2Id: String,
      discussionId: String,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def editNote(resourceId: Double, resource2Id: String, discussionId: Double, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def editNote(
      resourceId: Double,
      resource2Id: String,
      discussionId: Double,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def editNote(resourceId: Double, resource2Id: Double, discussionId: String, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def editNote(
      resourceId: Double,
      resource2Id: Double,
      discussionId: String,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def editNote(resourceId: Double, resource2Id: Double, discussionId: Double, noteId: Double, content: String): js.Promise[js.Object] = js.native
    def editNote(
      resourceId: Double,
      resource2Id: Double,
      discussionId: Double,
      noteId: Double,
      content: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    
    def removeNote(resourceId: String, resource2Id: String, discussionId: String, noteId: Double): js.Promise[js.Object] = js.native
    def removeNote(resourceId: String, resource2Id: String, discussionId: String, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def removeNote(resourceId: String, resource2Id: String, discussionId: Double, noteId: Double): js.Promise[js.Object] = js.native
    def removeNote(resourceId: String, resource2Id: String, discussionId: Double, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def removeNote(resourceId: String, resource2Id: Double, discussionId: String, noteId: Double): js.Promise[js.Object] = js.native
    def removeNote(resourceId: String, resource2Id: Double, discussionId: String, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def removeNote(resourceId: String, resource2Id: Double, discussionId: Double, noteId: Double): js.Promise[js.Object] = js.native
    def removeNote(resourceId: String, resource2Id: Double, discussionId: Double, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def removeNote(resourceId: Double, resource2Id: String, discussionId: String, noteId: Double): js.Promise[js.Object] = js.native
    def removeNote(resourceId: Double, resource2Id: String, discussionId: String, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def removeNote(resourceId: Double, resource2Id: String, discussionId: Double, noteId: Double): js.Promise[js.Object] = js.native
    def removeNote(resourceId: Double, resource2Id: String, discussionId: Double, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def removeNote(resourceId: Double, resource2Id: Double, discussionId: String, noteId: Double): js.Promise[js.Object] = js.native
    def removeNote(resourceId: Double, resource2Id: Double, discussionId: String, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def removeNote(resourceId: Double, resource2Id: Double, discussionId: Double, noteId: Double): js.Promise[js.Object] = js.native
    def removeNote(resourceId: Double, resource2Id: Double, discussionId: Double, noteId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    var resource2Type: String = js.native
    
    def show(resourceId: String, resource2Id: String, discussionId: String): js.Promise[GetResponse] = js.native
    def show(resourceId: String, resource2Id: String, discussionId: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: String, resource2Id: String, discussionId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: String, resource2Id: String, discussionId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: String, resource2Id: Double, discussionId: String): js.Promise[GetResponse] = js.native
    def show(resourceId: String, resource2Id: Double, discussionId: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: String, resource2Id: Double, discussionId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: String, resource2Id: Double, discussionId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, resource2Id: String, discussionId: String): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, resource2Id: String, discussionId: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, resource2Id: String, discussionId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, resource2Id: String, discussionId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, resource2Id: Double, discussionId: String): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, resource2Id: Double, discussionId: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, resource2Id: Double, discussionId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, resource2Id: Double, discussionId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
