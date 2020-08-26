package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data or objects used
  */
@js.native
trait AuditEventEntity extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'query'.
    */
  var _query: js.UndefOr[Element] = js.native
  /**
    * Descriptive text
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Additional Information about the entity
    */
  var detail: js.UndefOr[js.Array[AuditEventEntityDetail]] = js.native
  /**
    * Specific instance of object
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Life-cycle stage for the entity
    */
  var lifecycle: js.UndefOr[Coding] = js.native
  /**
    * Descriptor for entity
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Query parameters
    */
  var query: js.UndefOr[base64Binary] = js.native
  /**
    * Specific instance of resource
    */
  var reference: js.UndefOr[Reference] = js.native
  /**
    * What role the entity played
    */
  var role: js.UndefOr[Coding] = js.native
  /**
    * Security labels on the entity
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * Type of entity involved
    */
  var `type`: js.UndefOr[Coding] = js.native
}

object AuditEventEntity {
  @scala.inline
  def apply(): AuditEventEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditEventEntity]
  }
  @scala.inline
  implicit class AuditEventEntityOps[Self <: AuditEventEntity] (val x: Self) extends AnyVal {
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
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def set_query(value: Element): Self = this.set("_query", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_query: Self = this.set("_query", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDetailVarargs(value: AuditEventEntityDetail*): Self = this.set("detail", js.Array(value :_*))
    @scala.inline
    def setDetail(value: js.Array[AuditEventEntityDetail]): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setLifecycle(value: Coding): Self = this.set("lifecycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycle: Self = this.set("lifecycle", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setQuery(value: base64Binary): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setReference(value: Reference): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
    @scala.inline
    def setRole(value: Coding): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSecurityLabelVarargs(value: Coding*): Self = this.set("securityLabel", js.Array(value :_*))
    @scala.inline
    def setSecurityLabel(value: js.Array[Coding]): Self = this.set("securityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityLabel: Self = this.set("securityLabel", js.undefined)
    @scala.inline
    def setType(value: Coding): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

