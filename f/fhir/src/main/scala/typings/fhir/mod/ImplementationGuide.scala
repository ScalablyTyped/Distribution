package typings.fhir.mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.retired
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
  var _package: js.Array[ImplementationGuidePackage]
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * A binary file that is included in the  implementation guide when it is published.
    */
  var binary: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Contacts to assist a user in finding and communicating with the publisher.
    */
  var contact: js.UndefOr[js.Array[ImplementationGuideContact]] = js.undefined
  
  /**
    * A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * The date this version of the implementation guide was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides.
    */
  var dependency: js.UndefOr[js.Array[ImplementationGuideDependency]] = js.undefined
  
  /**
    * A free text natural language description of the Implementation Guide and its use.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Allows filtering of Implementation Guides that are appropriate for use vs. not.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The version of the FHIR specification on which this ImplementationGuide is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 1.0.2 for this version.
    */
  var fhirVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A set of profiles that all resources covered by this implementation guide must conform to.
    */
  var global: js.UndefOr[js.Array[ImplementationGuideGlobal]] = js.undefined
  
  /**
    * A free text natural language name identifying the Implementation Guide.
    */
  var name: String
  
  /**
    * A page / section in the implementation guide. The root page is the implementation guide home page.
    */
  var page: ImplementationGuidePage
  
  /**
    * Helps establish the "authority/credibility" of the implementation guide.  May also allow for contact.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ImplementationGuide: typings.fhir.fhirStrings.ImplementationGuide
  
  /**
    * Allows filtering of Implementation Guides that are appropriate for use vs. not.
    */
  var status: draft | active | retired
  
  /**
    * This is required to allow hosting Implementation Guides on multiple different servers, and to allow for the editorial process.
    */
  var url: String
  
  /**
    * Assist in searching for appropriate implementation guide.
    */
  var useContext: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * There may be multiple resource versions of the Implementation Guide that have this same identifier. The resource version id will change for technical reasons, whereas the stated version number needs to be under the author's control.
    */
  var version: js.UndefOr[String] = js.undefined
}
object ImplementationGuide {
  
  inline def apply(
    _package: js.Array[ImplementationGuidePackage],
    name: String,
    page: ImplementationGuidePage,
    status: draft | active | retired,
    url: String
  ): ImplementationGuide = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], resourceType = "ImplementationGuide", status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuide]
  }
  
  extension [Self <: ImplementationGuide](x: Self) {
    
    inline def setBinary(value: js.Array[String]): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setBinaryVarargs(value: String*): Self = StObject.set(x, "binary", js.Array(value*))
    
    inline def setContact(value: js.Array[ImplementationGuideContact]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ImplementationGuideContact*): Self = StObject.set(x, "contact", js.Array(value*))
    
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
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPage(value: ImplementationGuidePage): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ImplementationGuide): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | retired): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUseContext(value: js.Array[CodeableConcept]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: CodeableConcept*): Self = StObject.set(x, "useContext", js.Array(value*))
    
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
