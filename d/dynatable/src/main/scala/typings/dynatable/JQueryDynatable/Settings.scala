package typings.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var dataset: Dataset = js.native
  var features: Features = js.native
  var inputs: Inputs = js.native
  var params: Params = js.native
  var readers: Readers = js.native
  var table: Table = js.native
  var writers: Writers = js.native
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
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataset(value: Dataset): Self = this.set("dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeatures(value: Features): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputs(value: Inputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: Params): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setReaders(value: Readers): Self = this.set("readers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTable(value: Table): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def setWriters(value: Writers): Self = this.set("writers", value.asInstanceOf[js.Any])
  }
  
}

