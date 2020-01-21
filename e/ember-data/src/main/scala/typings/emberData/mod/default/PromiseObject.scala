package typings.emberData.mod.default

import typings.emberObject.promiseProxyMixinMod.PromiseProxyMixin
import typings.emberObject.proxyMod.ObjectProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "PromiseObject")
@js.native
class PromiseObject[T] ()
  extends PromiseProxyMixin[T with typings.emberObject.proxyMod.default[js.Object]]
     with ObjectProxy[T]

