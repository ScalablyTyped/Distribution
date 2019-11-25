package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthInfo extends js.Object {
  var host: String
  var isProxy: Boolean
  var port: Double
  var realm: String
  var scheme: String
}

object AuthInfo {
  @scala.inline
  def apply(host: String, isProxy: Boolean, port: Double, realm: String, scheme: String): AuthInfo = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], isProxy = isProxy.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthInfo]
  }
}

