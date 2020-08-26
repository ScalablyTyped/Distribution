package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource that defines a type of message that can be exchanged between systems
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait MessageDefinition extends DomainResource {
  /**
    * Contains extended information for property 'category'.
    */
  var _category: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.native
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
    * Contains extended information for property 'responseRequired'.
    */
  var _responseRequired: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  /**
    * Responses to this message
    */
  var allowedResponse: js.UndefOr[js.Array[MessageDefinitionAllowedResponse]] = js.native
  /**
    * Definition this one is based on
    */
  var base: js.UndefOr[Reference] = js.native
  /**
    * Consequence | Currency | Notification
    */
  var category: js.UndefOr[code] = js.native
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.native
  /**
    * Date this was last changed
    */
  var date: dateTime = js.native
  /**
    * Natural language description of the message definition
    */
  var description: js.UndefOr[markdown] = js.native
  /**
    * Event type
    */
  var event: Coding = js.native
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.native
  /**
    * Resource(s) that are the subject of the event
    */
  var focus: js.UndefOr[js.Array[MessageDefinitionFocus]] = js.native
  /**
    * Additional identifier for the message definition
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Intended jurisdiction for message definition (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Name for this message definition (computer friendly)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Protocol/workflow this is part of
    */
  var parent: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.native
  /**
    * Why this message definition is defined
    */
  var purpose: js.UndefOr[markdown] = js.native
  /**
    * Takes the place of
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Is a response required?
    */
  var responseRequired: js.UndefOr[Boolean] = js.native
  /**
    * draft | active | retired | unknown
    */
  var status: code = js.native
  /**
    * Name for this message definition (human friendly)
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Logical URI to reference this message definition (globally unique)
    */
  var url: js.UndefOr[uri] = js.native
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.native
  /**
    * Business version of the message definition
    */
  var version: js.UndefOr[String] = js.native
}

object MessageDefinition {
  @scala.inline
  def apply(date: dateTime, event: Coding, status: code): MessageDefinition = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDefinition]
  }
  @scala.inline
  implicit class MessageDefinitionOps[Self <: MessageDefinition] (val x: Self) extends AnyVal {
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
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: Coding): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def set_category(value: Element): Self = this.set("_category", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_category: Self = this.set("_category", js.undefined)
    @scala.inline
    def set_copyright(value: Element): Self = this.set("_copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_copyright: Self = this.set("_copyright", js.undefined)
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
    def set_responseRequired(value: Element): Self = this.set("_responseRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_responseRequired: Self = this.set("_responseRequired", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def set_title(value: Element): Self = this.set("_title", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_title: Self = this.set("_title", js.undefined)
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    @scala.inline
    def setAllowedResponseVarargs(value: MessageDefinitionAllowedResponse*): Self = this.set("allowedResponse", js.Array(value :_*))
    @scala.inline
    def setAllowedResponse(value: js.Array[MessageDefinitionAllowedResponse]): Self = this.set("allowedResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedResponse: Self = this.set("allowedResponse", js.undefined)
    @scala.inline
    def setBase(value: Reference): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setCategory(value: code): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = this.set("contact", js.Array(value :_*))
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = this.set("contact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    @scala.inline
    def setCopyright(value: markdown): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setDescription(value: markdown): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExperimental(value: Boolean): Self = this.set("experimental", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    @scala.inline
    def setFocusVarargs(value: MessageDefinitionFocus*): Self = this.set("focus", js.Array(value :_*))
    @scala.inline
    def setFocus(value: js.Array[MessageDefinitionFocus]): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = this.set("jurisdiction", js.Array(value :_*))
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParentVarargs(value: Reference*): Self = this.set("parent", js.Array(value :_*))
    @scala.inline
    def setParent(value: js.Array[Reference]): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    @scala.inline
    def setPurpose(value: markdown): Self = this.set("purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
    @scala.inline
    def setReplacesVarargs(value: Reference*): Self = this.set("replaces", js.Array(value :_*))
    @scala.inline
    def setReplaces(value: js.Array[Reference]): Self = this.set("replaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaces: Self = this.set("replaces", js.undefined)
    @scala.inline
    def setResponseRequired(value: Boolean): Self = this.set("responseRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseRequired: Self = this.set("responseRequired", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
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

