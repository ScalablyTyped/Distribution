package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.estree.mod.Identifier
  - typings.estree.mod.ObjectPattern
  - typings.estree.mod.ArrayPattern
  - typings.estree.mod.RestElement
  - typings.estree.mod.AssignmentPattern
  - typings.estree.mod.MemberExpression
*/
trait Pattern extends Node
object Pattern {
  
  @scala.inline
  def ArrayPattern(elements: js.Array[Pattern], `type`: typings.estree.estreeStrings.ArrayPattern): typings.estree.mod.ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ArrayPattern]
  }
  
  @scala.inline
  def AssignmentPattern(left: Pattern, right: Expression, `type`: typings.estree.estreeStrings.AssignmentPattern): typings.estree.mod.AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.AssignmentPattern]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typings.estree.estreeStrings.Identifier): typings.estree.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.Identifier]
  }
  
  @scala.inline
  def MemberExpression(
    computed: Boolean,
    `object`: Expression | Super,
    optional: Boolean,
    property: Expression,
    `type`: typings.estree.estreeStrings.MemberExpression
  ): typings.estree.mod.MemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.MemberExpression]
  }
  
  @scala.inline
  def ObjectPattern(
    properties: js.Array[AssignmentProperty | RestElement],
    `type`: typings.estree.estreeStrings.ObjectPattern
  ): typings.estree.mod.ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.ObjectPattern]
  }
  
  @scala.inline
  def RestElement(argument: Pattern, `type`: typings.estree.estreeStrings.RestElement): typings.estree.mod.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.estree.mod.RestElement]
  }
}
