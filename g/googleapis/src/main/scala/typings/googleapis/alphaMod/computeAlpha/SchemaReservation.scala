package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reservation resource
  */
@js.native
trait SchemaReservation extends StObject {
  
  /**
    * [OutputOnly] Full or partial url for parent commitment for reservations
    * which are tied to a commitment.
    */
  var commitment: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Type of the resource. Always compute#reservations for
    * reservations.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The name of the resource, provided by the client when initially creating
    * the resource. The resource name must be 1-63 characters long, and comply
    * with RFC1035. Specifically, the name must be 1-63 characters long and
    * match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the
    * first character must be a lowercase letter, and all following characters
    * must be a dash, lowercase letter, or digit, except the last character,
    * which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined fully-qualified URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  
  /**
    * Reservation for instances with specific machine shapes.
    */
  var specificReservation: js.UndefOr[SchemaAllocationSpecificSKUReservation] = js.native
  
  /**
    * Indicates whether the reservation can be consumed by VMs with &quot;any
    * reservation&quot; defined. If the field is set, then only VMs that target
    * the reservation by name using --reservation-affinity can consume this
    * reservation.
    */
  var specificReservationRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * Zone in which the reservation resides, must be provided if reservation is
    * created with commitment creation.
    */
  var zone: js.UndefOr[String] = js.native
}
object SchemaReservation {
  
  @scala.inline
  def apply(): SchemaReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReservation]
  }
  
  @scala.inline
  implicit class SchemaReservationMutableBuilder[Self <: SchemaReservation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitment(value: String): Self = StObject.set(x, "commitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitmentUndefined: Self = StObject.set(x, "commitment", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    @scala.inline
    def setSpecificReservation(value: SchemaAllocationSpecificSKUReservation): Self = StObject.set(x, "specificReservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecificReservationRequired(value: Boolean): Self = StObject.set(x, "specificReservationRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecificReservationRequiredUndefined: Self = StObject.set(x, "specificReservationRequired", js.undefined)
    
    @scala.inline
    def setSpecificReservationUndefined: Self = StObject.set(x, "specificReservation", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
