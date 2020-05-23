package typings.emberEngine

import typings.emberEngine.anon.Instantiate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/engine/-private/registry-proxy-mixin", JSImport.Namespace)
@js.native
object registryProxyMixinMod extends js.Object {
  /**
    * RegistryProxyMixin is used to provide public access to specific
    * registry functionality.
    */
  @js.native
  trait RegistryProxyMixin extends js.Object {
    /**
      * Check if a factory is registered.
      */
    def hasRegistration(fullName: String): Boolean = js.native
    /**
      * Define a dependency injection onto a specific factory or all factories
      * of a type.
      */
    def inject(factoryNameOrType: String, property: String, injectionName: String): js.Any = js.native
    /**
      * Registers a factory or value that can be used for dependency injection (with
      * `inject`) or for service lookup. Each factory is registered with
      * a full name including two parts: `type:name`.
      */
    def register(fullName: String, factory: js.Any): js.Any = js.native
    def register(fullName: String, factory: js.Any, options: Instantiate): js.Any = js.native
    /**
      * Register an option for a particular factory.
      */
    def registerOption(fullName: String, optionName: String, options: js.Object): js.Any = js.native
    /**
      * Register options for a particular factory.
      */
    def registerOptions(fullName: String, options: js.Object): js.Any = js.native
    /**
      * Allow registering options for all factories of a type.
      */
    def registerOptionsForType(`type`: String, options: js.Object): js.Any = js.native
    /**
      * Return a specific registered option for a particular factory.
      */
    def registeredOption(fullName: String, optionName: String): js.Object = js.native
    /**
      * Return registered options for a particular factory.
      */
    def registeredOptions(fullName: String): js.Object = js.native
    /**
      * Return the registered options for all factories of a type.
      */
    def registeredOptionsForType(`type`: String): js.Object = js.native
    /**
      * Given a fullName return the corresponding factory.
      */
    def resolveRegistration(fullName: String): js.Any = js.native
    /**
      * Unregister a factory.
      */
    def unregister(fullName: String): js.Any = js.native
  }
  
  val default: typings.emberObject.mixinMod.default[RegistryProxyMixin, typings.emberObject.mod.default] = js.native
}

