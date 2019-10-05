package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesLane extends js.Object {
  /** Allows to maintain additional information about lane
    * @Default {{}}
    */
  var addInfo: js.UndefOr[js.Any] = js.undefined
  /** An array of objects where each object represents a child node of the lane
    * @Default {[]}
    */
  var children: js.UndefOr[js.Array[_]] = js.undefined
  /** This property allows you to customize lanes appearance using user-defined CSS.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Defines the fill color of the lane
    * @Default {white}
    */
  var fillColor: js.UndefOr[String] = js.undefined
  /** Defines the header of the lane
    * @Default {{ text: Function, fontSize: 11 }}
    */
  var header: js.UndefOr[js.Any] = js.undefined
  /** Defines the height of lane
    * @Default {0}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Defines the object as a lane
    * @Default {false}
    */
  var isLane: js.UndefOr[Boolean] = js.undefined
  /** Sets the unique identifier of the lane
    */
  var name: js.UndefOr[String] = js.undefined
  /** Sets the orientation of the lane.
    * @Default {vertical}
    */
  var orientation: js.UndefOr[String] = js.undefined
  /** Defines the width of lane
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.undefined
  /** Defines the z-index of the lane
    * @Default {0}
    */
  var zorder: js.UndefOr[Double] = js.undefined
}

object NodesLane {
  @scala.inline
  def apply(
    addInfo: js.Any = null,
    children: js.Array[_] = null,
    cssClass: String = null,
    fillColor: String = null,
    header: js.Any = null,
    height: Int | Double = null,
    isLane: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    orientation: String = null,
    width: Int | Double = null,
    zorder: Int | Double = null
  ): NodesLane = {
    val __obj = js.Dynamic.literal()
    if (addInfo != null) __obj.updateDynamic("addInfo")(addInfo)
    if (children != null) __obj.updateDynamic("children")(children)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (header != null) __obj.updateDynamic("header")(header)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isLane)) __obj.updateDynamic("isLane")(isLane)
    if (name != null) __obj.updateDynamic("name")(name)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zorder != null) __obj.updateDynamic("zorder")(zorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesLane]
  }
}

