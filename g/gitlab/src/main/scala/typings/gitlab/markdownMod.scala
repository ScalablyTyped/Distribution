package typings.gitlab

import typings.gitlab.anon.gfmstringundefinedproject
import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markdownMod {
  
  @JSImport("gitlab/dist/types/core/services/Markdown", "Markdown")
  @js.native
  open class Markdown () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def render(text: String): js.Promise[js.Object] = js.native
    def render(text: String, options: gfmstringundefinedproject): js.Promise[js.Object] = js.native
  }
}
