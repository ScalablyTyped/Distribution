package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of codes drawn from one or more code systems
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ValueSet extends DomainResource {
  
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.native
  
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
    * Contains extended information for property 'extensible'.
    */
  var _extensible: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'immutable'.
    */
  var _immutable: js.UndefOr[Element] = js.native
  
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
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  
  /**
    * Definition of the content of the value set (CLD)
    */
  var compose: js.UndefOr[ValueSetCompose] = js.native
  
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.native
  
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.native
  
  /**
    * Natural language description of the value set
    */
  var description: js.UndefOr[markdown] = js.native
  
  /**
    * Used when the value set is "expanded"
    */
  var expansion: js.UndefOr[ValueSetExpansion] = js.native
  
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this is intended to be used with an extensible binding
    */
  var extensible: js.UndefOr[Boolean] = js.native
  
  /**
    * Additional identifier for the value set
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Indicates whether or not any change to the content logical definition may occur
    */
  var immutable: js.UndefOr[Boolean] = js.native
  
  /**
    * Intended jurisdiction for value set (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Name for this value set (computer friendly)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.native
  
  /**
    * Why this value set is defined
    */
  var purpose: js.UndefOr[markdown] = js.native
  
  /**
    * draft | active | retired | unknown
    */
  var status: code = js.native
  
  /**
    * Name for this value set (human friendly)
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Logical URI to reference this value set (globally unique)
    */
  var url: js.UndefOr[uri] = js.native
  
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.native
  
  /**
    * Business version of the value set
    */
  var version: js.UndefOr[String] = js.native
}
object ValueSet {
  
  @scala.inline
  def apply(status: code): ValueSet = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSet]
  }
  
  @scala.inline
  implicit class ValueSetOps[Self <: ValueSet] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_copyright(value: Element): Self = this.set("_copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_copyright: Self = this.set("_copyright", js.undefined)
    
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
    def set_extensible(value: Element): Self = this.set("_extensible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_extensible: Self = this.set("_extensible", js.undefined)
    
    @scala.inline
    def set_immutable(value: Element): Self = this.set("_immutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_immutable: Self = this.set("_immutable", js.undefined)
    
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
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    
    @scala.inline
    def setCompose(value: ValueSetCompose): Self = this.set("compose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompose: Self = this.set("compose", js.undefined)
    
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
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDescription(value: markdown): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExpansion(value: ValueSetExpansion): Self = this.set("expansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpansion: Self = this.set("expansion", js.undefined)
    
    @scala.inline
    def setExperimental(value: Boolean): Self = this.set("experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    
    @scala.inline
    def setExtensible(value: Boolean): Self = this.set("extensible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensible: Self = this.set("extensible", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setImmutable(value: Boolean): Self = this.set("immutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmutable: Self = this.set("immutable", js.undefined)
    
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
