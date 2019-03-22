package typings
package gitlabLib.distLatestTemplatesResourceAccessRequestsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceAccessRequests
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  var ACCESS_LEVELS: gitlabLib.Anon_DEVELOPER = js.native
  def all(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any
  ): js.Promise[_] = js.native
  def approve(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any,
    hasAccessLevel: gitlabLib.Anon_AccessLevel
  ): js.Promise[_] = js.native
  def deny(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any
  ): js.Promise[_] = js.native
  def request(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any
  ): js.Promise[_] = js.native
}

