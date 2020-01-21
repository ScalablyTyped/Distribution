package typings.giraffe.Giraffe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOptions_ extends js.Object {
  var alwaysRender: js.UndefOr[Boolean] = js.undefined
  var disposeOnDetach: js.UndefOr[Boolean] = js.undefined
  var documentTitle: js.UndefOr[String] = js.undefined
  var saveScrollPosition: js.UndefOr[Boolean] = js.undefined
}

object DefaultOptions_ {
  @scala.inline
  def apply(
    alwaysRender: js.UndefOr[Boolean] = js.undefined,
    disposeOnDetach: js.UndefOr[Boolean] = js.undefined,
    documentTitle: String = null,
    saveScrollPosition: js.UndefOr[Boolean] = js.undefined
  ): DefaultOptions_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysRender)) __obj.updateDynamic("alwaysRender")(alwaysRender.asInstanceOf[js.Any])
    if (!js.isUndefined(disposeOnDetach)) __obj.updateDynamic("disposeOnDetach")(disposeOnDetach.asInstanceOf[js.Any])
    if (documentTitle != null) __obj.updateDynamic("documentTitle")(documentTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(saveScrollPosition)) __obj.updateDynamic("saveScrollPosition")(saveScrollPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOptions_]
  }
}

