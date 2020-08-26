package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.AllowedCharacterCount
import typings.googleapis.anon.CfiRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAnnotation extends js.Object {
  /**
    * Anchor text after excerpt. For requests, if the user bookmarked a screen
    * that has no flowing text on it, then this field should be empty.
    */
  var afterSelectedText: js.UndefOr[String] = js.native
  /**
    * Anchor text before excerpt. For requests, if the user bookmarked a screen
    * that has no flowing text on it, then this field should be empty.
    */
  var beforeSelectedText: js.UndefOr[String] = js.native
  /**
    * Selection ranges sent from the client.
    */
  var clientVersionRanges: js.UndefOr[CfiRange] = js.native
  /**
    * Timestamp for the created time of this annotation.
    */
  var created: js.UndefOr[String] = js.native
  /**
    * Selection ranges for the most recent content version.
    */
  var currentVersionRanges: js.UndefOr[CfiRange] = js.native
  /**
    * User-created data for this annotation.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * Indicates that this annotation is deleted.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * The highlight style for this annotation.
    */
  var highlightStyle: js.UndefOr[String] = js.native
  /**
    * Id of this annotation, in the form of a GUID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The layer this annotation is for.
    */
  var layerId: js.UndefOr[String] = js.native
  var layerSummary: js.UndefOr[AllowedCharacterCount] = js.native
  /**
    * Pages that this annotation spans.
    */
  var pageIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Excerpt from the volume.
    */
  var selectedText: js.UndefOr[String] = js.native
  /**
    * URL to this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Timestamp for the last time this annotation was modified.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * The volume that this annotation belongs to.
    */
  var volumeId: js.UndefOr[String] = js.native
}

object SchemaAnnotation {
  @scala.inline
  def apply(): SchemaAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotation]
  }
  @scala.inline
  implicit class SchemaAnnotationOps[Self <: SchemaAnnotation] (val x: Self) extends AnyVal {
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
    def setAfterSelectedText(value: String): Self = this.set("afterSelectedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterSelectedText: Self = this.set("afterSelectedText", js.undefined)
    @scala.inline
    def setBeforeSelectedText(value: String): Self = this.set("beforeSelectedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeSelectedText: Self = this.set("beforeSelectedText", js.undefined)
    @scala.inline
    def setClientVersionRanges(value: CfiRange): Self = this.set("clientVersionRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientVersionRanges: Self = this.set("clientVersionRanges", js.undefined)
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setCurrentVersionRanges(value: CfiRange): Self = this.set("currentVersionRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentVersionRanges: Self = this.set("currentVersionRanges", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setHighlightStyle(value: String): Self = this.set("highlightStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightStyle: Self = this.set("highlightStyle", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLayerId(value: String): Self = this.set("layerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerId: Self = this.set("layerId", js.undefined)
    @scala.inline
    def setLayerSummary(value: AllowedCharacterCount): Self = this.set("layerSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerSummary: Self = this.set("layerSummary", js.undefined)
    @scala.inline
    def setPageIdsVarargs(value: String*): Self = this.set("pageIds", js.Array(value :_*))
    @scala.inline
    def setPageIds(value: js.Array[String]): Self = this.set("pageIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageIds: Self = this.set("pageIds", js.undefined)
    @scala.inline
    def setSelectedText(value: String): Self = this.set("selectedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedText: Self = this.set("selectedText", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
  }
  
}

