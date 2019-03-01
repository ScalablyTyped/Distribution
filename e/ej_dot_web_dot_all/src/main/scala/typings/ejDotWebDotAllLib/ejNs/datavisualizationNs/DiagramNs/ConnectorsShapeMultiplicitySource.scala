package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorsShapeMultiplicitySource extends js.Object {
  /** Defines the source label to connector. Applicable, if the connector is of type &quot;UML&quot;
    * @Default {null}
    */
  var lowerBounds: js.UndefOr[scala.Double] = js.undefined
  /** Defines the source label to connector. Applicable, if the connector is of type &quot;UML&quot;
    * @Default {true}
    */
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the source label to connector. Applicable, if the connector is of type &quot;UML&quot;
    * @Default {null}
    */
  var upperBounds: js.UndefOr[scala.Double] = js.undefined
}

object ConnectorsShapeMultiplicitySource {
  @scala.inline
  def apply(
    lowerBounds: scala.Int | scala.Double = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    upperBounds: scala.Int | scala.Double = null
  ): ConnectorsShapeMultiplicitySource = {
    val __obj = js.Dynamic.literal()
    if (lowerBounds != null) __obj.updateDynamic("lowerBounds")(lowerBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (upperBounds != null) __obj.updateDynamic("upperBounds")(upperBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorsShapeMultiplicitySource]
  }
}

