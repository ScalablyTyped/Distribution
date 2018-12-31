package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program extends BaseNode {
  var body: js.Array[Statement | ModuleDeclaration]
  var comments: js.UndefOr[js.Array[Comment]] = js.undefined
  var sourceType: estreeLib.estreeLibStrings.script | estreeLib.estreeLibStrings.module
  @JSName("type")
  var type_Program: estreeLib.estreeLibStrings.Program
}

