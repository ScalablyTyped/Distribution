package typings.dispatchr.createStoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions extends js.Object {
  var dehydrate: js.UndefOr[js.Function0[_]] = js.undefined
  var handlers: StringDictionary[String]
  var initialize: js.UndefOr[js.Function0[Unit]] = js.undefined
  var mixins: js.UndefOr[js.Array[js.Object]] = js.undefined
  var rehydrate: js.UndefOr[js.Function1[/* state */ js.Any, Unit]] = js.undefined
  var statics: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var storeName: String
}

object StoreOptions {
  @scala.inline
  def apply(
    handlers: StringDictionary[String],
    storeName: String,
    dehydrate: () => _ = null,
    initialize: () => Unit = null,
    mixins: js.Array[js.Object] = null,
    rehydrate: /* state */ js.Any => Unit = null,
    statics: StringDictionary[js.Any] = null
  ): StoreOptions = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], storeName = storeName.asInstanceOf[js.Any])
    if (dehydrate != null) __obj.updateDynamic("dehydrate")(js.Any.fromFunction0(dehydrate))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (rehydrate != null) __obj.updateDynamic("rehydrate")(js.Any.fromFunction1(rehydrate))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreOptions]
  }
}

