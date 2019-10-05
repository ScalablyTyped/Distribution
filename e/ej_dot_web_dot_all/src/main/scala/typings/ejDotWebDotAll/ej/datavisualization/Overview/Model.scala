package typings.ejDotWebDotAll.ej.datavisualization.Overview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Defines the height of the overview
    * @Default {400}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** The sourceId property of overview should be set with the corresponding Diagram ID for you need the overall view.
    * @Default {null}
    */
  var sourceID: js.UndefOr[String] = js.undefined
  /** Defines the width of the overview
    * @Default {250}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(height: Int | Double = null, sourceID: String = null, width: Int | Double = null): Model = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (sourceID != null) __obj.updateDynamic("sourceID")(sourceID)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

