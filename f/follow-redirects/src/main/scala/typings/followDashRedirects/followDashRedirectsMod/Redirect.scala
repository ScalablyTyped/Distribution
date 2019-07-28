package typings.followDashRedirects.followDashRedirectsMod

import typings.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redirect extends js.Object {
  var headers: IncomingHttpHeaders
  var statusCode: Double
  var url: String
}

object Redirect {
  @scala.inline
  def apply(headers: IncomingHttpHeaders, statusCode: Double, url: String): Redirect = {
    val __obj = js.Dynamic.literal(headers = headers, statusCode = statusCode, url = url)
  
    __obj.asInstanceOf[Redirect]
  }
}

