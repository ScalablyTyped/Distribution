package typings.forgeDi.transientLifecycleMod

import typings.forgeDi.argumentsMod.Arguments
import typings.forgeDi.lifecycleMod.Lifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransientLifecycle extends Lifecycle

object TransientLifecycle {
  @scala.inline
  def apply(
    resolve: (typings.forgeDi.resolverMod.default, typings.forgeDi.contextMod.default, Arguments) => js.Any
  ): TransientLifecycle = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction3(resolve))
    __obj.asInstanceOf[TransientLifecycle]
  }
}

