package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an image of a snapshot.
  */
@js.native
trait Schema$SnapshotImage extends js.Object {
  /**
    * The height of the image.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#snapshotImage.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The MIME type of the image.
    */
  var mime_type: js.UndefOr[String] = js.native
  /**
    * The URL of the image. This URL may be invalidated at any time and should
    * not be cached.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * The width of the image.
    */
  var width: js.UndefOr[Double] = js.native
}

object Schema$SnapshotImage {
  @scala.inline
  def apply(
    height: Int | Double = null,
    kind: String = null,
    mime_type: String = null,
    url: String = null,
    width: Int | Double = null
  ): Schema$SnapshotImage = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mime_type != null) __obj.updateDynamic("mime_type")(mime_type.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SnapshotImage]
  }
}

