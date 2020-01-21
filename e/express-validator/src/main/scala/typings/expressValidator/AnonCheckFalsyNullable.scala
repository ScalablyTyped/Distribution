package typings.expressValidator

import typings.expressValidator.contextMod.Optional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckFalsyNullable extends Optional {
  var checkFalsy: Boolean
  var nullable: Boolean
}

object AnonCheckFalsyNullable {
  @scala.inline
  def apply(checkFalsy: Boolean, nullable: Boolean): AnonCheckFalsyNullable = {
    val __obj = js.Dynamic.literal(checkFalsy = checkFalsy.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCheckFalsyNullable]
  }
}

