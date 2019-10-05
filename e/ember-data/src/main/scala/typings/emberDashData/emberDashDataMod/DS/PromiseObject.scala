package typings.emberDashData.emberDashDataMod.DS

import typings.rsvp.rsvpMod.RSVP.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `PromiseObject` is an object that acts like both an `Ember.Object`
  * and a promise. When the promise is resolved, then the resulting value
  * will be set to the `PromiseObject`'s `content` property. This makes
  * it easy to create data bindings with the `PromiseObject` that will
  * be updated when the promise resolves.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.rsvp.rsvpMod.default.Promise because Inheritance from two classes. Inlined 
- typings.atEmberObject.promiseDashProxyDashMixinMod.PromiseProxyMixin because Inheritance from two classes. Inlined isFulfilled, isPending, isRejected, isSettled, promise, reason */ @JSImport("ember-data", "DS.PromiseObject")
@js.native
class PromiseObject[T] ()
  extends typings.atEmberObject.proxyMod.default[T]
     with Promise[T with typings.atEmberObject.proxyMod.default[js.Object]] {
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
  var promise: typings.rsvp.rsvpMod.default.Promise[T with typings.atEmberObject.proxyMod.default[js.Object]] = js.native
  /**
    * If the proxied promise is rejected this will contain the reason
    * provided.
    */
  var reason: js.Any = js.native
}

