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

object distTypesCoreServicesEpicsMod {
  
  @JSImport("gitlab/dist/types/core/services/Epics", "Epics")
  @js.native
  open class Epics () extends BaseService {
    def this(param0: BaseServiceOptions) = this()
    
    def all(groupId: String): js.Promise[GetResponse] = js.native
    def all(groupId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(groupId: Double): js.Promise[GetResponse] = js.native
    def all(groupId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(groupId: String, title: String): js.Promise[js.Object] = js.native
    def create(groupId: String, title: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(groupId: Double, title: String): js.Promise[js.Object] = js.native
    def create(groupId: Double, title: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(groupId: String, epicId: Double): js.Promise[js.Object] = js.native
    def edit(groupId: String, epicId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(groupId: Double, epicId: Double): js.Promise[js.Object] = js.native
    def edit(groupId: Double, epicId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(groupId: String, epicId: Double): js.Promise[js.Object] = js.native
    def remove(groupId: String, epicId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(groupId: Double, epicId: Double): js.Promise[js.Object] = js.native
    def remove(groupId: Double, epicId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(groupId: String, epicId: Double): js.Promise[GetResponse] = js.native
    def show(groupId: String, epicId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(groupId: Double, epicId: Double): js.Promise[GetResponse] = js.native
    def show(groupId: Double, epicId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
