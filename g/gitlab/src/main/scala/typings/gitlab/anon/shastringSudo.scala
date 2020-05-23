package typings.gitlab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  sha  :string} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
trait shastringSudo extends js.Object {
  var sha: String
  var sudo: js.UndefOr[String | Double] = js.undefined
}

object shastringSudo {
  @scala.inline
  def apply(sha: String, sudo: String | Double = null): shastringSudo = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[shastringSudo]
  }
}

