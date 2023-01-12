package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.gitlabStrings.closed
import typings.gitlab.gitlabStrings.commented
import typings.gitlab.gitlabStrings.created
import typings.gitlab.gitlabStrings.destroyed
import typings.gitlab.gitlabStrings.expired
import typings.gitlab.gitlabStrings.issue
import typings.gitlab.gitlabStrings.joined
import typings.gitlab.gitlabStrings.left
import typings.gitlab.gitlabStrings.merge_request
import typings.gitlab.gitlabStrings.merged
import typings.gitlab.gitlabStrings.milestone
import typings.gitlab.gitlabStrings.note
import typings.gitlab.gitlabStrings.project
import typings.gitlab.gitlabStrings.pushed
import typings.gitlab.gitlabStrings.reopened
import typings.gitlab.gitlabStrings.snippet
import typings.gitlab.gitlabStrings.updated
import typings.gitlab.gitlabStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesEventsMod {
  
  @JSImport("gitlab/dist/types/core/services/Events", "Events")
  @js.native
  open class Events () extends BaseService {
    def this(param0: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions & EventOptions): js.Promise[GetResponse] = js.native
  }
  
  trait EventOptions extends StObject {
    
    var action: js.UndefOr[
        created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired
      ] = js.undefined
    
    var targetType: js.UndefOr[issue | milestone | merge_request | note | project | snippet | user] = js.undefined
  }
  object EventOptions {
    
    inline def apply(): EventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventOptions] (val x: Self) extends AnyVal {
      
      inline def setAction(
        value: created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setTargetType(value: issue | milestone | merge_request | note | project | snippet | user): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
      
      inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    }
  }
}
