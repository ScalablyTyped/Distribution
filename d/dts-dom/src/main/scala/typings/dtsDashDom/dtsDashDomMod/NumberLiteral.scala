package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.`number-literal`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberLiteral extends PrimitiveType {
  var kind: `number-literal`
  var value: Double
}

object NumberLiteral {
  @scala.inline
  def apply(kind: `number-literal`, value: Double): NumberLiteral = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
  
    __obj.asInstanceOf[NumberLiteral]
  }
}

