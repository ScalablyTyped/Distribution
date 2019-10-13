package typings.emberDashData.emberDashDataMod.DS

import typings.atEmberObject.promiseDashProxyDashMixinMod.PromiseProxyMixin
import typings.atEmberObject.proxyMod.ObjectProxy
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
@JSImport("ember-data", "DS.PromiseObject")
@js.native
class PromiseObject[T] ()
  extends PromiseProxyMixin[T with typings.atEmberObject.proxyMod.default[js.Object]]
     with ObjectProxy[T]

