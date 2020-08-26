package typings.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Segment extends js.Object {
  /** Time the segment was created. */
  var created: js.UndefOr[String] = js.native
  /** Segment definition. */
  var definition: js.UndefOr[String] = js.native
  /** Segment ID. */
  var id: js.UndefOr[String] = js.native
  /** Resource type for Analytics segment. */
  var kind: js.UndefOr[String] = js.native
  /** Segment name. */
  var name: js.UndefOr[String] = js.native
  /** Segment ID. Can be used with the 'segment' parameter in Core Reporting API. */
  var segmentId: js.UndefOr[String] = js.native
  /** Link for this segment. */
  var selfLink: js.UndefOr[String] = js.native
  /** Type for a segment. Possible values are "BUILT_IN" or "CUSTOM". */
  var `type`: js.UndefOr[String] = js.native
  /** Time the segment was last modified. */
  var updated: js.UndefOr[String] = js.native
}

object Segment {
  @scala.inline
  def apply(): Segment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Segment]
  }
  @scala.inline
  implicit class SegmentOps[Self <: Segment] (val x: Self) extends AnyVal {
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
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDefinition(value: String): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
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
    def setSegmentId(value: String): Self = this.set("segmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentId: Self = this.set("segmentId", js.undefined)
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
  }
  
}

