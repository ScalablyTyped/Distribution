package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of an operation or a named query
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait OperationDefinition
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'idempotent'.
    */
  var _idempotent: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'instance'.
    */
  var _instance: js.UndefOr[Element] = js.undefined
  
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
    * Contains extended information for property 'purpose'.
    */
  var _purpose: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'resource'.
    */
  var _resource: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Marks this as a profile of the base
    */
  var base: js.UndefOr[Reference] = js.undefined
  
  /**
    * Name used to invoke the operation
    */
  var code: typings.fhir.fhir.code
  
  /**
    * Additional information about use
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Natural language description of the operation definition
    */
  var description: js.UndefOr[markdown] = js.undefined
  
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether content is unchanged by the operation
    */
  var idempotent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Invoke on an instance?
    */
  var instance: Boolean
  
  /**
    * Intended jurisdiction for operation definition (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * operation | query
    */
  var kind: code
  
  /**
    * Name for this operation definition (computer friendly)
    */
  var name: String
  
  /**
    * Define overloaded variants for when  generating code
    */
  var overload: js.UndefOr[js.Array[OperationDefinitionOverload]] = js.undefined
  
  /**
    * Parameters for the operation/query
    */
  var parameter: js.UndefOr[js.Array[OperationDefinitionParameter]] = js.undefined
  
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * Why this operation definition is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  
  /**
    * Types this operation applies to
    */
  var resource: js.UndefOr[js.Array[code]] = js.undefined
  
  /**
    * draft | active | retired | unknown
    */
  var status: code
  
  /**
    * Invoke at the system level?
    */
  var system: Boolean
  
  /**
    * Invole at the type level?
    */
  var `type`: Boolean
  
  /**
    * Logical URI to reference this operation definition (globally unique)
    */
  var url: js.UndefOr[uri] = js.undefined
  
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * Business version of the operation definition
    */
  var version: js.UndefOr[String] = js.undefined
}
object OperationDefinition {
  
  @scala.inline
  def apply(
    code: code,
    instance: Boolean,
    kind: code,
    name: String,
    status: code,
    system: Boolean,
    `type`: Boolean
  ): OperationDefinition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDefinition]
  }
  
  @scala.inline
  implicit class OperationDefinitionMutableBuilder[Self <: OperationDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Reference): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
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
    def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    @scala.inline
    def setIdempotent(value: Boolean): Self = StObject.set(x, "idempotent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotentUndefined: Self = StObject.set(x, "idempotent", js.undefined)
    
    @scala.inline
    def setInstance(value: Boolean): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
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
    def setOverload(value: js.Array[OperationDefinitionOverload]): Self = StObject.set(x, "overload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverloadUndefined: Self = StObject.set(x, "overload", js.undefined)
    
    @scala.inline
    def setOverloadVarargs(value: OperationDefinitionOverload*): Self = StObject.set(x, "overload", js.Array(value :_*))
    
    @scala.inline
    def setParameter(value: js.Array[OperationDefinitionParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    @scala.inline
    def setParameterVarargs(value: OperationDefinitionParameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    @scala.inline
    def setPurpose(value: markdown): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    @scala.inline
    def setResource(value: js.Array[code]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setResourceVarargs(value: code*): Self = StObject.set(x, "resource", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: Boolean): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
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
    def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    @scala.inline
    def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    @scala.inline
    def set_idempotent(value: Element): Self = StObject.set(x, "_idempotent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_idempotentUndefined: Self = StObject.set(x, "_idempotent", js.undefined)
    
    @scala.inline
    def set_instance(value: Element): Self = StObject.set(x, "_instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_instanceUndefined: Self = StObject.set(x, "_instance", js.undefined)
    
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
    def set_purpose(value: Element): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    @scala.inline
    def set_resource(value: js.Array[Element]): Self = StObject.set(x, "_resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_resourceUndefined: Self = StObject.set(x, "_resource", js.undefined)
    
    @scala.inline
    def set_resourceVarargs(value: Element*): Self = StObject.set(x, "_resource", js.Array(value :_*))
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
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
