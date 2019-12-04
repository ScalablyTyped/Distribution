package typings.emberDashData.emberDashDataMod.default

import typings.atEmberObject.promiseDashProxyDashMixinMod.PromiseProxyMixin
import typings.atEmberObject.proxyMod.ObjectProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "PromiseObject")
@js.native
class PromiseObject[T] ()
  extends PromiseProxyMixin[T with typings.atEmberObject.proxyMod.default[js.Object]]
     with ObjectProxy[T]

