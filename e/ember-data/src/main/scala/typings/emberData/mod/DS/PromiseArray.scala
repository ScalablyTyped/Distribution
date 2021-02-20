package typings.emberData.mod.DS

import typings.ember.mod.default.ArrayProxy
import typings.rsvp.mod.RSVP.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `PromiseArray` is an object that acts like both an `Ember.Array`
  * and a promise. When the promise is resolved the resulting value
  * will be set to the `PromiseArray`'s `content` property. This makes
  * it easy to create data bindings with the `PromiseArray` that will be
  * updated when the promise resolves.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.rsvp.mod.default.Promise because Inheritance from two classes. Inlined 
- typings.emberObject.promiseProxyMixinMod.PromiseProxyMixin because Inheritance from two classes. Inlined promise, isRejected, isPending, reason, isSettled, isFulfilled */ @JSImport("ember-data", "DS.PromiseArray")
@js.native
class PromiseArray[T] ()
  extends ArrayProxy[T]
     with Promise[ArrayProxy[T]] {
  
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
  var promise: typings.rsvp.mod.default.Promise[ArrayProxy[T]] = js.native
  
  /**
    * If the proxied promise is rejected this will contain the reason
    * provided.
    */
  var reason: js.Any = js.native
}
