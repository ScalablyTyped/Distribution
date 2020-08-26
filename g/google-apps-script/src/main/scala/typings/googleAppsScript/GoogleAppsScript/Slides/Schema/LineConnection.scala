package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineConnection extends js.Object {
  var connectedObjectId: js.UndefOr[String] = js.native
  var connectionSiteIndex: js.UndefOr[Double] = js.native
}

object LineConnection {
  @scala.inline
  def apply(): LineConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineConnection]
  }
  @scala.inline
  implicit class LineConnectionOps[Self <: LineConnection] (val x: Self) extends AnyVal {
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
    def setConnectedObjectId(value: String): Self = this.set("connectedObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectedObjectId: Self = this.set("connectedObjectId", js.undefined)
    @scala.inline
    def setConnectionSiteIndex(value: Double): Self = this.set("connectionSiteIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionSiteIndex: Self = this.set("connectionSiteIndex", js.undefined)
  }
  
}

