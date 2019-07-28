package typings.dynatable.JQueryDynatableNs

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
    val __obj = js.Dynamic.literal(dataset = dataset, features = features, inputs = inputs, params = params, readers = readers, table = table, writers = writers)
  
    __obj.asInstanceOf[Settings]
  }
}

