package typings
package dropboxjsLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountInfoOptions extends js.Object {
  var httpCache: scala.Boolean
}

object AccountInfoOptions {
  @scala.inline
  def apply(httpCache: scala.Boolean): AccountInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("httpCache")(httpCache)
    __obj.asInstanceOf[AccountInfoOptions]
  }
}

