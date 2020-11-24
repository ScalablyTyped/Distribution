package typings.emberObject

import typings.rsvp.mod.default.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/object/promise-proxy-mixin", JSImport.Namespace)
@js.native
object promiseProxyMixinMod extends js.Object {
  
  val default: typings.emberObject.mixinMod.default[PromiseProxyMixin[js.Any], typings.emberObject.mod.default] = js.native
  
  /**
    * A low level mixin making ObjectProxy promise-aware.
    */
  @js.native
  trait PromiseProxyMixin[T] extends Promise[T] {
    
    /**
      * Will become `true` if the proxied promise is fulfilled.
      */
    var isFulfilled: Boolean = js.native
    
    /**
      * Once the proxied promise has settled this will become `false`.
      */
    var isPending: Boolean = js.native
    
    /**
      * Will become `true` if the proxied promise is rejected.
      */
    var isRejected: Boolean = js.native
    
    /**
      * Once the proxied promise has settled this will become `true`.
      */
    var isSettled: Boolean = js.native
    
    /**
      * The promise whose fulfillment value is being proxied by this object.
      */
    var promise: Promise[T] = js.native
    
    /**
      * If the proxied promise is rejected this will contain the reason
      * provided.
      */
    var reason: js.Any = js.native
  }
}
