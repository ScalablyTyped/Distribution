package typings.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberInternalSlots extends js.Object {
  var ild: NumberILD
  var nu: js.Array[String]
  var patterns: NumberLocalePatternData
}

object NumberInternalSlots {
  @scala.inline
  def apply(ild: NumberILD, nu: js.Array[String], patterns: NumberLocalePatternData): NumberInternalSlots = {
    val __obj = js.Dynamic.literal(ild = ild.asInstanceOf[js.Any], nu = nu.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberInternalSlots]
  }
}

