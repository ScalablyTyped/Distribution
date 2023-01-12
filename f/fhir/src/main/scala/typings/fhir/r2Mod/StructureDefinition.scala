package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`extension`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.datatype
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.logical
import typings.fhir.fhirStrings.mapping
import typings.fhir.fhirStrings.resource
import typings.fhir.fhirStrings.retired
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructureDefinition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _abstract: js.UndefOr[Element] = js.undefined
  
  var _base: js.UndefOr[Element] = js.undefined
  
  var _constrainedType: js.UndefOr[Element] = js.undefined
  
  var _context: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _contextType: js.UndefOr[Element] = js.undefined
  
  var _copyright: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _display: js.UndefOr[Element] = js.undefined
  
  var _experimental: js.UndefOr[Element] = js.undefined
  
  var _fhirVersion: js.UndefOr[Element] = js.undefined
  
  var _kind: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _requirements: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether structure this definition describes is abstract or not  - that is, whether an actual exchanged item can ever be of this type.
    */
  var `abstract`: Boolean
  
  /**
    * An absolute URI that is the base structure from which this set of constraints is derived.
    */
  var base: js.UndefOr[String] = js.undefined
  
  /**
    * Assist in searching for appropriate StructureDefinitions.
    */
  var code: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * The type of type that is being constrained - a data type, an extension, a resource, including abstract ones. If this field is present, it indicates that the structure definition is a constraint. If it is not present, then the structure definition is the definition of a base structure.
    */
  var constrainedType: js.UndefOr[String] = js.undefined
  
  /**
    * Contacts to assist a user in finding and communicating with the publisher.
    */
  var contact: js.UndefOr[js.Array[StructureDefinitionContact]] = js.undefined
  
  /**
    * Identifies the types of resource or data type elements to which the extension can be applied.
    */
  var context: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If this is an extension, Identifies the context within FHIR resources where the extension can be used.
    */
  var contextType: js.UndefOr[resource | datatype | mapping | `extension`] = js.undefined
  
  /**
    * A copyright statement relating to the structure definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * The date this version of the structure definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the structure definition changes.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * A free text natural language description of the StructureDefinition and its use.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A differential view is expressed relative to the base StructureDefinition - a statement of differences that it applies.
    */
  var differential: js.UndefOr[StructureDefinitionDifferential] = js.undefined
  
  /**
    * Defined so that applications can use this name when displaying the value of the extension to the user.
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * Allows filtering of StructureDefinitions that are appropriate for use vs. not.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The version of the FHIR specification on which this StructureDefinition is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 1.0.2 for this version.
    */
  var fhirVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Formal identifier that is used to identify this StructureDefinition when it is represented in other formats, or referenced in a specification, model, design or an instance  (should be globally unique OID, UUID, or URI), (if it's not possible to use the literal URI).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Defines the kind of structure that this definition is describing.
    */
  var kind: datatype | resource | logical
  
  /**
    * An external specification that the content is mapped to.
    */
  var mapping: js.UndefOr[js.Array[StructureDefinitionMapping]] = js.undefined
  
  /**
    * A free text natural language name identifying the StructureDefinition.
    */
  var name: String
  
  /**
    * Helps establish the "authority/credibility" of the structure definition.  May also allow for contact.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * Explains why this structure definition is needed and why it's been constrained as it has.
    */
  var requirements: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_StructureDefinition: typings.fhir.fhirStrings.StructureDefinition
  
  /**
    * A snapshot view is expressed in a stand alone form that can be used and interpreted without considering the base StructureDefinition.
    */
  var snapshot: js.UndefOr[StructureDefinitionSnapshot] = js.undefined
  
  /**
    * Allows filtering of StructureDefinitions that are appropriate for use vs. not.
    */
  var status: draft | active | retired
  
  /**
    * So you can say, in a StructureDefinition, what the full extension URLs should be. This is required to allow hosting StructureDefinitions on multiple different servers, and to allow for the editorial process.
    */
  var url: String
  
  /**
    * Assist in searching for appropriate content.
    */
  var useContext: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * There may be multiple resource versions of the StructureDefinition that have this same identifier. The resource version id will change for technical reasons, whereas the stated version number needs to be under the author's control.
    */
  var version: js.UndefOr[String] = js.undefined
}
object StructureDefinition {
  
  inline def apply(
    `abstract`: Boolean,
    kind: datatype | resource | logical,
    name: String,
    status: draft | active | retired,
    url: String
  ): StructureDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = "StructureDefinition", status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StructureDefinition] (val x: Self) extends AnyVal {
    
    inline def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setCode(value: js.Array[Coding]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: Coding*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setConstrainedType(value: String): Self = StObject.set(x, "constrainedType", value.asInstanceOf[js.Any])
    
    inline def setConstrainedTypeUndefined: Self = StObject.set(x, "constrainedType", js.undefined)
    
    inline def setContact(value: js.Array[StructureDefinitionContact]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: StructureDefinitionContact*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setContext(value: js.Array[String]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextType(value: resource | datatype | mapping | `extension`): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
    
    inline def setContextTypeUndefined: Self = StObject.set(x, "contextType", js.undefined)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setContextVarargs(value: String*): Self = StObject.set(x, "context", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDifferential(value: StructureDefinitionDifferential): Self = StObject.set(x, "differential", value.asInstanceOf[js.Any])
    
    inline def setDifferentialUndefined: Self = StObject.set(x, "differential", js.undefined)
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setFhirVersion(value: String): Self = StObject.set(x, "fhirVersion", value.asInstanceOf[js.Any])
    
    inline def setFhirVersionUndefined: Self = StObject.set(x, "fhirVersion", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setKind(value: datatype | resource | logical): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMapping(value: js.Array[StructureDefinitionMapping]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setMappingVarargs(value: StructureDefinitionMapping*): Self = StObject.set(x, "mapping", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setRequirements(value: String): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.StructureDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: StructureDefinitionSnapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    inline def setStatus(value: draft | active | retired): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUseContext(value: js.Array[CodeableConcept]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: CodeableConcept*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_abstract(value: Element): Self = StObject.set(x, "_abstract", value.asInstanceOf[js.Any])
    
    inline def set_abstractUndefined: Self = StObject.set(x, "_abstract", js.undefined)
    
    inline def set_base(value: Element): Self = StObject.set(x, "_base", value.asInstanceOf[js.Any])
    
    inline def set_baseUndefined: Self = StObject.set(x, "_base", js.undefined)
    
    inline def set_constrainedType(value: Element): Self = StObject.set(x, "_constrainedType", value.asInstanceOf[js.Any])
    
    inline def set_constrainedTypeUndefined: Self = StObject.set(x, "_constrainedType", js.undefined)
    
    inline def set_context(value: js.Array[Element]): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
    
    inline def set_contextType(value: Element): Self = StObject.set(x, "_contextType", value.asInstanceOf[js.Any])
    
    inline def set_contextTypeUndefined: Self = StObject.set(x, "_contextType", js.undefined)
    
    inline def set_contextUndefined: Self = StObject.set(x, "_context", js.undefined)
    
    inline def set_contextVarargs(value: Element*): Self = StObject.set(x, "_context", js.Array(value*))
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    inline def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
    
    inline def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    inline def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    inline def set_fhirVersion(value: Element): Self = StObject.set(x, "_fhirVersion", value.asInstanceOf[js.Any])
    
    inline def set_fhirVersionUndefined: Self = StObject.set(x, "_fhirVersion", js.undefined)
    
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
