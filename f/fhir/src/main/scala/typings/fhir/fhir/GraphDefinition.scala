package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of an graph of resources
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait GraphDefinition extends DomainResource {
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
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'purpose'.
    */
  var _purpose: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.native
  /**
    * Natural language description of the graph definition
    */
  var description: js.UndefOr[markdown] = js.native
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.native
  /**
    * Intended jurisdiction for graph definition (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Links this graph makes rules about
    */
  var link: js.UndefOr[js.Array[GraphDefinitionLink]] = js.native
  /**
    * Name for this graph definition (computer friendly)
    */
  var name: String = js.native
  /**
    * Profile on base resource
    */
  var profile: js.UndefOr[uri] = js.native
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.native
  /**
    * Why this graph definition is defined
    */
  var purpose: js.UndefOr[markdown] = js.native
  /**
    * Type of resource at which the graph starts
    */
  var start: code = js.native
  /**
    * draft | active | retired | unknown
    */
  var status: code = js.native
  /**
    * Logical URI to reference this graph definition (globally unique)
    */
  var url: js.UndefOr[uri] = js.native
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.native
  /**
    * Business version of the graph definition
    */
  var version: js.UndefOr[String] = js.native
}

object GraphDefinition {
  @scala.inline
  def apply(name: String, start: code, status: code): GraphDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDefinition]
  }
  @scala.inline
  implicit class GraphDefinitionOps[Self <: GraphDefinition] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: code): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
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
    def set_profile(value: Element): Self = this.set("_profile", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_profile: Self = this.set("_profile", js.undefined)
    @scala.inline
    def set_publisher(value: Element): Self = this.set("_publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_publisher: Self = this.set("_publisher", js.undefined)
    @scala.inline
    def set_purpose(value: Element): Self = this.set("_purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_purpose: Self = this.set("_purpose", js.undefined)
    @scala.inline
    def set_start(value: Element): Self = this.set("_start", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_start: Self = this.set("_start", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
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
    def setJurisdictionVarargs(value: CodeableConcept*): Self = this.set("jurisdiction", js.Array(value :_*))
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    @scala.inline
    def setLinkVarargs(value: GraphDefinitionLink*): Self = this.set("link", js.Array(value :_*))
    @scala.inline
    def setLink(value: js.Array[GraphDefinitionLink]): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setProfile(value: uri): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    @scala.inline
    def setPurpose(value: markdown): Self = this.set("purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
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

