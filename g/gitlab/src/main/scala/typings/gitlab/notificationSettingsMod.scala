package typings.gitlab

import typings.gitlab.anon.Level
import typings.gitlab.anon.`0`
import typings.gitlab.anon.`1`
import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationSettingsMod {
  
  @JSImport("gitlab/dist/types/core/services/NotificationSettings", "NotificationSettings")
  @js.native
  class NotificationSettings () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(hasProjectIdGroupIdOptions: (`0` | `1`) with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def edit(hasProjectIdGroupIdOptions: Level with (`0` | `1`) with BaseRequestOptions): js.Promise[js.Object] = js.native
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
    
    @scala.inline
    def custom: typings.gitlab.gitlabStrings.custom = "custom".asInstanceOf[typings.gitlab.gitlabStrings.custom]
    
    @scala.inline
    def disabled: typings.gitlab.gitlabStrings.disabled = "disabled".asInstanceOf[typings.gitlab.gitlabStrings.disabled]
    
    @scala.inline
    def global: typings.gitlab.gitlabStrings.global = "global".asInstanceOf[typings.gitlab.gitlabStrings.global]
    
    @scala.inline
    def mention: typings.gitlab.gitlabStrings.mention = "mention".asInstanceOf[typings.gitlab.gitlabStrings.mention]
    
    @scala.inline
    def participating: typings.gitlab.gitlabStrings.participating = "participating".asInstanceOf[typings.gitlab.gitlabStrings.participating]
    
    @scala.inline
    def watch: typings.gitlab.gitlabStrings.watch = "watch".asInstanceOf[typings.gitlab.gitlabStrings.watch]
  }
}
