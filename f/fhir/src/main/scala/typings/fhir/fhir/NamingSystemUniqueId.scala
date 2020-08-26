package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Unique identifiers used for system
  */
@js.native
trait NamingSystemUniqueId extends BackboneElement {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'preferred'.
    */
  var _preferred: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  /**
    * Notes about identifier usage
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * When is identifier valid?
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Is this the id that should be used for this type
    */
  var preferred: js.UndefOr[Boolean] = js.native
  /**
    * oid | uuid | uri | other
    */
  var `type`: code = js.native
  /**
    * The unique identifier
    */
  var value: String = js.native
}

object NamingSystemUniqueId {
  @scala.inline
  def apply(`type`: code, value: String): NamingSystemUniqueId = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamingSystemUniqueId]
  }
  @scala.inline
  implicit class NamingSystemUniqueIdOps[Self <: NamingSystemUniqueId] (val x: Self) extends AnyVal {
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
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def set_comment(value: Element): Self = this.set("_comment", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_comment: Self = this.set("_comment", js.undefined)
    @scala.inline
    def set_preferred(value: Element): Self = this.set("_preferred", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_preferred: Self = this.set("_preferred", js.undefined)
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def set_value(value: Element): Self = this.set("_value", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_value: Self = this.set("_value", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setPreferred(value: Boolean): Self = this.set("preferred", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferred: Self = this.set("preferred", js.undefined)
  }
  
}

