package typings.falcor.falcorMod

import typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.JSONGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelOptions extends js.Object {
  var cache: js.UndefOr[JSONGraph] = js.undefined
  var collectRatio: js.UndefOr[Double] = js.undefined
  var comparator: js.UndefOr[ModelComparator] = js.undefined
  var errorSelector: js.UndefOr[ModelErrorSelector] = js.undefined
  var maxSize: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[ModelOnChange] = js.undefined
  var source: js.UndefOr[DataSource] = js.undefined
}

object ModelOptions {
  @scala.inline
  def apply(
    cache: JSONGraph = null,
    collectRatio: Int | Double = null,
    comparator: ModelComparator = null,
    errorSelector: ModelErrorSelector = null,
    maxSize: Int | Double = null,
    onChange: ModelOnChange = null,
    source: DataSource = null
  ): ModelOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (collectRatio != null) __obj.updateDynamic("collectRatio")(collectRatio.asInstanceOf[js.Any])
    if (comparator != null) __obj.updateDynamic("comparator")(comparator)
    if (errorSelector != null) __obj.updateDynamic("errorSelector")(errorSelector)
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ModelOptions]
  }
}

