package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines behaviour and contraints on the ValueSet Expansion operation
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ExpansionProfile
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'activeOnly'.
    */
  var _activeOnly: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'displayLanguage'.
    */
  var _displayLanguage: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'excludeNested'.
    */
  var _excludeNested: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'excludeNotForUI'.
    */
  var _excludeNotForUI: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'excludePostCoordinated'.
    */
  var _excludePostCoordinated: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'includeDefinition'.
    */
  var _includeDefinition: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'includeDesignations'.
    */
  var _includeDesignations: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'limitedExpansion'.
    */
  var _limitedExpansion: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Include or exclude inactive concepts in the expansion
    */
  var activeOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Natural language description of the expansion profile
    */
  var description: js.UndefOr[markdown] = js.undefined
  
  /**
    * When the expansion profile imposes designation contraints
    */
  var designation: js.UndefOr[ExpansionProfileDesignation] = js.undefined
  
  /**
    * Specify the language for the display element of codes in the value set expansion
    */
  var displayLanguage: js.UndefOr[code] = js.undefined
  
  /**
    * Nested codes in the expansion or not
    */
  var excludeNested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Include or exclude codes which cannot be rendered in user interfaces in the value set expansion
    */
  var excludeNotForUI: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Include or exclude codes which are post coordinated expressions in the value set expansion
    */
  var excludePostCoordinated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Systems/Versions to be exclude
    */
  var excludedSystem: js.UndefOr[ExpansionProfileExcludedSystem] = js.undefined
  
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Fix use of a code system to a particular version
    */
  var fixedVersion: js.UndefOr[js.Array[ExpansionProfileFixedVersion]] = js.undefined
  
  /**
    * Additional identifier for the expansion profile
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Include or exclude the value set definition in the expansion
    */
  var includeDefinition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the expansion should include concept designations
    */
  var includeDesignations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Intended jurisdiction for expansion profile (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Controls behaviour of the value set expand operation when value sets are too large to be completely expanded
    */
  var limitedExpansion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Name for this expansion profile (computer friendly)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * draft | active | retired | unknown
    */
  var status: code
  
  /**
    * Logical URI to reference this expansion profile (globally unique)
    */
  var url: js.UndefOr[uri] = js.undefined
  
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * Business version of the expansion profile
    */
  var version: js.UndefOr[String] = js.undefined
}
object ExpansionProfile {
  
  @scala.inline
  def apply(status: code): ExpansionProfile = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpansionProfile]
  }
  
  @scala.inline
  implicit class ExpansionProfileMutableBuilder[Self <: ExpansionProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveOnly(value: Boolean): Self = StObject.set(x, "activeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOnlyUndefined: Self = StObject.set(x, "activeOnly", js.undefined)
    
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDescription(value: markdown): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDesignation(value: ExpansionProfileDesignation): Self = StObject.set(x, "designation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignationUndefined: Self = StObject.set(x, "designation", js.undefined)
    
    @scala.inline
    def setDisplayLanguage(value: code): Self = StObject.set(x, "displayLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLanguageUndefined: Self = StObject.set(x, "displayLanguage", js.undefined)
    
    @scala.inline
    def setExcludeNested(value: Boolean): Self = StObject.set(x, "excludeNested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeNestedUndefined: Self = StObject.set(x, "excludeNested", js.undefined)
    
    @scala.inline
    def setExcludeNotForUI(value: Boolean): Self = StObject.set(x, "excludeNotForUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeNotForUIUndefined: Self = StObject.set(x, "excludeNotForUI", js.undefined)
    
    @scala.inline
    def setExcludePostCoordinated(value: Boolean): Self = StObject.set(x, "excludePostCoordinated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludePostCoordinatedUndefined: Self = StObject.set(x, "excludePostCoordinated", js.undefined)
    
    @scala.inline
    def setExcludedSystem(value: ExpansionProfileExcludedSystem): Self = StObject.set(x, "excludedSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedSystemUndefined: Self = StObject.set(x, "excludedSystem", js.undefined)
    
    @scala.inline
    def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    @scala.inline
    def setFixedVersion(value: js.Array[ExpansionProfileFixedVersion]): Self = StObject.set(x, "fixedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedVersionUndefined: Self = StObject.set(x, "fixedVersion", js.undefined)
    
    @scala.inline
    def setFixedVersionVarargs(value: ExpansionProfileFixedVersion*): Self = StObject.set(x, "fixedVersion", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIncludeDefinition(value: Boolean): Self = StObject.set(x, "includeDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDefinitionUndefined: Self = StObject.set(x, "includeDefinition", js.undefined)
    
    @scala.inline
    def setIncludeDesignations(value: Boolean): Self = StObject.set(x, "includeDesignations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDesignationsUndefined: Self = StObject.set(x, "includeDesignations", js.undefined)
    
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value :_*))
    
    @scala.inline
    def setLimitedExpansion(value: Boolean): Self = StObject.set(x, "limitedExpansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitedExpansionUndefined: Self = StObject.set(x, "limitedExpansion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: uri): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    @scala.inline
    def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def set_activeOnly(value: Element): Self = StObject.set(x, "_activeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_activeOnlyUndefined: Self = StObject.set(x, "_activeOnly", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_displayLanguage(value: Element): Self = StObject.set(x, "_displayLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_displayLanguageUndefined: Self = StObject.set(x, "_displayLanguage", js.undefined)
    
    @scala.inline
    def set_excludeNested(value: Element): Self = StObject.set(x, "_excludeNested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_excludeNestedUndefined: Self = StObject.set(x, "_excludeNested", js.undefined)
    
    @scala.inline
    def set_excludeNotForUI(value: Element): Self = StObject.set(x, "_excludeNotForUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_excludeNotForUIUndefined: Self = StObject.set(x, "_excludeNotForUI", js.undefined)
    
    @scala.inline
    def set_excludePostCoordinated(value: Element): Self = StObject.set(x, "_excludePostCoordinated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_excludePostCoordinatedUndefined: Self = StObject.set(x, "_excludePostCoordinated", js.undefined)
    
    @scala.inline
    def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    @scala.inline
    def set_includeDefinition(value: Element): Self = StObject.set(x, "_includeDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_includeDefinitionUndefined: Self = StObject.set(x, "_includeDefinition", js.undefined)
    
    @scala.inline
    def set_includeDesignations(value: Element): Self = StObject.set(x, "_includeDesignations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_includeDesignationsUndefined: Self = StObject.set(x, "_includeDesignations", js.undefined)
    
    @scala.inline
    def set_limitedExpansion(value: Element): Self = StObject.set(x, "_limitedExpansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_limitedExpansionUndefined: Self = StObject.set(x, "_limitedExpansion", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
