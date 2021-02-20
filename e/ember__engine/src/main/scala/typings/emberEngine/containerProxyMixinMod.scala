package typings.emberEngine

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerProxyMixinMod extends Shortcut {
  
  @JSImport("@ember/engine/-private/container-proxy-mixin", JSImport.Default)
  @js.native
  val default: typings.emberObject.mixinMod.default[ContainerProxyMixin, typings.emberObject.mod.default] = js.native
  
  /**
    * Given a fullName return a factory manager.
    */
  @js.native
  trait ContainerProxyMixin extends StObject {
    
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
  
  type _To = typings.emberObject.mixinMod.default[ContainerProxyMixin, typings.emberObject.mod.default]
  
  /* This means you don't have to write `default`, but can instead just say `containerProxyMixinMod.foo` */
  override def _to: typings.emberObject.mixinMod.default[ContainerProxyMixin, typings.emberObject.mod.default] = default
}
