package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesWikisMod {
  
  @JSImport("gitlab/dist/types/core/services/Wikis", "Wikis")
  @js.native
  open class Wikis () extends BaseService {
    def this(param0: BaseServiceOptions) = this()
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(projectId: String): js.Promise[js.Object] = js.native
    def create(projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(projectId: Double): js.Promise[js.Object] = js.native
    def create(projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(projectId: String, slug: String): js.Promise[js.Object] = js.native
    def edit(projectId: String, slug: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, slug: String): js.Promise[js.Object] = js.native
    def edit(projectId: Double, slug: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, slug: String): js.Promise[js.Object] = js.native
    def remove(projectId: String, slug: String, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, slug: String): js.Promise[js.Object] = js.native
    def remove(projectId: Double, slug: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, slug: String): js.Promise[GetResponse] = js.native
    def show(projectId: String, slug: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, slug: String): js.Promise[GetResponse] = js.native
    def show(projectId: Double, slug: String, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
