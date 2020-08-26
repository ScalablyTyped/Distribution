package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to perform some action on or in regards to an existing resource
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ProcessRequest extends DomainResource {
  /**
    * Contains extended information for property 'action'.
    */
  var _action: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'exclude'.
    */
  var _exclude: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'include'.
    */
  var _include: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'nullify'.
    */
  var _nullify: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'reference'.
    */
  var _reference: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * cancel | poll | reprocess | status
    */
  var action: js.UndefOr[code] = js.native
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.native
  /**
    * Resource type(s) to exclude
    */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Resource type(s) to include
    */
  var include: js.UndefOr[js.Array[String]] = js.native
  /**
    * Items to re-adjudicate
    */
  var item: js.UndefOr[js.Array[ProcessRequestItem]] = js.native
  /**
    * Remove history
    */
  var nullify: js.UndefOr[Boolean] = js.native
  /**
    * Responsible organization
    */
  var organization: js.UndefOr[Reference] = js.native
  /**
    * Selection period
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Responsible practitioner
    */
  var provider: js.UndefOr[Reference] = js.native
  /**
    * Reference number/string
    */
  var reference: js.UndefOr[String] = js.native
  /**
    * Reference to the Request resource
    */
  var request: js.UndefOr[Reference] = js.native
  /**
    * Reference to the Response resource
    */
  var response: js.UndefOr[Reference] = js.native
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  /**
    * Party which is the target of the request
    */
  var target: js.UndefOr[Reference] = js.native
}

object ProcessRequest {
  @scala.inline
  def apply(): ProcessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessRequest]
  }
  @scala.inline
  implicit class ProcessRequestOps[Self <: ProcessRequest] (val x: Self) extends AnyVal {
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
    def set_action(value: Element): Self = this.set("_action", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_action: Self = this.set("_action", js.undefined)
    @scala.inline
    def set_created(value: Element): Self = this.set("_created", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_created: Self = this.set("_created", js.undefined)
    @scala.inline
    def set_excludeVarargs(value: Element*): Self = this.set("_exclude", js.Array(value :_*))
    @scala.inline
    def set_exclude(value: js.Array[Element]): Self = this.set("_exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_exclude: Self = this.set("_exclude", js.undefined)
    @scala.inline
    def set_includeVarargs(value: Element*): Self = this.set("_include", js.Array(value :_*))
    @scala.inline
    def set_include(value: js.Array[Element]): Self = this.set("_include", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_include: Self = this.set("_include", js.undefined)
    @scala.inline
    def set_nullify(value: Element): Self = this.set("_nullify", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_nullify: Self = this.set("_nullify", js.undefined)
    @scala.inline
    def set_reference(value: Element): Self = this.set("_reference", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_reference: Self = this.set("_reference", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setAction(value: code): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setCreated(value: dateTime): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setIncludeVarargs(value: String*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: js.Array[String]): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setItemVarargs(value: ProcessRequestItem*): Self = this.set("item", js.Array(value :_*))
    @scala.inline
    def setItem(value: js.Array[ProcessRequestItem]): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setNullify(value: Boolean): Self = this.set("nullify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullify: Self = this.set("nullify", js.undefined)
    @scala.inline
    def setOrganization(value: Reference): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setProvider(value: Reference): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setReference(value: String): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
    @scala.inline
    def setRequest(value: Reference): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setResponse(value: Reference): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTarget(value: Reference): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

