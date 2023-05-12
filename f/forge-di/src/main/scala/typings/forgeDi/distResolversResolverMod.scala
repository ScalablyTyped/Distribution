package typings.forgeDi

import typings.forgeDi.distFrameworkArgumentsMod.Arguments
import typings.forgeDi.distFrameworkDependencyMod.Dependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResolversResolverMod {
  
  /* note: abstract class */ @JSImport("forge-di/dist/resolvers/Resolver", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Resolver {
    def this(
      forge: typings.forgeDi.distForgeMod.default,
      binding: typings.forgeDi.distFrameworkBindingMod.default[Any]
    ) = this()
    
    /* protected */ /* CompleteClass */
    var binding: typings.forgeDi.distFrameworkBindingMod.default[Any] = js.native
    
    /* CompleteClass */
    var dependencies: js.Array[Dependency] = js.native
    
    /* protected */ /* CompleteClass */
    var forge: typings.forgeDi.distForgeMod.default = js.native
    
    /* CompleteClass */
    override def resolve(context: typings.forgeDi.distFrameworkContextMod.default, args: Arguments): Any = js.native
    
    /* protected */ /* CompleteClass */
    override def resolveDependencies(
      context: typings.forgeDi.distFrameworkContextMod.default,
      dependencies: js.Array[Dependency],
      args: Arguments
    ): Any = js.native
  }
  
  trait Resolver extends StObject {
    
    /* protected */ var binding: typings.forgeDi.distFrameworkBindingMod.default[Any]
    
    var dependencies: js.Array[Dependency]
    
    /* protected */ var forge: typings.forgeDi.distForgeMod.default
    
    def resolve(context: typings.forgeDi.distFrameworkContextMod.default, args: Arguments): Any
    
    /* protected */ def resolveDependencies(
      context: typings.forgeDi.distFrameworkContextMod.default,
      dependencies: js.Array[Dependency],
      args: Arguments
    ): Any
  }
  object Resolver {
    
    inline def apply(
      binding: typings.forgeDi.distFrameworkBindingMod.default[Any],
      dependencies: js.Array[Dependency],
      forge: typings.forgeDi.distForgeMod.default,
      resolve: (typings.forgeDi.distFrameworkContextMod.default, Arguments) => Any,
      resolveDependencies: (typings.forgeDi.distFrameworkContextMod.default, js.Array[Dependency], Arguments) => Any
    ): Resolver = {
      val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], forge = forge.asInstanceOf[js.Any], resolve = js.Any.fromFunction2(resolve), resolveDependencies = js.Any.fromFunction3(resolveDependencies))
      __obj.asInstanceOf[Resolver]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Resolver] (val x: Self) extends AnyVal {
      
      inline def setBinding(value: typings.forgeDi.distFrameworkBindingMod.default[Any]): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      inline def setDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setForge(value: typings.forgeDi.distForgeMod.default): Self = StObject.set(x, "forge", value.asInstanceOf[js.Any])
      
      inline def setResolve(value: (typings.forgeDi.distFrameworkContextMod.default, Arguments) => Any): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
      
      inline def setResolveDependencies(value: (typings.forgeDi.distFrameworkContextMod.default, js.Array[Dependency], Arguments) => Any): Self = StObject.set(x, "resolveDependencies", js.Any.fromFunction3(value))
    }
  }
}
