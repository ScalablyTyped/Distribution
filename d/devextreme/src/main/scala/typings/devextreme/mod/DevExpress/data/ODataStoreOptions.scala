package typings.devextreme.mod.DevExpress.data

import typings.devextreme.AnonAsync
import typings.devextreme.AnonErrorDetails
import typings.devextreme.devextremeStrings.Decimal
import typings.devextreme.devextremeStrings.Int32
import typings.devextreme.devextremeStrings.Int64
import typings.devextreme.devextremeStrings.Single
import typings.devextreme.devextremeStrings.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ODataStoreOptions extends StoreOptions[ODataStore] {
  /** Specifies a function that customizes the request before it is sent to the server. */
  var beforeSend: js.UndefOr[js.Function1[/* options */ AnonAsync, _]] = js.undefined
  /** Specifies whether the store serializes/parses date-time values. */
  var deserializeDates: js.UndefOr[Boolean] = js.undefined
  /** Specifies a function that is executed when the ODataStore throws an error. */
  @JSName("errorHandler")
  var errorHandler_ODataStoreOptions: js.UndefOr[js.Function1[/* e */ AnonErrorDetails, _]] = js.undefined
  /** Specifies the data field types. Accepts the following types: "String", "Int32", "Int64", "Boolean", "Single", "Decimal" and "Guid". */
  var fieldTypes: js.UndefOr[js.Any] = js.undefined
  /** Specifies whether to convert string values to lowercase in filter and search requests. Applies to the following operations: "startswith", "endswith", "contains", and "notcontains". */
  var filterToLower: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether data should be sent using JSONP. */
  var jsonp: js.UndefOr[Boolean] = js.undefined
  /** Specifies the type of the key property or properties. */
  var keyType: js.UndefOr[
    String | Int32 | Int64 | typings.devextreme.devextremeStrings.Guid | typings.devextreme.devextremeStrings.Boolean | Single | Decimal | js.Any
  ] = js.undefined
  /** Specifies the URL of an OData entity collection. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the OData version. */
  var version: js.UndefOr[Double] = js.undefined
  /** Specifies whether to send cookies, authorization headers, and client certificates in a cross-origin request. */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object ODataStoreOptions {
  @scala.inline
  def apply(
    beforeSend: /* options */ AnonAsync => _ = null,
    deserializeDates: js.UndefOr[Boolean] = js.undefined,
    errorHandler: /* e */ AnonErrorDetails => _ = null,
    fieldTypes: js.Any = null,
    filterToLower: js.UndefOr[Boolean] = js.undefined,
    jsonp: js.UndefOr[Boolean] = js.undefined,
    key: java.lang.String | js.Array[java.lang.String] = null,
    keyType: String | Int32 | Int64 | typings.devextreme.devextremeStrings.Guid | typings.devextreme.devextremeStrings.Boolean | Single | Decimal | js.Any = null,
    onInserted: (/* values */ js.Any, /* key */ js.Any | java.lang.String | Double) => _ = null,
    onInserting: /* values */ js.Any => _ = null,
    onLoaded: /* result */ js.Array[_] => _ = null,
    onLoading: /* loadOptions */ LoadOptions => _ = null,
    onModified: js.Function = null,
    onModifying: js.Function = null,
    onPush: /* changes */ js.Array[_] => _ = null,
    onRemoved: /* key */ js.Any | java.lang.String | Double => _ = null,
    onRemoving: /* key */ js.Any | java.lang.String | Double => _ = null,
    onUpdated: (/* key */ js.Any | java.lang.String | Double, /* values */ js.Any) => _ = null,
    onUpdating: (/* key */ js.Any | java.lang.String | Double, /* values */ js.Any) => _ = null,
    url: java.lang.String = null,
    version: Int | Double = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): ODataStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (!js.isUndefined(deserializeDates)) __obj.updateDynamic("deserializeDates")(deserializeDates.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction1(errorHandler))
    if (fieldTypes != null) __obj.updateDynamic("fieldTypes")(fieldTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(filterToLower)) __obj.updateDynamic("filterToLower")(filterToLower.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonp)) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType.asInstanceOf[js.Any])
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
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[ODataStoreOptions]
  }
}

