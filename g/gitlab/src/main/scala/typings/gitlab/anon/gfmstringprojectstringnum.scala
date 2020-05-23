package typings.gitlab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  gfm ? :string,   project ? :string | number} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
trait gfmstringprojectstringnum extends js.Object {
  var gfm: js.UndefOr[String] = js.undefined
  var project: js.UndefOr[String | Double] = js.undefined
  var sudo: js.UndefOr[String | Double] = js.undefined
}

object gfmstringprojectstringnum {
  @scala.inline
  def apply(gfm: String = null, project: String | Double = null, sudo: String | Double = null): gfmstringprojectstringnum = {
    val __obj = js.Dynamic.literal()
    if (gfm != null) __obj.updateDynamic("gfm")(gfm.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[gfmstringprojectstringnum]
  }
}

