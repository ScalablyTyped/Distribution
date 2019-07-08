package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberLiteral extends PrimitiveType {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.`number-literal`
  var value: scala.Double
}

object NumberLiteral {
  @scala.inline
  def apply(kind: dtsDashDomLib.dtsDashDomLibStrings.`number-literal`, value: scala.Double): NumberLiteral = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
  
    __obj.asInstanceOf[NumberLiteral]
  }
}

