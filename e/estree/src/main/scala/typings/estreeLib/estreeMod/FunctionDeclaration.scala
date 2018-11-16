package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FunctionDeclaration extends BaseFunction {
  @JSName("body")
  var body_FunctionDeclaration: BlockStatement
  /** It is null when a function declaration is a part of the `export default function` statement */
  var id: Identifier | scala.Null
  @JSName("type")
  var type_FunctionDeclaration: estreeLib.estreeLibStrings.FunctionDeclaration
}

