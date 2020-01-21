package typings.emberEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/engine/-private/container-proxy-mixin", JSImport.Namespace)
@js.native
object containerProxyMixinMod extends js.Object {
  /**
    * Given a fullName return a factory manager.
    */
  @js.native
  trait ContainerProxyMixin extends js.Object {
    /**
      * Given a fullName return a corresponding factory.
      */
    def factoryFor(fullName: String): js.Any = js.native
    def factoryFor(fullName: String, options: js.Object): js.Any = js.native
    /**
      * Given a fullName return a corresponding instance.
      */
    def lookup(fullName: String): js.Any = js.native
    def lookup(fullName: String, options: js.Object): js.Any = js.native
    /**
      * Returns an object that can be used to provide an owner to a
      * manually created instance.
      */
    def ownerInjection(): js.Object = js.native
  }
  
  val default: typings.emberObject.mixinMod.default[ContainerProxyMixin, typings.emberObject.mod.default] = js.native
}

