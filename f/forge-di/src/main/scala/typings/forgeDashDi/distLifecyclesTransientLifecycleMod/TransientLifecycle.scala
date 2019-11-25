package typings.forgeDashDi.distLifecyclesTransientLifecycleMod

import typings.forgeDashDi.distFrameworkArgumentsMod.Arguments
import typings.forgeDashDi.distLifecyclesLifecycleMod.Lifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransientLifecycle extends Lifecycle

object TransientLifecycle {
  @scala.inline
  def apply(
    resolve: (typings.forgeDashDi.distResolversResolverMod.default, typings.forgeDashDi.distFrameworkContextMod.default, Arguments) => js.Any
  ): TransientLifecycle = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction3(resolve))
  
    __obj.asInstanceOf[TransientLifecycle]
  }
}

