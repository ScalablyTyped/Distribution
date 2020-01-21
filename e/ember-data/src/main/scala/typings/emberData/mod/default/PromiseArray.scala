package typings.emberData.mod.default

import typings.ember.mod.default.ArrayProxy
import typings.emberObject.promiseProxyMixinMod.PromiseProxyMixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "PromiseArray")
@js.native
class PromiseArray[T] ()
  extends PromiseProxyMixin[ArrayProxy[T]]
     with typings.emberArray.proxyMod.ArrayProxy[T]

