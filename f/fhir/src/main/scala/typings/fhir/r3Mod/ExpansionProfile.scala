package typings.fhir.r3Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpansionProfile
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _activeOnly: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _displayLanguage: js.UndefOr[Element] = js.undefined
  
  var _excludeNested: js.UndefOr[Element] = js.undefined
  
  var _excludeNotForUI: js.UndefOr[Element] = js.undefined
  
  var _excludePostCoordinated: js.UndefOr[Element] = js.undefined
  
  var _experimental: js.UndefOr[Element] = js.undefined
  
  var _includeDefinition: js.UndefOr[Element] = js.undefined
  
  var _includeDesignations: js.UndefOr[Element] = js.undefined
  
  var _limitedExpansion: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Inactive codes are included if activeOnly is present and has a value of "true". Note that if the value set explicitly specifies that inactive codes are included, this property can still remove them from a specific expansion, but this parameter cannot include them if the value set excludes them.
    */
  var activeOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * May be a web site, an email address, a telephone number, etc.
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Note that this is not the same as the resource last-modified-date, since the resource may be a secondary representation of the expansion profile. Additional specific dates may be added as extensions or be found by consulting Provenances associated with past versions of the resource.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * This description can be used to capture details such as why the expansion profile was built, comments about misuse, instructions for clinical use and interpretation, literature references, examples from the paper world, etc. It is not a rendering of the expansion profile as conveyed in the 'text' field of the resource itself. This item SHOULD be populated unless the information is available from context (e.g. the language of the profile is presumed to be the predominant language in the place the profile was created).
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A set of criteria that provide the constraints imposed on the value set expansion by including or excluding designations.
    */
  var designation: js.UndefOr[ExpansionProfileDesignation] = js.undefined
  
  /**
    * Specifies the language to be used for description in the expansions i.e. the language to be used for ValueSet.expansion.contains.display.
    */
  var displayLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Nesting of codes is excluded if excludeNested is present and has a value of "true".
    */
  var excludeNested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Codes which cannot be used in user interfaces will be excluded if excludeNotForUI is present and has a value of "true".
    */
  var excludeNotForUI: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Post coordinated codes are excluded if excludePostCoordinated is present and has a value of "true".
    */
  var excludePostCoordinated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When a system is excluded, and this makes a material difference to the expansion, the exclusion SHALL  be noted in the expansion parameters using a parameter 'excluded'.
    */
  var excludedSystem: js.UndefOr[ExpansionProfileExcludedSystem] = js.undefined
  
  /**
    * Allows filtering of expansion profile that are appropriate for use vs. not. This is labeled as "Is Modifier" because applications should not use an experimental expansion profile in production.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Fix use of a particular code system to a particular version.
    */
  var fixedVersion: js.UndefOr[js.Array[ExpansionProfileFixedVersion]] = js.undefined
  
  /**
    * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data type, e.g., to identify this expansion profile outside of FHIR, where it is not possible to use the logical URI.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The ValueSet defintion refers to all fields in the ValueSet definition apart from  ValueSet.contains. The definition is only included if includeDefinition is present and has a value of "true".
    */
  var includeDefinition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ExpansionProfile.designation.include and ExpansionProfile.designation.exclude are only evaluated if includeDesignations is present and set to "true". If includeDesignations is present with a value of "true" and both ExpansionProfile.designation.include and ExpansionProfile.designation.exclude are absent, then all designations are returned in the expansion.
    */
  var includeDesignations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * It may be possible for the expansion profile to be used in jurisdictions other than those for which it was originally designed or intended.
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * This field overides the default behaviour (which is to return an error). This does not apply to expansions which are unbounded. Clients SHALL process the extension [http://hl7.org/fhir/StructureDefinition/valueset-toocostly](extension-valueset-toocostly.html) correctly if limitedExpansion = true.
    */
  var limitedExpansion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name is not expected to be globally unique. The name should be a simple alpha-numeric type name to ensure that it is computable friendly.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Usually an organization, but may be an individual. The publisher (or steward) of the expansion profile is the organization or individual primarily responsible for the maintenance and upkeep of the expansion profile. This is not necessarily the same individual or organization that developed and initially authored the content. The publisher is the primary point of contact for questions or issues with the expansion profile. This item SHOULD be populated unless the information is available from context.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ExpansionProfile: typings.fhir.fhirStrings.ExpansionProfile
  
  /**
    * Allows filtering of expansion profiles that are appropriate for use vs. not.
    * This is labeled as "Is Modifier" because applications should not use a retired expansion profile without due consideration.
    */
  var status: draft | active | retired | unknown
  
  /**
    * Can be a urn:uuid: or a urn:oid:, but real http: addresses are preferred.  Multiple instances may share the same url if they have a distinct version.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * When multiple useContexts are specified, there is no expectation whether all or any of the contexts apply.
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * There may be different expansion profile instances that have the same identifier but different versions.  The version can be appended to the url in a reference to allow a refrence to a particular business version of the expansion profile with the format [url]|[version].
    */
  var version: js.UndefOr[String] = js.undefined
}
object ExpansionProfile {
  
  inline def apply(status: draft | active | retired | unknown): ExpansionProfile = {
    val __obj = js.Dynamic.literal(resourceType = "ExpansionProfile", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpansionProfile]
  }
  
