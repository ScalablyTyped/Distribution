package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`iri-stem`
import typings.fhir.fhirStrings.oid
import typings.fhir.fhirStrings.other
import typings.fhir.fhirStrings.uri
import typings.fhir.fhirStrings.uuid
import typings.fhir.fhirStrings.v2csmnemonic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamingSystemUniqueId
  extends StObject
     with BackboneElement {
  
  var _authoritative: js.UndefOr[Element] = js.undefined
  
  var _comment: js.UndefOr[Element] = js.undefined
  
  var _preferred: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates whether this identifier ie endorsed by the official owner of the associated naming system.
    */
  var authoritative: js.UndefOr[Boolean] = js.undefined
  
  /**
    * e.g. "must be used in Germany" or "was initially published in error with this value".
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Within a registry, a given identifier should only be "active" for a single namespace at a time.  (Ideally, an identifier should only ever be associated with a single namespace across all time).
    * The nuance of identifier deprecation is not represented with a separate element. When a determination is made that an identifier should not be used, the validity period end date is updated with the date the identifier is deemed to be deprecated. The identifier should no longer be used once the period end date is reached.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Indicates whether this identifier is the "preferred" identifier of this type.
    */
  var preferred: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Different identifier types may be used in different types of communications (OIDs for v3, URIs for FHIR, etc.).  Other includes RUIDs from v3, standard v2 code name strings, etc. Preferred identifiers for the same identifier type SHOULD NOT overlap by period.
    */
  var `type`: oid | uuid | uri | `iri-stem` | v2csmnemonic | other
  
  /**
    * If the value is a URI intended for use as FHIR system identifier, the URI should not contain "\" or "?" or "," since this makes escaping very difficult.
    */
  var value: String
}
object NamingSystemUniqueId {
  
  inline def apply(`type`: oid | uuid | uri | `iri-stem` | v2csmnemonic | other, value: String): NamingSystemUniqueId = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamingSystemUniqueId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamingSystemUniqueId] (val x: Self) extends AnyVal {
    
    inline def setAuthoritative(value: Boolean): Self = StObject.set(x, "authoritative", value.asInstanceOf[js.Any])
    
    inline def setAuthoritativeUndefined: Self = StObject.set(x, "authoritative", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    
    inline def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
    
    inline def setType(value: oid | uuid | uri | `iri-stem` | v2csmnemonic | other): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_authoritative(value: Element): Self = StObject.set(x, "_authoritative", value.asInstanceOf[js.Any])
    
    inline def set_authoritativeUndefined: Self = StObject.set(x, "_authoritative", js.undefined)
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    inline def set_preferred(value: Element): Self = StObject.set(x, "_preferred", value.asInstanceOf[js.Any])
    
    inline def set_preferredUndefined: Self = StObject.set(x, "_preferred", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
