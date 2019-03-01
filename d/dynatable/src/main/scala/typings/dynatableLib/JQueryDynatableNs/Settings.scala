package typings
package dynatableLib.JQueryDynatableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var dataset: Dataset
  var features: Features
  var inputs: Inputs
  var params: Params
  var readers: Readers
  var table: Table
  var writers: Writers
}

object Settings {
  @scala.inline
  def apply(
    dataset: Dataset,
    features: Features,
    inputs: Inputs,
    params: Params,
    readers: Readers,
    table: Table,
    writers: Writers
  ): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataset")(dataset)
    __obj.updateDynamic("features")(features)
    __obj.updateDynamic("inputs")(inputs)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("readers")(readers)
    __obj.updateDynamic("table")(table)
    __obj.updateDynamic("writers")(writers)
    __obj.asInstanceOf[Settings]
  }
}

