package typings.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignPattern extends js.Object {
  var negativePattern: String
  var positivePattern: String
  var zeroPattern: String
}

object SignPattern {
  @scala.inline
  def apply(negativePattern: String, positivePattern: String, zeroPattern: String): SignPattern = {
    val __obj = js.Dynamic.literal(negativePattern = negativePattern.asInstanceOf[js.Any], positivePattern = positivePattern.asInstanceOf[js.Any], zeroPattern = zeroPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignPattern]
  }
}

