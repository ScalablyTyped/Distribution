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
  var clientVersionRanges: js.UndefOr[gapiDotClientDotBooksLib.Anon_GbImageRange] = js.undefined
  /** Timestamp for the created time of this annotation. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** Selection ranges for the most recent content version. */
  var currentVersionRanges: js.UndefOr[gapiDotClientDotBooksLib.Anon_GbImageRange] = js.undefined
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
  var layerSummary: js.UndefOr[gapiDotClientDotBooksLib.Anon_LimitType] = js.undefined
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

