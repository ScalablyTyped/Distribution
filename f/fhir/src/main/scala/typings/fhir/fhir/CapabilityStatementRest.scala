package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If the endpoint is a RESTful one
  */
@js.native
trait CapabilityStatementRest extends BackboneElement {
  
  /**
    * Contains extended information for property 'compartment'.
    */
  var _compartment: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.native
  
  /**
    * Compartments served/used by system
    */
  var compartment: js.UndefOr[js.Array[uri]] = js.native
  
  /**
    * General description of implementation
    */
  var documentation: js.UndefOr[String] = js.native
  
  /**
    * What operations are supported?
    */
  var interaction: js.UndefOr[js.Array[CapabilityStatementRestInteraction]] = js.native
  
  /**
    * client | server
    */
  var mode: code = js.native
  
  /**
    * Definition of an operation or a custom query
    */
  var operation: js.UndefOr[js.Array[CapabilityStatementRestOperation]] = js.native
  
  /**
    * Resource served on the REST interface
    */
  var resource: js.UndefOr[js.Array[CapabilityStatementRestResource]] = js.native
  
  /**
    * Search parameters for searching all resources
    */
  var searchParam: js.UndefOr[js.Array[CapabilityStatementRestResourceSearchParam]] = js.native
  
  /**
    * Information about security of implementation
    */
  var security: js.UndefOr[CapabilityStatementRestSecurity] = js.native
}
object CapabilityStatementRest {
  
  @scala.inline
  def apply(mode: code): CapabilityStatementRest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRest]
  }
  
  @scala.inline
  implicit class CapabilityStatementRestOps[Self <: CapabilityStatementRest] (val x: Self) extends AnyVal {
    
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
    def setMode(value: code): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_compartmentVarargs(value: Element*): Self = this.set("_compartment", js.Array(value :_*))
    
    @scala.inline
    def set_compartment(value: js.Array[Element]): Self = this.set("_compartment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_compartment: Self = this.set("_compartment", js.undefined)
    
    @scala.inline
    def set_documentation(value: Element): Self = this.set("_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_documentation: Self = this.set("_documentation", js.undefined)
    
    @scala.inline
    def set_mode(value: Element): Self = this.set("_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_mode: Self = this.set("_mode", js.undefined)
    
    @scala.inline
    def setCompartmentVarargs(value: uri*): Self = this.set("compartment", js.Array(value :_*))
    
    @scala.inline
    def setCompartment(value: js.Array[uri]): Self = this.set("compartment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompartment: Self = this.set("compartment", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    
    @scala.inline
    def setInteractionVarargs(value: CapabilityStatementRestInteraction*): Self = this.set("interaction", js.Array(value :_*))
    
    @scala.inline
    def setInteraction(value: js.Array[CapabilityStatementRestInteraction]): Self = this.set("interaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteraction: Self = this.set("interaction", js.undefined)
    
    @scala.inline
    def setOperationVarargs(value: CapabilityStatementRestOperation*): Self = this.set("operation", js.Array(value :_*))
    
    @scala.inline
    def setOperation(value: js.Array[CapabilityStatementRestOperation]): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    
    @scala.inline
    def setResourceVarargs(value: CapabilityStatementRestResource*): Self = this.set("resource", js.Array(value :_*))
    
    @scala.inline
    def setResource(value: js.Array[CapabilityStatementRestResource]): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setSearchParamVarargs(value: CapabilityStatementRestResourceSearchParam*): Self = this.set("searchParam", js.Array(value :_*))
    
    @scala.inline
    def setSearchParam(value: js.Array[CapabilityStatementRestResourceSearchParam]): Self = this.set("searchParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchParam: Self = this.set("searchParam", js.undefined)
    
    @scala.inline
    def setSecurity(value: CapabilityStatementRestSecurity): Self = this.set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
  }
}
