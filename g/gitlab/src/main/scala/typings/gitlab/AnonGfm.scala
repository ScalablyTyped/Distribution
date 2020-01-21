package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGfm extends js.Object {
  var gfm: js.UndefOr[String] = js.undefined
  var project: js.UndefOr[String | Double] = js.undefined
}

object AnonGfm {
  @scala.inline
  def apply(gfm: String = null, project: String | Double = null): AnonGfm = {
    val __obj = js.Dynamic.literal()
    if (gfm != null) __obj.updateDynamic("gfm")(gfm.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGfm]
  }
}

