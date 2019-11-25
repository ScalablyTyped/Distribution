package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorsShapeMultiplicity extends js.Object {
  /** Defines the source label to connector. Applicable, if the connector is of type &quot;UML&quot;
    */
  var source: js.UndefOr[ConnectorsShapeMultiplicitySource] = js.undefined
  /** Defines the target label to connector. Applicable, if the connector is of type &quot;UML&quot;
    * @Default {true}
    */
  var target: js.UndefOr[ConnectorsShapeMultiplicitySource] = js.undefined
  /** Sets the type of the multiplicity. Applicable, if the connector is of type &quot;classifier&quot;
    * @Default {ej.datavisualization.Diagram.Multiplicity.OneToOne}
    */
  var `type`: js.UndefOr[Multiplicity | String] = js.undefined
}

object ConnectorsShapeMultiplicity {
  @scala.inline
  def apply(
    source: ConnectorsShapeMultiplicitySource = null,
    target: ConnectorsShapeMultiplicitySource = null,
    `type`: Multiplicity | String = null
  ): ConnectorsShapeMultiplicity = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorsShapeMultiplicity]
  }
}

