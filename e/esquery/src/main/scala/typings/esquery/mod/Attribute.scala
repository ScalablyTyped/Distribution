package typings.esquery.mod

import typings.esquery.esqueryStrings.Equalssign
import typings.esquery.esqueryStrings.ExclamationmarkEqualssign
import typings.esquery.esqueryStrings.Greaterthansign
import typings.esquery.esqueryStrings.GreaterthansignEqualssign
import typings.esquery.esqueryStrings.Lessthansign
import typings.esquery.esqueryStrings.LessthansignEqualssign
import typings.esquery.esqueryStrings.attribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attribute
  extends SubjectSelectorAtom
     with Selector
     with SubjectSelector {
  var name: String = js.native
  var operator: js.UndefOr[
    Equalssign | ExclamationmarkEqualssign | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign
  ] = js.native
  @JSName("type")
  var type_Attribute: attribute = js.native
  var value: js.UndefOr[Literal | RegExpLiteral | Type] = js.native
}

object Attribute {
  @scala.inline
  def apply(name: String, `type`: attribute): Attribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  @scala.inline
  implicit class AttributeOps[Self <: Attribute] (val x: Self) extends AnyVal {
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
    def setType(value: attribute): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(
      value: Equalssign | ExclamationmarkEqualssign | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign
    ): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setValue(value: Literal | RegExpLiteral | Type): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

