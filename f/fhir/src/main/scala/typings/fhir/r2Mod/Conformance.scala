package typings.fhir.r2Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.both
import typings.fhir.fhirStrings.capability
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.elements
import typings.fhir.fhirStrings.extensions
import typings.fhir.fhirStrings.instance
import typings.fhir.fhirStrings.no
import typings.fhir.fhirStrings.requirements_
import typings.fhir.fhirStrings.retired
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conformance
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _acceptUnknown: js.UndefOr[Element] = js.undefined
  
  var _copyright: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _experimental: js.UndefOr[Element] = js.undefined
  
  var _fhirVersion: js.UndefOr[Element] = js.undefined
  
  var _format: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _kind: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _requirements: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * A code that indicates whether the application accepts unknown elements or extensions when reading resources.
    */
  var acceptUnknown: no | extensions | elements | both
  
  /**
    * Contacts to assist a user in finding and communicating with the publisher.
    */
  var contact: js.UndefOr[js.Array[ConformanceContact]] = js.undefined
  
  /**
    * A copyright statement relating to the conformance statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * The date  (and optionally time) when the conformance statement was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the conformance statement changes.
    */
  var date: String
  
  /**
    * A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A document definition.
    */
  var document: js.UndefOr[js.Array[ConformanceDocument]] = js.undefined
  
  /**
    * A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The version of the FHIR specification on which this conformance statement is based.
    */
  var fhirVersion: String
  
  /**
    * A list of the formats supported by this implementation using their content types.
    */
  var format: js.Array[String]
  
  /**
    * Identifies a specific implementation instance that is described by the conformance statement - i.e. a particular installation, rather than the capabilities of a software program.
    */
  var implementation: js.UndefOr[ConformanceImplementation] = js.undefined
  
  /**
    * Allow searching the 3 modes.
    */
  var kind: instance | capability | requirements_
  
  /**
    * A description of the messaging capabilities of the solution.
    */
  var messaging: js.UndefOr[js.Array[ConformanceMessaging]] = js.undefined
  
  /**
    * A free text natural language name identifying the conformance statement.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A list of profiles that represent different use cases supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}.
    */
  var profile: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Helps establish the "authority/credibility" of the conformance.  May also allow for contact.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * Explains why this conformance statement is needed and why it's been constrained as it has.
    */
  var requirements: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Conformance: typings.fhir.fhirStrings.Conformance
  
  /**
    * A definition of the restful capabilities of the solution, if any.
    */
  var rest: js.UndefOr[js.Array[ConformanceRest]] = js.undefined
  
  /**
    * Software that is covered by this conformance statement.  It is used when the conformance statement describes the capabilities of a particular software version, independent of an installation.
    */
  var software: js.UndefOr[ConformanceSoftware] = js.undefined
  
  /**
    * The status of this conformance statement.
    */
  var status: js.UndefOr[draft | active | retired] = js.undefined
  
  /**
    * An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
    */
  var version: js.UndefOr[String] = js.undefined
}
object Conformance {
  
  inline def apply(
    acceptUnknown: no | extensions | elements | both,
    date: String,
    fhirVersion: String,
    format: js.Array[String],
    kind: instance | capability | requirements_
  ): Conformance = {
    val __obj = js.Dynamic.literal(acceptUnknown = acceptUnknown.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], fhirVersion = fhirVersion.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], resourceType = "Conformance")
    __obj.asInstanceOf[Conformance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Conformance] (val x: Self) extends AnyVal {
    
    inline def setAcceptUnknown(value: no | extensions | elements | both): Self = StObject.set(x, "acceptUnknown", value.asInstanceOf[js.Any])
    
    inline def setContact(value: js.Array[ConformanceContact]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ConformanceContact*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocument(value: js.Array[ConformanceDocument]): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setDocumentVarargs(value: ConformanceDocument*): Self = StObject.set(x, "document", js.Array(value*))
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setFhirVersion(value: String): Self = StObject.set(x, "fhirVersion", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: js.Array[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatVarargs(value: String*): Self = StObject.set(x, "format", js.Array(value*))
    
    inline def setImplementation(value: ConformanceImplementation): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    inline def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
    
    inline def setKind(value: instance | capability | requirements_): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMessaging(value: js.Array[ConformanceMessaging]): Self = StObject.set(x, "messaging", value.asInstanceOf[js.Any])
    
    inline def setMessagingUndefined: Self = StObject.set(x, "messaging", js.undefined)
    
    inline def setMessagingVarargs(value: ConformanceMessaging*): Self = StObject.set(x, "messaging", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProfile(value: js.Array[Reference]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setProfileVarargs(value: Reference*): Self = StObject.set(x, "profile", js.Array(value*))
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setRequirements(value: String): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Conformance): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRest(value: js.Array[ConformanceRest]): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    inline def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
    
    inline def setRestVarargs(value: ConformanceRest*): Self = StObject.set(x, "rest", js.Array(value*))
    
    inline def setSoftware(value: ConformanceSoftware): Self = StObject.set(x, "software", value.asInstanceOf[js.Any])
    
    inline def setSoftwareUndefined: Self = StObject.set(x, "software", js.undefined)
    
    inline def setStatus(value: draft | active | retired): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_acceptUnknown(value: Element): Self = StObject.set(x, "_acceptUnknown", value.asInstanceOf[js.Any])
    
    inline def set_acceptUnknownUndefined: Self = StObject.set(x, "_acceptUnknown", js.undefined)
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    inline def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    inline def set_fhirVersion(value: Element): Self = StObject.set(x, "_fhirVersion", value.asInstanceOf[js.Any])
    
    inline def set_fhirVersionUndefined: Self = StObject.set(x, "_fhirVersion", js.undefined)
    
    inline def set_format(value: js.Array[Element]): Self = StObject.set(x, "_format", value.asInstanceOf[js.Any])
    
    inline def set_formatUndefined: Self = StObject.set(x, "_format", js.undefined)
    
    inline def set_formatVarargs(value: Element*): Self = StObject.set(x, "_format", js.Array(value*))
    
    inline def set_kind(value: Element): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    
    inline def set_kindUndefined: Self = StObject.set(x, "_kind", js.undefined)
    
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
