package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceTemplatesMod {
  
  @JSImport("gitlab/dist/types/core/templates/ResourceTemplates", "ResourceTemplates")
  @js.native
  class ResourceTemplates protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def show(resourceId: String): js.Promise[js.Object] = js.native
    def show(resourceId: String, options: Sudo): js.Promise[js.Object] = js.native
    def show(resourceId: Double): js.Promise[js.Object] = js.native
    def show(resourceId: Double, options: Sudo): js.Promise[js.Object] = js.native
  }
}
