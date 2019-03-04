package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var method: java.lang.String
  var referrer: java.lang.String
  var url: java.lang.String
}

object Request {
  @scala.inline
  def apply(method: java.lang.String, referrer: java.lang.String, url: java.lang.String): Request = {
    val __obj = js.Dynamic.literal(method = method, referrer = referrer, url = url)
  
    __obj.asInstanceOf[Request]
  }
}

