package typings.forgeDi.singletonLifecycleMod

import typings.forgeDi.argumentsMod.Arguments
import typings.forgeDi.lifecycleMod.Lifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingletonLifecycle extends Lifecycle {
  var instance: js.Any = js.native
}

object SingletonLifecycle {
  @scala.inline
  def apply(
    instance: js.Any,
    resolve: (typings.forgeDi.resolverMod.default, typings.forgeDi.contextMod.default, Arguments) => js.Any
  ): SingletonLifecycle = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], resolve = js.Any.fromFunction3(resolve))
    __obj.asInstanceOf[SingletonLifecycle]
  }
  @scala.inline
  implicit class SingletonLifecycleOps[Self <: SingletonLifecycle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstance(value: js.Any): Self = this.set("instance", value.asInstanceOf[js.Any])
  }
  
}

