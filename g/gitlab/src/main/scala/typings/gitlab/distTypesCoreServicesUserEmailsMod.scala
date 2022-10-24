package typings.gitlab

import typings.gitlab.anon.userIdnumberundefinedBase
import typings.gitlab.anon.userIdnumberundefinedPagi
import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesUserEmailsMod {
  
  @JSImport("gitlab/dist/types/core/services/UserEmails", "UserEmails")
  @js.native
  open class UserEmails () extends BaseService {
    def this(param0: BaseServiceOptions) = this()
    
    def add(email: Any): js.Promise[js.Object] = js.native
    def add(email: Any, param1: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    
    def all(): js.Promise[GetResponse] = js.native
    def all(param0: userIdnumberundefinedPagi): js.Promise[GetResponse] = js.native
    
    def remove(emailId: Any): js.Promise[js.Object] = js.native
    def remove(emailId: Any, param1: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    
    def show(emailId: Any): js.Promise[GetResponse] = js.native
    def show(emailId: Any, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
}
