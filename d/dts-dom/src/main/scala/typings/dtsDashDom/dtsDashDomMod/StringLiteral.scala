package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.`string-literal`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringLiteral extends PrimitiveType {
  var kind: `string-literal`
  var value: String
}

object StringLiteral {
  @scala.inline
  def apply(kind: `string-literal`, value: String): StringLiteral = {
    val __obj = js.Dynamic.literal(kind = kind, value = value)
  
    __obj.asInstanceOf[StringLiteral]
  }
}

