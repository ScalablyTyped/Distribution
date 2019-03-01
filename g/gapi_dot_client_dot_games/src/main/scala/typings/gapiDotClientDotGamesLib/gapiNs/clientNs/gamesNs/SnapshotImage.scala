package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotImage extends js.Object {
  /** The height of the image. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#snapshotImage. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The MIME type of the image. */
  var mime_type: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of the image. This URL may be invalidated at any time and should not be cached. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** The width of the image. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SnapshotImage {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    mime_type: java.lang.String = null,
    url: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): SnapshotImage = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (mime_type != null) __obj.updateDynamic("mime_type")(mime_type)
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotImage]
  }
}

