package typings.devextreme.mod.DevExpress.data

import typings.devextreme.AnonAsync
import typings.devextreme.AnonErrorDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ODataContextOptions extends js.Object {
  /** @name ODataContext.Options.beforeSend */
  var beforeSend: js.UndefOr[js.Function1[/* options */ AnonAsync, _]] = js.undefined
  /** @name ODataContext.Options.deserializeDates */
  var deserializeDates: js.UndefOr[Boolean] = js.undefined
  /** @name ODataContext.Options.entities */
  var entities: js.UndefOr[js.Any] = js.undefined
  /** @name ODataContext.Options.errorHandler */
  var errorHandler: js.UndefOr[js.Function1[/* e */ AnonErrorDetails, _]] = js.undefined
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

