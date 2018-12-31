package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the fill color of the lane
    * @Default {white}
    */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the header of the lane
    * @Default {{ text: Function, fontSize: 11 }}
    */
  var header: js.UndefOr[js.Any] = js.undefined
  /** Defines the height of lane
    * @Default {0}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Defines the object as a lane
    * @Default {false}
    */
  var isLane: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the unique identifier of the lane
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the orientation of the lane.
    * @Default {vertical}
    */
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the width of lane
    * @Default {0}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** Defines the z-index of the lane
    * @Default {0}
    */
  var zorder: js.UndefOr[scala.Double] = js.undefined
}

