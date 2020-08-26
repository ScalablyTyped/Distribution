package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of codes drawn from one or more code systems
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait CodeSystem extends DomainResource {
  /**
    * Contains extended information for property 'caseSensitive'.
    */
  var _caseSensitive: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'compositional'.
    */
  var _compositional: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'content'.
    */
  var _content: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'count'.
    */
  var _count: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'hierarchyMeaning'.
    */
  var _hierarchyMeaning: js.UndefOr[Element] = js.native
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
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueSet'.
    */
  var _valueSet: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'versionNeeded'.
    */
  var _versionNeeded: js.UndefOr[Element] = js.native
  /**
    * If code comparison is case sensitive
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * If code system defines a post-composition grammar
    */
  var compositional: js.UndefOr[Boolean] = js.native
  /**
    * Concepts in the code system
    */
  var concept: js.UndefOr[js.Array[CodeSystemConcept]] = js.native
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  /**
    * not-present | example | fragment | complete
    */
  var content: code = js.native
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.native
  /**
    * Total concepts in the code system
    */
  var count: js.UndefOr[unsignedInt] = js.native
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.native
  /**
    * Natural language description of the code system
    */
  var description: js.UndefOr[markdown] = js.native
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.native
  /**
    * Filter that can be used in a value set
    */
  var filter: js.UndefOr[js.Array[CodeSystemFilter]] = js.native
  /**
    * grouped-by | is-a | part-of | classified-with
    */
  var hierarchyMeaning: js.UndefOr[code] = js.native
  /**
    * Additional identifier for the code system
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Intended jurisdiction for code system (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Name for this code system (computer friendly)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Additional information supplied about each concept
    */
  var property: js.UndefOr[js.Array[CodeSystemProperty]] = js.native
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.native
  /**
    * Why this code system is defined
    */
  var purpose: js.UndefOr[markdown] = js.native
  /**
    * draft | active | retired | unknown
    */
  var status: code = js.native
  /**
    * Name for this code system (human friendly)
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Logical URI to reference this code system (globally unique) (Coding.system)
    */
  var url: js.UndefOr[uri] = js.native
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.native
  /**
    * Canonical URL for value set with entire code system
    */
  var valueSet: js.UndefOr[uri] = js.native
  /**
    * Business version of the code system (Coding.version)
    */
  var version: js.UndefOr[String] = js.native
  /**
    * If definitions are not stable
    */
  var versionNeeded: js.UndefOr[Boolean] = js.native
}

object CodeSystem {
  @scala.inline
  def apply(content: code, status: code): CodeSystem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSystem]
  }
  @scala.inline
  implicit class CodeSystemOps[Self <: CodeSystem] (val x: Self) extends AnyVal {
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
    def setContent(value: code): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def set_caseSensitive(value: Element): Self = this.set("_caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_caseSensitive: Self = this.set("_caseSensitive", js.undefined)
    @scala.inline
    def set_compositional(value: Element): Self = this.set("_compositional", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_compositional: Self = this.set("_compositional", js.undefined)
    @scala.inline
    def set_content(value: Element): Self = this.set("_content", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_content: Self = this.set("_content", js.undefined)
    @scala.inline
    def set_copyright(value: Element): Self = this.set("_copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_copyright: Self = this.set("_copyright", js.undefined)
    @scala.inline
    def set_count(value: Element): Self = this.set("_count", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_count: Self = this.set("_count", js.undefined)
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_experimental(value: Element): Self = this.set("_experimental", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_experimental: Self = this.set("_experimental", js.undefined)
    @scala.inline
    def set_hierarchyMeaning(value: Element): Self = this.set("_hierarchyMeaning", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_hierarchyMeaning: Self = this.set("_hierarchyMeaning", js.undefined)
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
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    @scala.inline
    def set_valueSet(value: Element): Self = this.set("_valueSet", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueSet: Self = this.set("_valueSet", js.undefined)
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    @scala.inline
    def set_versionNeeded(value: Element): Self = this.set("_versionNeeded", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_versionNeeded: Self = this.set("_versionNeeded", js.undefined)
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setCompositional(value: Boolean): Self = this.set("compositional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompositional: Self = this.set("compositional", js.undefined)
    @scala.inline
    def setConceptVarargs(value: CodeSystemConcept*): Self = this.set("concept", js.Array(value :_*))
    @scala.inline
    def setConcept(value: js.Array[CodeSystemConcept]): Self = this.set("concept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcept: Self = this.set("concept", js.undefined)
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = this.set("contact", js.Array(value :_*))
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = this.set("contact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    @scala.inline
    def setCopyright(value: markdown): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setCount(value: unsignedInt): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDescription(value: markdown): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExperimental(value: Boolean): Self = this.set("experimental", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    @scala.inline
    def setFilterVarargs(value: CodeSystemFilter*): Self = this.set("filter", js.Array(value :_*))
    @scala.inline
    def setFilter(value: js.Array[CodeSystemFilter]): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setHierarchyMeaning(value: code): Self = this.set("hierarchyMeaning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHierarchyMeaning: Self = this.set("hierarchyMeaning", js.undefined)
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = this.set("jurisdiction", js.Array(value :_*))
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPropertyVarargs(value: CodeSystemProperty*): Self = this.set("property", js.Array(value :_*))
    @scala.inline
    def setProperty(value: js.Array[CodeSystemProperty]): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    @scala.inline
    def setPurpose(value: markdown): Self = this.set("purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUrl(value: uri): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUseContextVarargs(value: UsageContext*): Self = this.set("useContext", js.Array(value :_*))
    @scala.inline
    def setUseContext(value: js.Array[UsageContext]): Self = this.set("useContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseContext: Self = this.set("useContext", js.undefined)
    @scala.inline
    def setValueSet(value: uri): Self = this.set("valueSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueSet: Self = this.set("valueSet", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVersionNeeded(value: Boolean): Self = this.set("versionNeeded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionNeeded: Self = this.set("versionNeeded", js.undefined)
  }
  
}

