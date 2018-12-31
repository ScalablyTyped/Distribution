package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportNamedDeclaration extends BaseNode {
  var declaration: js.UndefOr[Declaration | scala.Null] = js.undefined
  var source: js.UndefOr[Literal | scala.Null] = js.undefined
  var specifiers: js.Array[ExportSpecifier]
  @JSName("type")
  var type_ExportNamedDeclaration: estreeLib.estreeLibStrings.ExportNamedDeclaration
}

