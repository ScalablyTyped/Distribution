package typings.expressMung.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var mungError: Boolean
}

object Options {
  @scala.inline
  def apply(mungError: Boolean): Options = {
    val __obj = js.Dynamic.literal(mungError = mungError.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

