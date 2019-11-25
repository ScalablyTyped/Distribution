package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingOutOptions extends js.Object {
  var mustInvalidate: Boolean
}

object SingOutOptions {
  @scala.inline
  def apply(mustInvalidate: Boolean): SingOutOptions = {
    val __obj = js.Dynamic.literal(mustInvalidate = mustInvalidate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SingOutOptions]
  }
}

