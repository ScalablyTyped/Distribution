package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Group of multiple entities
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Group extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'actual'.
    */
  var _actual: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'quantity'.
    */
  var _quantity: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Whether this group's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Descriptive or actual
    */
  var actual: Boolean = js.native
  /**
    * Trait of group members
    */
  var characteristic: js.UndefOr[js.Array[GroupCharacteristic]] = js.native
  /**
    * Kind of Group members
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  /**
    * Unique id
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Who or what is in group
    */
  var member: js.UndefOr[js.Array[GroupMember]] = js.native
  /**
    * Label for Group
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Number of members
    */
  var quantity: js.UndefOr[unsignedInt] = js.native
  /**
    * person | animal | practitioner | device | medication | substance
    */
  var `type`: code = js.native
}

object Group {
  @scala.inline
  def apply(actual: Boolean, `type`: code): Group = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  @scala.inline
  implicit class GroupOps[Self <: Group] (val x: Self) extends AnyVal {
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
    def setActual(value: Boolean): Self = this.set("actual", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_active(value: Element): Self = this.set("_active", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_active: Self = this.set("_active", js.undefined)
    @scala.inline
    def set_actual(value: Element): Self = this.set("_actual", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_actual: Self = this.set("_actual", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def set_quantity(value: Element): Self = this.set("_quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_quantity: Self = this.set("_quantity", js.undefined)
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setCharacteristicVarargs(value: GroupCharacteristic*): Self = this.set("characteristic", js.Array(value :_*))
    @scala.inline
    def setCharacteristic(value: js.Array[GroupCharacteristic]): Self = this.set("characteristic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacteristic: Self = this.set("characteristic", js.undefined)
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setMemberVarargs(value: GroupMember*): Self = this.set("member", js.Array(value :_*))
    @scala.inline
    def setMember(value: js.Array[GroupMember]): Self = this.set("member", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMember: Self = this.set("member", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setQuantity(value: unsignedInt): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
  
}

