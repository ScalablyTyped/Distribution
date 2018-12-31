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

