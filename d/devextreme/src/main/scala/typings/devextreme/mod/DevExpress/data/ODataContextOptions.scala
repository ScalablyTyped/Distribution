package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Async
import typings.devextreme.anon.ErrorDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ODataContextOptions extends js.Object {
  /** @name ODataContext.Options.beforeSend */
  var beforeSend: js.UndefOr[js.Function1[/* options */ Async, _]] = js.undefined
  /** @name ODataContext.Options.deserializeDates */
  var deserializeDates: js.UndefOr[Boolean] = js.undefined
  /** @name ODataContext.Options.entities */
  var entities: js.UndefOr[js.Any] = js.undefined
  /** @name ODataContext.Options.errorHandler */
  var errorHandler: js.UndefOr[js.Function1[/* e */ ErrorDetails, _]] = js.undefined
  /** @name ODataContext.Options.filterToLower */
  var filterToLower: js.UndefOr[Boolean] = js.undefined
  /** @name ODataContext.Options.jsonp */
  var jsonp: js.UndefOr[Boolean] = js.undefined
  /** @name ODataContext.Options.url */
  var url: js.UndefOr[String] = js.undefined
  /** @name ODataContext.Options.version */
  var version: js.UndefOr[Double] = js.undefined
  /** @name ODataContext.Options.withCredentials */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object ODataContextOptions {
  @scala.inline
  def apply(
    beforeSend: /* options */ Async => _ = null,
    deserializeDates: js.UndefOr[Boolean] = js.undefined,
    entities: js.Any = null,
    errorHandler: /* e */ ErrorDetails => _ = null,
    filterToLower: js.UndefOr[Boolean] = js.undefined,
    jsonp: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    version: js.UndefOr[Double] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): ODataContextOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (!js.isUndefined(deserializeDates)) __obj.updateDynamic("deserializeDates")(deserializeDates.get.asInstanceOf[js.Any])
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction1(errorHandler))
    if (!js.isUndefined(filterToLower)) __obj.updateDynamic("filterToLower")(filterToLower.get.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonp)) __obj.updateDynamic("jsonp")(jsonp.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ODataContextOptions]
  }
}

