package typings
package dispatchrLib.addonsCreateStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions extends js.Object {
  var dehydrate: js.UndefOr[js.Function0[_]] = js.undefined
  var handlers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var initialize: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var mixins: js.UndefOr[js.Array[js.Object]] = js.undefined
  var rehydrate: js.UndefOr[js.Function1[/* state */ js.Any, scala.Unit]] = js.undefined
  var statics: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var storeName: java.lang.String
}

object StoreOptions {
  @scala.inline
  def apply(
    handlers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    storeName: java.lang.String,
    dehydrate: js.Function0[_] = null,
    initialize: js.Function0[scala.Unit] = null,
    mixins: js.Array[js.Object] = null,
    rehydrate: js.Function1[/* state */ js.Any, scala.Unit] = null,
    statics: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): StoreOptions = {
    val __obj = js.Dynamic.literal(handlers = handlers, storeName = storeName)
    if (dehydrate != null) __obj.updateDynamic("dehydrate")(dehydrate)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (rehydrate != null) __obj.updateDynamic("rehydrate")(rehydrate)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    __obj.asInstanceOf[StoreOptions]
  }
}

