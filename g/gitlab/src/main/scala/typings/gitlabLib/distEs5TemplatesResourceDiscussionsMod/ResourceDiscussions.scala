package typings
package gitlabLib.distEs5TemplatesResourceDiscussionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDiscussions
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  var resource2Type: java.lang.String = js.native
  def addNote(
    resourceId: java.lang.String,
    resource2Id: java.lang.String,
    discussiodId: java.lang.String,
    noteId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NoteId */ js.Any,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def all(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    resource2Id: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Resource2Id */ js.Any,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def create(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    resource2Id: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Resource2Id */ js.Any,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def editNote(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    resource2Id: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Resource2Id */ js.Any,
    discussiodId: DiscussiodId,
    noteId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NoteId */ js.Any,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def removeNote(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    resource2Id: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Resource2Id */ js.Any,
    discussiodId: DiscussiodId,
    noteId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NoteId */ js.Any
  ): js.Promise[_] = js.native
  def show(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    resource2Id: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Resource2Id */ js.Any,
    discussiodId: DiscussiodId
  ): js.Promise[_] = js.native
}

