package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyDocument extends js.Object {
  var conditions: js.Array[js.Array[java.lang.String | scala.Double]]
  var expiration: java.lang.String
  var string: java.lang.String
}

object PolicyDocument {
  @scala.inline
  def apply(
    conditions: js.Array[js.Array[java.lang.String | scala.Double]],
    expiration: java.lang.String,
    string: java.lang.String
  ): PolicyDocument = {
    val __obj = js.Dynamic.literal(conditions = conditions, expiration = expiration, string = string)
  
    __obj.asInstanceOf[PolicyDocument]
  }
}

