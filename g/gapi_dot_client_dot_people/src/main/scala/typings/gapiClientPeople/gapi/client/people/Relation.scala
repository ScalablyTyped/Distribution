package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relation extends js.Object {
  /**
    * Output only. The type of the relation translated and formatted in the viewer's
    * account locale or the locale specified in the Accept-Language HTTP header.
    */
  var formattedType: js.UndefOr[String] = js.native
  /** Metadata about the relation. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
  /** The name of the other person this relation refers to. */
  var person: js.UndefOr[String] = js.native
  /**
    * The person's relation to the other person. The type can be custom or one of
    * these predefined values:
    *
    * &#42; `spouse`
    * &#42; `child`
    * &#42; `mother`
    * &#42; `father`
    * &#42; `parent`
    * &#42; `brother`
    * &#42; `sister`
    * &#42; `friend`
    * &#42; `relative`
    * &#42; `domesticPartner`
    * &#42; `manager`
    * &#42; `assistant`
    * &#42; `referredBy`
    * &#42; `partner`
    */
  var `type`: js.UndefOr[String] = js.native
}

object Relation {
  @scala.inline
  def apply(): Relation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relation]
  }
  @scala.inline
  implicit class RelationOps[Self <: Relation] (val x: Self) extends AnyVal {
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
    def setFormattedType(value: String): Self = this.set("formattedType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedType: Self = this.set("formattedType", js.undefined)
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setPerson(value: String): Self = this.set("person", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerson: Self = this.set("person", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

