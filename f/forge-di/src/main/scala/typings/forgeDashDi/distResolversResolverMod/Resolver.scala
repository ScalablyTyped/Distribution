package typings.forgeDashDi.distResolversResolverMod

import typings.forgeDashDi.distFrameworkArgumentsMod.Arguments
import typings.forgeDashDi.distFrameworkDependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolver extends js.Object {
  var binding: typings.forgeDashDi.distFrameworkBindingMod.default
  var dependencies: js.Array[Dependency]
  var forge: typings.forgeDashDi.distForgeMod.default
  def resolve(context: typings.forgeDashDi.distFrameworkContextMod.default, args: Arguments): js.Any
  /* protected */ def resolveDependencies(
    context: typings.forgeDashDi.distFrameworkContextMod.default,
    dependencies: js.Array[Dependency],
    args: Arguments
  ): js.Any
}

object Resolver {
  @scala.inline
  def apply(
    binding: typings.forgeDashDi.distFrameworkBindingMod.default,
    dependencies: js.Array[Dependency],
    forge: typings.forgeDashDi.distForgeMod.default,
    resolve: (typings.forgeDashDi.distFrameworkContextMod.default, Arguments) => js.Any,
    resolveDependencies: (typings.forgeDashDi.distFrameworkContextMod.default, js.Array[Dependency], Arguments) => js.Any
  ): Resolver = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], forge = forge.asInstanceOf[js.Any], resolve = js.Any.fromFunction2(resolve), resolveDependencies = js.Any.fromFunction3(resolveDependencies))
  
    __obj.asInstanceOf[Resolver]
  }
}

