package typings.forgeDi.resolverMod

import typings.forgeDi.argumentsMod.Arguments
import typings.forgeDi.dependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/resolvers/Resolver", JSImport.Default)
@js.native
abstract class default protected () extends Resolver {
  def this(forge: typings.forgeDi.forgeMod.default, binding: typings.forgeDi.bindingMod.default) = this()
  /* CompleteClass */
  override var binding: typings.forgeDi.bindingMod.default = js.native
  /* CompleteClass */
  override var dependencies: js.Array[Dependency] = js.native
  /* CompleteClass */
  override var forge: typings.forgeDi.forgeMod.default = js.native
  /* CompleteClass */
  override def resolve(context: typings.forgeDi.contextMod.default, args: Arguments): js.Any = js.native
  /* CompleteClass */
  /* protected */ override def resolveDependencies(context: typings.forgeDi.contextMod.default, dependencies: js.Array[Dependency], args: Arguments): js.Any = js.native
}

