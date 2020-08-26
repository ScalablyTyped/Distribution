package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectorsShapeMultiplicitySource extends js.Object {
  /** Defines the source label to connector. Applicable, if the connector is of type &quot;UML&quot;
    * @Default {null}
    */
  var lowerBounds: js.UndefOr[Double] = js.native
  /** Defines the source label to connector. Applicable, if the connector is of type &quot;UML&quot;
    * @Default {true}
    */
  var optional: js.UndefOr[Boolean] = js.native
  /** Defines the source label to connector. Applicable, if the connector is of type &quot;UML&quot;
    * @Default {null}
    */
  var upperBounds: js.UndefOr[Double] = js.native
}

object ConnectorsShapeMultiplicitySource {
  @scala.inline
  def apply(): ConnectorsShapeMultiplicitySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorsShapeMultiplicitySource]
  }
  @scala.inline
  implicit class ConnectorsShapeMultiplicitySourceOps[Self <: ConnectorsShapeMultiplicitySource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLowerBounds(value: Double): Self = this.set("lowerBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowerBounds: Self = this.set("lowerBounds", js.undefined)
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    @scala.inline
    def setUpperBounds(value: Double): Self = this.set("upperBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpperBounds: Self = this.set("upperBounds", js.undefined)
  }
  
}

