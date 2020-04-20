package typings.dynatable.JQueryDynatable

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
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], readers = readers.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], writers = writers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

