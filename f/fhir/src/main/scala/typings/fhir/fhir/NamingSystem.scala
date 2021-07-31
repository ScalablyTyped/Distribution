package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * System of unique identification
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait NamingSystem
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'responsible'.
    */
  var _responsible: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'usage'.
    */
  var _usage: js.UndefOr[Element] = js.undefined
  
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Date this was last changed
    */
  var date: dateTime
  
  /**
    * Natural language description of the naming system
    */
  var description: js.UndefOr[markdown] = js.undefined
  
  /**
    * Intended jurisdiction for naming system (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * codesystem | identifier | root
    */
  var kind: code
  
  /**
    * Name for this naming system (computer friendly)
    */
  var name: String
  
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * Use this instead
    */
  var replacedBy: js.UndefOr[Reference] = js.undefined
  
  /**
    * Who maintains system namespace?
    */
  var responsible: js.UndefOr[String] = js.undefined
  
  /**
    * draft | active | retired | unknown
    */
  var status: code
  
  /**
    * e.g. driver,  provider,  patient, bank etc.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Unique identifiers used for system
    */
  var uniqueId: js.Array[NamingSystemUniqueId]
  
  /**
    * How/where is it used
    */
  var usage: js.UndefOr[String] = js.undefined
  
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
}
object NamingSystem {
  
  @scala.inline
  def apply(date: dateTime, kind: code, name: String, status: code, uniqueId: js.Array[NamingSystemUniqueId]): NamingSystem = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamingSystem]
  }
  
  @scala.inline
  implicit class NamingSystemMutableBuilder[Self <: NamingSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: markdown): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: code): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    @scala.inline
    def setReplacedBy(value: Reference): Self = StObject.set(x, "replacedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacedByUndefined: Self = StObject.set(x, "replacedBy", js.undefined)
    
    @scala.inline
    def setResponsible(value: String): Self = StObject.set(x, "responsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsibleUndefined: Self = StObject.set(x, "responsible", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUniqueId(value: js.Array[NamingSystemUniqueId]): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueIdVarargs(value: NamingSystemUniqueId*): Self = StObject.set(x, "uniqueId", js.Array(value :_*))
    
    @scala.inline
    def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    
    @scala.inline
    def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    @scala.inline
    def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value :_*))
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_kind(value: Element): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_kindUndefined: Self = StObject.set(x, "_kind", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    @scala.inline
    def set_responsible(value: Element): Self = StObject.set(x, "_responsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_responsibleUndefined: Self = StObject.set(x, "_responsible", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_usage(value: Element): Self = StObject.set(x, "_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_usageUndefined: Self = StObject.set(x, "_usage", js.undefined)
  }
}
