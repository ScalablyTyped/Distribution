package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var method: String
  var referrer: String
  var url: String
}

object Request {
  @scala.inline
  def apply(method: String, referrer: String, url: String): Request = {
    val __obj = js.Dynamic.literal(method = method, referrer = referrer, url = url)
  
    __obj.asInstanceOf[Request]
  }
}

