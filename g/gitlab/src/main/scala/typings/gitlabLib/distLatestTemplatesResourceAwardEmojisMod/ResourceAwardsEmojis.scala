package typings
package gitlabLib.distLatestTemplatesResourceAwardEmojisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceAwardsEmojis
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  var resourceType: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any = js.native
  def all(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions,
    noteId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NoteId */ js.Any
  ): js.Promise[_] = js.native
  def award(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    name: java.lang.String,
    noteId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NoteId */ js.Any
  ): js.Promise[_] = js.native
  def remove(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    awardId: java.lang.String,
    noteId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NoteId */ js.Any
  ): js.Promise[_] = js.native
  def remove(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    awardId: scala.Double,
    noteId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NoteId */ js.Any
  ): js.Promise[_] = js.native
  def show(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    awardId: java.lang.String,
    noteId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NoteId */ js.Any
  ): js.Promise[_] = js.native
  def show(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    awardId: scala.Double,
    noteId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NoteId */ js.Any
  ): js.Promise[_] = js.native
}

