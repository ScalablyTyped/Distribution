package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorsShapeMultiplicitySource extends js.Object {
  /** Defines the source label to connector. Applicable, if the connector is of type &quot;UML&quot;
    * @Default {null}
    */
  var lowerBounds: js.UndefOr[Double] = js.undefined
  /** Defines the source label to connector. Applicable, if the connector is of type &quot;UML&quot;
    * @Default {true}
    */
  var optional: js.UndefOr[Boolean] = js.undefined
  /** Defines the source label to connector. Applicable, if the connector is of type &quot;UML&quot;
    * @Default {null}
    */
  var upperBounds: js.UndefOr[Double] = js.undefined
}

object ConnectorsShapeMultiplicitySource {
  @scala.inline
  def apply(
    lowerBounds: Int | Double = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    upperBounds: Int | Double = null
  ): ConnectorsShapeMultiplicitySource = {
    val __obj = js.Dynamic.literal()
    if (lowerBounds != null) __obj.updateDynamic("lowerBounds")(lowerBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (upperBounds != null) __obj.updateDynamic("upperBounds")(upperBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorsShapeMultiplicitySource]
  }
}

