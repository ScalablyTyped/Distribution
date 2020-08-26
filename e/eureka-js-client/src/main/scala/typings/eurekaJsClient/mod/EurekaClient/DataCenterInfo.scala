package typings.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataCenterInfo extends js.Object {
  var `@class`: js.UndefOr[String] = js.native
  var name: DataCenterName = js.native
}

object DataCenterInfo {
  @scala.inline
  def apply(name: DataCenterName): DataCenterInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCenterInfo]
  }
  @scala.inline
  implicit class DataCenterInfoOps[Self <: DataCenterInfo] (val x: Self) extends AnyVal {
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
    def setName(value: DataCenterName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def `set@class`(value: String): Self = this.set("@class", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete@class`: Self = this.set("@class", js.undefined)
  }
  
}

