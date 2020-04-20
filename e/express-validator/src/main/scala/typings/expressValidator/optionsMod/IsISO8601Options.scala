package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsISO8601Options extends js.Object {
  var strict: Boolean
}

object IsISO8601Options {
  @scala.inline
  def apply(strict: Boolean): IsISO8601Options = {
    val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsISO8601Options]
  }
}

