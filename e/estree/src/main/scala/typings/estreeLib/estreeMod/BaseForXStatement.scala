package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseForXStatement extends BaseNode {
  var body: Statement
  var left: VariableDeclaration | Pattern
  var right: estreeLib.Expression
}

