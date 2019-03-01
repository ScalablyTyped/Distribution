package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageAsset extends js.Object {
  /** The height of the asset. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#imageAsset. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the asset. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of the asset. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** The width of the asset. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ImageAsset {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    url: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): ImageAsset = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageAsset]
  }
}

