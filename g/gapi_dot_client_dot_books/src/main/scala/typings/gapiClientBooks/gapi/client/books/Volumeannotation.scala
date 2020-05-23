package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.anon.ContentVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volumeannotation extends js.Object {
  /** The annotation data id for this volume annotation. */
  var annotationDataId: js.UndefOr[String] = js.undefined
  /** Link to get data for this annotation. */
  var annotationDataLink: js.UndefOr[String] = js.undefined
  /** The type of annotation this is. */
  var annotationType: js.UndefOr[String] = js.undefined
  /** The content ranges to identify the selected text. */
  var contentRanges: js.UndefOr[ContentVersion] = js.undefined
  /** Data for this annotation. */
  var data: js.UndefOr[String] = js.undefined
  /** Indicates that this annotation is deleted. */
  var deleted: js.UndefOr[Boolean] = js.undefined
  /** Unique id of this volume annotation. */
  var id: js.UndefOr[String] = js.undefined
  /** Resource Type */
  var kind: js.UndefOr[String] = js.undefined
  /** The Layer this annotation is for. */
  var layerId: js.UndefOr[String] = js.undefined
  /** Pages the annotation spans. */
  var pageIds: js.UndefOr[js.Array[String]] = js.undefined
  /** Excerpt from the volume. */
  var selectedText: js.UndefOr[String] = js.undefined
  /** URL to this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Timestamp for the last time this anntoation was updated. (RFC 3339 UTC date-time format). */
  var updated: js.UndefOr[String] = js.undefined
  /** The Volume this annotation is for. */
  var volumeId: js.UndefOr[String] = js.undefined
}

object Volumeannotation {
  @scala.inline
  def apply(
    annotationDataId: String = null,
    annotationDataLink: String = null,
    annotationType: String = null,
    contentRanges: ContentVersion = null,
    data: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    layerId: String = null,
    pageIds: js.Array[String] = null,
    selectedText: String = null,
    selfLink: String = null,
    updated: String = null,
    volumeId: String = null
  ): Volumeannotation = {
    val __obj = js.Dynamic.literal()
    if (annotationDataId != null) __obj.updateDynamic("annotationDataId")(annotationDataId.asInstanceOf[js.Any])
    if (annotationDataLink != null) __obj.updateDynamic("annotationDataLink")(annotationDataLink.asInstanceOf[js.Any])
    if (annotationType != null) __obj.updateDynamic("annotationType")(annotationType.asInstanceOf[js.Any])
    if (contentRanges != null) __obj.updateDynamic("contentRanges")(contentRanges.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (pageIds != null) __obj.updateDynamic("pageIds")(pageIds.asInstanceOf[js.Any])
    if (selectedText != null) __obj.updateDynamic("selectedText")(selectedText.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volumeannotation]
  }
}

