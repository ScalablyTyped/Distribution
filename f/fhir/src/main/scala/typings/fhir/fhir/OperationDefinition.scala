package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of an operation or a named query
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait OperationDefinition extends DomainResource {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  
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
    * Contains extended information for property 'idempotent'.
    */
  var _idempotent: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'instance'.
    */
  var _instance: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.native
  
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
    * Contains extended information for property 'resource'.
    */
  var _resource: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  
  /**
    * Marks this as a profile of the base
    */
  var base: js.UndefOr[Reference] = js.native
  
  /**
    * Name used to invoke the operation
    */
  var code: typings.fhir.fhir.code = js.native
  
  /**
    * Additional information about use
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.native
  
  /**
    * Natural language description of the operation definition
    */
  var description: js.UndefOr[markdown] = js.native
  
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether content is unchanged by the operation
    */
  var idempotent: js.UndefOr[Boolean] = js.native
  
  /**
    * Invoke on an instance?
    */
  var instance: Boolean = js.native
  
  /**
    * Intended jurisdiction for operation definition (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * operation | query
    */
  var kind: code = js.native
  
  /**
    * Name for this operation definition (computer friendly)
    */
  var name: String = js.native
  
  /**
    * Define overloaded variants for when  generating code
    */
  var overload: js.UndefOr[js.Array[OperationDefinitionOverload]] = js.native
  
  /**
    * Parameters for the operation/query
    */
  var parameter: js.UndefOr[js.Array[OperationDefinitionParameter]] = js.native
  
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.native
  
  /**
    * Why this operation definition is defined
    */
  var purpose: js.UndefOr[markdown] = js.native
  
  /**
    * Types this operation applies to
    */
  var resource: js.UndefOr[js.Array[code]] = js.native
  
  /**
    * draft | active | retired | unknown
    */
  var status: code = js.native
  
  /**
    * Invoke at the system level?
    */
  var system: Boolean = js.native
  
  /**
    * Invole at the type level?
    */
  var `type`: Boolean = js.native
  
  /**
    * Logical URI to reference this operation definition (globally unique)
    */
  var url: js.UndefOr[uri] = js.native
  
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.native
  
  /**
    * Business version of the operation definition
    */
  var version: js.UndefOr[String] = js.native
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
  implicit class OperationDefinitionOps[Self <: OperationDefinition] (val x: Self) extends AnyVal {
    
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
    def setCode(value: code): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: Boolean): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: code): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: Boolean): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Boolean): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    
    @scala.inline
    def set_comment(value: Element): Self = this.set("_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_comment: Self = this.set("_comment", js.undefined)
    
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
    def set_idempotent(value: Element): Self = this.set("_idempotent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_idempotent: Self = this.set("_idempotent", js.undefined)
    
    @scala.inline
    def set_instance(value: Element): Self = this.set("_instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_instance: Self = this.set("_instance", js.undefined)
    
    @scala.inline
    def set_kind(value: Element): Self = this.set("_kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_kind: Self = this.set("_kind", js.undefined)
    
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
    def set_resourceVarargs(value: Element*): Self = this.set("_resource", js.Array(value :_*))
    
    @scala.inline
    def set_resource(value: js.Array[Element]): Self = this.set("_resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_resource: Self = this.set("_resource", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def set_system(value: Element): Self = this.set("_system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_system: Self = this.set("_system", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    
    @scala.inline
    def setBase(value: Reference): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
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
    def setExperimental(value: Boolean): Self = this.set("experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    
    @scala.inline
    def setIdempotent(value: Boolean): Self = this.set("idempotent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdempotent: Self = this.set("idempotent", js.undefined)
    
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = this.set("jurisdiction", js.Array(value :_*))
    
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    
    @scala.inline
    def setOverloadVarargs(value: OperationDefinitionOverload*): Self = this.set("overload", js.Array(value :_*))
    
    @scala.inline
    def setOverload(value: js.Array[OperationDefinitionOverload]): Self = this.set("overload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverload: Self = this.set("overload", js.undefined)
    
    @scala.inline
    def setParameterVarargs(value: OperationDefinitionParameter*): Self = this.set("parameter", js.Array(value :_*))
    
    @scala.inline
    def setParameter(value: js.Array[OperationDefinitionParameter]): Self = this.set("parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameter: Self = this.set("parameter", js.undefined)
    
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    
    @scala.inline
    def setPurpose(value: markdown): Self = this.set("purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
    
    @scala.inline
    def setResourceVarargs(value: code*): Self = this.set("resource", js.Array(value :_*))
    
    @scala.inline
    def setResource(value: js.Array[code]): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
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
