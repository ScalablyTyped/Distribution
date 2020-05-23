package typings.easyXHeaders.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Targetdefaults extends js.Object {
  var target_defaults: Cflags
  var variables: Clang
}

object Targetdefaults {
  @scala.inline
  def apply(target_defaults: Cflags, variables: Clang): Targetdefaults = {
    val __obj = js.Dynamic.literal(target_defaults = target_defaults.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Targetdefaults]
  }
}

