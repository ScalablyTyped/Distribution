package typings.gapiClientGames.gapi.client.games

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
    height: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    mime_type: String = null,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): SnapshotImage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mime_type != null) __obj.updateDynamic("mime_type")(mime_type.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotImage]
  }
}

