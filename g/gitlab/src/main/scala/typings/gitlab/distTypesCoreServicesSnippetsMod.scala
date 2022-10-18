package typings.gitlab

import typings.gitlab.anon.publicbooleanPaginatedReq
import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesSnippetsMod {
  
  @JSImport("gitlab/dist/types/core/services/Snippets", "Snippets")
  @js.native
  open class Snippets () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(hasPOptions: publicbooleanPaginatedReq): js.Promise[GetResponse] = js.native
    
    def content(snippetId: Double): js.Promise[GetResponse] = js.native
    def content(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def create(title: String, fileName: String, content: String, visibility: SnippetVisibility): js.Promise[js.Object] = js.native
    def create(
      title: String,
      fileName: String,
      content: String,
      visibility: SnippetVisibility,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    
    def edit(snippetId: Double): js.Promise[js.Object] = js.native
    def edit(snippetId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(snippetId: Double): js.Promise[js.Object] = js.native
    def remove(snippetId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(snippetId: Double): js.Promise[GetResponse] = js.native
    def show(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def userAgentDetails(snippetId: Double): js.Promise[GetResponse] = js.native
    def userAgentDetails(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gitlab.gitlabStrings.`private`
    - typings.gitlab.gitlabStrings.public
    - typings.gitlab.gitlabStrings.internal
  */
  trait SnippetVisibility extends StObject
  object SnippetVisibility {
    
    inline def internal: typings.gitlab.gitlabStrings.internal = "internal".asInstanceOf[typings.gitlab.gitlabStrings.internal]
    
    inline def `private`: typings.gitlab.gitlabStrings.`private` = "private".asInstanceOf[typings.gitlab.gitlabStrings.`private`]
    
    inline def public: typings.gitlab.gitlabStrings.public = "public".asInstanceOf[typings.gitlab.gitlabStrings.public]
  }
}
