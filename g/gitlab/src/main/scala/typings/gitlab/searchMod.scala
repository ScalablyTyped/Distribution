package typings.gitlab

import typings.gitlab.anon.projectIdstringnumberundeDictkey
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/Search", JSImport.Namespace)
@js.native
object searchMod extends js.Object {
  
  @js.native
  class Search () extends BaseService {
    
    def all(scope: String, search: String, hasProjectIdGroupIdOptions: projectIdstringnumberundeDictkey): js.Promise[GetResponse] = js.native
  }
}
