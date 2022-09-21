package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.estree.mod.Identifier
  - typings.estree.mod.ObjectPattern
  - typings.estree.mod.ArrayPattern
  - typings.estree.mod.RestElement
  - typings.estree.mod.AssignmentPattern
  - typings.estree.mod.MemberExpression
*/
trait Pattern extends StObject
object Pattern {
  
  inline def ArrayPattern(elements: js.Array[Pattern | Null]): typings.estree.mod.ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typings.estree.mod.ArrayPattern]
  }
  
  inline def AssignmentPattern(left: Pattern, right: Expression): typings.estree.mod.AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typings.estree.mod.AssignmentPattern]
  }
  
  inline def Identifier(name: String): typings.estree.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.estree.mod.Identifier]
  }
  
  inline def MemberExpression(
    computed: Boolean,
    `object`: Expression | Super,
    optional: Boolean,
    property: Expression | PrivateIdentifier
  ): typings.estree.mod.MemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typings.estree.mod.MemberExpression]
  }
  
  inline def ObjectPattern(properties: js.Array[AssignmentProperty | RestElement]): typings.estree.mod.ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typings.estree.mod.ObjectPattern]
  }
  
  inline def RestElement(argument: Pattern): typings.estree.mod.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typings.estree.mod.RestElement]
  }
}
