package typings.devextreme.mod.DevExpress.data

import typings.devextreme.AnonAsync
import typings.devextreme.AnonErrorDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ODataContextOptions extends js.Object {
  /** Specifies a function that customizes the request before it is sent to the server. */
  var beforeSend: js.UndefOr[js.Function1[/* options */ AnonAsync, _]] = js.undefined
  /** Specifies whether stores in the ODataContext serialize/parse date-time values. */
  var deserializeDates: js.UndefOr[Boolean] = js.undefined
  /** Specifies entity collections to be accessed. */
  var entities: js.UndefOr[js.Any] = js.undefined
  /** Specifies a function that is executed when the ODataContext throws an error. */
  var errorHandler: js.UndefOr[js.Function1[/* e */ AnonErrorDetails, _]] = js.undefined
  /** Specifies whether to convert string values to lowercase in filter and search requests. Applies to the following operations: "startswith", "endswith", "contains", and "notcontains". */
  var filterToLower: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether data should be sent using JSONP. */
  var jsonp: js.UndefOr[Boolean] = js.undefined
  /** Specifies the URL of an OData service. */
  var url: js.UndefOr[String] = js.undefined
  /** Specifies the OData version. */
  var version: js.UndefOr[Double] = js.undefined
  /** Specifies whether to send cookies, authorization headers, and client certificates in a cross-origin request. */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object ODataContextOptions {
  @scala.inline
  def apply(
    beforeSend: /* options */ AnonAsync => _ = null,
    deserializeDates: js.UndefOr[Boolean] = js.undefined,
    entities: js.Any = null,
    errorHandler: /* e */ AnonErrorDetails => _ = null,
    filterToLower: js.UndefOr[Boolean] = js.undefined,
    jsonp: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    version: Int | Double = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): ODataContextOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (!js.isUndefined(deserializeDates)) __obj.updateDynamic("deserializeDates")(deserializeDates.asInstanceOf[js.Any])
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction1(errorHandler))
    if (!js.isUndefined(filterToLower)) __obj.updateDynamic("filterToLower")(filterToLower.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonp)) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[ODataContextOptions]
  }
}

