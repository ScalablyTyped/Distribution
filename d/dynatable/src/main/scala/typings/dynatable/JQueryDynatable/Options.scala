package typings.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var dataset: js.UndefOr[Dataset] = js.native
  var features: js.UndefOr[Features] = js.native
  var inputs: js.UndefOr[Inputs] = js.native
  var params: js.UndefOr[Params] = js.native
  var readers: js.UndefOr[Readers] = js.native
  var table: js.UndefOr[Table] = js.native
  var writers: js.UndefOr[Writers] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def deleteDataset: Self = this.set("dataset", js.undefined)
    @scala.inline
    def setFeatures(value: Features): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setInputs(value: Inputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    @scala.inline
    def setParams(value: Params): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setReaders(value: Readers): Self = this.set("readers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReaders: Self = this.set("readers", js.undefined)
    @scala.inline
    def setTable(value: Table): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    @scala.inline
    def setWriters(value: Writers): Self = this.set("writers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriters: Self = this.set("writers", js.undefined)
  }
  
}

