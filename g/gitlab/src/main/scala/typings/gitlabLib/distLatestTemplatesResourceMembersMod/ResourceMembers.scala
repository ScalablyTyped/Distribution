package typings
package gitlabLib.distLatestTemplatesResourceMembersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceMembers
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  def add(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any,
    accessLevel: AccessLevel,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def all(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any
  ): js.Promise[_] = js.native
  def all(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    includeInherited: scala.Boolean
  ): js.Promise[_] = js.native
  def all(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    includeInherited: scala.Boolean,
    options: js.Object
  ): js.Promise[_] = js.native
  def edit(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any,
    accessLevel: AccessLevel,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def remove(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any
  ): js.Promise[_] = js.native
  def show(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any
  ): js.Promise[_] = js.native
}

