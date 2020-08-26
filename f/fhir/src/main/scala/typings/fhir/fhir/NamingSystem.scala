package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System of unique identification
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait NamingSystem extends DomainResource {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
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
    * Contains extended information for property 'responsible'.
    */
  var _responsible: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'usage'.
    */
  var _usage: js.UndefOr[Element] = js.native
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  /**
    * Date this was last changed
    */
  var date: dateTime = js.native
  /**
    * Natural language description of the naming system
    */
  var description: js.UndefOr[markdown] = js.native
  /**
    * Intended jurisdiction for naming system (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * codesystem | identifier | root
    */
  var kind: code = js.native
  /**
    * Name for this naming system (computer friendly)
    */
  var name: String = js.native
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.native
  /**
    * Use this instead
    */
  var replacedBy: js.UndefOr[Reference] = js.native
  /**
    * Who maintains system namespace?
    */
  var responsible: js.UndefOr[String] = js.native
  /**
    * draft | active | retired | unknown
    */
  var status: code = js.native
  /**
    * e.g. driver,  provider,  patient, bank etc.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
  /**
    * Unique identifiers used for system
    */
  var uniqueId: js.Array[NamingSystemUniqueId] = js.native
  /**
    * How/where is it used
    */
  var usage: js.UndefOr[String] = js.native
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.native
}

object NamingSystem {
  @scala.inline
  def apply(date: dateTime, kind: code, name: String, status: code, uniqueId: js.Array[NamingSystemUniqueId]): NamingSystem = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamingSystem]
  }
  @scala.inline
  implicit class NamingSystemOps[Self <: NamingSystem] (val x: Self) extends AnyVal {
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
    def setKind(value: code): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueIdVarargs(value: NamingSystemUniqueId*): Self = this.set("uniqueId", js.Array(value :_*))
    @scala.inline
    def setUniqueId(value: js.Array[NamingSystemUniqueId]): Self = this.set("uniqueId", value.asInstanceOf[js.Any])
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
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
    def set_responsible(value: Element): Self = this.set("_responsible", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_responsible: Self = this.set("_responsible", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def set_usage(value: Element): Self = this.set("_usage", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_usage: Self = this.set("_usage", js.undefined)
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = this.set("contact", js.Array(value :_*))
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = this.set("contact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    @scala.inline
    def setDescription(value: markdown): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = this.set("jurisdiction", js.Array(value :_*))
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    @scala.inline
    def setReplacedBy(value: Reference): Self = this.set("replacedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplacedBy: Self = this.set("replacedBy", js.undefined)
    @scala.inline
    def setResponsible(value: String): Self = this.set("responsible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsible: Self = this.set("responsible", js.undefined)
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUsage(value: String): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
    @scala.inline
    def setUseContextVarargs(value: UsageContext*): Self = this.set("useContext", js.Array(value :_*))
    @scala.inline
    def setUseContext(value: js.Array[UsageContext]): Self = this.set("useContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseContext: Self = this.set("useContext", js.undefined)
  }
  
}

