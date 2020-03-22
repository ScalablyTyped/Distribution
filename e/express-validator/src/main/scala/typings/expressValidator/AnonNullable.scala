package typings.expressValidator

import typings.expressValidator.contextMod.Optional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNullable extends Optional {
  var checkFalsy: Boolean
  var nullable: Boolean
}

object AnonNullable {
  @scala.inline
  def apply(checkFalsy: Boolean, nullable: Boolean): AnonNullable = {
    val __obj = js.Dynamic.literal(checkFalsy = checkFalsy.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNullable]
  }
}

