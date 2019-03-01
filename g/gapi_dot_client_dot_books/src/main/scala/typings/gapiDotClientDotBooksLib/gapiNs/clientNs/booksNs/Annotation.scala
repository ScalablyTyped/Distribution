package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotation extends js.Object {
  /** Anchor text after excerpt. For requests, if the user bookmarked a screen that has no flowing text on it, then this field should be empty. */
  var afterSelectedText: js.UndefOr[java.lang.String] = js.undefined
  /** Anchor text before excerpt. For requests, if the user bookmarked a screen that has no flowing text on it, then this field should be empty. */
  var beforeSelectedText: js.UndefOr[java.lang.String] = js.undefined
  /** Selection ranges sent from the client. */
  var clientVersionRanges: js.UndefOr[gapiDotClientDotBooksLib.Anon_CfiRange] = js.undefined
  /** Timestamp for the created time of this annotation. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** Selection ranges for the most recent content version. */
  var currentVersionRanges: js.UndefOr[gapiDotClientDotBooksLib.Anon_CfiRange] = js.undefined
  /** User-created data for this annotation. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates that this annotation is deleted. */
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  /** The highlight style for this annotation. */
  var highlightStyle: js.UndefOr[java.lang.String] = js.undefined
  /** Id of this annotation, in the form of a GUID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The layer this annotation is for. */
  var layerId: js.UndefOr[java.lang.String] = js.undefined
  var layerSummary: js.UndefOr[gapiDotClientDotBooksLib.Anon_AllowedCharacterCount] = js.undefined
  /** Pages that this annotation spans. */
  var pageIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Excerpt from the volume. */
  var selectedText: js.UndefOr[java.lang.String] = js.undefined
  /** URL to this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Timestamp for the last time this annotation was modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** The volume that this annotation belongs to. */
  var volumeId: js.UndefOr[java.lang.String] = js.undefined
}

object Annotation {
  @scala.inline
  def apply(
    afterSelectedText: java.lang.String = null,
    beforeSelectedText: java.lang.String = null,
    clientVersionRanges: gapiDotClientDotBooksLib.Anon_CfiRange = null,
    created: java.lang.String = null,
    currentVersionRanges: gapiDotClientDotBooksLib.Anon_CfiRange = null,
    data: java.lang.String = null,
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    highlightStyle: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    layerId: java.lang.String = null,
    layerSummary: gapiDotClientDotBooksLib.Anon_AllowedCharacterCount = null,
    pageIds: js.Array[java.lang.String] = null,
    selectedText: java.lang.String = null,
    selfLink: java.lang.String = null,
    updated: java.lang.String = null,
    volumeId: java.lang.String = null
  ): Annotation = {
    val __obj = js.Dynamic.literal()
    if (afterSelectedText != null) __obj.updateDynamic("afterSelectedText")(afterSelectedText)
    if (beforeSelectedText != null) __obj.updateDynamic("beforeSelectedText")(beforeSelectedText)
    if (clientVersionRanges != null) __obj.updateDynamic("clientVersionRanges")(clientVersionRanges)
    if (created != null) __obj.updateDynamic("created")(created)
    if (currentVersionRanges != null) __obj.updateDynamic("currentVersionRanges")(currentVersionRanges)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (highlightStyle != null) __obj.updateDynamic("highlightStyle")(highlightStyle)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (layerId != null) __obj.updateDynamic("layerId")(layerId)
    if (layerSummary != null) __obj.updateDynamic("layerSummary")(layerSummary)
    if (pageIds != null) __obj.updateDynamic("pageIds")(pageIds)
    if (selectedText != null) __obj.updateDynamic("selectedText")(selectedText)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId)
    __obj.asInstanceOf[Annotation]
  }
}

