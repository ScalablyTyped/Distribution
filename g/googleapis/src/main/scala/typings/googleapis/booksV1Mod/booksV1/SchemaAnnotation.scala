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
  def apply(
    afterSelectedText: String = null,
    beforeSelectedText: String = null,
    clientVersionRanges: CfiRange = null,
    created: String = null,
    currentVersionRanges: CfiRange = null,
    data: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    highlightStyle: String = null,
    id: String = null,
    kind: String = null,
    layerId: String = null,
    layerSummary: AllowedCharacterCount = null,
    pageIds: js.Array[String] = null,
    selectedText: String = null,
    selfLink: String = null,
    updated: String = null,
    volumeId: String = null
  ): SchemaAnnotation = {
    val __obj = js.Dynamic.literal()
    if (afterSelectedText != null) __obj.updateDynamic("afterSelectedText")(afterSelectedText.asInstanceOf[js.Any])
    if (beforeSelectedText != null) __obj.updateDynamic("beforeSelectedText")(beforeSelectedText.asInstanceOf[js.Any])
    if (clientVersionRanges != null) __obj.updateDynamic("clientVersionRanges")(clientVersionRanges.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (currentVersionRanges != null) __obj.updateDynamic("currentVersionRanges")(currentVersionRanges.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (highlightStyle != null) __obj.updateDynamic("highlightStyle")(highlightStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (layerSummary != null) __obj.updateDynamic("layerSummary")(layerSummary.asInstanceOf[js.Any])
    if (pageIds != null) __obj.updateDynamic("pageIds")(pageIds.asInstanceOf[js.Any])
    if (selectedText != null) __obj.updateDynamic("selectedText")(selectedText.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnnotation]
  }
}

