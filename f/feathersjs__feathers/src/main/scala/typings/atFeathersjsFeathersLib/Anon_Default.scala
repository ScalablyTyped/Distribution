package typings
package atFeathersjsFeathersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  val SKIP: atFeathersjsFeathersLib.atFeathersjsFeathersMod.SkipSymbol
  val version: java.lang.String
  // tslint:disable-next-line no-unnecessary-generics
  def default[T](): atFeathersjsFeathersLib.atFeathersjsFeathersMod.Application[T]
}

object Anon_Default {
  @scala.inline
  def apply(
    SKIP: atFeathersjsFeathersLib.atFeathersjsFeathersMod.SkipSymbol,
    default: () => atFeathersjsFeathersLib.atFeathersjsFeathersMod.Application[js.Any],
    version: java.lang.String
  ): Anon_Default = {
    val __obj = js.Dynamic.literal(SKIP = SKIP.asInstanceOf[js.Any], default = js.Any.fromFunction0(default), version = version)
  
    __obj.asInstanceOf[Anon_Default]
  }
}

