package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.OverviewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Defines the height of the overview
    * @Default {400}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The sourceId property of overview should be set with the corresponding Diagram ID for you need the overall view.
    * @Default {null}
    */
  var sourceID: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the width of the overview
    * @Default {250}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    sourceID: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (sourceID != null) __obj.updateDynamic("sourceID")(sourceID)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

