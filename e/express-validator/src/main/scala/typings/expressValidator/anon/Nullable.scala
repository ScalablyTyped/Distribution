package typings.expressValidator.anon

import typings.expressValidator.contextMod.Optional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nullable extends Optional {
  var checkFalsy: Boolean
  var nullable: Boolean
}

object Nullable {
  @scala.inline
  def apply(checkFalsy: Boolean, nullable: Boolean): Nullable = {
    val __obj = js.Dynamic.literal(checkFalsy = checkFalsy.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nullable]
  }
}

