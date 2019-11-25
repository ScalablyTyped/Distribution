package typings.expressDashValidator

import typings.expressDashValidator.srcContextMod.Optional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckFalsyNullable extends Optional {
  var checkFalsy: Boolean
  var nullable: Boolean
}

object Anon_CheckFalsyNullable {
  @scala.inline
  def apply(checkFalsy: Boolean, nullable: Boolean): Anon_CheckFalsyNullable = {
    val __obj = js.Dynamic.literal(checkFalsy = checkFalsy.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CheckFalsyNullable]
  }
}

