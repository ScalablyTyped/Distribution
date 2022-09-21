package typings.fhir.mod

import typings.fhir.fhirStrings.`fully-specified`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.comparable
import typings.fhir.fhirStrings.convertable
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.equivalent
import typings.fhir.fhirStrings.flexible
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.scaleable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataElement
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _copyright: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _experimental: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _stringency: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Contacts to assist a user in finding and communicating with the publisher.
    */
  var contact: js.UndefOr[js.Array[DataElementContact]] = js.undefined
  
  /**
    * A copyright statement relating to the definition of the data element. Copyright statements are generally legal restrictions on the use and publishing of the details of the definition of the data element.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * The date this version of the data element was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the data element  changes.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * 1.
    */
  var element: js.Array[ElementDefinition]
  
  /**
    * A flag to indicate that this search data element definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Formal identifier that is used to identify this data element when it is represented in other formats, or referenced in a specification, model, design or an instance.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Identifies a specification (other than a terminology) that the elements which make up the DataElement have some correspondence with.
    */
  var mapping: js.UndefOr[js.Array[DataElementMapping]] = js.undefined
  
  /**
    * The term used by humans to refer to the data element.  Should ideally be unique within the context in which the data element is expected to be used.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Helps establish the "authority/credibility" of the data element.  May also allow for contact.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_DataElement: typings.fhir.fhirStrings.DataElement
  
  /**
    * Allows filtering of data elements that are appropriate for use.
    */
  var status: draft | active | retired
  
  /**
    * Allows determining the degree of comparability of data element instances. Less granular data elements result in data that is less comparable (or at least requires more work to compare).
    */
  var stringency: js.UndefOr[comparable | `fully-specified` | equivalent | convertable | scaleable | flexible] = js.undefined
  
  /**
    * An absolute URL that is used to identify this data element when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this data element is (or will be) published.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of data element definitions.
    */
  var useContext: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * There may be multiple resource versions of the data element that have this same identifier. The resource version id will change for technical reasons, whereas the stated version number needs to be under the author's control.
    */
  var version: js.UndefOr[String] = js.undefined
}
object DataElement {
  
  inline def apply(element: js.Array[ElementDefinition], status: draft | active | retired): DataElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], resourceType = "DataElement", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataElement]
  }
  
  extension [Self <: DataElement](x: Self) {
    
    inline def setContact(value: js.Array[DataElementContact]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: DataElementContact*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setElement(value: js.Array[ElementDefinition]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementVarargs(value: ElementDefinition*): Self = StObject.set(x, "element", js.Array(value*))
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setMapping(value: js.Array[DataElementMapping]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setMappingVarargs(value: DataElementMapping*): Self = StObject.set(x, "mapping", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.DataElement): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | retired): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStringency(value: comparable | `fully-specified` | equivalent | convertable | scaleable | flexible): Self = StObject.set(x, "stringency", value.asInstanceOf[js.Any])
    
    inline def setStringencyUndefined: Self = StObject.set(x, "stringency", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseContext(value: js.Array[CodeableConcept]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: CodeableConcept*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    inline def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    inline def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_stringency(value: Element): Self = StObject.set(x, "_stringency", value.asInstanceOf[js.Any])
    
    inline def set_stringencyUndefined: Self = StObject.set(x, "_stringency", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
