package typings.gitlab

import typings.gitlab.anon.projectIdstringnumberPagi
import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runnersMod {
  
  @JSImport("gitlab/dist/types/core/services/Runners", "Runners")
  @js.native
  class Runners () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(hasProjectIdOptions: projectIdstringnumberPagi): js.Promise[GetResponse] = js.native
    
    def allOwned(): js.Promise[GetResponse] = js.native
    def allOwned(options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    
    def disable(projectId: String, runnerId: Double): js.Promise[js.Object] = js.native
    def disable(projectId: String, runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def disable(projectId: Double, runnerId: Double): js.Promise[js.Object] = js.native
    def disable(projectId: Double, runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def edit(runnerId: Double): js.Promise[js.Object] = js.native
    def edit(runnerId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def enable(projectId: String, runnerId: Double): js.Promise[js.Object] = js.native
    def enable(projectId: String, runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def enable(projectId: Double, runnerId: Double): js.Promise[js.Object] = js.native
    def enable(projectId: Double, runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def jobs(runnerId: Double): js.Promise[GetResponse] = js.native
    def jobs(runnerId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def remove(runnerId: Double): js.Promise[js.Object] = js.native
    def remove(runnerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(runnerId: Double): js.Promise[GetResponse] = js.native
    def show(runnerId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  trait RunnerSchema extends StObject {
    
    var active: Boolean
    
    var description: String
    
    var id: Double
    
    var ip_address: String
    
    var is_shared: Boolean
    
    var name: String
    
    var online: Boolean
    
    var status: String
  }
  object RunnerSchema {
    
    inline def apply(
      active: Boolean,
      description: String,
      id: Double,
      ip_address: String,
      is_shared: Boolean,
      name: String,
      online: Boolean,
      status: String
    ): RunnerSchema = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ip_address = ip_address.asInstanceOf[js.Any], is_shared = is_shared.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunnerSchema]
    }
    
    extension [Self <: RunnerSchema](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
      
      inline def setIs_shared(value: Boolean): Self = StObject.set(x, "is_shared", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
