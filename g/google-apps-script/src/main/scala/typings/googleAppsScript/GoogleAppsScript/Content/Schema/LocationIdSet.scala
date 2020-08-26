package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationIdSet extends js.Object {
  var locationIds: js.UndefOr[js.Array[String]] = js.native
}

object LocationIdSet {
  @scala.inline
  def apply(): LocationIdSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationIdSet]
  }
  @scala.inline
  implicit class LocationIdSetOps[Self <: LocationIdSet] (val x: Self) extends AnyVal {
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
    def setLocationIdsVarargs(value: String*): Self = this.set("locationIds", js.Array(value :_*))
    @scala.inline
    def setLocationIds(value: js.Array[String]): Self = this.set("locationIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationIds: Self = this.set("locationIds", js.undefined)
  }
  
}

