package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFutureReservation extends StObject {
  
  /**
    * [Output Only] The creation timestamp for this future reservation in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you create the future reservation.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] A unique identifier for this future reservation. The server defines this identifier.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#futureReservation for future reservations.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name prefix for the reservations to be created at the time of delivery. The name prefix must comply with RFC1035. Maximum allowed length for name prefix is 20. Automatically created reservations name format will be -date-####.
    */
  var namePrefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Planning state before being submitted for evaluation
    */
  var planningStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined fully-qualified URL for this resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of Projects/Folders to share with.
    */
  var shareSettings: js.UndefOr[SchemaShareSettings] = js.undefined
  
  /**
    * Future Reservation configuration to indicate instance properties and total count.
    */
  var specificSkuProperties: js.UndefOr[SchemaFutureReservationSpecificSKUProperties] = js.undefined
  
  /**
    * [Output only] Status of the Future Reservation
    */
  var status: js.UndefOr[SchemaFutureReservationStatus] = js.undefined
  
  /**
    * Time window for this Future Reservation.
    */
  var timeWindow: js.UndefOr[SchemaFutureReservationTimeWindow] = js.undefined
  
  /**
    * [Output Only] URL of the Zone where this future reservation resides.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaFutureReservation {
  
  inline def apply(): SchemaFutureReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFutureReservation]
  }
  
  extension [Self <: SchemaFutureReservation](x: Self) {
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixNull: Self = StObject.set(x, "namePrefix", null)
    
    inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlanningStatus(value: String): Self = StObject.set(x, "planningStatus", value.asInstanceOf[js.Any])
    
    inline def setPlanningStatusNull: Self = StObject.set(x, "planningStatus", null)
    
    inline def setPlanningStatusUndefined: Self = StObject.set(x, "planningStatus", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkWithIdNull: Self = StObject.set(x, "selfLinkWithId", null)
    
    inline def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    inline def setShareSettings(value: SchemaShareSettings): Self = StObject.set(x, "shareSettings", value.asInstanceOf[js.Any])
    
    inline def setShareSettingsUndefined: Self = StObject.set(x, "shareSettings", js.undefined)
    
    inline def setSpecificSkuProperties(value: SchemaFutureReservationSpecificSKUProperties): Self = StObject.set(x, "specificSkuProperties", value.asInstanceOf[js.Any])
    
    inline def setSpecificSkuPropertiesUndefined: Self = StObject.set(x, "specificSkuProperties", js.undefined)
    
    inline def setStatus(value: SchemaFutureReservationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTimeWindow(value: SchemaFutureReservationTimeWindow): Self = StObject.set(x, "timeWindow", value.asInstanceOf[js.Any])
    
    inline def setTimeWindowUndefined: Self = StObject.set(x, "timeWindow", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
