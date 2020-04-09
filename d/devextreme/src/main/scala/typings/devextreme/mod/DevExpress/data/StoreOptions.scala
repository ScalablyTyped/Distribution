package typings.devextreme.mod.DevExpress.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions[T] extends js.Object {
  /** @name Store.Options.errorHandler */
  var errorHandler: js.UndefOr[js.Function] = js.undefined
  /** @name Store.Options.key */
  var key: js.UndefOr[String | js.Array[String]] = js.undefined
  /** @name Store.Options.onInserted */
  var onInserted: js.UndefOr[js.Function2[/* values */ js.Any, /* key */ js.Any | String | Double, _]] = js.undefined
  /** @name Store.Options.onInserting */
  var onInserting: js.UndefOr[js.Function1[/* values */ js.Any, _]] = js.undefined
  /** @name Store.Options.onLoaded */
  var onLoaded: js.UndefOr[js.Function1[/* result */ js.Array[_], _]] = js.undefined
  /** @name Store.Options.onLoading */
  var onLoading: js.UndefOr[js.Function1[/* loadOptions */ LoadOptions, _]] = js.undefined
  /** @name Store.Options.onModified */
  var onModified: js.UndefOr[js.Function] = js.undefined
  /** @name Store.Options.onModifying */
  var onModifying: js.UndefOr[js.Function] = js.undefined
  /** @name Store.Options.onPush */
  var onPush: js.UndefOr[js.Function1[/* changes */ js.Array[_], _]] = js.undefined
  /** @name Store.Options.onRemoved */
  var onRemoved: js.UndefOr[js.Function1[/* key */ js.Any | String | Double, _]] = js.undefined
  /** @name Store.Options.onRemoving */
  var onRemoving: js.UndefOr[js.Function1[/* key */ js.Any | String | Double, _]] = js.undefined
  /** @name Store.Options.onUpdated */
  var onUpdated: js.UndefOr[js.Function2[/* key */ js.Any | String | Double, /* values */ js.Any, _]] = js.undefined
  /** @name Store.Options.onUpdating */
  var onUpdating: js.UndefOr[js.Function2[/* key */ js.Any | String | Double, /* values */ js.Any, _]] = js.undefined
}

object StoreOptions {
  @scala.inline
  def apply[T](
    errorHandler: js.Function = null,
    key: String | js.Array[String] = null,
    onInserted: (/* values */ js.Any, /* key */ js.Any | String | Double) => _ = null,
    onInserting: /* values */ js.Any => _ = null,
    onLoaded: /* result */ js.Array[_] => _ = null,
    onLoading: /* loadOptions */ LoadOptions => _ = null,
    onModified: js.Function = null,
    onModifying: js.Function = null,
    onPush: /* changes */ js.Array[_] => _ = null,
    onRemoved: /* key */ js.Any | String | Double => _ = null,
    onRemoving: /* key */ js.Any | String | Double => _ = null,
    onUpdated: (/* key */ js.Any | String | Double, /* values */ js.Any) => _ = null,
    onUpdating: (/* key */ js.Any | String | Double, /* values */ js.Any) => _ = null
  ): StoreOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(errorHandler.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onInserted != null) __obj.updateDynamic("onInserted")(js.Any.fromFunction2(onInserted))
    if (onInserting != null) __obj.updateDynamic("onInserting")(js.Any.fromFunction1(onInserting))
    if (onLoaded != null) __obj.updateDynamic("onLoaded")(js.Any.fromFunction1(onLoaded))
    if (onLoading != null) __obj.updateDynamic("onLoading")(js.Any.fromFunction1(onLoading))
    if (onModified != null) __obj.updateDynamic("onModified")(onModified.asInstanceOf[js.Any])
    if (onModifying != null) __obj.updateDynamic("onModifying")(onModifying.asInstanceOf[js.Any])
    if (onPush != null) __obj.updateDynamic("onPush")(js.Any.fromFunction1(onPush))
    if (onRemoved != null) __obj.updateDynamic("onRemoved")(js.Any.fromFunction1(onRemoved))
    if (onRemoving != null) __obj.updateDynamic("onRemoving")(js.Any.fromFunction1(onRemoving))
    if (onUpdated != null) __obj.updateDynamic("onUpdated")(js.Any.fromFunction2(onUpdated))
    if (onUpdating != null) __obj.updateDynamic("onUpdating")(js.Any.fromFunction2(onUpdating))
    __obj.asInstanceOf[StoreOptions[T]]
  }
}

