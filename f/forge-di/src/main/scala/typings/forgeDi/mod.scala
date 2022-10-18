package typings.forgeDi

import org.scalablytyped.runtime.StringDictionary
import typings.forgeDi.anon.Partialdefault
import typings.forgeDi.distFrameworkConfigMod.Config
import typings.forgeDi.distFrameworkConstructorMod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("forge-di", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("forge-di", JSImport.Default)
  @js.native
  open class default ()
    extends typings.forgeDi.distForgeMod.default {
    def this(config: Config) = this()
  }
  
  @JSImport("forge-di", "Binding")
  @js.native
  open class Binding protected ()
    extends typings.forgeDi.distFrameworkBindingMod.default {
    def this(forge: typings.forgeDi.distForgeMod.default, name: String) = this()
  }
  
  @JSImport("forge-di", "ConfigurationError")
  @js.native
  open class ConfigurationError protected ()
    extends typings.forgeDi.distErrorsConfigurationErrorMod.default {
    def this(name: String, message: String) = this()
  }
  
  @JSImport("forge-di", "Context")
  @js.native
  open class Context ()
    extends typings.forgeDi.distFrameworkContextMod.default
  
  @JSImport("forge-di", "Forge")
  @js.native
  open class Forge ()
    extends typings.forgeDi.distForgeMod.default {
    def this(config: Config) = this()
  }
  
  @JSImport("forge-di", "FunctionResolver")
  @js.native
  open class FunctionResolver protected ()
    extends typings.forgeDi.distResolversFunctionResolverMod.default {
    def this(
      forge: typings.forgeDi.distForgeMod.default,
      binding: typings.forgeDi.distFrameworkBindingMod.default,
      func: js.Function
    ) = this()
  }
  
  @JSImport("forge-di", "InstanceResolver")
  @js.native
  open class InstanceResolver protected ()
    extends typings.forgeDi.distResolversInstanceResolverMod.default {
    def this(
      forge: typings.forgeDi.distForgeMod.default,
      binding: typings.forgeDi.distFrameworkBindingMod.default,
      instance: Any
    ) = this()
  }
  
  @JSImport("forge-di", "Mode")
  @js.native
  object Mode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.forgeDi.distFrameworkModeMod.Mode & String] = js.native
    
    /* "All" */ val All: typings.forgeDi.distFrameworkModeMod.Mode.All & String = js.native
    
    /* "AtLeastOne" */ val AtLeastOne: typings.forgeDi.distFrameworkModeMod.Mode.AtLeastOne & String = js.native
    
    /* "AtMostOne" */ val AtMostOne: typings.forgeDi.distFrameworkModeMod.Mode.AtMostOne & String = js.native
  }
  
  @JSImport("forge-di", "RegexInspector")
  @js.native
  open class RegexInspector ()
    extends typings.forgeDi.distInspectorsRegexInspectorMod.default
  
  @JSImport("forge-di", "ResolutionError")
  @js.native
  open class ResolutionError protected ()
    extends typings.forgeDi.distErrorsResolutionErrorMod.default {
    def this(name: String, hint: Any, context: typings.forgeDi.distFrameworkContextMod.default, message: String) = this()
  }
  
  /* note: abstract class */ @JSImport("forge-di", "Resolver")
  @js.native
  open class Resolver protected ()
    extends typings.forgeDi.distResolversResolverMod.default {
    def this(
      forge: typings.forgeDi.distForgeMod.default,
      binding: typings.forgeDi.distFrameworkBindingMod.default
    ) = this()
  }
  
  @JSImport("forge-di", "SingletonLifecycle")
  @js.native
  open class SingletonLifecycle ()
    extends typings.forgeDi.distLifecyclesSingletonLifecycleMod.default
  
  @JSImport("forge-di", "TransientLifecycle")
  @js.native
  open class TransientLifecycle ()
    extends typings.forgeDi.distLifecyclesTransientLifecycleMod.default
  
  @JSImport("forge-di", "TypeResolver")
  @js.native
  open class TypeResolver protected ()
    extends typings.forgeDi.distResolversTypeResolverMod.default {
    def this(
      forge: typings.forgeDi.distForgeMod.default,
      binding: typings.forgeDi.distFrameworkBindingMod.default,
      `type`: Constructor
    ) = this()
  }
  
  inline def inject[T](hints: StringDictionary[String | Partialdefault]): js.Function1[/* target */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(hints.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ T, T]]
}
