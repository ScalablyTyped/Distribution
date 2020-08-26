package typings.elasticElasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: Boolean = js.native
  var ingest: Boolean = js.native
  var master: Boolean = js.native
  var ml: Boolean = js.native
}

object Data {
  @scala.inline
  def apply(data: Boolean, ingest: Boolean, master: Boolean, ml: Boolean): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ingest = ingest.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setData(value: Boolean): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIngest(value: Boolean): Self = this.set("ingest", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaster(value: Boolean): Self = this.set("master", value.asInstanceOf[js.Any])
    @scala.inline
    def setMl(value: Boolean): Self = this.set("ml", value.asInstanceOf[js.Any])
  }
  
}

