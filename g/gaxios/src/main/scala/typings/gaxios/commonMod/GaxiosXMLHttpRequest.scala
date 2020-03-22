package typings.gaxios.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaxiosXMLHttpRequest extends js.Object {
  var responseURL: String
}

object GaxiosXMLHttpRequest {
  @scala.inline
  def apply(responseURL: String): GaxiosXMLHttpRequest = {
    val __obj = js.Dynamic.literal(responseURL = responseURL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GaxiosXMLHttpRequest]
  }
}

