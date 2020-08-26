package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClientAnalytics.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomMetric extends js.Object {
  /** Account ID. */
  var accountId: js.UndefOr[String] = js.native
  /** Boolean indicating whether the custom metric is active. */
  var active: js.UndefOr[Boolean] = js.native
  /** Time the custom metric was created. */
  var created: js.UndefOr[String] = js.native
  /** Custom metric ID. */
  var id: js.UndefOr[String] = js.native
  /** Index of the custom metric. */
  var index: js.UndefOr[Double] = js.native
  /** Kind value for a custom metric. Set to "analytics#customMetric". It is a read-only field. */
  var kind: js.UndefOr[String] = js.native
  /** Max value of custom metric. */
  var max_value: js.UndefOr[String] = js.native
  /** Min value of custom metric. */
  var min_value: js.UndefOr[String] = js.native
  /** Name of the custom metric. */
  var name: js.UndefOr[String] = js.native
  /** Parent link for the custom metric. Points to the property to which the custom metric belongs. */
  var parentLink: js.UndefOr[Href] = js.native
  /** Scope of the custom metric: HIT or PRODUCT. */
  var scope: js.UndefOr[String] = js.native
  /** Link for the custom metric */
  var selfLink: js.UndefOr[String] = js.native
  /** Data type of custom metric. */
  var `type`: js.UndefOr[String] = js.native
  /** Time the custom metric was last modified. */
  var updated: js.UndefOr[String] = js.native
  /** Property ID. */
  var webPropertyId: js.UndefOr[String] = js.native
}

object CustomMetric {
  @scala.inline
  def apply(): CustomMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomMetric]
  }
  @scala.inline
  implicit class CustomMetricOps[Self <: CustomMetric] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMax_value(value: String): Self = this.set("max_value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_value: Self = this.set("max_value", js.undefined)
    @scala.inline
    def setMin_value(value: String): Self = this.set("min_value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin_value: Self = this.set("min_value", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParentLink(value: Href): Self = this.set("parentLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentLink: Self = this.set("parentLink", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
  
}

