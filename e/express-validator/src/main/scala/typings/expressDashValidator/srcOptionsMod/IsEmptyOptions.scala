package typings.expressDashValidator.srcOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsEmptyOptions extends js.Object {
  var ignore_whitespace: Boolean
}

object IsEmptyOptions {
  @scala.inline
  def apply(ignore_whitespace: Boolean): IsEmptyOptions = {
    val __obj = js.Dynamic.literal(ignore_whitespace = ignore_whitespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IsEmptyOptions]
  }
}

