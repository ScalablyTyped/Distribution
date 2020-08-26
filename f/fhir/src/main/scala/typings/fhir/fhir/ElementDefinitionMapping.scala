package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Map element to another set of definitions
  */
@js.native
trait ElementDefinitionMapping extends Element {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'identity'.
    */
  var _identity: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'map'.
    */
  var _map: js.UndefOr[Element] = js.native
  /**
    * Comments about the mapping or its use
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * Reference to mapping declaration
    */
  var identity: id = js.native
  /**
    * Computable language of mapping
    */
  var language: js.UndefOr[code] = js.native
  /**
    * Details of the mapping
    */
  var map: String = js.native
}

object ElementDefinitionMapping {
  @scala.inline
  def apply(identity: id, map: String): ElementDefinitionMapping = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionMapping]
  }
  @scala.inline
  implicit class ElementDefinitionMappingOps[Self <: ElementDefinitionMapping] (val x: Self) extends AnyVal {
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
    def setMap(value: String): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def set_comment(value: Element): Self = this.set("_comment", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_comment: Self = this.set("_comment", js.undefined)
    @scala.inline
    def set_identity(value: Element): Self = this.set("_identity", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_identity: Self = this.set("_identity", js.undefined)
    @scala.inline
    def set_language(value: Element): Self = this.set("_language", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_language: Self = this.set("_language", js.undefined)
    @scala.inline
    def set_map(value: Element): Self = this.set("_map", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_map: Self = this.set("_map", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setLanguage(value: code): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
  
}

