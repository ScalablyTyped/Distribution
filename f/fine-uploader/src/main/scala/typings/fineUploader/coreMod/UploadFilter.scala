package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadFilter extends js.Object {
  /**
    * the id of the file
    */
  var id: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * status of the file
    */
  var status: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * the uuid of the file
    */
  var uuid: js.UndefOr[Double | js.Array[Double]] = js.native
}

object UploadFilter {
  @scala.inline
  def apply(): UploadFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadFilter]
  }
  @scala.inline
  implicit class UploadFilterOps[Self <: UploadFilter] (val x: Self) extends AnyVal {
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
    def setIdVarargs(value: Double*): Self = this.set("id", js.Array(value :_*))
    @scala.inline
    def setId(value: Double | js.Array[Double]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setStatusVarargs(value: String*): Self = this.set("status", js.Array(value :_*))
    @scala.inline
    def setStatus(value: String | js.Array[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUuidVarargs(value: Double*): Self = this.set("uuid", js.Array(value :_*))
    @scala.inline
    def setUuid(value: Double | js.Array[Double]): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
  
}

