package typings.giraffe.Giraffe

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOptions extends js.Object {
  var alwaysRender: js.UndefOr[Boolean] = js.undefined
  var disposeOnDetach: js.UndefOr[Boolean] = js.undefined
  var documentTitle: js.UndefOr[String] = js.undefined
  var saveScrollPosition: js.UndefOr[Boolean] = js.undefined
}

object DefaultOptions {
  @scala.inline
  def apply(
    alwaysRender: js.UndefOr[Boolean] = js.undefined,
    disposeOnDetach: js.UndefOr[Boolean] = js.undefined,
    documentTitle: String = null,
    saveScrollPosition: js.UndefOr[Boolean] = js.undefined
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysRender)) __obj.updateDynamic("alwaysRender")(alwaysRender)
    if (!js.isUndefined(disposeOnDetach)) __obj.updateDynamic("disposeOnDetach")(disposeOnDetach)
    if (documentTitle != null) __obj.updateDynamic("documentTitle")(documentTitle)
    if (!js.isUndefined(saveScrollPosition)) __obj.updateDynamic("saveScrollPosition")(saveScrollPosition)
    __obj.asInstanceOf[DefaultOptions]
  }
}

@JSGlobal("Giraffe.defaultOptions")
@js.native
object defaultOptions extends TopLevel[DefaultOptions]

