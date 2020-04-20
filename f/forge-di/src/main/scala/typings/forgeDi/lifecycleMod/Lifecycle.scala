package typings.forgeDi.lifecycleMod

import typings.forgeDi.argumentsMod.Arguments
import typings.forgeDi.resolverMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lifecycle extends js.Object {
  def resolve(resolver: default, context: typings.forgeDi.contextMod.default, args: Arguments): js.Any
}

object Lifecycle {
  @scala.inline
  def apply(resolve: (default, typings.forgeDi.contextMod.default, Arguments) => js.Any): Lifecycle = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction3(resolve))
    __obj.asInstanceOf[Lifecycle]
  }
}

