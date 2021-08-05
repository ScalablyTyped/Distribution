package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structural Definition
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait StructureDefinition
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'abstract'.
    */
  var _abstract: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'baseDefinition'.
    */
  var _baseDefinition: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'context'.
    */
  var _context: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'contextInvariant'.
    */
  var _contextInvariant: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'contextType'.
    */
  var _contextType: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'derivation'.
    */
  var _derivation: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'fhirVersion'.
    */
  var _fhirVersion: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'purpose'.
    */
  var _purpose: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether the structure is abstract
    */
  var `abstract`: Boolean
  
  /**
    * Definition that this type is constrained/specialized from
    */
  var baseDefinition: js.UndefOr[uri] = js.undefined
  
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Where the extension can be used in instances
    */
  var context: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * FHIRPath invariants - when the extension can be used
    */
  var contextInvariant: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * resource | datatype | extension
    */
  var contextType: js.UndefOr[code] = js.undefined
  
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.undefined
  
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  
  /**
    * specialization | constraint - How relates to base definition
    */
  var derivation: js.UndefOr[code] = js.undefined
  
  /**
    * Natural language description of the structure definition
    */
  var description: js.UndefOr[markdown] = js.undefined
  
  /**
    * Differential view of the structure
    */
  var differential: js.UndefOr[StructureDefinitionDifferential] = js.undefined
  
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * FHIR Version this StructureDefinition targets
    */
  var fhirVersion: js.UndefOr[id] = js.undefined
  
  /**
    * Additional identifier for the structure definition
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Intended jurisdiction for structure definition (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Assist with indexing and finding
    */
  var keyword: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * primitive-type | complex-type | resource | logical
    */
  var kind: code
  
  /**
    * External specification that the content is mapped to
    */
  var mapping: js.UndefOr[js.Array[StructureDefinitionMapping]] = js.undefined
  
  /**
    * Name for this structure definition (computer friendly)
    */
  var name: String
  
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * Why this structure definition is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  
  /**
    * Snapshot view of the structure
    */
  var snapshot: js.UndefOr[StructureDefinitionSnapshot] = js.undefined
  
  /**
    * draft | active | retired | unknown
    */
  var status: code
  
  /**
    * Name for this structure definition (human friendly)
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Type defined or constrained by this structure
    */
  var `type`: code
  
  /**
    * Logical URI to reference this structure definition (globally unique)
    */
  var url: uri
  
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * Business version of the structure definition
    */
  var version: js.UndefOr[String] = js.undefined
}
object StructureDefinition {
  
  inline def apply(`abstract`: Boolean, kind: code, name: String, status: code, `type`: code, url: uri): StructureDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureDefinition]
  }
  
  extension [Self <: StructureDefinition](x: Self) {
    
    inline def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setBaseDefinition(value: uri): Self = StObject.set(x, "baseDefinition", value.asInstanceOf[js.Any])
    
    inline def setBaseDefinitionUndefined: Self = StObject.set(x, "baseDefinition", js.undefined)
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    inline def setContext(value: js.Array[String]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextInvariant(value: js.Array[String]): Self = StObject.set(x, "contextInvariant", value.asInstanceOf[js.Any])
    
    inline def setContextInvariantUndefined: Self = StObject.set(x, "contextInvariant", js.undefined)
    
    inline def setContextInvariantVarargs(value: String*): Self = StObject.set(x, "contextInvariant", js.Array(value :_*))
    
    inline def setContextType(value: code): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
    
    inline def setContextTypeUndefined: Self = StObject.set(x, "contextType", js.undefined)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setContextVarargs(value: String*): Self = StObject.set(x, "context", js.Array(value :_*))
    
    inline def setCopyright(value: markdown): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDerivation(value: code): Self = StObject.set(x, "derivation", value.asInstanceOf[js.Any])
    
    inline def setDerivationUndefined: Self = StObject.set(x, "derivation", js.undefined)
    
    inline def setDescription(value: markdown): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDifferential(value: StructureDefinitionDifferential): Self = StObject.set(x, "differential", value.asInstanceOf[js.Any])
    
    inline def setDifferentialUndefined: Self = StObject.set(x, "differential", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setFhirVersion(value: id): Self = StObject.set(x, "fhirVersion", value.asInstanceOf[js.Any])
    
    inline def setFhirVersionUndefined: Self = StObject.set(x, "fhirVersion", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value :_*))
    
    inline def setKeyword(value: js.Array[Coding]): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    inline def setKeywordVarargs(value: Coding*): Self = StObject.set(x, "keyword", js.Array(value :_*))
    
    inline def setKind(value: code): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMapping(value: js.Array[StructureDefinitionMapping]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setMappingVarargs(value: StructureDefinitionMapping*): Self = StObject.set(x, "mapping", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setPurpose(value: markdown): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setSnapshot(value: StructureDefinitionSnapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: uri): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value :_*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_abstract(value: Element): Self = StObject.set(x, "_abstract", value.asInstanceOf[js.Any])
    
    inline def set_abstractUndefined: Self = StObject.set(x, "_abstract", js.undefined)
    
    inline def set_baseDefinition(value: Element): Self = StObject.set(x, "_baseDefinition", value.asInstanceOf[js.Any])
    
    inline def set_baseDefinitionUndefined: Self = StObject.set(x, "_baseDefinition", js.undefined)
    
    inline def set_context(value: js.Array[Element]): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
    
    inline def set_contextInvariant(value: js.Array[Element]): Self = StObject.set(x, "_contextInvariant", value.asInstanceOf[js.Any])
    
    inline def set_contextInvariantUndefined: Self = StObject.set(x, "_contextInvariant", js.undefined)
    
    inline def set_contextInvariantVarargs(value: Element*): Self = StObject.set(x, "_contextInvariant", js.Array(value :_*))
    
    inline def set_contextType(value: Element): Self = StObject.set(x, "_contextType", value.asInstanceOf[js.Any])
    
    inline def set_contextTypeUndefined: Self = StObject.set(x, "_contextType", js.undefined)
    
    inline def set_contextUndefined: Self = StObject.set(x, "_context", js.undefined)
    
    inline def set_contextVarargs(value: Element*): Self = StObject.set(x, "_context", js.Array(value :_*))
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_derivation(value: Element): Self = StObject.set(x, "_derivation", value.asInstanceOf[js.Any])
    
    inline def set_derivationUndefined: Self = StObject.set(x, "_derivation", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
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
    
    inline def set_purpose(value: Element): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    inline def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
