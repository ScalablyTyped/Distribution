package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base Resource
  */
@js.native
trait ResourceBase extends js.Object {
  /**
    * Contains extended information for property 'id'.
    */
  var _id: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'implicitRules'.
    */
  var _implicitRules: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'resourceType'.
    */
  var _resourceType: js.UndefOr[Element] = js.native
  /**
    * Logical id of this artifact
    */
  var id: js.UndefOr[typings.fhir.fhir.id] = js.native
  /**
    * A set of rules under which this content was created
    */
  var implicitRules: js.UndefOr[uri] = js.native
  /**
    * Language of the resource content
    */
  var language: js.UndefOr[code] = js.native
  /**
    * Metadata about the resource
    */
  var meta: js.UndefOr[Meta] = js.native
  /**
    * The type of the resource.
    */
  var resourceType: js.UndefOr[code] = js.native
}

object ResourceBase {
  @scala.inline
  def apply(): ResourceBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceBase]
  }
  @scala.inline
  implicit class ResourceBaseOps[Self <: ResourceBase] (val x: Self) extends AnyVal {
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
    def set_id(value: Element): Self = this.set("_id", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_id: Self = this.set("_id", js.undefined)
    @scala.inline
    def set_implicitRules(value: Element): Self = this.set("_implicitRules", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_implicitRules: Self = this.set("_implicitRules", js.undefined)
    @scala.inline
    def set_language(value: Element): Self = this.set("_language", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_language: Self = this.set("_language", js.undefined)
    @scala.inline
    def set_resourceType(value: Element): Self = this.set("_resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_resourceType: Self = this.set("_resourceType", js.undefined)
    @scala.inline
    def setId(value: id): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImplicitRules(value: uri): Self = this.set("implicitRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImplicitRules: Self = this.set("implicitRules", js.undefined)
    @scala.inline
    def setLanguage(value: code): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setMeta(value: Meta): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setResourceType(value: code): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
  
}

