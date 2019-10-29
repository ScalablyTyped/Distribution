package typings.forgeDashDi

import org.scalablytyped.runtime.StringDictionary
import typings.forgeDashDi.distFrameworkArgumentsMod.Arguments
import typings.forgeDashDi.distFrameworkConfigMod.Config
import typings.forgeDashDi.distFrameworkConstructorMod.Constructor
import typings.forgeDashDi.distFrameworkDependencyMod.Dependency
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di", JSImport.Namespace)
@js.native
object forgeDashDiMod extends js.Object {
  @js.native
  class Binding protected ()
    extends typings.forgeDashDi.distFrameworkBindingMod.default {
    def this(forge: typings.forgeDashDi.distForgeMod.default, name: String) = this()
  }
  
  @js.native
  class ConfigurationError protected ()
    extends typings.forgeDashDi.distErrorsConfigurationErrorMod.default {
    def this(name: String, message: String) = this()
  }
  
  @js.native
  class Context ()
    extends typings.forgeDashDi.distFrameworkContextMod.default
  
  @js.native
  class Forge ()
    extends typings.forgeDashDi.distForgeMod.default {
    def this(config: Config) = this()
  }
  
  @js.native
  class FunctionResolver protected ()
    extends typings.forgeDashDi.distResolversFunctionResolverMod.default {
    def this(
      forge: typings.forgeDashDi.distForgeMod.default,
      binding: typings.forgeDashDi.distFrameworkBindingMod.default,
      func: js.Function
    ) = this()
  }
  
  @js.native
  class InstanceResolver protected ()
    extends typings.forgeDashDi.distResolversInstanceResolverMod.default {
    def this(
      forge: typings.forgeDashDi.distForgeMod.default,
      binding: typings.forgeDashDi.distFrameworkBindingMod.default,
      instance: js.Any
    ) = this()
  }
  
  @js.native
  class RegexInspector ()
    extends typings.forgeDashDi.distInspectorsRegexInspectorMod.RegexInspector {
    /* CompleteClass */
    override var getParameterNames: js.Any = js.native
    /* CompleteClass */
    override def findConstructor(func: Constructor): Constructor = js.native
    /* CompleteClass */
    override def getDependencies(func: js.Function): js.Array[Dependency] = js.native
  }
  
  @js.native
  class ResolutionError protected ()
    extends typings.forgeDashDi.distErrorsResolutionErrorMod.default {
    def this(
      name: String,
      hint: js.Any,
      context: typings.forgeDashDi.distFrameworkContextMod.default,
      message: String
    ) = this()
  }
  
  @js.native
  abstract class Resolver protected ()
    extends typings.forgeDashDi.distResolversResolverMod.default {
    def this(
      forge: typings.forgeDashDi.distForgeMod.default,
      binding: typings.forgeDashDi.distFrameworkBindingMod.default
    ) = this()
  }
  
  @js.native
  class SingletonLifecycle ()
    extends typings.forgeDashDi.distLifecyclesSingletonLifecycleMod.default
  
  @js.native
  class TransientLifecycle ()
    extends typings.forgeDashDi.distLifecyclesTransientLifecycleMod.TransientLifecycle {
    /* CompleteClass */
    override def resolve(
      resolver: typings.forgeDashDi.distResolversResolverMod.default,
      context: typings.forgeDashDi.distFrameworkContextMod.default,
      args: Arguments
    ): js.Any = js.native
  }
  
  @js.native
  class TypeResolver protected ()
    extends typings.forgeDashDi.distResolversTypeResolverMod.default {
    def this(
      forge: typings.forgeDashDi.distForgeMod.default,
      binding: typings.forgeDashDi.distFrameworkBindingMod.default,
      `type`: Constructor
    ) = this()
  }
  
  @js.native
  class default ()
    extends typings.forgeDashDi.distForgeMod.default {
    def this(config: Config) = this()
  }
  
  def inject[T](hints: StringDictionary[String | Partial[Dependency]]): js.Function1[/* target */ T, T] = js.native
  @js.native
  object Mode extends js.Object {
    /* "All" */ val All: typings.forgeDashDi.distFrameworkModeMod.Mode.All with String = js.native
    /* "AtLeastOne" */ val AtLeastOne: typings.forgeDashDi.distFrameworkModeMod.Mode.AtLeastOne with String = js.native
    /* "AtMostOne" */ val AtMostOne: typings.forgeDashDi.distFrameworkModeMod.Mode.AtMostOne with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.forgeDashDi.distFrameworkModeMod.Mode with String] = js.native
  }
  
}

