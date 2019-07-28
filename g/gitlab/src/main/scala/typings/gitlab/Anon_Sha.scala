package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sha extends js.Object {
  var sha: js.UndefOr[String] = js.undefined
}

object Anon_Sha {
  @scala.inline
  def apply(sha: String = null): Anon_Sha = {
    val __obj = js.Dynamic.literal()
    if (sha != null) __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[Anon_Sha]
  }
}

