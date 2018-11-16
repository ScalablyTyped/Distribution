package typings
package gitlabLib.modelsIssuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/Models/Issues", "Issues")
@js.native
class Issues ()
  extends gitlabLib.basemodelMod.BaseModel {
  def all(): js.Any = js.native
  def all(fn: js.Function): js.Any = js.native
  def all(params: js.Object): js.Any = js.native
  def all(params: js.Object, fn: js.Function): js.Any = js.native
  def create(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def create(projectId: gitlabLib.basemodelMod.TId, params: js.Object): js.Any = js.native
  def create(projectId: gitlabLib.basemodelMod.TId, params: js.Object, fn: js.Function): js.Any = js.native
  def edit(projectId: gitlabLib.basemodelMod.TId, issueId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def edit(projectId: gitlabLib.basemodelMod.TId, issueId: gitlabLib.basemodelMod.TId, params: js.Object): js.Any = js.native
  def edit(
    projectId: gitlabLib.basemodelMod.TId,
    issueId: gitlabLib.basemodelMod.TId,
    params: js.Object,
    fn: js.Function
  ): js.Any = js.native
  def remove(projectId: gitlabLib.basemodelMod.TId, issueId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def remove(projectId: gitlabLib.basemodelMod.TId, issueId: gitlabLib.basemodelMod.TId, fn: js.Function): js.Any = js.native
  def show(projectId: gitlabLib.basemodelMod.TId, issueId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def show(projectId: gitlabLib.basemodelMod.TId, issueId: gitlabLib.basemodelMod.TId, fn: js.Function): js.Any = js.native
  def subscribe(projectId: gitlabLib.basemodelMod.TId, issueId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def subscribe(projectId: gitlabLib.basemodelMod.TId, issueId: gitlabLib.basemodelMod.TId, params: js.Object): js.Any = js.native
  def subscribe(
    projectId: gitlabLib.basemodelMod.TId,
    issueId: gitlabLib.basemodelMod.TId,
    params: js.Object,
    fn: js.Function
  ): js.Any = js.native
  def unsubscribe(projectId: gitlabLib.basemodelMod.TId, issueId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def unsubscribe(projectId: gitlabLib.basemodelMod.TId, issueId: gitlabLib.basemodelMod.TId, fn: js.Function): js.Any = js.native
}

