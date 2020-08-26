package typings.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountSummary extends js.Object {
  /** Account ID. */
  var id: js.UndefOr[String] = js.native
  /** Resource type for Analytics AccountSummary. */
  var kind: js.UndefOr[String] = js.native
  /** Account name. */
  var name: js.UndefOr[String] = js.native
  /** Indicates whether this account is starred or not. */
  var starred: js.UndefOr[Boolean] = js.native
  /** List of web properties under this account. */
  var webProperties: js.UndefOr[js.Array[WebPropertySummary]] = js.native
}

object AccountSummary {
  @scala.inline
  def apply(): AccountSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSummary]
  }
  @scala.inline
  implicit class AccountSummaryOps[Self <: AccountSummary] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setStarred(value: Boolean): Self = this.set("starred", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStarred: Self = this.set("starred", js.undefined)
    @scala.inline
    def setWebPropertiesVarargs(value: WebPropertySummary*): Self = this.set("webProperties", js.Array(value :_*))
    @scala.inline
    def setWebProperties(value: js.Array[WebPropertySummary]): Self = this.set("webProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebProperties: Self = this.set("webProperties", js.undefined)
  }
  
}

