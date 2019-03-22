package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessLevel extends js.Object {
  var accessLevel: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AccessLevel {
  @scala.inline
  def apply(accessLevel: scala.Int | scala.Double = null): Anon_AccessLevel = {
    val __obj = js.Dynamic.literal()
    if (accessLevel != null) __obj.updateDynamic("accessLevel")(accessLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccessLevel]
  }
}

