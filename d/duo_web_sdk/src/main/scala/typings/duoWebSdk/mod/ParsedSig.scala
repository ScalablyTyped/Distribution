package typings.duoWebSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedSig extends js.Object {
  var appSig: String
  var duoSig: String
  var sigRequest: String
}

object ParsedSig {
  @scala.inline
  def apply(appSig: String, duoSig: String, sigRequest: String): ParsedSig = {
    val __obj = js.Dynamic.literal(appSig = appSig.asInstanceOf[js.Any], duoSig = duoSig.asInstanceOf[js.Any], sigRequest = sigRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParsedSig]
  }
}

