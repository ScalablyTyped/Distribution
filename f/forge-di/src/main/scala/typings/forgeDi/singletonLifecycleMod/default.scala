package typings.forgeDi.singletonLifecycleMod

import typings.forgeDi.argumentsMod.Arguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/lifecycles/SingletonLifecycle", JSImport.Default)
@js.native
class default () extends SingletonLifecycle {
  /* CompleteClass */
  override var instance: js.Any = js.native
  /* CompleteClass */
  override def resolve(
    resolver: typings.forgeDi.resolverMod.default,
    context: typings.forgeDi.contextMod.default,
    args: Arguments
  ): js.Any = js.native
}

