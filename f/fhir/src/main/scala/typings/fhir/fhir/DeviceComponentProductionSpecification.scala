package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specification details such as Component Revisions, or Serial Numbers
  */
@js.native
trait DeviceComponentProductionSpecification extends BackboneElement {
  
  /**
    * Contains extended information for property 'productionSpec'.
    */
  var _productionSpec: js.UndefOr[Element] = js.native
  
  /**
    * Internal component unique identification
    */
  var componentId: js.UndefOr[Identifier] = js.native
  
  /**
    * A printable string defining the component
    */
  var productionSpec: js.UndefOr[String] = js.native
  
  /**
    * Type or kind of production specification, for example serial number or software revision
    */
  var specType: js.UndefOr[CodeableConcept] = js.native
}
object DeviceComponentProductionSpecification {
  
  @scala.inline
  def apply(): DeviceComponentProductionSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceComponentProductionSpecification]
  }
  
  @scala.inline
  implicit class DeviceComponentProductionSpecificationOps[Self <: DeviceComponentProductionSpecification] (val x: Self) extends AnyVal {
    
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
    def set_productionSpec(value: Element): Self = this.set("_productionSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_productionSpec: Self = this.set("_productionSpec", js.undefined)
    
    @scala.inline
    def setComponentId(value: Identifier): Self = this.set("componentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentId: Self = this.set("componentId", js.undefined)
    
    @scala.inline
    def setProductionSpec(value: String): Self = this.set("productionSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductionSpec: Self = this.set("productionSpec", js.undefined)
    
    @scala.inline
    def setSpecType(value: CodeableConcept): Self = this.set("specType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecType: Self = this.set("specType", js.undefined)
  }
}
