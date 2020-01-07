package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an image asset object.
  */
@js.native
trait Schema$ImageAsset extends js.Object {
  /**
    * The height of the asset.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#imageAsset.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the asset.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The URL of the asset.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * The width of the asset.
    */
  var width: js.UndefOr[Double] = js.native
}

object Schema$ImageAsset {
  @scala.inline
  def apply(
    height: Int | Double = null,
    kind: String = null,
    name: String = null,
    url: String = null,
    width: Int | Double = null
  ): Schema$ImageAsset = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImageAsset]
  }
}

