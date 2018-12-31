package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  var `type`: js.UndefOr[Multiplicity | java.lang.String] = js.undefined
}

