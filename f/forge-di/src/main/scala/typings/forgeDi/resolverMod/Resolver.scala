package typings.forgeDi.resolverMod

import typings.forgeDi.argumentsMod.Arguments
import typings.forgeDi.dependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolver extends js.Object {
  var binding: typings.forgeDi.bindingMod.default
  var dependencies: js.Array[Dependency]
  var forge: typings.forgeDi.forgeMod.default
  def resolve(context: typings.forgeDi.contextMod.default, args: Arguments): js.Any
  /* protected */ def resolveDependencies(context: typings.forgeDi.contextMod.default, dependencies: js.Array[Dependency], args: Arguments): js.Any
}

object Resolver {
  @scala.inline
  def apply(
    binding: typings.forgeDi.bindingMod.default,
    dependencies: js.Array[Dependency],
    forge: typings.forgeDi.forgeMod.default,
    resolve: (typings.forgeDi.contextMod.default, Arguments) => js.Any,
    resolveDependencies: (typings.forgeDi.contextMod.default, js.Array[Dependency], Arguments) => js.Any
  ): Resolver = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], forge = forge.asInstanceOf[js.Any], resolve = js.Any.fromFunction2(resolve), resolveDependencies = js.Any.fromFunction3(resolveDependencies))
    __obj.asInstanceOf[Resolver]
  }
}

