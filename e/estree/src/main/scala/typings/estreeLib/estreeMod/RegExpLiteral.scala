package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpLiteral extends BaseNode {
  var raw: js.UndefOr[java.lang.String] = js.undefined
  var regex: estreeLib.Anon_Flags
  @JSName("type")
  var type_RegExpLiteral: estreeLib.estreeLibStrings.Literal
  var value: js.UndefOr[stdLib.RegExp | scala.Null] = js.undefined
}

