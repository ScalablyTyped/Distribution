package typings.gapiClientAdsense.gapi.client.adsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedAdStyle extends js.Object {
  /** The AdStyle itself. */
  var adStyle: js.UndefOr[AdStyle] = js.native
  /** Unique identifier of this saved ad style. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format. */
  var id: js.UndefOr[String] = js.native
  /** Kind of resource this is, in this case adsense#savedAdStyle. */
  var kind: js.UndefOr[String] = js.native
  /** The user selected name of this SavedAdStyle. */
  var name: js.UndefOr[String] = js.native
}

object SavedAdStyle {
  @scala.inline
  def apply(): SavedAdStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavedAdStyle]
  }
  @scala.inline
  implicit class SavedAdStyleOps[Self <: SavedAdStyle] (val x: Self) extends AnyVal {
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
    def setAdStyle(value: AdStyle): Self = this.set("adStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdStyle: Self = this.set("adStyle", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

