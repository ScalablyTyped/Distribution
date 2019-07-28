package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotImage extends js.Object {
  /** The height of the image. */
  var height: js.UndefOr[Double] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#snapshotImage. */
  var kind: js.UndefOr[String] = js.undefined
  /** The MIME type of the image. */
  var mime_type: js.UndefOr[String] = js.undefined
  /** The URL of the image. This URL may be invalidated at any time and should not be cached. */
  var url: js.UndefOr[String] = js.undefined
  /** The width of the image. */
  var width: js.UndefOr[Double] = js.undefined
}

object SnapshotImage {
  @scala.inline
  def apply(
    height: Int | Double = null,
    kind: String = null,
    mime_type: String = null,
    url: String = null,
    width: Int | Double = null
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

