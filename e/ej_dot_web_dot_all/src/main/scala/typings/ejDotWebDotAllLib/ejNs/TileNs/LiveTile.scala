package typings
package ejDotWebDotAllLib.ejNs.TileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveTile extends js.Object {
  /** Specifies whether to enable liveTile or not.
    * @Default {false}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
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
  var `type`: js.UndefOr[liveTileType | java.lang.String] = js.undefined
  /** Specifies time interval between two successive liveTile animation
    * @Default {2000}
    */
  var updateInterval: js.UndefOr[scala.Double] = js.undefined
}

object LiveTile {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    imageClass: js.Array[_] = null,
    imageTemplateId: js.Array[_] = null,
    imageUrl: js.Array[_] = null,
    text: js.Array[_] = null,
    `type`: liveTileType | java.lang.String = null,
    updateInterval: scala.Int | scala.Double = null
  ): LiveTile = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass)
    if (imageTemplateId != null) __obj.updateDynamic("imageTemplateId")(imageTemplateId)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updateInterval != null) __obj.updateDynamic("updateInterval")(updateInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveTile]
  }
}

