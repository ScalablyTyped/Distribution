package typings.firebaseDatabase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDomain extends js.Object {
  var domain: String
  var host: String
  var namespace: String
  var pathString: String
  var port: Double
  var scheme: String
  var secure: Boolean
  var subdomain: String
}

object AnonDomain {
  @scala.inline
  def apply(
    domain: String,
    host: String,
    namespace: String,
    pathString: String,
    port: Double,
    scheme: String,
    secure: Boolean,
    subdomain: String
  ): AnonDomain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], pathString = pathString.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDomain]
  }
}

