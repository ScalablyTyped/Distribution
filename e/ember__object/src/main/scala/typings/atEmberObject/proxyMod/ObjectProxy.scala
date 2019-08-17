package typings.atEmberObject.proxyMod

import typings.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertyGetter
import typings.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertyGetters
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectProxy[T /* <: js.Object */]
  extends typings.atEmberObject.atEmberObjectMod.default {
  /**
    * The object whose properties will be forwarded.
    */
  var content: js.UndefOr[T] = js.native
  def get[K /* <: String */](key: K): js.UndefOr[
    UnwrapComputedPropertyGetter[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ] = js.native
  def getProperties[K /* <: String */](list: K*): Pick[UnwrapComputedPropertyGetters[this.type], K] = js.native
  def getProperties[K /* <: String */](list: js.Array[K]): Pick[UnwrapComputedPropertyGetters[this.type], K] = js.native
  @JSName("get")
  def get_K_String_UnwrapComputedPropertyGetter[K /* <: String */](key: K): UnwrapComputedPropertyGetter[/* import warning: ImportType.apply Failed type conversion: this[K] */ js.Any] = js.native
}

