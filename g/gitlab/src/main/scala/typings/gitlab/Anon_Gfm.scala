package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gfm extends js.Object {
  var gfm: js.UndefOr[String] = js.undefined
  var project: js.UndefOr[String | Double] = js.undefined
}

object Anon_Gfm {
  @scala.inline
  def apply(gfm: String = null, project: String | Double = null): Anon_Gfm = {
    val __obj = js.Dynamic.literal()
    if (gfm != null) __obj.updateDynamic("gfm")(gfm.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Gfm]
  }
}

