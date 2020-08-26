package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.estree.mod.SimpleCallExpression
  - typings.estree.mod.MemberExpression
*/
trait ChainElement extends js.Object

object ChainElement {
  @scala.inline
  def SimpleCallExpression(
    arguments: js.Array[Expression | SpreadElement],
    callee: Expression | Super,
    optional: Boolean,
    `type`: typings.estree.estreeStrings.CallExpression
  ): ChainElement = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainElement]
  }
  @scala.inline
  def MemberExpression(
    computed: Boolean,
    `object`: Expression | Super,
    optional: Boolean,
    property: Expression,
    `type`: typings.estree.estreeStrings.MemberExpression
  ): ChainElement = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainElement]
  }
}

