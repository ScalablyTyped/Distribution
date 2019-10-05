package typings.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dataset: js.UndefOr[Dataset] = js.undefined
  var features: js.UndefOr[Features] = js.undefined
  var inputs: js.UndefOr[Inputs] = js.undefined
  var params: js.UndefOr[Params] = js.undefined
  var readers: js.UndefOr[Readers] = js.undefined
  var table: js.UndefOr[Table] = js.undefined
  var writers: js.UndefOr[Writers] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dataset: Dataset = null,
    features: Features = null,
    inputs: Inputs = null,
    params: Params = null,
    readers: Readers = null,
    table: Table = null,
    writers: Writers = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dataset != null) __obj.updateDynamic("dataset")(dataset)
    if (features != null) __obj.updateDynamic("features")(features)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (params != null) __obj.updateDynamic("params")(params)
    if (readers != null) __obj.updateDynamic("readers")(readers)
    if (table != null) __obj.updateDynamic("table")(table)
    if (writers != null) __obj.updateDynamic("writers")(writers)
    __obj.asInstanceOf[Options]
  }
}

