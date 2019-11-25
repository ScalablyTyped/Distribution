package typings.atGoogleDashCloudStorage.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyDocument extends js.Object {
  var conditions: js.Array[js.Array[String | Double]]
  var expiration: String
  var string: String
}

object PolicyDocument {
  @scala.inline
  def apply(conditions: js.Array[js.Array[String | Double]], expiration: String, string: String): PolicyDocument = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PolicyDocument]
  }
}

