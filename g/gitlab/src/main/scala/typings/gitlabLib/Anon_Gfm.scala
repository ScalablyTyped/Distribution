package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gfm extends js.Object {
  var gfm: js.UndefOr[java.lang.String] = js.undefined
  var project: js.UndefOr[ProjectId] = js.undefined
}

object Anon_Gfm {
  @scala.inline
  def apply(gfm: java.lang.String = null, project: ProjectId = null): Anon_Gfm = {
    val __obj = js.Dynamic.literal()
    if (gfm != null) __obj.updateDynamic("gfm")(gfm)
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Gfm]
  }
}

