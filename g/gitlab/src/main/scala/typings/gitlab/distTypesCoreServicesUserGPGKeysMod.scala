package typings.gitlab

import typings.gitlab.anon.userIdnumberundefinedBase
import typings.gitlab.anon.userIdnumberundefinedPagi
import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesUserGPGKeysMod {
  
  @JSImport("gitlab/dist/types/core/services/UserGPGKeys", "UserGPGKeys")
  @js.native
  open class UserGPGKeys () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def add(key: String): js.Promise[js.Object] = js.native
    def add(key: String, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    
    def all(): js.Promise[GetResponse] = js.native
    def all(hasUserIdOptions: userIdnumberundefinedPagi): js.Promise[GetResponse] = js.native
    
    def remove(keyId: Double): js.Promise[js.Object] = js.native
    def remove(keyId: Double, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    
    def show(keyId: Double): js.Promise[GetResponse] = js.native
    def show(keyId: Double, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[GetResponse] = js.native
  }
}
