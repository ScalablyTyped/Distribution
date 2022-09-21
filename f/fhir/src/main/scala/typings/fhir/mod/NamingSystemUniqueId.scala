package typings.fhir.mod

import typings.fhir.fhirStrings.oid
import typings.fhir.fhirStrings.other
import typings.fhir.fhirStrings.uri
import typings.fhir.fhirStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamingSystemUniqueId
  extends StObject
     with BackboneElement {
  
  var _preferred: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Identifies the period of time over which this identifier is considered appropriate to refer to the naming system.  Outside of this window, the identifier might be non-deterministic.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Indicates whether this identifier is the "preferred" identifier of this type.
    */
  var preferred: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies the unique identifier scheme used for this particular identifier.
    */
  var `type`: oid | uuid | uri | other
  
  /**
    * The string that should be sent over the wire to identify the code system or identifier system.
    */
  var value: String
}
object NamingSystemUniqueId {
  
  inline def apply(`type`: oid | uuid | uri | other, value: String): NamingSystemUniqueId = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamingSystemUniqueId]
  }
  
  extension [Self <: NamingSystemUniqueId](x: Self) {
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    
    inline def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
    
    inline def setType(value: oid | uuid | uri | other): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_preferred(value: Element): Self = StObject.set(x, "_preferred", value.asInstanceOf[js.Any])
    
    inline def set_preferredUndefined: Self = StObject.set(x, "_preferred", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
