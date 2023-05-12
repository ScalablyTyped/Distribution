package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryItemResponsibleOrganization
  extends StObject
     with BackboneElement {
  
  /**
    * An organization that has an association with the item, e.g. manufacturer, distributor, responsible, etc.
    */
  var organization: Reference
  
  /**
    * The role of the organization e.g. manufacturer, distributor, etc.
    */
  var role: CodeableConcept
}
object InventoryItemResponsibleOrganization {
  
  inline def apply(organization: Reference, role: CodeableConcept): InventoryItemResponsibleOrganization = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryItemResponsibleOrganization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryItemResponsibleOrganization] (val x: Self) extends AnyVal {
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
