package typings.forgeDi

import org.scalablytyped.runtime.StringDictionary
import typings.forgeDi.anon.Partialdefault
import typings.forgeDi.configMod.Config
import typings.forgeDi.constructorMod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("forge-di", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("forge-di", JSImport.Default)
  @js.native
  class default ()
    extends typings.forgeDi.forgeMod.default {
    def this(config: Config) = this()
  }
  
  @JSImport("forge-di", "Binding")
  @js.native
  class Binding protected ()
    extends typings.forgeDi.bindingMod.default {
    def this(forge: typings.forgeDi.forgeMod.default, name: String) = this()
  }
  
  @JSImport("forge-di", "ConfigurationError")
  @js.native
  class ConfigurationError protected ()
    extends typings.forgeDi.configurationErrorMod.default {
    def this(name: String, message: String) = this()
  }
  
  @JSImport("forge-di", "Context")
  @js.native
  class Context ()
    extends typings.forgeDi.contextMod.default
  
  @JSImport("forge-di", "Forge")
  @js.native
  class Forge ()
    extends typings.forgeDi.forgeMod.default {
    def this(config: Config) = this()
  }
  
  @JSImport("forge-di", "FunctionResolver")
  @js.native
  class FunctionResolver protected ()
    extends typings.forgeDi.functionResolverMod.default {
    def this(
      forge: typings.forgeDi.forgeMod.default,
      binding: typings.forgeDi.bindingMod.default,
      func: js.Function
    ) = this()
  }
  
  @JSImport("forge-di", "InstanceResolver")
  @js.native
  class InstanceResolver protected ()
    extends typings.forgeDi.instanceResolverMod.default {
    def this(
      forge: typings.forgeDi.forgeMod.default,
      binding: typings.forgeDi.bindingMod.default,
      instance: js.Any
    ) = this()
  }
  
  @JSImport("forge-di", "Mode")
  @js.native
  object Mode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.forgeDi.modeMod.Mode & String] = js.native
    
    /* "All" */ val All: typings.forgeDi.modeMod.Mode.All & String = js.native
    
    /* "AtLeastOne" */ val AtLeastOne: typings.forgeDi.modeMod.Mode.AtLeastOne & String = js.native
    
    /* "AtMostOne" */ val AtMostOne: typings.forgeDi.modeMod.Mode.AtMostOne & String = js.native
  }
  
  @JSImport("forge-di", "RegexInspector")
  @js.native
  class RegexInspector ()
    extends typings.forgeDi.regexInspectorMod.default
  
  @JSImport("forge-di", "ResolutionError")
  @js.native
  class ResolutionError protected ()
    extends typings.forgeDi.resolutionErrorMod.default {
    def this(name: String, hint: js.Any, context: typings.forgeDi.contextMod.default, message: String) = this()
  }
  
  @JSImport("forge-di", "Resolver")
  @js.native
  abstract class Resolver protected ()
    extends typings.forgeDi.resolverMod.default {
    def this(forge: typings.forgeDi.forgeMod.default, binding: typings.forgeDi.bindingMod.default) = this()
  }
  
  @JSImport("forge-di", "SingletonLifecycle")
  @js.native
  class SingletonLifecycle ()
    extends typings.forgeDi.singletonLifecycleMod.default
  
  @JSImport("forge-di", "TransientLifecycle")
  @js.native
  class TransientLifecycle ()
    extends typings.forgeDi.transientLifecycleMod.default
  
  @JSImport("forge-di", "TypeResolver")
  @js.native
  class TypeResolver protected ()
    extends typings.forgeDi.typeResolverMod.default {
    def this(
      forge: typings.forgeDi.forgeMod.default,
      binding: typings.forgeDi.bindingMod.default,
      `type`: Constructor
    ) = this()
  }
  
  @scala.inline
  def inject[T](hints: StringDictionary[String | Partialdefault]): js.Function1[/* target */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(hints.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ T, T]]
}
