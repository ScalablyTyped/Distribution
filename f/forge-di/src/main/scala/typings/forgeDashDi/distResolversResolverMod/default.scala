package typings.forgeDashDi.distResolversResolverMod

import typings.forgeDashDi.distFrameworkArgumentsMod.Arguments
import typings.forgeDashDi.distFrameworkDependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/resolvers/Resolver", JSImport.Default)
@js.native
abstract class default protected () extends Resolver {
  def this(
    forge: typings.forgeDashDi.distForgeMod.default,
    binding: typings.forgeDashDi.distFrameworkBindingMod.default
  ) = this()
  /* CompleteClass */
  override var binding: typings.forgeDashDi.distFrameworkBindingMod.default = js.native
  /* CompleteClass */
  override var dependencies: js.Array[Dependency] = js.native
  /* CompleteClass */
  override var forge: typings.forgeDashDi.distForgeMod.default = js.native
  /* CompleteClass */
  override def resolve(context: typings.forgeDashDi.distFrameworkContextMod.default, args: Arguments): js.Any = js.native
  /* CompleteClass */
  /* protected */ override def resolveDependencies(
    context: typings.forgeDashDi.distFrameworkContextMod.default,
    dependencies: js.Array[Dependency],
    args: Arguments
  ): js.Any = js.native
}

