package typings.fhir.r2Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.codesystem_
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.identifier
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamingSystem
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _kind: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _responsible: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _usage: js.UndefOr[Element] = js.undefined
  
  /**
    * Contacts to assist a user in finding and communicating with the publisher.
    */
  var contact: js.UndefOr[js.Array[NamingSystemContact]] = js.undefined
  
  /**
    * The date  (and optionally time) when the system was registered or published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the registration changes.
    */
  var date: String
  
  /**
    * Details about what the namespace identifies including scope, granularity, version labeling, etc.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the purpose for the naming system - what kinds of things does it make unique?
    */
  var kind: codesystem_ | identifier | root
  
  /**
    * The descriptive name of this particular identifier type or code system.
    */
  var name: String
  
  /**
    * Helps establish the "authority/credibility" of the naming system.  May also allow for contact.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * For naming systems that are retired, indicates the naming system that should be used in their place (if any).
    */
  var replacedBy: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_NamingSystem: typings.fhir.fhirStrings.NamingSystem
  
  /**
    * The name of the organization that is responsible for issuing identifiers or codes for this namespace and ensuring their non-collision.
    */
  var responsible: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the naming system is "ready for use" or not.
    */
  var status: draft | active | retired
  
  /**
    * Categorizes a naming system for easier search by grouping related naming systems.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Indicates how the system may be identified when referenced in electronic exchange.
    */
  var uniqueId: js.Array[NamingSystemUniqueId]
  
  /**
    * Provides guidance on the use of the namespace, including the handling of formatting characters, use of upper vs. lower case, etc.
    */
  var usage: js.UndefOr[String] = js.undefined
  
  /**
    * Assist in searching for appropriate content.
    */
  var useContext: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object NamingSystem {
  
  inline def apply(
    date: String,
    kind: codesystem_ | identifier | root,
    name: String,
    status: draft | active | retired,
    uniqueId: js.Array[NamingSystemUniqueId]
  ): NamingSystem = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = "NamingSystem", status = status.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamingSystem]
  }
  
  extension [Self <: NamingSystem](x: Self) {
    
    inline def setContact(value: js.Array[NamingSystemContact]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: NamingSystemContact*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKind(value: codesystem_ | identifier | root): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setReplacedBy(value: Reference): Self = StObject.set(x, "replacedBy", value.asInstanceOf[js.Any])
    
    inline def setReplacedByUndefined: Self = StObject.set(x, "replacedBy", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.NamingSystem): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResponsible(value: String): Self = StObject.set(x, "responsible", value.asInstanceOf[js.Any])
    
    inline def setResponsibleUndefined: Self = StObject.set(x, "responsible", js.undefined)
    
    inline def setStatus(value: draft | active | retired): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUniqueId(value: js.Array[NamingSystemUniqueId]): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    inline def setUniqueIdVarargs(value: NamingSystemUniqueId*): Self = StObject.set(x, "uniqueId", js.Array(value*))
    
    inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    
    inline def setUseContext(value: js.Array[CodeableConcept]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: CodeableConcept*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_kind(value: Element): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    
    inline def set_kindUndefined: Self = StObject.set(x, "_kind", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    inline def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    inline def set_responsible(value: Element): Self = StObject.set(x, "_responsible", value.asInstanceOf[js.Any])
    
    inline def set_responsibleUndefined: Self = StObject.set(x, "_responsible", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_usage(value: Element): Self = StObject.set(x, "_usage", value.asInstanceOf[js.Any])
    
    inline def set_usageUndefined: Self = StObject.set(x, "_usage", js.undefined)
  }
}
