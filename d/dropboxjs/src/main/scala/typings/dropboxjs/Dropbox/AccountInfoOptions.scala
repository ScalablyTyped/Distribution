package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountInfoOptions extends js.Object {
  var httpCache: Boolean
}

object AccountInfoOptions {
  @scala.inline
  def apply(httpCache: Boolean): AccountInfoOptions = {
    val __obj = js.Dynamic.literal(httpCache = httpCache.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountInfoOptions]
  }
}

