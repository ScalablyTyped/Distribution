package typings.gitlab

import typings.gitlab.anon.accessLevelAccessLevelund
import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceAccessRequestsMod {
  
  @JSImport("gitlab/dist/types/core/templates/ResourceAccessRequests", "ResourceAccessRequests")
  @js.native
  class ResourceAccessRequests protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    
    def all(resourceId: String): js.Promise[GetResponse] = js.native
    def all(resourceId: Double): js.Promise[GetResponse] = js.native
    
    def approve(resourceId: String, userId: Double): js.Promise[js.Object] = js.native
    def approve(resourceId: String, userId: Double, hasAccessLevel: accessLevelAccessLevelund): js.Promise[js.Object] = js.native
    def approve(resourceId: Double, userId: Double): js.Promise[js.Object] = js.native
    def approve(resourceId: Double, userId: Double, hasAccessLevel: accessLevelAccessLevelund): js.Promise[js.Object] = js.native
    
    def deny(resourceId: String, userId: Double): js.Promise[js.Object] = js.native
    def deny(resourceId: Double, userId: Double): js.Promise[js.Object] = js.native
    
    def request(resourceId: String): js.Promise[js.Object] = js.native
    def request(resourceId: Double): js.Promise[js.Object] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gitlab.gitlabNumbers.`10`
    - typings.gitlab.gitlabNumbers.`20`
    - typings.gitlab.gitlabNumbers.`30`
    - typings.gitlab.gitlabNumbers.`40`
    - typings.gitlab.gitlabNumbers.`50`
  */
  trait AccessLevel extends StObject
  object AccessLevel {
    
    @scala.inline
    def `10`: typings.gitlab.gitlabNumbers.`10` = 10.asInstanceOf[typings.gitlab.gitlabNumbers.`10`]
    
    @scala.inline
    def `20`: typings.gitlab.gitlabNumbers.`20` = 20.asInstanceOf[typings.gitlab.gitlabNumbers.`20`]
    
    @scala.inline
    def `30`: typings.gitlab.gitlabNumbers.`30` = 30.asInstanceOf[typings.gitlab.gitlabNumbers.`30`]
    
    @scala.inline
    def `40`: typings.gitlab.gitlabNumbers.`40` = 40.asInstanceOf[typings.gitlab.gitlabNumbers.`40`]
    
    @scala.inline
    def `50`: typings.gitlab.gitlabNumbers.`50` = 50.asInstanceOf[typings.gitlab.gitlabNumbers.`50`]
  }
}
