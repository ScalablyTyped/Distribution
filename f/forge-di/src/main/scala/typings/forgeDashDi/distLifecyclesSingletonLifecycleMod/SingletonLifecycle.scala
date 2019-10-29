package typings.forgeDashDi.distLifecyclesSingletonLifecycleMod

import typings.forgeDashDi.distFrameworkArgumentsMod.Arguments
import typings.forgeDashDi.distLifecyclesLifecycleMod.Lifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingletonLifecycle extends Lifecycle {
  var instance: js.Any
}

object SingletonLifecycle {
  @scala.inline
  def apply(
    instance: js.Any,
    resolve: (typings.forgeDashDi.distResolversResolverMod.default, typings.forgeDashDi.distFrameworkContextMod.default, Arguments) => js.Any,
    toString: () => String
  ): SingletonLifecycle = {
    val __obj = js.Dynamic.literal(instance = instance, resolve = js.Any.fromFunction3(resolve), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[SingletonLifecycle]
  }
}

