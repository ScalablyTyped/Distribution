package typings.fhir.r3Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplementationGuide
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _binary: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _copyright: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _experimental: js.UndefOr[Element] = js.undefined
  
  var _fhirVersion: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * A logical group of resources. Logical groups can be used when building pages.
    */
  @JSName("package")
  var _package: js.UndefOr[js.Array[ImplementationGuidePackage]] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * This is principally included for the FHIR publishing tool, but may be useful when extracting and reusing content from the implementation guide.
    */
  var binary: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * May be a web site, an email address, a telephone number, etc.
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the implementation guide.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * Note that this is not the same as the resource last-modified-date, since the resource may be a secondary representation of the implementation guide. Additional specific dates may be added as extensions or be found by consulting Provenances associated with past versions of the resource.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.
    */
  var dependency: js.UndefOr[js.Array[ImplementationGuideDependency]] = js.undefined
  
  /**
    * This description can be used to capture details such as why the implementation guide was built, comments about misuse, instructions for clinical use and interpretation, literature references, examples from the paper world, etc. It is not a rendering of the implementation guide as conveyed in the 'text' field of the resource itself. This item SHOULD be populated unless the information is available from context (e.g. the language of the profile is presumed to be the predominant language in the place the profile was created).
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Allows filtering of implementation guide that are appropriate for use vs. not. This is labeled as "Is Modifier" because applications should not use an experimental implementation guide in production.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An Implementation Guide should specify the target it applies to, as ImplementationGuides are rarely valid across multiple versions of FHIR.
    */
  var fhirVersion: js.UndefOr[String] = js.undefined
  
  /**
    * See [Default Profiles](implementationguide.html#default) for a discussion of which resources are 'covered' by an implementation guide.
    */
  var global: js.UndefOr[js.Array[ImplementationGuideGlobal]] = js.undefined
  
  /**
    * It may be possible for the implementation guide to be used in jurisdictions other than those for which it was originally designed or intended.
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The name is not expected to be globally unique. The name should be a simple alpha-numeric type name to ensure that it is computable friendly.
    */
  var name: String
  
  /**
    * Pages automatically become sections if they have sub-pages. By convention, the home page is called index.html.
    */
  var page: js.UndefOr[ImplementationGuidePage] = js.undefined
  
  /**
    * Usually an organization, but may be an individual. The publisher (or steward) of the implementation guide is the organization or individual primarily responsible for the maintenance and upkeep of the implementation guide. This is not necessarily the same individual or organization that developed and initially authored the content. The publisher is the primary point of contact for questions or issues with the implementation guide. This item SHOULD be populated unless the information is available from context.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ImplementationGuide: typings.fhir.fhirStrings.ImplementationGuide
  
  /**
    * Allows filtering of implementation guides that are appropriate for use vs. not.
    * This is labeled as "Is Modifier" because applications should not use a retired implementation guide without due consideration.
    */
  var status: draft | active | retired | unknown
  
  /**
    * Can be a urn:uuid: or a urn:oid:, but real http: addresses are preferred.  Multiple instances may share the same url if they have a distinct version.
    */
  var url: String
  
  /**
    * When multiple useContexts are specified, there is no expectation whether all or any of the contexts apply.
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * There may be different implementation guide instances that have the same identifier but different versions.  The version can be appended to the url in a reference to allow a refrence to a particular business version of the implementation guide with the format [url]|[version].
    */
  var version: js.UndefOr[String] = js.undefined
}
object ImplementationGuide {
  
  inline def apply(name: String, status: draft | active | retired | unknown, url: String): ImplementationGuide = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resourceType = "ImplementationGuide", status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuide]
  }
  
  extension [Self <: ImplementationGuide](x: Self) {
    
    inline def setBinary(value: js.Array[String]): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setBinaryVarargs(value: String*): Self = StObject.set(x, "binary", js.Array(value*))
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDependency(value: js.Array[ImplementationGuideDependency]): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setDependencyUndefined: Self = StObject.set(x, "dependency", js.undefined)
    
    inline def setDependencyVarargs(value: ImplementationGuideDependency*): Self = StObject.set(x, "dependency", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setFhirVersion(value: String): Self = StObject.set(x, "fhirVersion", value.asInstanceOf[js.Any])
    
    inline def setFhirVersionUndefined: Self = StObject.set(x, "fhirVersion", js.undefined)
    
    inline def setGlobal(value: js.Array[ImplementationGuideGlobal]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setGlobalVarargs(value: ImplementationGuideGlobal*): Self = StObject.set(x, "global", js.Array(value*))
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPage(value: ImplementationGuidePage): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ImplementationGuide): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_binary(value: js.Array[Element]): Self = StObject.set(x, "_binary", value.asInstanceOf[js.Any])
    
    inline def set_binaryUndefined: Self = StObject.set(x, "_binary", js.undefined)
    
    inline def set_binaryVarargs(value: Element*): Self = StObject.set(x, "_binary", js.Array(value*))
    
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
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_package(value: js.Array[ImplementationGuidePackage]): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    
    inline def set_packageVarargs(value: ImplementationGuidePackage*): Self = StObject.set(x, "package", js.Array(value*))
    
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
