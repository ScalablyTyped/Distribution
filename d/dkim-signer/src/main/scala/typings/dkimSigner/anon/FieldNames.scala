package typings.dkimSigner.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldNames extends js.Object {
  var fieldNames: String
  var headers: String
}

object FieldNames {
  @scala.inline
  def apply(fieldNames: String, headers: String): FieldNames = {
    val __obj = js.Dynamic.literal(fieldNames = fieldNames.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldNames]
  }
}

