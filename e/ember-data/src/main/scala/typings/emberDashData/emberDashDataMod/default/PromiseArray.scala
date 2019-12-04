package typings.emberDashData.emberDashDataMod.default

import typings.atEmberObject.promiseDashProxyDashMixinMod.PromiseProxyMixin
import typings.ember.emberMod.default.ArrayProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "PromiseArray")
@js.native
class PromiseArray[T] ()
  extends PromiseProxyMixin[ArrayProxy[T]]
     with typings.atEmberArray.proxyMod.ArrayProxy[T]

