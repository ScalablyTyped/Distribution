package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinLogCoordinates extends js.Object {
  /** Name of the binary log file for a Cloud SQL instance. */
  var binLogFileName: js.UndefOr[String] = js.native
  /** Position (offset) within the binary log file. */
  var binLogPosition: js.UndefOr[String] = js.native
  /** This is always sql#binLogCoordinates. */
  var kind: js.UndefOr[String] = js.native
}

object BinLogCoordinates {
  @scala.inline
  def apply(): BinLogCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinLogCoordinates]
  }
  @scala.inline
  implicit class BinLogCoordinatesOps[Self <: BinLogCoordinates] (val x: Self) extends AnyVal {
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
    def setBinLogFileName(value: String): Self = this.set("binLogFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinLogFileName: Self = this.set("binLogFileName", js.undefined)
    @scala.inline
    def setBinLogPosition(value: String): Self = this.set("binLogPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinLogPosition: Self = this.set("binLogPosition", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

