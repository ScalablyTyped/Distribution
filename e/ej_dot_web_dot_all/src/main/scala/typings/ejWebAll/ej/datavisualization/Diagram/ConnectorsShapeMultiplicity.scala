package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorsShapeMultiplicity extends js.Object {
  
  /** Defines the source label to connector. Applicable, if the connector is of type &quot;UML&quot;
    */
  var source: js.UndefOr[ConnectorsShapeMultiplicitySource] = js.native
  
  /** Defines the target label to connector. Applicable, if the connector is of type &quot;UML&quot;
    * @Default {true}
    */
  var target: js.UndefOr[ConnectorsShapeMultiplicitySource] = js.native
  
  /** Sets the type of the multiplicity. Applicable, if the connector is of type &quot;classifier&quot;
    * @Default {ej.datavisualization.Diagram.Multiplicity.OneToOne}
    */
  var `type`: js.UndefOr[Multiplicity | String] = js.native
}
object ConnectorsShapeMultiplicity {
  
  @scala.inline
  def apply(): ConnectorsShapeMultiplicity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorsShapeMultiplicity]
  }
  
  @scala.inline
  implicit class ConnectorsShapeMultiplicityOps[Self <: ConnectorsShapeMultiplicity] (val x: Self) extends AnyVal {
    
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
    def setSource(value: ConnectorsShapeMultiplicitySource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setTarget(value: ConnectorsShapeMultiplicitySource): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setType(value: Multiplicity | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
