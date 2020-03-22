package typings.gitlab

import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/ReleaseLinks", JSImport.Namespace)
@js.native
object releaseLinksMod extends js.Object {
  @js.native
  class ReleaseLinks () extends BaseService {
    def all(projectId: String, tagName: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, tagName: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double, tagName: String): js.Promise[GetResponse] = js.native
    def all(projectId: Double, tagName: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(projectId: String, tagName: String, name: String, url: String): js.Promise[js.Object] = js.native
    def create(projectId: String, tagName: String, name: String, url: String, options: Sudo): js.Promise[js.Object] = js.native
    def create(projectId: Double, tagName: String, name: String, url: String): js.Promise[js.Object] = js.native
    def create(projectId: Double, tagName: String, name: String, url: String, options: Sudo): js.Promise[js.Object] = js.native
    def edit(projectId: String, tagName: String, linkId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: String, tagName: String, linkId: Double, options: Sudo with (AnonName | AnonUrl)): js.Promise[js.Object] = js.native
    def edit(projectId: Double, tagName: String, linkId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: Double, tagName: String, linkId: Double, options: Sudo with (AnonName | AnonUrl)): js.Promise[js.Object] = js.native
    def remove(projectId: String, tagName: String, linkId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, tagName: String, linkId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, tagName: String, linkId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, tagName: String, linkId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: String, tagName: String, linkId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, tagName: String, linkId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, tagName: String, linkId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, tagName: String, linkId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
}

