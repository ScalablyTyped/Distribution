package typings.forgeDi.dependencyMod

import typings.forgeDi.modeMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dependency extends js.Object {
  var hint: String
  var mode: Mode
  var name: String
}

object Dependency {
  @scala.inline
  def apply(hint: String, mode: Mode, name: String): Dependency = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependency]
  }
}

