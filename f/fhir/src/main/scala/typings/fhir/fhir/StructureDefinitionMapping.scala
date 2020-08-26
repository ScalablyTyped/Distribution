package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * External specification that the content is mapped to
  */
@js.native
trait StructureDefinitionMapping extends BackboneElement {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'identity'.
    */
  var _identity: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'uri'.
    */
  var _uri: js.UndefOr[Element] = js.native
  /**
    * Versions, Issues, Scope limitations etc.
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * Internal id when this mapping is used
    */
  var identity: id = js.native
  /**
    * Names what this mapping refers to
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Identifies what this mapping refers to
    */
  var uri: js.UndefOr[typings.fhir.fhir.uri] = js.native
}

object StructureDefinitionMapping {
  @scala.inline
  def apply(identity: id): StructureDefinitionMapping = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureDefinitionMapping]
  }
  @scala.inline
  implicit class StructureDefinitionMappingOps[Self <: StructureDefinitionMapping] (val x: Self) extends AnyVal {
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
    def setIdentity(value: id): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def set_comment(value: Element): Self = this.set("_comment", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_comment: Self = this.set("_comment", js.undefined)
    @scala.inline
    def set_identity(value: Element): Self = this.set("_identity", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_identity: Self = this.set("_identity", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def set_uri(value: Element): Self = this.set("_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_uri: Self = this.set("_uri", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUri(value: uri): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

