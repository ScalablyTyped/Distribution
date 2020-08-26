package typings.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataResource extends js.Object {
  var columns: ColumnsResource = js.native
}

object MetadataResource {
  @scala.inline
  def apply(columns: ColumnsResource): MetadataResource = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataResource]
  }
  @scala.inline
  implicit class MetadataResourceOps[Self <: MetadataResource] (val x: Self) extends AnyVal {
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
    def setColumns(value: ColumnsResource): Self = this.set("columns", value.asInstanceOf[js.Any])
  }
  
}

