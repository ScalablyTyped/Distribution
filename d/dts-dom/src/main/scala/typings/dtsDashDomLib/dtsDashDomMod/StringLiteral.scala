package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringLiteral extends PrimitiveType {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.`string-literal`
  var value: java.lang.String
}

object StringLiteral {
  @scala.inline
  def apply(kind: dtsDashDomLib.dtsDashDomLibStrings.`string-literal`, value: java.lang.String): StringLiteral = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
  
    __obj.asInstanceOf[StringLiteral]
  }
}

