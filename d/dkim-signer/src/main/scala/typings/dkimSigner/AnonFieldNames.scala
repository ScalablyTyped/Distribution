package typings.dkimSigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFieldNames extends js.Object {
  var fieldNames: String
  var headers: String
}

object AnonFieldNames {
  @scala.inline
  def apply(fieldNames: String, headers: String): AnonFieldNames = {
    val __obj = js.Dynamic.literal(fieldNames = fieldNames.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFieldNames]
  }
}

