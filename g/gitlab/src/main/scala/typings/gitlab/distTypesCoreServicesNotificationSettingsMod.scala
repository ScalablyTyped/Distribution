package typings.gitlab

import typings.gitlab.anon.groupIdstringnumberPagina
import typings.gitlab.anon.groupIdstringnumberlevelN
import typings.gitlab.anon.projectIdstringnumberPagi
import typings.gitlab.anon.projectIdstringnumberleve
import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesNotificationSettingsMod {
  
  @JSImport("gitlab/dist/types/core/services/NotificationSettings", "NotificationSettings")
  @js.native
  open class NotificationSettings () extends BaseService {
    def this(param0: BaseServiceOptions) = this()
    
    def all(param0: groupIdstringnumberPagina): js.Promise[GetResponse] = js.native
    def all(param0: projectIdstringnumberPagi): js.Promise[GetResponse] = js.native
    
    def edit(param0: groupIdstringnumberlevelN): js.Promise[js.Object] = js.native
    def edit(param0: projectIdstringnumberleve): js.Promise[js.Object] = js.native
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
