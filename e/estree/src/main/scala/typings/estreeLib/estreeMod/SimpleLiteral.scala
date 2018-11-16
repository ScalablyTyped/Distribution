package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SimpleLiteral extends BaseNode {
  var raw: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_SimpleLiteral: estreeLib.estreeLibStrings.Literal
  var value: java.lang.String | scala.Boolean | scala.Double | scala.Null
}

