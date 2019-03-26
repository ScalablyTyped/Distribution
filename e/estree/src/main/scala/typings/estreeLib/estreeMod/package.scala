package typings
package estreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object estreeMod {
  type BaseDeclaration = BaseStatement
  type BaseExpression = BaseNode
  type BaseModuleDeclaration = BaseNode
  type BasePattern = BaseNode
  type BaseStatement = BaseNode
  /* Rewritten from type alias, can be one of: 
    - Identifier
    - Literal
    - Program
    - Function
    - SwitchCase
    - CatchClause
    - VariableDeclarator
    - Statement
    - estreeLib.Expression
    - Property
    - AssignmentProperty
    - Super
    - TemplateElement
    - SpreadElement
    - Pattern
    - ClassBody
    - Class
    - MethodDefinition
    - ModuleDeclaration
    - ModuleSpecifier
  */
  type Node = _Node | estreeLib.Expression
}
