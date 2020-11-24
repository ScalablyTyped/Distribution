package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines behaviour and contraints on the ValueSet Expansion operation
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ExpansionProfile extends DomainResource {
  
  /**
    * Contains extended information for property 'activeOnly'.
    */
  var _activeOnly: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'displayLanguage'.
    */
  var _displayLanguage: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'excludeNested'.
    */
  var _excludeNested: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'excludeNotForUI'.
    */
  var _excludeNotForUI: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'excludePostCoordinated'.
    */
  var _excludePostCoordinated: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'includeDefinition'.
    */
  var _includeDefinition: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'includeDesignations'.
    */
  var _includeDesignations: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'limitedExpansion'.
    */
  var _limitedExpansion: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  
  /**
    * Include or exclude inactive concepts in the expansion
    */
  var activeOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.native
  
  /**
    * Natural language description of the expansion profile
    */
  var description: js.UndefOr[markdown] = js.native
  
  /**
    * When the expansion profile imposes designation contraints
    */
  var designation: js.UndefOr[ExpansionProfileDesignation] = js.native
  
  /**
    * Specify the language for the display element of codes in the value set expansion
    */
  var displayLanguage: js.UndefOr[code] = js.native
  
  /**
    * Nested codes in the expansion or not
    */
  var excludeNested: js.UndefOr[Boolean] = js.native
  
  /**
    * Include or exclude codes which cannot be rendered in user interfaces in the value set expansion
    */
  var excludeNotForUI: js.UndefOr[Boolean] = js.native
  
  /**
    * Include or exclude codes which are post coordinated expressions in the value set expansion
    */
  var excludePostCoordinated: js.UndefOr[Boolean] = js.native
  
  /**
    * Systems/Versions to be exclude
    */
  var excludedSystem: js.UndefOr[ExpansionProfileExcludedSystem] = js.native
  
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.native
  
  /**
    * Fix use of a code system to a particular version
    */
  var fixedVersion: js.UndefOr[js.Array[ExpansionProfileFixedVersion]] = js.native
  
  /**
    * Additional identifier for the expansion profile
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Include or exclude the value set definition in the expansion
    */
  var includeDefinition: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the expansion should include concept designations
    */
  var includeDesignations: js.UndefOr[Boolean] = js.native
  
  /**
    * Intended jurisdiction for expansion profile (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Controls behaviour of the value set expand operation when value sets are too large to be completely expanded
    */
  var limitedExpansion: js.UndefOr[Boolean] = js.native
  
  /**
    * Name for this expansion profile (computer friendly)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.native
  
  /**
    * draft | active | retired | unknown
    */
  var status: code = js.native
  
  /**
    * Logical URI to reference this expansion profile (globally unique)
    */
  var url: js.UndefOr[uri] = js.native
  
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.native
  
  /**
    * Business version of the expansion profile
    */
  var version: js.UndefOr[String] = js.native
}
object ExpansionProfile {
  
  @scala.inline
  def apply(status: code): ExpansionProfile = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpansionProfile]
  }
  
  @scala.inline
  implicit class ExpansionProfileOps[Self <: ExpansionProfile] (val x: Self) extends AnyVal {
    
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
    def set_activeOnly(value: Element): Self = this.set("_activeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_activeOnly: Self = this.set("_activeOnly", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_displayLanguage(value: Element): Self = this.set("_displayLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_displayLanguage: Self = this.set("_displayLanguage", js.undefined)
    
    @scala.inline
    def set_excludeNested(value: Element): Self = this.set("_excludeNested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_excludeNested: Self = this.set("_excludeNested", js.undefined)
    
    @scala.inline
    def set_excludeNotForUI(value: Element): Self = this.set("_excludeNotForUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_excludeNotForUI: Self = this.set("_excludeNotForUI", js.undefined)
    
    @scala.inline
    def set_excludePostCoordinated(value: Element): Self = this.set("_excludePostCoordinated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_excludePostCoordinated: Self = this.set("_excludePostCoordinated", js.undefined)
    
    @scala.inline
    def set_experimental(value: Element): Self = this.set("_experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_experimental: Self = this.set("_experimental", js.undefined)
    
    @scala.inline
    def set_includeDefinition(value: Element): Self = this.set("_includeDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_includeDefinition: Self = this.set("_includeDefinition", js.undefined)
    
    @scala.inline
    def set_includeDesignations(value: Element): Self = this.set("_includeDesignations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_includeDesignations: Self = this.set("_includeDesignations", js.undefined)
    
    @scala.inline
    def set_limitedExpansion(value: Element): Self = this.set("_limitedExpansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_limitedExpansion: Self = this.set("_limitedExpansion", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    
    @scala.inline
    def set_publisher(value: Element): Self = this.set("_publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_publisher: Self = this.set("_publisher", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    
    @scala.inline
    def setActiveOnly(value: Boolean): Self = this.set("activeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveOnly: Self = this.set("activeOnly", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = this.set("contact", js.Array(value :_*))
    
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = this.set("contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDescription(value: markdown): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDesignation(value: ExpansionProfileDesignation): Self = this.set("designation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesignation: Self = this.set("designation", js.undefined)
    
    @scala.inline
    def setDisplayLanguage(value: code): Self = this.set("displayLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLanguage: Self = this.set("displayLanguage", js.undefined)
    
    @scala.inline
    def setExcludeNested(value: Boolean): Self = this.set("excludeNested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeNested: Self = this.set("excludeNested", js.undefined)
    
    @scala.inline
    def setExcludeNotForUI(value: Boolean): Self = this.set("excludeNotForUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeNotForUI: Self = this.set("excludeNotForUI", js.undefined)
    
    @scala.inline
    def setExcludePostCoordinated(value: Boolean): Self = this.set("excludePostCoordinated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludePostCoordinated: Self = this.set("excludePostCoordinated", js.undefined)
    
    @scala.inline
    def setExcludedSystem(value: ExpansionProfileExcludedSystem): Self = this.set("excludedSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedSystem: Self = this.set("excludedSystem", js.undefined)
    
    @scala.inline
    def setExperimental(value: Boolean): Self = this.set("experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    
    @scala.inline
    def setFixedVersionVarargs(value: ExpansionProfileFixedVersion*): Self = this.set("fixedVersion", js.Array(value :_*))
    
    @scala.inline
    def setFixedVersion(value: js.Array[ExpansionProfileFixedVersion]): Self = this.set("fixedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedVersion: Self = this.set("fixedVersion", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setIncludeDefinition(value: Boolean): Self = this.set("includeDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDefinition: Self = this.set("includeDefinition", js.undefined)
    
    @scala.inline
    def setIncludeDesignations(value: Boolean): Self = this.set("includeDesignations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDesignations: Self = this.set("includeDesignations", js.undefined)
    
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = this.set("jurisdiction", js.Array(value :_*))
    
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    
    @scala.inline
    def setLimitedExpansion(value: Boolean): Self = this.set("limitedExpansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitedExpansion: Self = this.set("limitedExpansion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    
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
