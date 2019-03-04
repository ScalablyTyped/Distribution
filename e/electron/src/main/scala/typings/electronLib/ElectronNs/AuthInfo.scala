package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthInfo extends js.Object {
  var host: java.lang.String
  var isProxy: scala.Boolean
  var port: scala.Double
  var realm: java.lang.String
  var scheme: java.lang.String
}

object AuthInfo {
  @scala.inline
  def apply(
    host: java.lang.String,
    isProxy: scala.Boolean,
    port: scala.Double,
    realm: java.lang.String,
    scheme: java.lang.String
  ): AuthInfo = {
    val __obj = js.Dynamic.literal(host = host, isProxy = isProxy, port = port, realm = realm, scheme = scheme)
  
    __obj.asInstanceOf[AuthInfo]
  }
}

