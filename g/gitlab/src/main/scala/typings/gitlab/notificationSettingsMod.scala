package typings.gitlab

import typings.gitlab.anon.groupIdstringnumberPagina
import typings.gitlab.anon.groupIdstringnumberlevelN
import typings.gitlab.anon.projectIdstringnumberPagi
import typings.gitlab.anon.projectIdstringnumberleve
import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationSettingsMod {
  
  @JSImport("gitlab/dist/types/core/services/NotificationSettings", "NotificationSettings")
  @js.native
  open class NotificationSettings () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(hasProjectIdGroupIdOptions: groupIdstringnumberPagina): js.Promise[GetResponse] = js.native
    def all(hasProjectIdGroupIdOptions: projectIdstringnumberPagi): js.Promise[GetResponse] = js.native
    
    def edit(hasProjectIdGroupIdOptions: groupIdstringnumberlevelN): js.Promise[js.Object] = js.native
    def edit(hasProjectIdGroupIdOptions: projectIdstringnumberleve): js.Promise[js.Object] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gitlab.gitlabStrings.disabled
    - typings.gitlab.gitlabStrings.participating
    - typings.gitlab.gitlabStrings.watch
    - typings.gitlab.gitlabStrings.global
    - typings.gitlab.gitlabStrings.mention
    - typings.gitlab.gitlabStrings.custom
  */
  trait NotificationSettingLevel extends StObject
  object NotificationSettingLevel {
    
    inline def custom: typings.gitlab.gitlabStrings.custom = "custom".asInstanceOf[typings.gitlab.gitlabStrings.custom]
    
    inline def disabled: typings.gitlab.gitlabStrings.disabled = "disabled".asInstanceOf[typings.gitlab.gitlabStrings.disabled]
    
    inline def global: typings.gitlab.gitlabStrings.global = "global".asInstanceOf[typings.gitlab.gitlabStrings.global]
    
    inline def mention: typings.gitlab.gitlabStrings.mention = "mention".asInstanceOf[typings.gitlab.gitlabStrings.mention]
    
    inline def participating: typings.gitlab.gitlabStrings.participating = "participating".asInstanceOf[typings.gitlab.gitlabStrings.participating]
    
    inline def watch: typings.gitlab.gitlabStrings.watch = "watch".asInstanceOf[typings.gitlab.gitlabStrings.watch]
  }
}
