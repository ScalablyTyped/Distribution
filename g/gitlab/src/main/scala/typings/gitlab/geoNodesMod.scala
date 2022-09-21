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

object geoNodesMod {
  
  @JSImport("gitlab/dist/types/core/services/GeoNodes", "GeoNodes")
  @js.native
  open class GeoNodes () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(geonodeId: Double): js.Promise[js.Object] = js.native
    def create(geonodeId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(geonodeId: Double): js.Promise[js.Object] = js.native
    def edit(geonodeId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def failures(): js.Promise[js.Object] = js.native
    def failures(options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def repair(geonodeId: Double): js.Promise[js.Object] = js.native
    def repair(geonodeId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(geonodeId: Double): js.Promise[GetResponse] = js.native
    def show(geonodeId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def status(geonodeId: Double): js.Promise[GetResponse] = js.native
    def status(geonodeId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def statuses(): js.Promise[GetResponse] = js.native
    def statuses(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  }
}
