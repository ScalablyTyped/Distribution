package typings.fhir.r2Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.retired
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSet
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _copyright: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _experimental: js.UndefOr[Element] = js.undefined
  
  var _extensible: js.UndefOr[Element] = js.undefined
  
  var _immutable: js.UndefOr[Element] = js.undefined
  
  var _lockedDate: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _requirements: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * A definition of a code system, inlined into the value set (as a packaging convenience). Note that the inline code system may be used from other value sets by referring to its (codeSystem.system) directly.
    */
  var codeSystem: js.UndefOr[ValueSetCodeSystem] = js.undefined
  
  /**
    * A set of criteria that provide the content logical definition of the value set by including or excluding codes from outside this value set.
    */
  var compose: js.UndefOr[ValueSetCompose] = js.undefined
  
  /**
    * Contacts to assist a user in finding and communicating with the publisher.
    */
  var contact: js.UndefOr[js.Array[ValueSetContact]] = js.undefined
  
  /**
    * A copyright statement relating to the value set and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the value set.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * Need to know when a value set was first legal for use or became withdrawn or replaced.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Human understandability.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A value set can also be "expanded", where the value set is turned into a simple collection of enumerated codes. This element holds the expansion, if it has been performed.
    */
  var expansion: js.UndefOr[ValueSetExpansion] = js.undefined
  
  /**
    * This valueset was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * It is not required to say whether this intent applies.
    */
  var extensible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Formal identifier that is used to identify this value set when it is represented in other formats, or referenced in a specification, model, design or an instance.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * If this is set to 'true', then no new versions of the content logical definition can be created.  Note: Other metadata might still change.
    */
  var immutable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If a locked date is defined, then the Content Logical Definition must be evaluated using the current version of all referenced code system(s) and value set instances as of the locked date.
    */
  var lockedDate: js.UndefOr[String] = js.undefined
  
  /**
    * Support human navigation.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Helps establish the "authority/credibility" of the value set.  May also allow for contact.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * Explains why this value set is needed and why it has been constrained as it has.
    */
  var requirements: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ValueSet: typings.fhir.fhirStrings.ValueSet
  
  /**
    * Identify when/if the value set should be used.
    */
  var status: draft | active | retired
  
  /**
    * An absolute URL that is used to identify this value set when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this value set is (or will be) published.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Assist in searching for appropriate content.
    */
  var useContext: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Used to identify this version of the value set when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
    */
  var version: js.UndefOr[String] = js.undefined
}
object ValueSet {
  
  inline def apply(status: draft | active | retired): ValueSet = {
    val __obj = js.Dynamic.literal(resourceType = "ValueSet", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueSet] (val x: Self) extends AnyVal {
    
    inline def setCodeSystem(value: ValueSetCodeSystem): Self = StObject.set(x, "codeSystem", value.asInstanceOf[js.Any])
    
    inline def setCodeSystemUndefined: Self = StObject.set(x, "codeSystem", js.undefined)
    
    inline def setCompose(value: ValueSetCompose): Self = StObject.set(x, "compose", value.asInstanceOf[js.Any])
    
    inline def setComposeUndefined: Self = StObject.set(x, "compose", js.undefined)
    
    inline def setContact(value: js.Array[ValueSetContact]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ValueSetContact*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpansion(value: ValueSetExpansion): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
    
    inline def setExpansionUndefined: Self = StObject.set(x, "expansion", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setExtensible(value: Boolean): Self = StObject.set(x, "extensible", value.asInstanceOf[js.Any])
    
    inline def setExtensibleUndefined: Self = StObject.set(x, "extensible", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
    
    inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
    
    inline def setLockedDate(value: String): Self = StObject.set(x, "lockedDate", value.asInstanceOf[js.Any])
    
    inline def setLockedDateUndefined: Self = StObject.set(x, "lockedDate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setRequirements(value: String): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ValueSet): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | retired): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseContext(value: js.Array[CodeableConcept]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: CodeableConcept*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    inline def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    inline def set_extensible(value: Element): Self = StObject.set(x, "_extensible", value.asInstanceOf[js.Any])
    
    inline def set_extensibleUndefined: Self = StObject.set(x, "_extensible", js.undefined)
    
    inline def set_immutable(value: Element): Self = StObject.set(x, "_immutable", value.asInstanceOf[js.Any])
    
    inline def set_immutableUndefined: Self = StObject.set(x, "_immutable", js.undefined)
    
    inline def set_lockedDate(value: Element): Self = StObject.set(x, "_lockedDate", value.asInstanceOf[js.Any])
    
    inline def set_lockedDateUndefined: Self = StObject.set(x, "_lockedDate", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    inline def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    inline def set_requirements(value: Element): Self = StObject.set(x, "_requirements", value.asInstanceOf[js.Any])
    
    inline def set_requirementsUndefined: Self = StObject.set(x, "_requirements", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
