package typings.forgeDi.resolverMod

import typings.forgeDi.argumentsMod.Arguments
import typings.forgeDi.dependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resolver extends js.Object {
  
  var binding: typings.forgeDi.bindingMod.default = js.native
  
  var dependencies: js.Array[Dependency] = js.native
  
  var forge: typings.forgeDi.forgeMod.default = js.native
  
  def resolve(context: typings.forgeDi.contextMod.default, args: Arguments): js.Any = js.native
  
  /* protected */ def resolveDependencies(context: typings.forgeDi.contextMod.default, dependencies: js.Array[Dependency], args: Arguments): js.Any = js.native
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
  
  @scala.inline
  implicit class ResolverOps[Self <: Resolver] (val x: Self) extends AnyVal {
    
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
    def setBinding(value: typings.forgeDi.bindingMod.default): Self = this.set("binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesVarargs(value: Dependency*): Self = this.set("dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDependencies(value: js.Array[Dependency]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForge(value: typings.forgeDi.forgeMod.default): Self = this.set("forge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolve(value: (typings.forgeDi.contextMod.default, Arguments) => js.Any): Self = this.set("resolve", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResolveDependencies(value: (typings.forgeDi.contextMod.default, js.Array[Dependency], Arguments) => js.Any): Self = this.set("resolveDependencies", js.Any.fromFunction3(value))
  }
}
