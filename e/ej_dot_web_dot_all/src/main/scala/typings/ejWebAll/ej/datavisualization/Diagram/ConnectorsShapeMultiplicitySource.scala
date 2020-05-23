package typings.ejWebAll.ej.datavisualization.Diagram

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
    lowerBounds: js.UndefOr[Double] = js.undefined,
    optional: js.UndefOr[Boolean] = js.undefined,
    upperBounds: js.UndefOr[Double] = js.undefined
  ): ConnectorsShapeMultiplicitySource = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lowerBounds)) __obj.updateDynamic("lowerBounds")(lowerBounds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    if (!js.isUndefined(upperBounds)) __obj.updateDynamic("upperBounds")(upperBounds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorsShapeMultiplicitySource]
  }
}

