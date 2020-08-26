package typings.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileRef extends js.Object {
  /** Account ID to which this view (profile) belongs. */
  var accountId: js.UndefOr[String] = js.native
  /** Link for this view (profile). */
  var href: js.UndefOr[String] = js.native
  /** View (Profile) ID. */
  var id: js.UndefOr[String] = js.native
  /** Internal ID for the web property to which this view (profile) belongs. */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  /** Analytics view (profile) reference. */
  var kind: js.UndefOr[String] = js.native
  /** Name of this view (profile). */
  var name: js.UndefOr[String] = js.native
  /** Web property ID of the form UA-XXXXX-YY to which this view (profile) belongs. */
  var webPropertyId: js.UndefOr[String] = js.native
}

object ProfileRef {
  @scala.inline
  def apply(): ProfileRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileRef]
  }
  @scala.inline
  implicit class ProfileRefOps[Self <: ProfileRef] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = this.set("internalWebPropertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalWebPropertyId: Self = this.set("internalWebPropertyId", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
  
}

