package typings.googleCloudStorage.fileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyDocument extends js.Object {
  var base64: String
  var signature: String
  var string: String
}

object PolicyDocument {
  @scala.inline
  def apply(base64: String, signature: String, string: String): PolicyDocument = {
    val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PolicyDocument]
  }
}

