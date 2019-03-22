package typings
package gitlabLib.distEs5ServicesProjectSnippetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSnippets
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def all(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ): js.Promise[_] = js.native
  def all(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    options: js.Object
  ): js.Promise[_] = js.native
  def content(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    snippetId: SnippetId
  ): js.Promise[_] = js.native
  def create(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    title: java.lang.String,
    fileName: java.lang.String,
    code: java.lang.String,
    visibility: VisibilityLevel
  ): js.Promise[_] = js.native
  def create(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    title: java.lang.String,
    fileName: java.lang.String,
    code: java.lang.String,
    visibility: VisibilityLevel,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def edit(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    snippetId: SnippetId,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def remove(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    snippetId: SnippetId
  ): js.Promise[_] = js.native
  def show(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    snippetId: SnippetId
  ): js.Promise[_] = js.native
  def userAgentDetails(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    snippetId: SnippetId
  ): js.Promise[_] = js.native
}

