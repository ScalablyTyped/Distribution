package typings.ejWebAll.ej.Tile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveTile extends js.Object {
  /** Specifies whether to enable liveTile or not.
    * @Default {false}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies liveTile images in CSS classes.
    * @Default {null}
    */
  var imageClass: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies liveTile images in templates.
    * @Default {null}
    */
  var imageTemplateId: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies liveTile images in CSS classes.
    * @Default {null}
    */
  var imageUrl: js.UndefOr[js.Array[_]] = js.undefined
  /** Sets the text to each living tile
    * @Default {Null}
    */
  var text: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies liveTile type for Tile. See orientation
    * @Default {flip}
    */
  var `type`: js.UndefOr[liveTileType | String] = js.undefined
  /** Specifies time interval between two successive liveTile animation
    * @Default {2000}
    */
  var updateInterval: js.UndefOr[Double] = js.undefined
}

object LiveTile {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    imageClass: js.Array[_] = null,
    imageTemplateId: js.Array[_] = null,
    imageUrl: js.Array[_] = null,
    text: js.Array[_] = null,
    `type`: liveTileType | String = null,
    updateInterval: Int | Double = null
  ): LiveTile = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass.asInstanceOf[js.Any])
    if (imageTemplateId != null) __obj.updateDynamic("imageTemplateId")(imageTemplateId.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updateInterval != null) __obj.updateDynamic("updateInterval")(updateInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveTile]
  }
}

