package typings.esquery.esqueryMod

import typings.esquery.esqueryStrings.Asterisk
import typings.esquery.esqueryStrings.Equalssign
import typings.esquery.esqueryStrings.ExclamationmarkEqualssign
import typings.esquery.esqueryStrings.Greaterthansign
import typings.esquery.esqueryStrings.GreaterthansignEqualssign
import typings.esquery.esqueryStrings.Lessthansign
import typings.esquery.esqueryStrings.LessthansignEqualssign
import typings.esquery.esqueryStrings.`class`
import typings.esquery.esqueryStrings.`nth-child`
import typings.esquery.esqueryStrings.`nth-last-child`
import typings.esquery.esqueryStrings.`type`
import typings.esquery.esqueryStrings.adjacent
import typings.esquery.esqueryStrings.attribute
import typings.esquery.esqueryStrings.child
import typings.esquery.esqueryStrings.compound
import typings.esquery.esqueryStrings.declaration
import typings.esquery.esqueryStrings.descendant
import typings.esquery.esqueryStrings.expression
import typings.esquery.esqueryStrings.field
import typings.esquery.esqueryStrings.function
import typings.esquery.esqueryStrings.has
import typings.esquery.esqueryStrings.identifier
import typings.esquery.esqueryStrings.not
import typings.esquery.esqueryStrings.pattern
import typings.esquery.esqueryStrings.sibling
import typings.esquery.esqueryStrings.statement
import typings.esquery.esqueryStrings.wildcard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Unions
//
/* Rewritten from type alias, can be one of: 
  - typings.esquery.esqueryMod.Field
  - typings.esquery.esqueryMod.Type
  - typings.esquery.esqueryMod.Sequence
  - typings.esquery.esqueryMod.Identifier
  - typings.esquery.esqueryMod.Wildcard
  - typings.esquery.esqueryMod.Attribute
  - typings.esquery.esqueryMod.NthChild
  - typings.esquery.esqueryMod.NthLastChild
  - typings.esquery.esqueryMod.Descendant
  - typings.esquery.esqueryMod.Child
  - typings.esquery.esqueryMod.Sibling
  - typings.esquery.esqueryMod.Adjacent
  - typings.esquery.esqueryMod.Negation
  - typings.esquery.esqueryMod.Matches
  - typings.esquery.esqueryMod.Has
  - typings.esquery.esqueryMod.Class
*/
trait Selector extends js.Object

object Selector {
  @scala.inline
  def Descendant(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: descendant,
    subject: js.UndefOr[Boolean] = js.undefined
  ): Selector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Adjacent(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: adjacent,
    subject: js.UndefOr[Boolean] = js.undefined
  ): Selector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Negation(selectors: js.Array[SubjectSelector], `type`: not, subject: js.UndefOr[Boolean] = js.undefined): Selector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Field(name: String, `type`: field): Selector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Attribute(
    name: String,
    `type`: attribute,
    operator: Equalssign | ExclamationmarkEqualssign | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign = null,
    subject: js.UndefOr[Boolean] = js.undefined,
    value: Literal | RegExpLiteral | Type = null
  ): Selector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Has(selectors: js.Array[SubjectSelector], `type`: has, subject: js.UndefOr[Boolean] = js.undefined): Selector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Sibling(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: sibling,
    subject: js.UndefOr[Boolean] = js.undefined
  ): Selector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Wildcard(`type`: wildcard, value: Asterisk, subject: js.UndefOr[Boolean] = js.undefined): Selector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Matches(
    selectors: js.Array[SubjectSelector],
    `type`: typings.esquery.esqueryStrings.matches,
    subject: js.UndefOr[Boolean] = js.undefined
  ): Selector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Child(
    left: SubjectSelector,
    right: SubjectSelector,
    `type`: child,
    subject: js.UndefOr[Boolean] = js.undefined
  ): Selector = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Sequence(
    selectors: js.Array[SubjectSelector],
    `type`: compound,
    subject: js.UndefOr[Boolean] = js.undefined
  ): Selector = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Class(name: declaration | expression | function | pattern | statement, `type`: `class`): Selector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def NthLastChild(index: NumericLiteral, `type`: `nth-last-child`, subject: js.UndefOr[Boolean] = js.undefined): Selector = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def NthChild(index: NumericLiteral, `type`: `nth-child`, subject: js.UndefOr[Boolean] = js.undefined): Selector = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Type(`type`: `type`, value: String): Selector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  def Identifier(`type`: identifier, value: String, subject: js.UndefOr[Boolean] = js.undefined): Selector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
}

