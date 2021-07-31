package typings.forgeDi

import typings.forgeDi.argumentsMod.Arguments
import typings.forgeDi.dependencyMod.Dependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverMod {
  
  @JSImport("forge-di/dist/resolvers/Resolver", JSImport.Default)
  @js.native
  abstract class default protected ()
    extends StObject
       with Resolver {
    def this(forge: typings.forgeDi.forgeMod.default, binding: typings.forgeDi.bindingMod.default) = this()
    
    /* CompleteClass */
    var binding: typings.forgeDi.bindingMod.default = js.native
    
    /* CompleteClass */
    var dependencies: js.Array[Dependency] = js.native
    
    /* CompleteClass */
    var forge: typings.forgeDi.forgeMod.default = js.native
    
    /* CompleteClass */
    override def resolve(context: typings.forgeDi.contextMod.default, args: Arguments): js.Any = js.native
    
    /* CompleteClass */
    /* protected */ override def resolveDependencies(context: typings.forgeDi.contextMod.default, dependencies: js.Array[Dependency], args: Arguments): js.Any = js.native
  }
  
  trait Resolver extends StObject {
    
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
    
    @scala.inline
    implicit class ResolverMutableBuilder[Self <: Resolver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinding(value: typings.forgeDi.bindingMod.default): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      @scala.inline
      def setForge(value: typings.forgeDi.forgeMod.default): Self = StObject.set(x, "forge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolve(value: (typings.forgeDi.contextMod.default, Arguments) => js.Any): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResolveDependencies(value: (typings.forgeDi.contextMod.default, js.Array[Dependency], Arguments) => js.Any): Self = StObject.set(x, "resolveDependencies", js.Any.fromFunction3(value))
    }
  }
}
