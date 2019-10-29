package typings.forgeDashDi.distFrameworkDependencyMod

import typings.forgeDashDi.distFrameworkModeMod.Mode
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
    val __obj = js.Dynamic.literal(hint = hint, mode = mode, name = name)
  
    __obj.asInstanceOf[Dependency]
  }
}

