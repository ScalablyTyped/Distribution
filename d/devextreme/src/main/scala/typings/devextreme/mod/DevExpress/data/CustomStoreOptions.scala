package typings.devextreme.mod.DevExpress.data

import typings.devextreme.AnonFilter
import typings.devextreme.devextremeStrings.processed
import typings.devextreme.devextremeStrings.raw
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomStoreOptions extends StoreOptions[CustomStore] {
  /** Specifies a custom implementation of the byKey(key) method. */
  var byKey: js.UndefOr[js.Function1[/* key */ js.Any | String | Double, Promise[_] | JQueryPromise[_]]] = js.undefined
  /** Specifies whether raw data should be saved in the cache. Applies only if loadMode is "raw". */
  var cacheRawData: js.UndefOr[Boolean] = js.undefined
  /** Specifies a custom implementation of the insert(values) method. */
  var insert: js.UndefOr[js.Function1[/* values */ js.Any, Promise[_] | JQueryPromise[_]]] = js.undefined
  /** Specifies a custom implementation of the load(options) method. */
  var load: js.UndefOr[
    js.Function1[/* options */ LoadOptions, Promise[_] | JQueryPromise[_] | js.Array[_]]
  ] = js.undefined
  /** Specifies how data returned by the load function is treated. */
  var loadMode: js.UndefOr[processed | raw] = js.undefined
  /** Specifies a custom implementation of the remove(key) method. */
  var remove: js.UndefOr[
    js.Function1[/* key */ js.Any | String | Double, Promise[Unit] | JQueryPromise[Unit]]
  ] = js.undefined
  /** Specifies a custom implementation of the totalCount(options) method. */
  var totalCount: js.UndefOr[
    js.Function1[/* loadOptions */ AnonFilter, Promise[Double] | JQueryPromise[Double]]
  ] = js.undefined
  /** Specifies a custom implementation of the update(key, values) method. */
  var update: js.UndefOr[
    js.Function2[
      /* key */ js.Any | String | Double, 
      /* values */ js.Any, 
      Promise[_] | JQueryPromise[_]
    ]
  ] = js.undefined
  /** Specifies whether the store combines the search and filter expressions. Defaults to true if the loadMode is "raw" and false if it is "processed". */
  var useDefaultSearch: js.UndefOr[Boolean] = js.undefined
}

object CustomStoreOptions {
  @scala.inline
  def apply(
    byKey: /* key */ js.Any | String | Double => Promise[_] | JQueryPromise[_] = null,
    cacheRawData: js.UndefOr[Boolean] = js.undefined,
    errorHandler: js.Function = null,
    insert: /* values */ js.Any => Promise[_] | JQueryPromise[_] = null,
    key: String | js.Array[String] = null,
    load: /* options */ LoadOptions => Promise[_] | JQueryPromise[_] | js.Array[_] = null,
    loadMode: processed | raw = null,
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
    onUpdating: (/* key */ js.Any | String | Double, /* values */ js.Any) => _ = null,
    remove: /* key */ js.Any | String | Double => Promise[Unit] | JQueryPromise[Unit] = null,
    totalCount: /* loadOptions */ AnonFilter => Promise[Double] | JQueryPromise[Double] = null,
    update: (/* key */ js.Any | String | Double, /* values */ js.Any) => Promise[_] | JQueryPromise[_] = null,
    useDefaultSearch: js.UndefOr[Boolean] = js.undefined
  ): CustomStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (byKey != null) __obj.updateDynamic("byKey")(js.Any.fromFunction1(byKey))
    if (!js.isUndefined(cacheRawData)) __obj.updateDynamic("cacheRawData")(cacheRawData.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(errorHandler.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction1(insert))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (loadMode != null) __obj.updateDynamic("loadMode")(loadMode.asInstanceOf[js.Any])
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
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (totalCount != null) __obj.updateDynamic("totalCount")(js.Any.fromFunction1(totalCount))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    if (!js.isUndefined(useDefaultSearch)) __obj.updateDynamic("useDefaultSearch")(useDefaultSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomStoreOptions]
  }
}

