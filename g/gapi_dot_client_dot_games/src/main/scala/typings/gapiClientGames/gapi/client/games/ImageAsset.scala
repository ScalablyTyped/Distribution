package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageAsset extends js.Object {
  /** The height of the asset. */
  var height: js.UndefOr[Double] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#imageAsset. */
  var kind: js.UndefOr[String] = js.undefined
  /** The name of the asset. */
  var name: js.UndefOr[String] = js.undefined
  /** The URL of the asset. */
  var url: js.UndefOr[String] = js.undefined
  /** The width of the asset. */
  var width: js.UndefOr[Double] = js.undefined
}

object ImageAsset {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    name: String = null,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ImageAsset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageAsset]
  }
}

