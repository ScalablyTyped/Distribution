package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volumeannotation extends js.Object {
  /** The annotation data id for this volume annotation. */
  var annotationDataId: js.UndefOr[java.lang.String] = js.undefined
  /** Link to get data for this annotation. */
  var annotationDataLink: js.UndefOr[java.lang.String] = js.undefined
  /** The type of annotation this is. */
  var annotationType: js.UndefOr[java.lang.String] = js.undefined
  /** The content ranges to identify the selected text. */
  var contentRanges: js.UndefOr[gapiDotClientDotBooksLib.Anon_CfiRangeContentVersion] = js.undefined
  /** Data for this annotation. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates that this annotation is deleted. */
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  /** Unique id of this volume annotation. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource Type */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The Layer this annotation is for. */
  var layerId: js.UndefOr[java.lang.String] = js.undefined
  /** Pages the annotation spans. */
  var pageIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Excerpt from the volume. */
  var selectedText: js.UndefOr[java.lang.String] = js.undefined
  /** URL to this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Timestamp for the last time this anntoation was updated. (RFC 3339 UTC date-time format). */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** The Volume this annotation is for. */
  var volumeId: js.UndefOr[java.lang.String] = js.undefined
}