  extension [Self <: ExpansionProfile](x: Self) {
    
    inline def setActiveOnly(value: Boolean): Self = StObject.set(x, "activeOnly", value.asInstanceOf[js.Any])
    
    inline def setActiveOnlyUndefined: Self = StObject.set(x, "activeOnly", js.undefined)
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDesignation(value: ExpansionProfileDesignation): Self = StObject.set(x, "designation", value.asInstanceOf[js.Any])
    
    inline def setDesignationUndefined: Self = StObject.set(x, "designation", js.undefined)
    
    inline def setDisplayLanguage(value: String): Self = StObject.set(x, "displayLanguage", value.asInstanceOf[js.Any])
    
    inline def setDisplayLanguageUndefined: Self = StObject.set(x, "displayLanguage", js.undefined)
    
    inline def setExcludeNested(value: Boolean): Self = StObject.set(x, "excludeNested", value.asInstanceOf[js.Any])
    
    inline def setExcludeNestedUndefined: Self = StObject.set(x, "excludeNested", js.undefined)
    
    inline def setExcludeNotForUI(value: Boolean): Self = StObject.set(x, "excludeNotForUI", value.asInstanceOf[js.Any])
    
    inline def setExcludeNotForUIUndefined: Self = StObject.set(x, "excludeNotForUI", js.undefined)
    
    inline def setExcludePostCoordinated(value: Boolean): Self = StObject.set(x, "excludePostCoordinated", value.asInstanceOf[js.Any])
    
    inline def setExcludePostCoordinatedUndefined: Self = StObject.set(x, "excludePostCoordinated", js.undefined)
    
    inline def setExcludedSystem(value: ExpansionProfileExcludedSystem): Self = StObject.set(x, "excludedSystem", value.asInstanceOf[js.Any])
    
    inline def setExcludedSystemUndefined: Self = StObject.set(x, "excludedSystem", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setFixedVersion(value: js.Array[ExpansionProfileFixedVersion]): Self = StObject.set(x, "fixedVersion", value.asInstanceOf[js.Any])
    
    inline def setFixedVersionUndefined: Self = StObject.set(x, "fixedVersion", js.undefined)
    
    inline def setFixedVersionVarargs(value: ExpansionProfileFixedVersion*): Self = StObject.set(x, "fixedVersion", js.Array(value*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIncludeDefinition(value: Boolean): Self = StObject.set(x, "includeDefinition", value.asInstanceOf[js.Any])
    
    inline def setIncludeDefinitionUndefined: Self = StObject.set(x, "includeDefinition", js.undefined)
    
    inline def setIncludeDesignations(value: Boolean): Self = StObject.set(x, "includeDesignations", value.asInstanceOf[js.Any])
    
    inline def setIncludeDesignationsUndefined: Self = StObject.set(x, "includeDesignations", js.undefined)
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value*))
    
    inline def setLimitedExpansion(value: Boolean): Self = StObject.set(x, "limitedExpansion", value.asInstanceOf[js.Any])
    
    inline def setLimitedExpansionUndefined: Self = StObject.set(x, "limitedExpansion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ExpansionProfile): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_activeOnly(value: Element): Self = StObject.set(x, "_activeOnly", value.asInstanceOf[js.Any])
    
    inline def set_activeOnlyUndefined: Self = StObject.set(x, "_activeOnly", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_displayLanguage(value: Element): Self = StObject.set(x, "_displayLanguage", value.asInstanceOf[js.Any])
    
    inline def set_displayLanguageUndefined: Self = StObject.set(x, "_displayLanguage", js.undefined)
    
    inline def set_excludeNested(value: Element): Self = StObject.set(x, "_excludeNested", value.asInstanceOf[js.Any])
    
    inline def set_excludeNestedUndefined: Self = StObject.set(x, "_excludeNested", js.undefined)
    
    inline def set_excludeNotForUI(value: Element): Self = StObject.set(x, "_excludeNotForUI", value.asInstanceOf[js.Any])
    
    inline def set_excludeNotForUIUndefined: Self = StObject.set(x, "_excludeNotForUI", js.undefined)
    
    inline def set_excludePostCoordinated(value: Element): Self = StObject.set(x, "_excludePostCoordinated", value.asInstanceOf[js.Any])
    
    inline def set_excludePostCoordinatedUndefined: Self = StObject.set(x, "_excludePostCoordinated", js.undefined)
    
    inline def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    inline def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    inline def set_includeDefinition(value: Element): Self = StObject.set(x, "_includeDefinition", value.asInstanceOf[js.Any])
    
    inline def set_includeDefinitionUndefined: Self = StObject.set(x, "_includeDefinition", js.undefined)
    
    inline def set_includeDesignations(value: Element): Self = StObject.set(x, "_includeDesignations", value.asInstanceOf[js.Any])
    
    inline def set_includeDesignationsUndefined: Self = StObject.set(x, "_includeDesignations", js.undefined)
    
    inline def set_limitedExpansion(value: Element): Self = StObject.set(x, "_limitedExpansion", value.asInstanceOf[js.Any])
    
    inline def set_limitedExpansionUndefined: Self = StObject.set(x, "_limitedExpansion", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    inline def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
