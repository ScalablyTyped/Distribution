package typings.gitlab

import typings.gitlab.anon.gfmstringundefinedproject
import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesMarkdownMod {
  
  @JSImport("gitlab/dist/types/core/services/Markdown", "Markdown")
  @js.native
  open class Markdown () extends BaseService {
    def this(param0: BaseServiceOptions) = this()
    
    def render(text: String): js.Promise[js.Object] = js.native
    def render(text: String, options: gfmstringundefinedproject): js.Promise[js.Object] = js.native
  }
}
