package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettingsLocation extends js.Object {
  /** Specifies the position in horizontal direction
    * @Default {17}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Specifies the position in horizontal direction
    * @Default {30}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object CaptionSettingsLocation {
  @scala.inline
  def apply(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): CaptionSettingsLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsLocation]
  }
}

