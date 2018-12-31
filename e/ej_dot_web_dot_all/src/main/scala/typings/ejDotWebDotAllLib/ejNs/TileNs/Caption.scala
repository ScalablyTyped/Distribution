package typings
package ejDotWebDotAllLib.ejNs.TileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Caption extends js.Object {
  /** It is used to align the text of a tile.
    * @Default {normal}
    */
  var alignment: js.UndefOr[CaptionAlignment | java.lang.String] = js.undefined
  /** Specifies whether the tile text to be shown or hidden.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** sets the icon instead of text.
    * @Default {null}
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** It is used to specify the caption position like Inner top,  inner bottom and outer.
    * @Default {Innerbottom}
    */
  var position: js.UndefOr[CaptionPosition | java.lang.String] = js.undefined
  /** Changes the text of a tile.
    * @Default {Text}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

