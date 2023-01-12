package typings.fhir.r2Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.composite
import typings.fhir.fhirStrings.date
import typings.fhir.fhirStrings.distance
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.nearby
import typings.fhir.fhirStrings.normal
import typings.fhir.fhirStrings.number
import typings.fhir.fhirStrings.other
import typings.fhir.fhirStrings.phonetic
import typings.fhir.fhirStrings.quantity_
import typings.fhir.fhirStrings.reference
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.string
import typings.fhir.fhirStrings.token
import typings.fhir.fhirStrings.uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchParameter
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _base: js.UndefOr[Element] = js.undefined
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _experimental: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _requirements: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _target: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _xpath: js.UndefOr[Element] = js.undefined
  
  var _xpathUsage: js.UndefOr[Element] = js.undefined
  
  /**
    * The base resource type that this search parameter refers to.
    */
  var base: String
  
  /**
    * The code used in the URL or the parameter name in a parameters resource for this search parameter.
    */
  var code: String
  
  /**
    * Contacts to assist a user in finding and communicating with the publisher.
    */
  var contact: js.UndefOr[js.Array[SearchParameterContact]] = js.undefined
  
  /**
    * The date  (and optionally time) when the search parameter definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the search parameter changes.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the search parameters and how it used.
    */
  var description: String
  
  /**
    * A flag to indicate that this search parameter definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A free text natural language name identifying the search parameter.
    */
  var name: String
  
  /**
    * Helps establish the "authority/credibility" of the search parameter.  May also allow for contact.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * The Scope and Usage that this search parameter was created to meet.
    */
  var requirements: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SearchParameter: typings.fhir.fhirStrings.SearchParameter
  
  /**
    * The status of this search parameter definition.
    */
  var status: js.UndefOr[draft | active | retired] = js.undefined
  
  /**
    * Types of resource (if a resource is referenced).
    */
  var target: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The type of value a search parameter refers to, and how the content is interpreted.
    */
  var `type`: number | date | string | token | reference | composite | quantity_ | uri
  
  /**
    * To allow referencing and reusing search parameter definitions under other names on operational systems (in case of name clash).
    */
  var url: String
  
  /**
    * An XPath expression that returns a set of elements for the search parameter.
    */
  var xpath: js.UndefOr[String] = js.undefined
  
  /**
    * How the search parameter relates to the set of elements returned by evaluating the xpath query.
    */
  var xpathUsage: js.UndefOr[normal | phonetic | nearby | distance | other] = js.undefined
}
object SearchParameter {
  
  inline def apply(
    base: String,
    code: String,
    description: String,
    name: String,
    `type`: number | date | string | token | reference | composite | quantity_ | uri,
    url: String
  ): SearchParameter = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = "SearchParameter", url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchParameter] (val x: Self) extends AnyVal {
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setContact(value: js.Array[SearchParameterContact]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: SearchParameterContact*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setRequirements(value: String): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.SearchParameter): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | retired): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTarget(value: js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setType(value: number | date | string | token | reference | composite | quantity_ | uri): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setXpath(value: String): Self = StObject.set(x, "xpath", value.asInstanceOf[js.Any])
    
    inline def setXpathUndefined: Self = StObject.set(x, "xpath", js.undefined)
    
    inline def setXpathUsage(value: normal | phonetic | nearby | distance | other): Self = StObject.set(x, "xpathUsage", value.asInstanceOf[js.Any])
    
    inline def setXpathUsageUndefined: Self = StObject.set(x, "xpathUsage", js.undefined)
    
    inline def set_base(value: Element): Self = StObject.set(x, "_base", value.asInstanceOf[js.Any])
    
    inline def set_baseUndefined: Self = StObject.set(x, "_base", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    inline def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    inline def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    inline def set_requirements(value: Element): Self = StObject.set(x, "_requirements", value.asInstanceOf[js.Any])
    
    inline def set_requirementsUndefined: Self = StObject.set(x, "_requirements", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_target(value: js.Array[Element]): Self = StObject.set(x, "_target", value.asInstanceOf[js.Any])
    
    inline def set_targetUndefined: Self = StObject.set(x, "_target", js.undefined)
    
    inline def set_targetVarargs(value: Element*): Self = StObject.set(x, "_target", js.Array(value*))
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_xpath(value: Element): Self = StObject.set(x, "_xpath", value.asInstanceOf[js.Any])
    
    inline def set_xpathUndefined: Self = StObject.set(x, "_xpath", js.undefined)
    
    inline def set_xpathUsage(value: Element): Self = StObject.set(x, "_xpathUsage", value.asInstanceOf[js.Any])
    
    inline def set_xpathUsageUndefined: Self = StObject.set(x, "_xpathUsage", js.undefined)
  }
}
