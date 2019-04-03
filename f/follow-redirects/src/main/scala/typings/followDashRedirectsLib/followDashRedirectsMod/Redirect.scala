package typings
package followDashRedirectsLib.followDashRedirectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redirect extends js.Object {
  var headers: nodeLib.httpMod.IncomingHttpHeaders
  var statusCode: scala.Double
  var url: java.lang.String
}

object Redirect {
  @scala.inline
  def apply(headers: nodeLib.httpMod.IncomingHttpHeaders, statusCode: scala.Double, url: java.lang.String): Redirect = {
    val __obj = js.Dynamic.literal(headers = headers, statusCode = statusCode, url = url)
  
    __obj.asInstanceOf[Redirect]
  }
}

