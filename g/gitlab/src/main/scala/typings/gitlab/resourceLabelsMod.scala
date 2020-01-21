package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/templates/ResourceLabels", JSImport.Namespace)
@js.native
object resourceLabelsMod extends js.Object {
  @js.native
  class ResourceLabels protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    def all(resourceId: String): js.Promise[GetResponse] = js.native
    def all(resourceId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(resourceId: String, labelName: String, color: String): js.Promise[js.Object] = js.native
    def create(resourceId: String, labelName: String, color: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(resourceId: Double, labelName: String, color: String): js.Promise[js.Object] = js.native
    def create(resourceId: Double, labelName: String, color: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: String, labelName: String): js.Promise[js.Object] = js.native
    def edit(resourceId: String, labelName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, labelName: String): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, labelName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(resourceId: String, labelName: String): js.Promise[js.Object] = js.native
    def remove(resourceId: String, labelName: String, options: Sudo): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, labelName: String): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, labelName: String, options: Sudo): js.Promise[js.Object] = js.native
    def subscribe(resourceId: String, labelId: Double): js.Promise[js.Object] = js.native
    def subscribe(resourceId: String, labelId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def subscribe(resourceId: Double, labelId: Double): js.Promise[js.Object] = js.native
    def subscribe(resourceId: Double, labelId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def unsubscribe(resourceId: String, labelId: Double): js.Promise[js.Object] = js.native
    def unsubscribe(resourceId: String, labelId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def unsubscribe(resourceId: Double, labelId: Double): js.Promise[js.Object] = js.native
    def unsubscribe(resourceId: Double, labelId: Double, options: Sudo): js.Promise[js.Object] = js.native
  }
  
}

