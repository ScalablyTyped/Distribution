package typings.devextreme.mod.DevExpress.data

import typings.devextreme.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridDataSourceOptions extends js.Object {
  /** @name PivotGridDataSource.Options.fields */
  var fields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.undefined
  /** @name PivotGridDataSource.Options.filter */
  var filter: js.UndefOr[String | js.Array[_] | js.Function] = js.undefined
  /** @name PivotGridDataSource.Options.onChanged */
  var onChanged: js.UndefOr[js.Function] = js.undefined
  /** @name PivotGridDataSource.Options.onFieldsPrepared */
  var onFieldsPrepared: js.UndefOr[js.Function1[/* fields */ js.Array[PivotGridDataSourceField], _]] = js.undefined
  /** @name PivotGridDataSource.Options.onLoadError */
  var onLoadError: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.undefined
  /** @name PivotGridDataSource.Options.onLoadingChanged */
  var onLoadingChanged: js.UndefOr[js.Function1[/* isLoading */ Boolean, _]] = js.undefined
  /** @name PivotGridDataSource.Options.paginate */
  var paginate: js.UndefOr[Boolean] = js.undefined
  /** @name PivotGridDataSource.Options.remoteOperations */
  var remoteOperations: js.UndefOr[Boolean] = js.undefined
  /** @name PivotGridDataSource.Options.retrieveFields */
  var retrieveFields: js.UndefOr[Boolean] = js.undefined
  /** @name PivotGridDataSource.Options.store */
  var store: js.UndefOr[
    Store | StoreOptions[Store] | XmlaStore | XmlaStoreOptions | js.Array[AnonType] | AnonType
  ] = js.undefined
}

object PivotGridDataSourceOptions {
  @scala.inline
  def apply(
    fields: js.Array[PivotGridDataSourceField] = null,
    filter: String | js.Array[_] | js.Function = null,
    onChanged: js.Function = null,
    onFieldsPrepared: /* fields */ js.Array[PivotGridDataSourceField] => _ = null,
    onLoadError: /* error */ js.Any => _ = null,
    onLoadingChanged: /* isLoading */ Boolean => _ = null,
    paginate: js.UndefOr[Boolean] = js.undefined,
    remoteOperations: js.UndefOr[Boolean] = js.undefined,
    retrieveFields: js.UndefOr[Boolean] = js.undefined,
    store: Store | StoreOptions[Store] | XmlaStore | XmlaStoreOptions | js.Array[AnonType] | AnonType = null
  ): PivotGridDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (onChanged != null) __obj.updateDynamic("onChanged")(onChanged.asInstanceOf[js.Any])
    if (onFieldsPrepared != null) __obj.updateDynamic("onFieldsPrepared")(js.Any.fromFunction1(onFieldsPrepared))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (onLoadingChanged != null) __obj.updateDynamic("onLoadingChanged")(js.Any.fromFunction1(onLoadingChanged))
    if (!js.isUndefined(paginate)) __obj.updateDynamic("paginate")(paginate.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteOperations)) __obj.updateDynamic("remoteOperations")(remoteOperations.asInstanceOf[js.Any])
    if (!js.isUndefined(retrieveFields)) __obj.updateDynamic("retrieveFields")(retrieveFields.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGridDataSourceOptions]
  }
}

