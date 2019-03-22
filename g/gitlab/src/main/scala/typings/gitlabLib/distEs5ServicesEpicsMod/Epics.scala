package typings
package gitlabLib.distEs5ServicesEpicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Epics
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def all(
    groupId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupId */ js.Any
  ): js.Promise[_] = js.native
  def create(
    groupId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupId */ js.Any,
    title: java.lang.String,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def edit(
    groupId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupId */ js.Any,
    epicId: EpicId,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def remove(
    groupId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupId */ js.Any,
    epicId: EpicId
  ): js.Promise[_] = js.native
  def show(
    groupId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GroupId */ js.Any,
    epicId: EpicId
  ): js.Promise[_] = js.native
}

