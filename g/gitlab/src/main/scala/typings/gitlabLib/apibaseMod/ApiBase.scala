package typings
package gitlabLib.apibaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/ApiBase", "ApiBase")
@js.native
class ApiBase protected () extends js.Object {
  def this(options: ApiBaseOptions) = this()
  val client: this.type = js.native
  val groups: gitlabLib.modelsGroupsMod.Groups = js.native
  val issues: gitlabLib.modelsIssuesMod.Issues = js.native
  val labels: gitlabLib.modelsLabelsMod.Labels = js.native
  val notes: gitlabLib.modelsNotesMod.Notes = js.native
  var options: ApiBaseOptions = js.native
  val projects: gitlabLib.modelsProjectsMod.Projects = js.native
  val users: gitlabLib.modelsUsersMod.Users = js.native
  def handleOptions(): scala.Unit = js.native
  def init(): js.Object = js.native
}

