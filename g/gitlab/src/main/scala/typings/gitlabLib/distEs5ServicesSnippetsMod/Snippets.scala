package typings
package gitlabLib.distEs5ServicesSnippetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snippets
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def all(): js.Promise[_] = js.native
  def all(options: gitlabLib.Anon_Public): js.Promise[_] = js.native
  def content(snippetId: SnippetId): js.Promise[_] = js.native
  def create(
    title: java.lang.String,
    fileName: java.lang.String,
    content: java.lang.String,
    visibility: java.lang.String
  ): js.Promise[_] = js.native
  def create(
    title: java.lang.String,
    fileName: java.lang.String,
    content: java.lang.String,
    visibility: java.lang.String,
    options: js.Object
  ): js.Promise[_] = js.native
  def edit(snippetId: SnippetId, options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def remove(snippetId: SnippetId): js.Promise[_] = js.native
  def show(snippetId: SnippetId): js.Promise[_] = js.native
  def userAgentDetails(snippetId: SnippetId): js.Promise[_] = js.native
}

