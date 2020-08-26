package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structural Definition
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait StructureDefinition extends DomainResource {
  /**
    * Contains extended information for property 'abstract'.
    */
  var _abstract: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'baseDefinition'.
    */
  var _baseDefinition: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'context'.
    */
  var _context: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'contextInvariant'.
    */
  var _contextInvariant: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'contextType'.
    */
  var _contextType: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'derivation'.
    */
  var _derivation: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'fhirVersion'.
    */
  var _fhirVersion: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'purpose'.
    */
  var _purpose: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  /**
    * Whether the structure is abstract
    */
  var `abstract`: Boolean = js.native
  /**
    * Definition that this type is constrained/specialized from
    */
  var baseDefinition: js.UndefOr[uri] = js.native
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  /**
    * Where the extension can be used in instances
    */
  var context: js.UndefOr[js.Array[String]] = js.native
  /**
    * FHIRPath invariants - when the extension can be used
    */
  var contextInvariant: js.UndefOr[js.Array[String]] = js.native
  /**
    * resource | datatype | extension
    */
  var contextType: js.UndefOr[code] = js.native
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.native
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.native
  /**
    * specialization | constraint - How relates to base definition
    */
  var derivation: js.UndefOr[code] = js.native
  /**
    * Natural language description of the structure definition
    */
  var description: js.UndefOr[markdown] = js.native
  /**
    * Differential view of the structure
    */
  var differential: js.UndefOr[StructureDefinitionDifferential] = js.native
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.native
  /**
    * FHIR Version this StructureDefinition targets
    */
  var fhirVersion: js.UndefOr[id] = js.native
  /**
    * Additional identifier for the structure definition
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Intended jurisdiction for structure definition (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Assist with indexing and finding
    */
  var keyword: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * primitive-type | complex-type | resource | logical
    */
  var kind: code = js.native
  /**
    * External specification that the content is mapped to
    */
  var mapping: js.UndefOr[js.Array[StructureDefinitionMapping]] = js.native
  /**
    * Name for this structure definition (computer friendly)
    */
  var name: String = js.native
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.native
  /**
    * Why this structure definition is defined
    */
  var purpose: js.UndefOr[markdown] = js.native
  /**
    * Snapshot view of the structure
    */
  var snapshot: js.UndefOr[StructureDefinitionSnapshot] = js.native
  /**
    * draft | active | retired | unknown
    */
  var status: code = js.native
  /**
    * Name for this structure definition (human friendly)
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Type defined or constrained by this structure
    */
  var `type`: code = js.native
  /**
    * Logical URI to reference this structure definition (globally unique)
    */
  var url: uri = js.native
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.native
  /**
    * Business version of the structure definition
    */
  var version: js.UndefOr[String] = js.native
}

object StructureDefinition {
  @scala.inline
  def apply(`abstract`: Boolean, kind: code, name: String, status: code, `type`: code, url: uri): StructureDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureDefinition]
  }
  @scala.inline
  implicit class StructureDefinitionOps[Self <: StructureDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbstract(value: Boolean): Self = this.set("abstract", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: code): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: uri): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def set_abstract(value: Element): Self = this.set("_abstract", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_abstract: Self = this.set("_abstract", js.undefined)
    @scala.inline
    def set_baseDefinition(value: Element): Self = this.set("_baseDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_baseDefinition: Self = this.set("_baseDefinition", js.undefined)
    @scala.inline
    def set_contextVarargs(value: Element*): Self = this.set("_context", js.Array(value :_*))
    @scala.inline
    def set_context(value: js.Array[Element]): Self = this.set("_context", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_context: Self = this.set("_context", js.undefined)
    @scala.inline
    def set_contextInvariantVarargs(value: Element*): Self = this.set("_contextInvariant", js.Array(value :_*))
    @scala.inline
    def set_contextInvariant(value: js.Array[Element]): Self = this.set("_contextInvariant", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_contextInvariant: Self = this.set("_contextInvariant", js.undefined)
    @scala.inline
    def set_contextType(value: Element): Self = this.set("_contextType", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_contextType: Self = this.set("_contextType", js.undefined)
    @scala.inline
    def set_copyright(value: Element): Self = this.set("_copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_copyright: Self = this.set("_copyright", js.undefined)
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    @scala.inline
    def set_derivation(value: Element): Self = this.set("_derivation", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_derivation: Self = this.set("_derivation", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_experimental(value: Element): Self = this.set("_experimental", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_experimental: Self = this.set("_experimental", js.undefined)
    @scala.inline
    def set_fhirVersion(value: Element): Self = this.set("_fhirVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_fhirVersion: Self = this.set("_fhirVersion", js.undefined)
    @scala.inline
    def set_kind(value: Element): Self = this.set("_kind", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_kind: Self = this.set("_kind", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def set_publisher(value: Element): Self = this.set("_publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_publisher: Self = this.set("_publisher", js.undefined)
    @scala.inline
    def set_purpose(value: Element): Self = this.set("_purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_purpose: Self = this.set("_purpose", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def set_title(value: Element): Self = this.set("_title", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_title: Self = this.set("_title", js.undefined)
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    @scala.inline
    def setBaseDefinition(value: uri): Self = this.set("baseDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseDefinition: Self = this.set("baseDefinition", js.undefined)
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = this.set("contact", js.Array(value :_*))
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = this.set("contact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    @scala.inline
    def setContextVarargs(value: String*): Self = this.set("context", js.Array(value :_*))
    @scala.inline
    def setContext(value: js.Array[String]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setContextInvariantVarargs(value: String*): Self = this.set("contextInvariant", js.Array(value :_*))
    @scala.inline
    def setContextInvariant(value: js.Array[String]): Self = this.set("contextInvariant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextInvariant: Self = this.set("contextInvariant", js.undefined)
    @scala.inline
    def setContextType(value: code): Self = this.set("contextType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextType: Self = this.set("contextType", js.undefined)
    @scala.inline
    def setCopyright(value: markdown): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDerivation(value: code): Self = this.set("derivation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDerivation: Self = this.set("derivation", js.undefined)
    @scala.inline
    def setDescription(value: markdown): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDifferential(value: StructureDefinitionDifferential): Self = this.set("differential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDifferential: Self = this.set("differential", js.undefined)
    @scala.inline
    def setExperimental(value: Boolean): Self = this.set("experimental", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    @scala.inline
    def setFhirVersion(value: id): Self = this.set("fhirVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFhirVersion: Self = this.set("fhirVersion", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = this.set("jurisdiction", js.Array(value :_*))
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    @scala.inline
    def setKeywordVarargs(value: Coding*): Self = this.set("keyword", js.Array(value :_*))
    @scala.inline
    def setKeyword(value: js.Array[Coding]): Self = this.set("keyword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyword: Self = this.set("keyword", js.undefined)
    @scala.inline
    def setMappingVarargs(value: StructureDefinitionMapping*): Self = this.set("mapping", js.Array(value :_*))
    @scala.inline
    def setMapping(value: js.Array[StructureDefinitionMapping]): Self = this.set("mapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapping: Self = this.set("mapping", js.undefined)
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    @scala.inline
    def setPurpose(value: markdown): Self = this.set("purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
    @scala.inline
    def setSnapshot(value: StructureDefinitionSnapshot): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshot: Self = this.set("snapshot", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUseContextVarargs(value: UsageContext*): Self = this.set("useContext", js.Array(value :_*))
    @scala.inline
    def setUseContext(value: js.Array[UsageContext]): Self = this.set("useContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseContext: Self = this.set("useContext", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

